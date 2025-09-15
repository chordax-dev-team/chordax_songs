package chordax_dev_team.chordax_songs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ChordaxSongsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChordaxSongsApplication.class, args);
	}
}