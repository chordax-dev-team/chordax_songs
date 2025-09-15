package chordax_dev_team.chordax_songs.song.model.dto;

import chordax_dev_team.chordax_songs.song.model.enums.LineType;
import java.util.List;

public record LineDto(LineType lineType, String lyrics, List<ToneDto> tones) {}
