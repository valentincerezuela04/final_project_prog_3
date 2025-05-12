package com.musicreviewapp.song.controller;

import com.musicreviewapp.song.mapper.SongMapper;
import com.musicreviewapp.song.model.Song;
import com.musicreviewapp.song.dto.SongResponse;
import com.musicreviewapp.song.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SongController {

    @Autowired
    private SongService songService;

    @Autowired
    private SongMapper songMapper;

    @GetMapping("/songs")
    public ResponseEntity<List<SongResponse>> getAllSongs() {
        List<Song> songs = songService.findAll();
        return ResponseEntity.ok(songMapper.toResponseList(songs));
    }

    @GetMapping("/songs/{id}")
    public ResponseEntity<SongResponse> getSongById(@PathVariable Long id) {
        Optional<Song> song = songService.findById(id);
        return song.map(value -> ResponseEntity.ok(songMapper.toResponse(value)))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/songs/spotify/{spotifyId}")
    public ResponseEntity<SongResponse> getSongBySpotifyId(@PathVariable String spotifyId) {
        Optional<Song> song = songService.findBySpotifyId(spotifyId);
        return song.map(value -> ResponseEntity.ok(songMapper.toResponse(value)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/songs")
    public ResponseEntity<SongResponse> createSong(@RequestBody Song song) {
        Song savedSong = songService.save(song);
        return new ResponseEntity<>(songMapper.toResponse(savedSong), HttpStatus.CREATED);
    }

    @PutMapping("/songs/{id}")
    public ResponseEntity<SongResponse> updateSong(@PathVariable Long id, @RequestBody Song song) {
        Optional<Song> existingSong = songService.findById(id);

        if (existingSong.isPresent()) {
            song.setId(id);
            Song updatedSong = songService.save(song);
            return ResponseEntity.ok(songMapper.toResponse(updatedSong));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/songs/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSong(@PathVariable Long id) {
        songService.deleteById(id);
    }

    @GetMapping("/songs/search")
    public ResponseEntity<List<SongResponse>> searchSongs(@RequestParam String query) {
        List<Song> songs = songService.search(query);
        return ResponseEntity.ok(songMapper.toResponseList(songs));
    }
}