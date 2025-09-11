import org.springframework.transaction.annotation.Transactional;

@Transactional
public Song addSong(Long userId, SongDto songDto) {
        System.out.println(songDto);
        // checks if the song exists ...
        Song existing = songRepository.findByUserIdAndTitle(userId, songDto.getTitle());
        System.out.println("existing: " + existing);
        // ... if so, returns null ...
        if (existing != null) return null;
        // ... if not, it creates a new song
        Song newSong = new Song();
        System.out.println("newSong: " + newSong);
        newSong.setUserId(userId);
        newSong.setTitle(songDto.getTitle());
        newSong.setComposer(songDto.getComposer());
        newSong.setAuthor(songDto.getAuthor());
        newSong.setEnteredAt(LocalDateTime.now());
        System.out.println("newSong: " + newSong);
        List<LineDto> lineDtoList = songDto.getLines();
        System.out.println("lineDtoList: " + lineDtoList);
        for(LineDto lineDto : lineDtoList){
        Line line = new Line();
        line.setLineType(lineDto.getLineType());
        line.setLyrics(lineDto.getLyrics());
        List<ToneDto> toneDtoList = lineDto.getTones();
        for(ToneDto toneDto : toneDtoList){
        // checks if the tone exists ...
        Tone tone = toneRepository.findByChordAndPosition(toneDto.getChord(), toneDto.getPosition());
        // ... if not, it creates a new tone ...
        if(tone == null) {
        tone = new Tone();
        tone.setChord(toneDto.getChord());
        tone.setPosition(toneDto.getPosition());
        line.getTones().add(toneRepository.save(tone));
        }
        else{
        // ... if so, assigns existing one to the line
        line.getTones().add(tone);
        }
        }
        Line lineSaved = lineRepository.save(line);
        newSong.getLines().add(lineSaved);
        System.out.println("newSong: " + newSong);
        }
        return songRepository.save(newSong);
        }