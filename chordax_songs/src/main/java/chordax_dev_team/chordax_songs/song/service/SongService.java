package chordax_dev_team.chordax_songs.song.service;

import chordax_dev_team.chordax_songs.song.model.Line;
import chordax_dev_team.chordax_songs.song.model.Song;
import chordax_dev_team.chordax_songs.song.model.dto.SongDto;
import chordax_dev_team.chordax_songs.song.repository.LineRepository;
import chordax_dev_team.chordax_songs.song.repository.SongRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class SongService {

    private static final Logger logger = LoggerFactory.getLogger(SongService.class);


    private final LineService lineService;
    private final ToneService toneService;
    private final SongRepository songRepository;
    private final LineRepository lineRepository;

    public Song getSongByUserAndId(Long userId, Long songId) {
        return songRepository.findByUserIdAndId(userId, songId);
    }

    @Transactional
    public Song addSong(Long userId, SongDto songDto) {
            // Check if song already exists for this user
            Song existing = songRepository.findByUserIdAndTitle(userId, songDto.title());
            if (existing != null) return null;

            // Create new song
            Song newSong = Song.builder()
                .userId(userId)
                .title(songDto.title())
                .composer(songDto.composer())
                .author(songDto.author())
                .build();

            Song savedSong = songRepository.save(newSong);

            List<Line> savedLines = lineService.addLines(savedSong, songDto);

            // assign the Lines to the Song
            newSong.setLines(savedLines);

            return savedSong;
        }

    @Transactional
    public Song updateSong(Long userId, Long songId, SongDto songDto) {
        // delete exiting song
        deleteSong(userId, songId);
        // enter new song
        return addSong(userId, songDto);
    }

    @Transactional
    public void deleteSong(Long userId, Long songId) {
        // Fetch the song and verify ownership
        Song song = songRepository.findById(songId)
                .filter(s -> Objects.equals(s.getUserId(), userId))
                .orElseThrow(() -> new EntityNotFoundException("Song not found or access denied"));

        // Delete all lines associated with the song
        lineRepository.deleteAll(song.getLines());

        // Delete the song itself
        songRepository.delete(song);

        // remove orphan tones
        toneService.removeOrphanTones();
    }
}