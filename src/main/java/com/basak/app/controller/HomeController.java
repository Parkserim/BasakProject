package com.basak.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basak.app.model.MemberVO;
import com.basak.app.model.RecommendVO;
import com.basak.app.service.IRecommendService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	IRecommendService recommendService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session, Model model) {
		logger.info("Welcome home! The client locale");
		MemberVO member = (MemberVO) session.getAttribute("member");
		List<RecommendVO> recommendid = recommendService.getRecommendList();
		model.addAttribute("recommendid", recommendid);
		if(member == null) {
			logger.info("session false");
			model.addAttribute("msg", false);
		} else {
			logger.info("session true");
			model.addAttribute("member", member);
		}
		return "home";
	}
}
