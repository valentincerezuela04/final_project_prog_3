package com.musicreviewapp.music_review_app.user.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

<<<<<<< Updated upstream
@Entity
@Table(name = "credentials")
=======
>>>>>>> Stashed changes
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
<<<<<<< Updated upstream
public class Credential {

    @Id
    private Long id;

=======

@Entity
@Table(name = "credentials")
public class Credential {

    @Id
    @Column(name = "user_id")
    private Long id;


>>>>>>> Stashed changes
    @NotBlank
    @Size(min = 8, max = 120)
    private String password;

    @OneToOne
<<<<<<< Updated upstream
    @MapsId
=======
>>>>>>> Stashed changes
    @JoinColumn(name = "user_id")
    private User user;
}