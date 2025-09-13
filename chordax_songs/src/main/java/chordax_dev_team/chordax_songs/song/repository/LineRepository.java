package chordax_dev_team.chordax_songs.song.repository;

import chordax_dev_team.chordax_songs.song.model.Line;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  LineRepository extends JpaRepository<Line, Long> {

}
