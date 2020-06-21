package com.basak.app.service;

import java.util.List;

import com.basak.app.model.ReviewVO;

public interface IReviewService {
	List<ReviewVO> getReviewList(int snackId);
	void insertReview(ReviewVO review);
	void updateReview(ReviewVO review);
	void deleteReview(int memberId, int reviewId);
}