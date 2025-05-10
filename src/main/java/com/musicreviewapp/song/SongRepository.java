package com.musicreviewapp.song;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    //Metod that searches by spotifyId
    Optional<Song> findBySpotifyId(String spotifyId);
}
