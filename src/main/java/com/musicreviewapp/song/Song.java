package com.musicreviewapp.song;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "spotify_id")
    private String spotifyId;

    private String name;

    @Column(name = "artist_name")
    private String artistName;

    private String album;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "duration_ms")
    private Integer durationMs;

    @Column(name = "preview_url")
    private String previewUrl;

    @Column(name = "spotify_link")
    private String spotifyLink;

    private Integer popularity;

    // --- Constructores ---
//    public Song() {}
//
//    public Song(Long id, String spotifyId, String name, String artistName, String album,
//                String imageUrl, Integer durationMs, String previewUrl,
//                String spotifyLink, Integer popularity) {
//        this.id = id;
//        this.spotifyId = spotifyId;
//        this.name = name;
//        this.artistName = artistName;
//        this.album = album;
//        this.imageUrl = imageUrl;
//        this.durationMs = durationMs;
//        this.previewUrl = previewUrl;
//        this.spotifyLink = spotifyLink;
//        this.popularity = popularity;
//    }

//    // --- Getters y Setters ---
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public String getSpotifyId() { return spotifyId; }
//    public void setSpotifyId(String spotifyId) { this.spotifyId = spotifyId; }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//
//    public String getArtistName() { return artistName; }
//    public void setArtistName(String artistName) { this.artistName = artistName; }
//
//    public String getAlbum() { return album; }
//    public void setAlbum(String album) { this.album = album; }
//
//    public String getImageUrl() { return imageUrl; }
//    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
//
//    public Integer getDurationMs() { return durationMs; }
//    public void setDurationMs(Integer durationMs) { this.durationMs = durationMs; }
//
//    public String getPreviewUrl() { return previewUrl; }
//    public void setPreviewUrl(String previewUrl) { this.previewUrl = previewUrl; }
//
//    public String getSpotifyLink() { return spotifyLink; }
//    public void setSpotifyLink(String spotifyLink) { this.spotifyLink = spotifyLink; }
//
//    public Integer getPopularity() { return popularity; }
//    public void setPopularity(Integer popularity) { this.popularity = popularity; }
//
//    // --- toString() ---
//    @Override
//    public String toString() {
//        return "Song{" +
//                "id=" + id +
//                ", spotifyId='" + spotifyId + '\'' +
//                ", name='" + name + '\'' +
//                ", artistName='" + artistName + '\'' +
//                ", album='" + album + '\'' +
//                ", imageUrl='" + imageUrl + '\'' +
//                ", durationMs=" + durationMs +
//                ", previewUrl='" + previewUrl + '\'' +
//                ", spotifyLink='" + spotifyLink + '\'' +
//                ", popularity=" + popularity +
//                '}';

}
