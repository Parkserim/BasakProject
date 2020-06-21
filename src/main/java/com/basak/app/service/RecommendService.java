package com.basak.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.basak.app.dao.IRecommendRepository;
import com.basak.app.model.RecommendVO;

@Service
public class RecommendService implements IRecommendService {

	@Autowired
	@Qualifier("IRecommendRepository")
	IRecommendRepository recommendRepository;

	@Override
	public List<RecommendVO> getRecommendList() {
		return recommendRepository.getRecommendList();
	}

	@Override
	public void insertRecommend(RecommendVO recommend) {
		recommendRepository.insertRecommend(recommend);
	}

	@Override
	public void updateRecommend(RecommendVO recommend) {
		recommendRepository.updateRecommend(recommend);
		
	}

	@Override
	public void deleteRecommend(int memberId, int recommendId) {
		recommendRepository.deleteRecommend(memberId, recommendId);
		
	}

}