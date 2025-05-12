package com.musicreviewapp.song.repository;

import com.musicreviewapp.song.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    Optional<Song> findBySpotifyId(String spotifyId);

    List<Song> findByNameContainingIgnoreCaseOrArtistNameContainingIgnoreCase(
            String name, String artistName);
    // Page<Song> findByArtistNameContainingIgnoreCase(String artistName, Pageable pageable);
    // Page implementation soon
}
