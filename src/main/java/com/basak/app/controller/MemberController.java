package com.basak.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.basak.app.model.MemberVO;
import com.basak.app.service.IMemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	IMemberService memberService;
	
	// ȸ�� ���
	@RequestMapping("list.do")
	public String memberList(Model model) {
		logger.info("member list.do");
		List<MemberVO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/list";
	}
	
	// ȸ�� ���
	@RequestMapping("write.do")
	public String memberWrite() {
		logger.info("member write.do");
		return "member/write";
	}
	
	// ȸ�� ��� ó��
	@RequestMapping("insert.do")
	public String memberInsert(@ModelAttribute MemberVO vo) {
		logger.info("member insert.do");
		memberService.insertMember(vo);
		return "redirect:/";
	}
	
	// �α��� ȭ��
	@RequestMapping("login.do")
	public String login() {
		logger.info("member login.do");
		return "member/login";
	}
	
	// �α���
	@RequestMapping("login")
	public String login(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) {
		logger.info("member login");
		HttpSession session = req.getSession();
		MemberVO login = memberService.login(vo);
		
		if(login == null) {
			logger.info("member login false");
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		} else {
			logger.info("member login true");
			session.setAttribute("member", login);
		}
		return "redirect:/";
	}
	
	// �α׾ƿ� ó��
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		logger.info("member logout");
		session.invalidate();
		return "redirect:/";
	}
}
