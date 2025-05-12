package com.musicreviewapp.music_review_app.album;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<AlbumEntity> getAll() {
        return albumRepository.findAll();
    }

    public Optional<AlbumEntity> getById(Long id) {
        return albumRepository.findById(id);
    }

    public List<AlbumEntity> getByTitle(String title) {
        return albumRepository.findByTitleIgnoreCase(title);
    }

    public AlbumEntity save(AlbumEntity album) {
        return albumRepository.save(album);
    }
    public Optional<AlbumEntity> findBySpotifyId(String spotifyId) {
        return albumRepository.findBySpotifyId(spotifyId);
    }
    public void delete(Long id) {
        albumRepository.deleteById(id);
    }
}
