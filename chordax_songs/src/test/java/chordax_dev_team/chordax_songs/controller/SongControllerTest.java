//package chordax_dev_team.chordax_songs.controller;
//
//import chordax_dev_team.chordax_songs.model.Song;
//import chordax_dev_team.chordax_songs.service.SongService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//@WebMvcTest(SongController.class)
//class SongControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private SongService songService;
//
//    @Test
//    void shouldReturnSongById() throws Exception {
//        Song song = new Song();
//        song.setId(1L);
//        song.setTitle("Bohemian Rhapsody");
//
//        when(songService.getSongByUserAndId(1L,1L)).thenReturn(song);
//
//        mockMvc.perform(get("/api/v1/songs/1"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.title").value("Bohemian Rhapsody"));
//    }
//}