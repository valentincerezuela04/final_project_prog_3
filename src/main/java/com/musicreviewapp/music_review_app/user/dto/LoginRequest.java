package com.musicreviewapp.music_review_app.user.dto;

import jakarta.validation.constraints.NotBlank;
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
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}