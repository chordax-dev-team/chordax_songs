package chordax_dev_team.chordax_songs.song.service;

import chordax_dev_team.chordax_songs.song.model.Line;
import chordax_dev_team.chordax_songs.song.model.Song;
import chordax_dev_team.chordax_songs.song.model.dto.LineDto;
import chordax_dev_team.chordax_songs.song.model.dto.SongDto;
import chordax_dev_team.chordax_songs.song.repository.LineRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.function.Function;

@Service
public class LineService {


    private final LineRepository lineRepository;
    private final ToneService toneService;

    public LineService(LineRepository lineRepository, ToneService toneService) {
        this.lineRepository = lineRepository;
        this.toneService = toneService;
    }


    @Transactional
    public List<Line> addLines(Song song, SongDto songDto) {

        Function<LineDto, Line> intoLine = lineDto -> new Line(lineDto.getLineType(), lineDto.getLyrics(), song, toneService.addTones(lineDto));
        List<Line> linesToEnter = songDto.getLines().stream().map(intoLine).toList();

        return lineRepository.saveAll(linesToEnter);
    }

}
