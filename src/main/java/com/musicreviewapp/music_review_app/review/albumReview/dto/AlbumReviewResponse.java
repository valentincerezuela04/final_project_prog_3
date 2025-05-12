package com.musicreviewapp.music_review_app.review.albumReview.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AlbumReviewResponse {
    private Long AlbumReviewId;
    private Long UserId;
    private Long AlbumId;
    private String description;
    private Double rating;

}
