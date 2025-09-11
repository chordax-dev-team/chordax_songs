package chordax_dev_team.chordax_songs.repository;

import chordax_dev_team.chordax_songs.model.Line;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LineRepository extends JpaRepository<Line, Long> {
}
