package com.basak.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.basak.app.model.MemberVO;
import com.basak.app.model.RecommendVO;
import com.basak.app.service.IRecommendService;

@Controller

public class RecommendController {
	
	private static final Logger logger = LoggerFactory.getLogger(RecommendController.class);
	
	@Autowired
	IRecommendService recommendService;
	
	@RequestMapping("recommend/write.do")
	public String insertRecommend(HttpSession session, @ModelAttribute RecommendVO recommend, Model model) {
		logger.info("recommend insert");
		MemberVO member = (MemberVO) session.getAttribute("member");
		recommend.setmemberId(member.getMemberId());
		recommendService.insertRecommend(recommend);
		return "redirect:/";
	}
	
	@RequestMapping(value="/recommend/update", method=RequestMethod.GET)
	public String updateRecommend(HttpSession session, Model model) {
		MemberVO member = (MemberVO) session.getAttribute("member");
		return "redirect:/";
	}
	
	@RequestMapping(value="/recommend/update", method=RequestMethod.POST)
	public String updateRecommend(HttpSession session, RecommendVO recommend, Model model) {
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		recommendService.updateRecommend(recommend);
		return "redirect:/recommend/"+recommend.getRecommendId();
	}

	@RequestMapping("/recommend/delete.do")
	public String deleteRecommend(HttpSession session, @PathVariable int memberId, @PathVariable int reviewId, Model model) {
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		recommendService.deleteRecommend(memberId, reviewId);
		return "redirect:/";
	}
}//end class