package chordax_dev_team.chordax_songs.song.controller;

import chordax_dev_team.chordax_songs.song.exceptions.ApiException;
import chordax_dev_team.chordax_songs.song.model.Song;
import chordax_dev_team.chordax_songs.song.model.dto.SongDto;
import chordax_dev_team.chordax_songs.song.service.SongService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/songs")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // Consider restricting this in production
public class SongController {

	private static final Logger logger = LoggerFactory.getLogger(SongController.class);

	private final SongService songService;

	@Operation(summary = "Get a song by user and song ID", description = "Retrieves a song with its lyrics and chords for a specific user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Song retrieved successfully"),
			@ApiResponse(responseCode = "404", description = "Song not found", content = @Content(schema = @Schema(implementation = ApiException.class)))
	})
	@GetMapping("/{userId}/{songId}")
	public ResponseEntity<Song> getUserSong(@PathVariable Long userId,
											@PathVariable Long songId) {
		logger.info("GET /api/v1/songs/{}/{} - Fetching song for user", userId, songId);
		Song song = songService.getSongByUserAndId(userId, songId);
		if (song != null) {
			logger.debug("Found song ID={} titled '{}'", song.getId(), song.getTitle());
			return ResponseEntity.ok(song);
		} else {
			logger.warn("Song ID={} not found for userId={}", songId, userId);
			return ResponseEntity.notFound().build();
		}
	}

	@Operation(summary = "Add a new song for a user", description = "Creates a song with lyrics and chords")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Song created"),
			@ApiResponse(responseCode = "409", description = "Validation error", content = @Content(schema = @Schema(implementation = ApiException.class))),
			@ApiResponse(responseCode = "400", description = "Validation error", content = @Content(schema = @Schema(implementation = ApiException.class)))
	})
	@PostMapping("/{userId}")
	public ResponseEntity<Song> addSong(@PathVariable Long userId, @Valid @RequestBody SongDto songDto) {
		logger.info("POST /api/v1/songs/{} - Adding new song '{}'", userId, songDto.title());
		Song created = songService.addSong(userId, songDto);
		if (created != null) {
			logger.debug("Created song ID={} titled '{}'", created.getId(), created.getTitle());
			return ResponseEntity.status(HttpStatus.CREATED).body(created);
		} else {
			logger.warn("Song '{}' already exists for userId={}", songDto.title(), userId);
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
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
		logger.info("PUT /api/v1/songs/{}/{} - Updating song '{}'", userId, songId, songDto.title());
		Song updated = songService.updateSong(userId, songId, songDto);
		if (updated != null) {
			logger.debug("Updated song ID={} titled '{}'", updated.getId(), updated.getTitle());
			return ResponseEntity.ok(updated);
		} else {
			logger.warn("Song ID={} not found for userId={}", songId, userId);
			return ResponseEntity.notFound().build();
		}
	}

	@Operation(summary = "Delete a song")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Song deleted successfully"),
			@ApiResponse(responseCode = "404", description = "Song not found", content = @Content(schema = @Schema(implementation = ApiException.class)))
	})
	@DeleteMapping("/{userId}/{songId}")
	public ResponseEntity<Void> deleteSong(@PathVariable Long userId,
										   @PathVariable Long songId) {
		logger.info("DELETE /api/v1/songs/{}/{} - Attempting to delete song", userId, songId);
		try {
			songService.deleteSong(userId, songId);
			logger.debug("Deleted song ID={} for userId={}", songId, userId);
			return ResponseEntity.noContent().build();
		} catch (EntityNotFoundException e) {
			logger.warn("Failed to delete: song ID={} not found for userId={}", songId, userId);
			return ResponseEntity.notFound().build();
		}
	}
}