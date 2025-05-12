package com.musicreviewapp.music_review_app.review.albumReview.repository;

import com.musicreviewapp.music_review_app.review.albumReview.model.AlbumReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumReviewRepository extends JpaRepository<AlbumReview,Long> {

}
