package com.musicreviewapp.music_review_app.user.dto;

<<<<<<< Updated upstream
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
=======
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
>>>>>>> Stashed changes
public class UserResponse {
    private Long id;
    private String username;
    private String role;
}