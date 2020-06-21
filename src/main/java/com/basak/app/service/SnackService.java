package com.basak.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.basak.app.dao.ISnackRepository;
import com.basak.app.model.SnackVO;

@Service
public class SnackService implements ISnackService {

	@Autowired
	ISnackRepository snackRepository;
	
	@Override
	public List<SnackVO> getSnackID() {
		return snackRepository.getSnackID();
	}

	@Override
	public SnackVO getSnackInfo(int snackID) {
		return snackRepository.getSnackInfo(snackID);
	}
	
	@Override
	public SnackVO getCompanyInfo(int snackCompany) {
		return snackRepository.getCompanyInfo(snackCompany);
	}
	
	@Override
	public SnackVO getCategoryInfo(int snackCategory) {
		return snackRepository.getCategoryInfo(snackCategory);
	}

	@Override
	public void updateSnack(SnackVO snack) {
		snackRepository.updateSnack(snack);
	}

	@Override
	public void insertSnack(SnackVO snack) {
		snackRepository.insertSnack(snack);
	}

	@Override
	@Transactional
	public void deleteSnack(int snackID) {
		snackRepository.deleteSnack(snackID);
	}
}