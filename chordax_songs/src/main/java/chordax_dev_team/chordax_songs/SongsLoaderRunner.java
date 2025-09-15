package chordax_dev_team.chordax_songs;

import chordax_dev_team.chordax_songs.song.model.dto.LineDto;
import chordax_dev_team.chordax_songs.song.model.dto.SongDto;
import chordax_dev_team.chordax_songs.song.model.dto.ToneDto;
import chordax_dev_team.chordax_songs.song.model.enums.LineType;
import chordax_dev_team.chordax_songs.song.service.SongService;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

@Component
public class SongsLoaderRunner implements ApplicationRunner {
    private static final Logger LOG = LoggerFactory.getLogger(SongsLoaderRunner.class);

    @Autowired
    private SongService songService;

    @Override
    public void run(ApplicationArguments args) {

        LOG.info("Application started with option names");
        final String FILE_PATH = "src/main/resources/songs/";
        File folder = new File(FILE_PATH);

        if (!folder.exists() || !folder.isDirectory()) {
            throw new IllegalArgumentException("Invalid folder path: " + FILE_PATH);
        }

        File[] files = folder.listFiles();

        assert files != null;
        Stream.of(files)
                .filter(File::isFile)
                .map(file -> {
                    try {
                        return Files.readString(Path.of(file.getAbsolutePath()));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(content -> JsonParser.parseString(content)
                        .getAsJsonObject())
                .map(jsonToSong)
                .forEach(songDto -> {
                    LOG.info("Loading song: {}", songDto.title());
                    songService.addSong(1L, songDto);
                });
    }

    Function<JsonObject, SongDto> jsonToSong = json -> {
        List<JsonElement> jsonLines = json.getAsJsonArray("lines").asList();
        List<LineDto> lines = new ArrayList<>();

        for (JsonElement jE : jsonLines) {
            JsonObject jsonLine = jE.getAsJsonObject();
            List<JsonElement> jsonTones = jsonLine.getAsJsonArray("tones").asList();
            List<ToneDto> tones = new ArrayList<>();

            for (JsonElement jsonTone : jsonTones) {
                JsonObject toneObj = jsonTone.getAsJsonObject();
                String chord = toneObj.get("chord").getAsString();
                int position = toneObj.get("position").getAsInt();
                tones.add(new ToneDto(chord, position));
            }

            LineType lineType = LineType.valueOf(jsonLine.get("lineType").getAsString());
            String lyrics = jsonLine.get("lyrics").getAsString();
            lines.add(new LineDto(lineType, lyrics, tones));
        }

        String title = json.get("title").getAsString();
        String composer = json.get("composer").getAsString();
        String author = json.get("author").getAsString();

        return new SongDto(title, composer, author, 1, lines);
    };
}
