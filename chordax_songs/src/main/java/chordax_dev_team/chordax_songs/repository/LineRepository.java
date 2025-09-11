package chordax_dev_team.chordax_songs.repository;

import chordax_dev_team.chordax_songs.model.Line;
import chordax_dev_team.chordax_songs.model.Tone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<Line, Long> {

    default int countToneOccurrences(Tone tone){
        int occurrences = 0;
//        List<Line> line = ;
        for(Line line : findAll()){
            if(line.getTones().contains(tone)) occurrences++;
        }
        return occurrences;
    }
}
