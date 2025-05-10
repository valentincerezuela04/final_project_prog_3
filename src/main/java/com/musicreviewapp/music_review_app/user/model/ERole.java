package com.musicreviewapp.music_review_app.user.model;


import lombok.Getter;
public enum ERole {
    ADMIN ("Admin"), USER ("User");

    @Getter
    private String role;

    ERole(String role) {
        this.role = role;
    }
}
