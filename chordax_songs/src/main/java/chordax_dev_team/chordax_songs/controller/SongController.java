package chordax_dev_team.chordax_songs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chordax_dev_team.chordax_songs.model.Song;
import chordax_dev_team.chordax_songs.service.SongRepository;

@RestController
@RequestMapping("api/v1/songs")
public class SongController {

	@Autowired
	SongRepository songRepository;

	// to SELECT songs of selected user
	@GetMapping("/{userId}")
	public List<Song> getSongsAll(@PathVariable long userId) {

		// gets existing user by email
		return songRepository.findByUserId(userId);
	}

	// to SELECT a selected song of selected user
	@GetMapping("/{userId}/{songId}")
	public Song getSongsAll(@PathVariable long userId, @PathVariable long songId) {

		// gets selected song of selected user
		return songRepository.findBySongIdAndSongId(userId, songId);
	}

	// to INSERT a new song of selected user
	@PostMapping("")
	public Song addSong(@RequestBody Song song) {

		// gets existing song by title
		Optional<Song> existingSong = Optional.of(songRepository.findBySongTitle(song.getTitle()));

		// check if received song title exists in db
		if (existingSong != null) {
			// if it doesn't, save the new song in db
			// and return it
			return songRepository.save(song);
		}

		// if it does exist, return null
		return null;
	}

	// to UPDATE a selected song of selected user
	@PutMapping("")
	public Song updateSong(@RequestBody Song song) {

		// gets existing song by title
		Song existingSong = songRepository.findById(song.getId()).get();

		// if they do, modify it
		existingSong.setTitle(song.getTitle());
		existingSong.setVerses(song.getVerses());

		// and return it
		return songRepository.save(song);
	}
}
