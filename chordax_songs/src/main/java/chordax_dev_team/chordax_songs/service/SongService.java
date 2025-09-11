package chordax_dev_team.chordax_songs.service;

import chordax_dev_team.chordax_songs.model.Line;
import chordax_dev_team.chordax_songs.model.Song;
import chordax_dev_team.chordax_songs.model.Tone;
import chordax_dev_team.chordax_songs.model.dto.LineDto;
import chordax_dev_team.chordax_songs.model.dto.SongDto;
import chordax_dev_team.chordax_songs.model.dto.ToneDto;
import chordax_dev_team.chordax_songs.repository.LineRepository;
import chordax_dev_team.chordax_songs.repository.SongRepository;
import chordax_dev_team.chordax_songs.repository.ToneRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {

    private final SongRepository songRepository;
    private final LineRepository lineRepository;
    private final ToneRepository toneRepository;

    public SongService(SongRepository songRepository, LineRepository lineRepository, ToneRepository toneRepository) {
        this.songRepository = songRepository;
        this.lineRepository = lineRepository;
        this.toneRepository = toneRepository;
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
            newSong.setLines(new ArrayList<>());

            // Process each line
            for (LineDto lineDto : songDto.getLines()) {
                Line line = new Line();
                line.setLineType(lineDto.getLineType());
                line.setLyrics(lineDto.getLyrics());
                line.setTones(new ArrayList<>());

                // Process each tone
                for (ToneDto toneDto : lineDto.getTones()) {
                    Tone tone = toneRepository.findByChordAndPosition(toneDto.getChord(), toneDto.getPosition());
                    if (tone == null) {
                        tone = new Tone();
                        tone.setChord(toneDto.getChord());
                        tone.setPosition(toneDto.getPosition());
                        tone = toneRepository.save(tone);
                    }
                    line.getTones().add(tone);
                }

                Line lineSaved = lineRepository.save(line);
                newSong.getLines().add(lineSaved);
            }

            return songRepository.save(newSong);
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

        // Clear old lines
        lineRepository.deleteAll(existingSong.getLines());
        existingSong.setLines(new ArrayList<>());

        // Rebuild lines and tones
        for (LineDto lineDto : songDto.getLines()) {
            Line line = new Line();
            line.setLineType(lineDto.getLineType());
            line.setLyrics(lineDto.getLyrics());
            line.setTones(new ArrayList<>());

            for (ToneDto toneDto : lineDto.getTones()) {
                Tone tone = toneRepository.findByChordAndPosition(toneDto.getChord(), toneDto.getPosition());
                if (tone == null) {
                    tone = new Tone();
                    tone.setChord(toneDto.getChord());
                    tone.setPosition(toneDto.getPosition());
                    tone = toneRepository.save(tone);
                }
                line.getTones().add(tone);
            }

            Line savedLine = lineRepository.save(line);
            existingSong.getLines().add(savedLine);
        }

        return songRepository.save(existingSong);
    }

}