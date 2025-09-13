package chordax_dev_team.chordax_songs.title.controller;

import chordax_dev_team.chordax_songs.song.exceptions.ApiException;
import chordax_dev_team.chordax_songs.song.service.SongService;
import chordax_dev_team.chordax_songs.title.dto.TitleDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/titles/{userId}")
@CrossOrigin(origins = "*") // Consider restricting this in production
public class TitleController {

    @Autowired
    private SongService songService;

    @Operation(summary = "Get all titles for a user", description = "Retrieves a list of all titles created by the specified user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Titles retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "No titles found for user", content = @Content(schema = @Schema(implementation = ApiException.class)))
    })
    @GetMapping
    public ResponseEntity<List<TitleDto>> getTitles(@PathVariable Long userId) {
        List<TitleDto> titles = songService.getTitles(userId);
        return titles != null && !titles.isEmpty()
                ? ResponseEntity.ok(titles)
                : ResponseEntity.notFound().build();
    }
}