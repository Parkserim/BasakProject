package com.basak.app.service;

import java.util.List;

import com.basak.app.model.RecommendVO;

public interface IRecommendService {
	List<RecommendVO> getRecommendList();
	void insertRecommend(RecommendVO recommend);
	void updateRecommend(RecommendVO recommend);
	void deleteRecommend(int memberId, int recommendId);
}