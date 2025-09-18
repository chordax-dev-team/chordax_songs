package chordax_dev_team.chordax_songs.title.controller;

import chordax_dev_team.chordax_songs.song.exceptions.ApiException;
import chordax_dev_team.chordax_songs.song.service.SongService;
import chordax_dev_team.chordax_songs.title.dto.TitleDto;
import chordax_dev_team.chordax_songs.title.service.TitlesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/titles")
@CrossOrigin(origins = "*") // Consider restricting this in production
@RequiredArgsConstructor
public class TitleController {

    private static final Logger logger = LoggerFactory.getLogger(TitleController.class);

    private final SongService songService;
    private final TitlesService titlesService;

    @Operation(summary = "Get all titles for a user", description = "Retrieves a list of all titles created by the specified user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Titles retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "No titles found for user", content = @Content(schema = @Schema(implementation = ApiException.class)))
    })
    @GetMapping("/{userId}")
    public ResponseEntity<List<TitleDto>> getTitles(@PathVariable Long userId) {
        logger.info("GET /api/v1/titles/{} - Fetching titles for user", userId);
        List<TitleDto> titles = titlesService.titles(userId);

        if (titles != null && !titles.isEmpty()) {
            logger.debug("Found {} titles for userId={}", titles.size(), userId);
            return ResponseEntity.ok(titles);
        } else {
            logger.warn("No titles found for userId={}", userId);
            return ResponseEntity.notFound().build();
        }
    }
}
