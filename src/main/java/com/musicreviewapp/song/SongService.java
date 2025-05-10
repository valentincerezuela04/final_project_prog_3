package com.musicreviewapp.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public List<Song> getAll(){
        return songRepository.findAll();
    }

    public Optional<Song> getById(Long id){
        return songRepository.findById(id);
    }

    public Song save(Song song){
        return songRepository.save(song);
    }

    public void delete(Long id){
        songRepository.deleteById(id);
    }

}
