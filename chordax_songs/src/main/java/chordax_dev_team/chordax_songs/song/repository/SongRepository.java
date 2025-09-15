package chordax_dev_team.chordax_songs.song.repository;

import java.util.List;

import chordax_dev_team.chordax_songs.song.model.Song;
import chordax_dev_team.chordax_songs.title.dto.TitleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

	List<Song> findByUserId(long userId);

	Song findByUserIdAndTitle(long userId, String title);

	Song findByUserIdAndId(long userId, long id);

	@Query(value = "SELECT new chordax_dev_team.chordax_songs.title.dto.TitleDto(s.id, s.title) FROM Song s WHERE s.userId = :id")
	List<TitleDto> titlesByUserId(@Param("id") Long userId);
}
