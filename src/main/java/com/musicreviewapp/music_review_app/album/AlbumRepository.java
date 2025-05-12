package com.musicreviewapp.music_review_app.album;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlbumRepository extends JpaRepository<AlbumEntity,Long> {

    List<AlbumEntity> findByTitleIgnoreCase(String title);

    Optional<AlbumEntity> findBySpotifyId(String spotifyId);}
