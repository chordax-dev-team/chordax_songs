package chordax_dev_team.chordax_songs.song.service;

import chordax_dev_team.chordax_songs.song.model.Line;
import chordax_dev_team.chordax_songs.song.model.Song;
import chordax_dev_team.chordax_songs.song.model.dto.SongDto;
import chordax_dev_team.chordax_songs.song.repository.LineRepository;
import chordax_dev_team.chordax_songs.song.repository.SongRepository;
import chordax_dev_team.chordax_songs.title.dto.TitleDto;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
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

//    public List<Song> getSongsByUserId(Long userId) {
//        return songRepository.findByUserId(userId);
//    }

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

//    @Transactional
//    public Song updateSong(Long userId, Long songId, SongDto songDto) {
//        // Fetch existing song
//        Song existingSong = songRepository.findById(songId)
//                .filter(song -> song.getUserId() == userId)
//                .orElseThrow(() -> new EntityNotFoundException("Song not found or access denied"));
//
//        // Update metadata
//        existingSong.setTitle(songDto.title());
//        existingSong.setComposer(songDto.getComposer());
//        existingSong.setAuthor(songDto.getAuthor());
//        existingSong.setEnteredAt(LocalDateTime.now());
//        logger.info("Song of ID={} is set to USER={}", existingSong.getId(), existingSong.getUserId());
//
//
//        // Delete all lines associated with the song
////        lineRepository.deleteAll(existingSong.getLines());
//        logger.info("Number of Lines of song ID={} is {}", songId, existingSong.getLines().size());
//        // Enter all the new lines associated with the song
//        List<Line> savedLines = lineService.addLines(existingSong, songDto);
//        logger.info("Number of saved Lines of song ID={} is {}", songId, savedLines.size());
//        existingSong.setLines(savedLines);
//        logger.info("Number of lines of song ID={} is {}", songId, existingSong.getLines().size());
//        // Enter all the new lines associated with the song
//
//        songRepository.save(existingSong);
//
//        logger.info("Existing song ID={}", existingSong.getId());
//
//        // remove orphan tones
////        toneService.removeOrphanTones();
//
//        return existingSong;
//    }

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

    @Transactional
    public List<TitleDto> titles(Long userId) {
        return songRepository.titlesByUserId(userId);
    }
}