package chordax_dev_team.chordax_songs.repository;

import chordax_dev_team.chordax_songs.model.Tone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToneRepository extends JpaRepository<Tone, Long> {
    Tone findByChordAndPosition(String chord, int position);
}
