package com.basak.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.basak.app.model.ReviewVO;

public interface IReviewRepository {
	List<ReviewVO> getReviewList(@Param("snackId") int snackId);
	void insertReview(ReviewVO rev);
	void updateReview(ReviewVO rev);
	void deleteReview(int memberId, int reviewId);
}