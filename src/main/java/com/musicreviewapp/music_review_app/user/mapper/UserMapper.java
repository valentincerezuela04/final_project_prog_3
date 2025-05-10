package com.musicreviewapp.music_review_app.user.mapper;

import com.musicreviewapp.music_review_app.user.dto.SignupRequest;
import com.musicreviewapp.music_review_app.user.dto.UserResponse;
import com.musicreviewapp.music_review_app.user.model.ERole;
import com.musicreviewapp.music_review_app.user.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getUser_id())
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