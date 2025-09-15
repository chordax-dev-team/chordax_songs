package chordax_dev_team.chordax_songs.song.service;

import chordax_dev_team.chordax_songs.song.model.Line;
import chordax_dev_team.chordax_songs.song.model.Song;
import chordax_dev_team.chordax_songs.song.model.Tone;
import chordax_dev_team.chordax_songs.song.model.dto.LineDto;
import chordax_dev_team.chordax_songs.song.model.dto.SongDto;
import chordax_dev_team.chordax_songs.song.repository.LineRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class LineService {

    private static final Logger logger = LoggerFactory.getLogger(LineService.class);

    private final LineRepository lineRepository;
    private final ToneService toneService;

    @Transactional
    public List<Line> addLines(Song song, SongDto songDto) {
        logger.info("Adding {} lines to song ID={} titled '{}'", songDto.lines().size(), song.getId(), song.getTitle());

        Function<LineDto, Line> intoLine = lineDto -> {
            logger.debug("Creating line of type '{}' with lyrics '{}'", lineDto.lineType(), lineDto.lyrics());
            List<Tone> tones = toneService.addTones(lineDto);
            logger.debug("Associated {} tones with line '{}'", tones.size(), lineDto.lyrics());
            return new Line(lineDto.lineType(), lineDto.lyrics(), song, tones);
        };

        List<Line> linesToEnter = songDto.lines().stream().map(intoLine).toList();
        List<Line> savedLines = lineRepository.saveAll(linesToEnter);

        logger.info("Saved {} lines for song ID={}", savedLines.size(), song.getId());
        return savedLines;
    }
}