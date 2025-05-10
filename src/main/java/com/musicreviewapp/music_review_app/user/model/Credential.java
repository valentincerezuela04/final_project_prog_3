package com.musicreviewapp.music_review_app.user.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "credentials")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Credential {

    @Id
    private Long id;

    @NotBlank
    @Size(min = 8, max = 120)
    private String password;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}