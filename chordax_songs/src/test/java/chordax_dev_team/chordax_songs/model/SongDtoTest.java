//package chordax_dev_team.chordax_songs.model;
//
//import chordax_dev_team.chordax_songs.model.dto.LineDto;
//import chordax_dev_team.chordax_songs.model.dto.SongDto;
//import chordax_dev_team.chordax_songs.model.enums.LineType;
//import jakarta.validation.ConstraintViolation;
//import jakarta.validation.Validation;
//import jakarta.validation.Validator;
//import org.junit.jupiter.api.Test;
//
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//public class SongDtoTest {
//    private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//
//    @Test
//    void shouldFailValidationWhenTitleIsBlank() {
//        SongDto dto = new SongDto();
//        dto.setTitle(""); // Invalid
//        dto.setLines(Set.of(new LineDto(LineType.VERSE, "Lyrics", Set.of())));
//
//        Set<ConstraintViolation<SongDto>> violations = validator.validate(dto);
//        assertFalse(violations.isEmpty());
//    }
//}
