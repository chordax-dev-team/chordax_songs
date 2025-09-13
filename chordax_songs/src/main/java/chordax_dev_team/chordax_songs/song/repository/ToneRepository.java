package chordax_dev_team.chordax_songs.song.repository;

import chordax_dev_team.chordax_songs.song.model.Tone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToneRepository extends JpaRepository<Tone, Long> {
    Tone findByChordAndPosition(String chord, int position);
}
