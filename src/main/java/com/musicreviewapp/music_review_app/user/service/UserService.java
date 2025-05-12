package com.musicreviewapp.music_review_app.user.service;

import com.musicreviewapp.music_review_app.user.dto.SignupRequest;
import com.musicreviewapp.music_review_app.user.dto.UserResponse;
import com.musicreviewapp.music_review_app.user.mapper.UserMapper;
import com.musicreviewapp.music_review_app.user.model.Credential;
<<<<<<< Updated upstream
import com.musicreviewapp.music_review_app.user.model.ERole;
import com.musicreviewapp.music_review_app.user.model.User;
import com.musicreviewapp.music_review_app.user.repositories.UserRepository;
=======
import com.musicreviewapp.music_review_app.user.enums.ERole;
import com.musicreviewapp.music_review_app.user.model.User;
import com.musicreviewapp.music_review_app.user.repository.UserRepository;
>>>>>>> Stashed changes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public User registerUser(SignupRequest signupRequest) {
        User user = User.builder()
                .username(signupRequest.getUsername())
                .role(ERole.USER)
                .build();

        Credential credential = Credential.builder()
                .password(signupRequest.getPassword())
                .user(user)
                .build();

        user.setCredential(credential);
        return userRepository.save(user);
    }

    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toUserResponse)
                .collect(Collectors.toList());
    }

    public Optional<UserResponse> getUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toUserResponse);
    }

    public Optional<UserResponse> getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .map(userMapper::toUserResponse);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }
}