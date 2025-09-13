package chordax_dev_team.chordax_songs.song.service;

import chordax_dev_team.chordax_songs.song.model.Line;
import chordax_dev_team.chordax_songs.song.model.Tone;
import chordax_dev_team.chordax_songs.song.model.dto.LineDto;
import chordax_dev_team.chordax_songs.song.model.dto.ToneDto;
import chordax_dev_team.chordax_songs.song.repository.LineRepository;
import chordax_dev_team.chordax_songs.song.repository.ToneRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.function.Function;

@Service
public class ToneService {

    private final ToneRepository toneRepository;

    private final LineRepository lineRepository;

    public ToneService(ToneRepository toneRepository, LineRepository lineRepository) {
        this.toneRepository = toneRepository;
        this.lineRepository = lineRepository;
    }

    @Transactional
    public List<Tone> addTones(LineDto lineDto) {

        Function<ToneDto, Tone> intoTone = toneDto -> {
            Tone tone = toneRepository.findByChordAndPosition(toneDto.getChord(), toneDto.getPosition());
            if(tone == null) tone = toneRepository.save(new Tone(toneDto.getChord(), toneDto.getPosition()));
            return tone;
        };

        return lineDto.getTones().stream().map(intoTone).toList();
    }

    @Transactional
    public void removeTones() {

        toneLoop: for(Tone tone : toneRepository.findAll()) {
            for(Line line : lineRepository.findAll()){
                if(line.getTones().contains(tone)) continue toneLoop;
            }
            toneRepository.delete(tone);
        }
    }
}
