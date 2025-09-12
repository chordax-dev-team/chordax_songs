package chordax_dev_team.chordax_songs.service;

import chordax_dev_team.chordax_songs.model.Song;
import chordax_dev_team.chordax_songs.model.dto.SongDto;
import chordax_dev_team.chordax_songs.repository.LineRepository;
import chordax_dev_team.chordax_songs.repository.SongRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SongService {


    private final LineService lineService;
    private final ToneService toneService;

    private final SongRepository songRepository;
    private final LineRepository lineRepository;

    public SongService(LineService lineService, ToneService toneService, SongRepository songRepository, LineRepository lineRepository) {
        this.lineService = lineService;
        this.toneService = toneService;
        this.songRepository = songRepository;
        this.lineRepository = lineRepository;
    }

    public List<Song> getSongsByUser(Long userId) {
        return songRepository.findByUserId(userId);
    }

    public Song getSongByUserAndId(Long userId, Long songId) {
        return songRepository.findByUserIdAndId(userId, songId);
    }

    @Transactional
    public Song addSong(Long userId, SongDto songDto) {
            // Check if song already exists for this user
            Song existing = songRepository.findByUserIdAndTitle(userId, songDto.getTitle());
            if (existing != null) return null;

            // Create new song
            Song newSong = new Song();
            newSong.setUserId(userId);
            newSong.setTitle(songDto.getTitle());
            newSong.setComposer(songDto.getComposer());
            newSong.setAuthor(songDto.getAuthor());
            newSong.setEnteredAt(LocalDateTime.now());

            Song savedSong = songRepository.save(newSong);

            // assign the Lines to the Song
            newSong.setLines(lineService.addLines(savedSong, songDto));

            return savedSong;
        }

    @Transactional
    public Song updateSong(Long userId, Long songId, SongDto songDto) {
        // Fetch existing song
        Song existingSong = songRepository.findById(songId)
                .filter(song -> song.getUserId() == userId)
                .orElseThrow(() -> new EntityNotFoundException("Song not found or access denied"));

        // Update metadata
        existingSong.setTitle(songDto.getTitle());
        existingSong.setComposer(songDto.getComposer());
        existingSong.setAuthor(songDto.getAuthor());
        existingSong.setEnteredAt(LocalDateTime.now());

        // Delete all lines associated with the song
        lineRepository.deleteAll(existingSong.getLines());

        // Enter all the new lines associated with the song
        existingSong.setLines(lineService.addLines(existingSong, songDto));

        // remove orphan tones
        toneService.removeTones();

        return existingSong;
    }

    @Transactional
    public void deleteSong(Long userId, Long songId) {
        // Fetch the song and verify ownership
        Song song = songRepository.findById(songId)
                .filter(s -> s.getUserId() == userId)
                .orElseThrow(() -> new EntityNotFoundException("Song not found or access denied"));

        // Delete all lines associated with the song
        lineRepository.deleteAll(song.getLines());

        // Delete the song itself
        songRepository.delete(song);

        // remove orphan tones
        toneService.removeTones();
    }

}