package com.basak.app.service;

import java.util.List;

import com.basak.app.model.SnackVO;

public interface ISnackService {
	List<SnackVO> getSnackID();
	SnackVO getSnackInfo(int snackID);
	SnackVO getCompanyInfo(int snackCompany);
	SnackVO getCategoryInfo(int snackCategory);
	void updateSnack(SnackVO snack);
	void insertSnack(SnackVO snack);
	void deleteSnack(int snackID);
}