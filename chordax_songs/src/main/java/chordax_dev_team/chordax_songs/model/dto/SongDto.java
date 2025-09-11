package chordax_dev_team.chordax_songs.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Setter
@Data
public class SongDto {

    @NotBlank(message = "Title is required")
    private String title;

    private String composer;

    private String author;

    private long userId;

    private List<LineDto> lines;
}
