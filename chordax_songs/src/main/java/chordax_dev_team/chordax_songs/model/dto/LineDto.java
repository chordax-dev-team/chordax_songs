package chordax_dev_team.chordax_songs.model.dto;

import chordax_dev_team.chordax_songs.model.enums.LineType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@Getter
@AllArgsConstructor
public class LineDto {

    private LineType lineType;

    private String lyrics;

    private List<ToneDto> tones;
}
