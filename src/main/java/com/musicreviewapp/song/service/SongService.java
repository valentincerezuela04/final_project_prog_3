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

    public Song saveOrUpdate(Song song) {
        Optional<Song> existingSong = songRepository.findBySpotifyId(song.getSpotifyId());

        if (existingSong.isPresent()) {
            Song updatedSong = existingSong.get();
            updatedSong.setName(song.getName());
            updatedSong.setArtistName(song.getArtistName());
            updatedSong.setAlbum(song.getAlbum());
            updatedSong.setImageUrl(song.getImageUrl());
            updatedSong.setDurationMs(song.getDurationMs());
            updatedSong.setPreviewUrl(song.getPreviewUrl());
            updatedSong.setSpotifyLink(song.getSpotifyLink());
            updatedSong.setReleaseDate(song.getReleaseDate());

            return songRepository.save(updatedSong);
        } else {
            return songRepository.save(song);
        }
    }

    public void deleteById(Long id) {
        songRepository.deleteById(id);
    }

    public List<Song> search(String query) {
        return songRepository.findByNameContainingIgnoreCaseOrArtistNameContainingIgnoreCase(query, query);
    }
}