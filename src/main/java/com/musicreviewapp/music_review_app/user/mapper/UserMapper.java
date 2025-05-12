package com.musicreviewapp.music_review_app.user.mapper;

import com.musicreviewapp.music_review_app.user.dto.SignupRequest;
import com.musicreviewapp.music_review_app.user.dto.UserResponse;
<<<<<<< Updated upstream
import com.musicreviewapp.music_review_app.user.model.ERole;
=======
import com.musicreviewapp.music_review_app.user.enums.ERole;
>>>>>>> Stashed changes
import com.musicreviewapp.music_review_app.user.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse toUserResponse(User user) {
        return UserResponse.builder()
<<<<<<< Updated upstream
                .id(user.getUser_id())
=======
                .id(user.getUserId())
>>>>>>> Stashed changes
                .username(user.getUsername())
                .role(user.getRole().getRole())
                .build();
    }

    public User toUserEntity(SignupRequest request) {
        return User.builder()
                .username(request.getUsername())
                .role(ERole.USER)
                .build();
    }
}