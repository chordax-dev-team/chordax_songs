package chordax_dev_team.chordax_songs.controller;

import java.util.List;

import chordax_dev_team.chordax_songs.exceptions.ApiException;
import chordax_dev_team.chordax_songs.model.dto.SongDto;
import chordax_dev_team.chordax_songs.service.SongService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chordax_dev_team.chordax_songs.model.Song;

@RestController
@RequestMapping("api/v1/songs")
public class SongController {

	@Autowired
	private SongService songService;

	@GetMapping("/{userId}")
	public ResponseEntity<List<Song>> getSongsAll(@PathVariable Long userId) {
		List<Song> songs = songService.getSongsByUser(userId);
		return ResponseEntity.ok(songs);
	}

	@GetMapping("/{userId}/{songId}")
	public ResponseEntity<Song> getUserSong(@PathVariable Long userId, @PathVariable Long songId) {
		Song song = songService.getSongByUserAndId(userId, songId);
		return song != null ? ResponseEntity.ok(song) : ResponseEntity.notFound().build();
	}

	@Operation(summary = "Add a new song for a user", description = "Creates a song with lyrics and chords")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Song created"),
			@ApiResponse(responseCode = "409", description = "Validation error", content = @Content(schema = @Schema(implementation = ApiException.class))),
			@ApiResponse(responseCode = "400", description = "Validation error", content = @Content(schema = @Schema(implementation = ApiException.class)))
	})
	@PostMapping("/{userId}")
	public ResponseEntity<Song> addSong(@PathVariable Long userId, @Valid @RequestBody SongDto songDto) {
		Song created = songService.addSong(userId, songDto);
		return created != null
				? ResponseEntity.status(HttpStatus.CREATED).body(created)
				: ResponseEntity.status(HttpStatus.CONFLICT).build();
	}

	@Operation(summary = "Update a song")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Song updated successfully"),
			@ApiResponse(responseCode = "404", description = "Song not found", content = @Content(schema = @Schema(implementation = ApiException.class))),
			@ApiResponse(responseCode = "400", description = "Validation error", content = @Content(schema = @Schema(implementation = ApiException.class)))
	})
	@PutMapping("/{userId}/{songId}")
	public ResponseEntity<Song> updateSong(@PathVariable Long userId,
										   @PathVariable Long songId,
										   @Valid @RequestBody SongDto songDto) {
		Song updated = songService.updateSong(userId, songId, songDto);
		return updated != null
				? ResponseEntity.ok(updated)
				: ResponseEntity.notFound().build(); // 404 if song not found
	}
}
