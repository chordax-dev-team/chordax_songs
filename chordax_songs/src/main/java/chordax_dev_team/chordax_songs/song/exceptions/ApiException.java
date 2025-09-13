package chordax_dev_team.chordax_songs.song.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ApiException {
    private int status;
    private String message;
    private LocalDateTime timestamp = LocalDateTime.now();

    public ApiException(int i, String s) {
    }
}
