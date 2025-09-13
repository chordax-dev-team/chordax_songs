//package chordax_dev_team.chordax_songs.TESTING_ONLY;
//
//import chordax_dev_team.chordax_songs.song.model.dto.SongDto;
//import chordax_dev_team.chordax_songs.song.service.SongService;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.stream.Stream;
//
//
//@Component
//public class UTILS implements CommandLineRunner {
//
//    @Autowired
//    private SongService songService;
//
//    @Override
//    public void run(String... args){
//        System.out.println("CommandLineRunner executed with arguments:");
////        for (String arg : args) {
////            System.out.println(arg);
////        }
//        Stream.of(args)
//                .map(intoSongDto)
//                .forEach(saveSongDto);
//
//    }
//
//    Function<String, SongDto> intoSongDto = file -> {
//        try {
//            return (SongDto) new ObjectMapper().readValue(file, SongDto.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    };
//
//    Consumer<SongDto> saveSongDto = songDto -> songService.addSong(1L,  songDto);
//}