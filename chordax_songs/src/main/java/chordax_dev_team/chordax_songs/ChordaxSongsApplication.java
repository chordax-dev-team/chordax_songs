package chordax_dev_team.chordax_songs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

@EnableDiscoveryClient
@SpringBootApplication
public class ChordaxSongsApplication {

	public static void main(String[] args) {


//		String FILE_PATH = "src/main/resources/songs_to_enter/autostart";
//
//		File folder = new File(FILE_PATH);
//		File[] files = folder.listFiles();
//
//        assert files != null;
//		String[] customArgs = java.util.Arrays.stream(files)
//				.map(file -> {
//					try {
//						return Files.readString(Paths.get(file.getPath()));
//					} catch (IOException e) {
//						throw new RuntimeException(e);
//					}
//				}).toArray(String[]::new);
//		System.out.println(Arrays.toString(customArgs));

		SpringApplication.run(ChordaxSongsApplication.class, args);
	}

}
