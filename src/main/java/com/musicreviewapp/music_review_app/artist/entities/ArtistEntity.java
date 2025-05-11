package com.musicreviewapp.music_review_app.artist.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artist")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name =  "age")
    private int age;

    @Column(name = "biography")
    private String bigraphy;

    @OneToMany(mappedBy = "song",cascade = CascadeType.ALL)
    private List<ArtistXSongEntity> artistSongs = new ArrayList<>();


}
