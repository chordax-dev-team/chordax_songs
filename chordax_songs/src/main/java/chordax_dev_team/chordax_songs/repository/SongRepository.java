package chordax_dev_team.chordax_songs.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import chordax_dev_team.chordax_songs.model.Song;

public interface SongRepository extends JpaRepository<Song, Long> {
	
	List<Song> findByUserId(long userId);
	
	Song findByUserIdAndTitle(long userId, String title);
	
	Song findByUserIdAndId(long userId, long id);
}
