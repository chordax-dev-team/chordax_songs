package chordax_dev_team.chordax_songs.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import chordax_dev_team.chordax_songs.model.Song;

public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findByUserId(long userId);
}
