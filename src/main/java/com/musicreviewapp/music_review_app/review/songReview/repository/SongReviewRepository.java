package com.musicreviewapp.music_review_app.review.songReview.repository;

import com.musicreviewapp.music_review_app.review.songReview.model.SongReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongReviewRepository extends JpaRepository<SongReview,Long> {
}
