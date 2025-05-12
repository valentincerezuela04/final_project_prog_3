package com.musicreviewapp.song.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "spotify_id", unique = true, nullable = false)
    private String spotifyId;

    @Column(nullable = false)
    private String name;

    @Column(name = "artist_name", nullable = false)
    private String artistName;

    @Column(name = "album_name")
    private String album;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "duration_ms")
    private Integer durationMs;

    @Column(name = "preview_url")
    private String previewUrl;

    @Column(name = "spotify_link")
    private String spotifyLink;

    @Column(name = "release_date")
    private Date releaseDate;

}
