package chordax_dev_team.chordax_songs.song.controller;

import java.util.List;

import chordax_dev_team.chordax_songs.song.exceptions.ApiException;
import chordax_dev_team.chordax_songs.song.model.dto.SongDto;
import chordax_dev_team.chordax_songs.song.service.SongService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import chordax_dev_team.chordax_songs.song.model.Song;

@RestController
@RequestMapping("api/v1/songs")
public class SongController {

	@Autowired
	private SongService songService;

	@Operation(summary = "Get all songs for a user", description = "Retrieves a list of all songs created by the specified user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Songs retrieved successfully"),
			@ApiResponse(responseCode = "404", description = "No songs found for user", content = @Content(schema = @Schema(implementation = ApiException.class)))
	})
	@GetMapping("/{userId}")
	public ResponseEntity<List<Song>> getAllSongs(@PathVariable Long userId) {
		List<Song> songs = songService.getSongsByUserId(userId);
		return songs != null && !songs.isEmpty()
				? ResponseEntity.ok(songs)
				: ResponseEntity.notFound().build();
	}


	@Operation(summary = "Get a song by user and song ID", description = "Retrieves a song with its lyrics and chords for a specific user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Song retrieved successfully"),
			@ApiResponse(responseCode = "404", description = "Song not found", content = @Content(schema = @Schema(implementation = ApiException.class)))
	})
	@GetMapping("/{userId}/{songId}")
	public ResponseEntity<Song> getUserSong(@PathVariable Long userId,
											@PathVariable Long songId) {
		Song song = songService.getSongByUserAndId(userId, songId);
		return song != null
				? ResponseEntity.ok(song)
				: ResponseEntity.notFound().build();
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

	@Operation(summary = "Delete a song")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Song deleted successfully"),
			@ApiResponse(responseCode = "404", description = "Song not found", content = @Content(schema = @Schema(implementation = ApiException.class)))
	})
	@DeleteMapping("/{userId}/{songId}")
	public ResponseEntity<Void> deleteSong(@PathVariable Long userId,
										   @PathVariable Long songId) {
		try {
			songService.deleteSong(userId, songId);
			return ResponseEntity.noContent().build(); // 204 No Content
		} catch (EntityNotFoundException e) {
			return ResponseEntity.notFound().build(); // 404 Not Found
		}
	}
}
