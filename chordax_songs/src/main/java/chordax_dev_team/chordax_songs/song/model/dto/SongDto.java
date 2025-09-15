package chordax_dev_team.chordax_songs.song.model.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.List;

public record SongDto(
        @NotBlank(message = "Title is required")
        String title,
        String composer,
        String author,
        long userId,
        List<LineDto> lines
) {}

