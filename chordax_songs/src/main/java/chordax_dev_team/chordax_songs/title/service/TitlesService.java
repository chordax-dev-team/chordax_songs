package chordax_dev_team.chordax_songs.title.service;

import chordax_dev_team.chordax_songs.song.repository.SongRepository;
import chordax_dev_team.chordax_songs.title.dto.TitleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TitlesService {

    private final SongRepository songRepository;

    @Transactional
    public List<TitleDto> titles(Long userId) {
        return songRepository.titlesByUserId(userId);
    }
}
