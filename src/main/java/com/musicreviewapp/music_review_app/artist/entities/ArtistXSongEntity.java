package com.musicreviewapp.music_review_app.artist.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "artist_x_song")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArtistXSongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private ArtistEntity artist;

/*    @ManyToOne
    @JoinColumn(name = "song_id")
    //private Song song;*/


}
