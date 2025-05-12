package com.musicreviewapp.music_review_app.user.model;

<<<<<<< Updated upstream
=======
import com.musicreviewapp.music_review_app.user.enums.ERole;
>>>>>>> Stashed changes
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

<<<<<<< Updated upstream
@Entity
@Table(name = "clients")
=======
>>>>>>> Stashed changes
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
<<<<<<< Updated upstream
=======

@Entity
@Table(name = "clients")
>>>>>>> Stashed changes
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< Updated upstream
    private Long user_id;

    @NotBlank
    @Size(min = 3, max = 50)
    @Column(name = "username", unique = true)
=======
    @Column(name = "user_id")
    private Long userId;

    @NotBlank
    @Size(min = 3, max = 50)
    @Column(name = "username", unique = true, nullable = false)
>>>>>>> Stashed changes
    private String username;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private ERole role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Credential credential;
<<<<<<< Updated upstream
=======

    @Column(name = "active", nullable = false)
    private Boolean active;
>>>>>>> Stashed changes
}