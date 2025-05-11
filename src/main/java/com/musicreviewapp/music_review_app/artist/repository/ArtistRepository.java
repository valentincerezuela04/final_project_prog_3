package com.musicreviewapp.music_review_app.artist.repository;

import com.musicreviewapp.music_review_app.artist.entities.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<ArtistEntity,Long> {
}
