package com.musicreviewapp.music_review_app.artist.repository;

import com.musicreviewapp.music_review_app.artist.entities.ArtistXSongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistXSongRepository extends JpaRepository<ArtistXSongEntity,Long> {
}
