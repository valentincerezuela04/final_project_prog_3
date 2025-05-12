package com.musicreviewapp.music_review_app.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
<<<<<<< Updated upstream
import lombok.Data;

@Data
=======
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
>>>>>>> Stashed changes
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 50)
    private String username;

    @NotBlank
    @Size(min = 8, max = 120)
    private String password;
}