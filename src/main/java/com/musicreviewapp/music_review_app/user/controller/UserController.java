package com.musicreviewapp.music_review_app.user.controller;

import com.musicreviewapp.music_review_app.user.service.UserService;
import com.musicreviewapp.music_review_app.user.dto.SignupRequest;
import com.musicreviewapp.music_review_app.user.dto.UserResponse;
import com.musicreviewapp.music_review_app.user.mapper.UserMapper;
import com.musicreviewapp.music_review_app.user.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/auth/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signupRequest) {
        if (userService.existsByUsername(signupRequest.getUsername())) {
            return ResponseEntity.badRequest().body("Username is already taken!");
        }

        User user = userService.registerUser(signupRequest);
        return ResponseEntity.ok(userMapper.toUserResponse(user));
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/users/username/{username}")
    public ResponseEntity<UserResponse> getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}