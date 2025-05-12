package com.musicreviewapp.music_review_app.user.repositories;

import com.musicreviewapp.music_review_app.user.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, Long> {
}