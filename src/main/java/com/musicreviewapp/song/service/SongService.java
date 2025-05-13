package com.musicreviewapp.song.service;

import com.musicreviewapp.song.model.Song;
import com.musicreviewapp.song.repository.SongRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> findAll() {
        return songRepository.findAll();
    }

    public Optional<Song> findById(Long id) {
        return songRepository.findById(id);
    }

    public Optional<Song> findBySpotifyId(String spotifyId) {
        return songRepository.findBySpotifyId(spotifyId);
    }

    public Song save(Song song) {
        return songRepository.save(song);
    }

    public List<Song> search(String query) {
        return songRepository.findByNameContainingIgnoreCaseOrArtistNameContainingIgnoreCase(query, query);
    }
}