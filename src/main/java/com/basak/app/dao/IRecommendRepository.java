package com.basak.app.dao;

import java.util.List;

import com.basak.app.model.RecommendVO;

public interface IRecommendRepository {
	List<RecommendVO> getRecommendList();
	void updateRecommend(RecommendVO recommend);
	void insertRecommend(RecommendVO recommend);
	void deleteRecommend(int memberId, int recommendId);
}