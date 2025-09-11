//package chordax_dev_team.chordax_songs.service;
//
//import chordax_dev_team.chordax_songs.model.Line;
//import chordax_dev_team.chordax_songs.model.Song;
//import chordax_dev_team.chordax_songs.model.Tone;
//import chordax_dev_team.chordax_songs.model.dto.LineDto;
//import chordax_dev_team.chordax_songs.model.dto.SongDto;
//import chordax_dev_team.chordax_songs.model.enums.Chord;
//import chordax_dev_team.chordax_songs.model.enums.LineType;
//import chordax_dev_team.chordax_songs.repository.SongRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.util.List;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class SongServiceTest {
//
//    @Autowired
//    private SongService songService;
//
//    @MockBean
//    private SongRepository songRepository;
//
//    @Test
//    void shouldAddNewSong() {
//        SongDto dto = new SongDto();
//        dto.setTitle("Test Song");
//        dto.setComposer("Composer");
//        dto.setAuthor("Author");
//        dto.setLines(Set.of(new LineDto(LineType.VERSE, "Lyrics", Set.of())));
//
//        Song song = new Song();
//        song.setId(1L);
//        song.setTitle(dto.getTitle());
//
//        when(songRepository.save(any(Song.class))).thenReturn(song);
//
//        Song result = songService.addSong(1L, dto);
//
//        assertNotNull(result);
//        assertEquals("Test Song", result.getTitle());
//        verify(songRepository).save(any(Song.class));
//    }
//}
//
//
