package chordax_dev_team.chordax_songs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chordax_dev_team.chordax_songs.model.Song;
import chordax_dev_team.chordax_songs.service.SongRepository;

@RestController
@RequestMapping("api/v1/songs")
public class SongController {

	@Autowired
	SongRepository songRepository;

	// to SELECT user for login
	@GetMapping("/{userId}")
	public List<Song> getSongsAll(@PathVariable long userId) {

		// gets existing user by email
		return songRepository.findByUserId(userId);
	}
}
