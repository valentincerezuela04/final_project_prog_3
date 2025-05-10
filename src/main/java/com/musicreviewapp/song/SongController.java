package com.musicreviewapp.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<Song> getAllSongs() {
        try {
            List<Song> songs = songService.getAll();
            System.out.println("Songs from DB:");
            songs.forEach(System.out::println);
            return songs;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id){
        return songService.getById(id)
                .orElseThrow(() -> new RuntimeException("The song was not found"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Song addSong(@RequestBody Song song){
        return songService.save(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id){
        songService.delete(id);
    }
}
