package com.basak.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basak.app.model.MemberVO;
import com.basak.app.model.SnackVO;
import com.basak.app.service.ISnackService;

@Controller
public class SnackController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	ISnackService snackService;

	@RequestMapping(value={"/snack", "/snack/list"})
	public String getSnackID(HttpSession session, Model model) {
		logger.info("snack list");
		List<SnackVO> snackid = snackService.getSnackID();
		model.addAttribute("snackid", snackid);
		MemberVO member = (MemberVO) session.getAttribute("member");
		if(member == null) {
			logger.info("snack session false");
			model.addAttribute("msg", false);
		} else {
			logger.info("snack session true");
			model.addAttribute("member", member);
		}
		return "snack/list";
	}
	
	@RequestMapping(value="/snack/info/{snackID}")
	public String getSnackInfo(@PathVariable int snackID, HttpSession session, Model model) {
		logger.info("snack info:"+snackID);
		SnackVO snack = snackService.getSnackInfo(snackID);
		model.addAttribute("snack", snack);
		if(snack==null){
			logger.info("null");
		}
		MemberVO member = (MemberVO) session.getAttribute("member");
		if(member == null) {
			logger.info("snack info session false");
			model.addAttribute("msg", false);
		} else {
			logger.info("snack info session true");
			model.addAttribute("member", member);
		}
		return "snack/info";
	}
	
	@RequestMapping(value="/snack/{snackCompany}")
	public String getCompanyInfo(@PathVariable int snackCompany, Model model) {
		logger.info("snack company");
		SnackVO snack = snackService.getCompanyInfo(snackCompany);
		model.addAttribute("snack", snack);
		return "snack/company";
	}
	
	@RequestMapping(value="/snack/{snackCategory}")
	public String getCategoryInfo(@PathVariable int snackCategory, Model model) {
		logger.info("snack category");
		SnackVO snack = snackService.getCategoryInfo(snackCategory);
		model.addAttribute("snack", snack);
		return "snack/category";
	}
	
	@RequestMapping(value="/snack/insert", method=RequestMethod.POST)
	public String insertSnack(SnackVO snack, Model model) {
		logger.info("snack insert");
		snackService.insertSnack(snack);
		return "redirect:/snack";
	}
	
	@RequestMapping(value="/snack/update", method=RequestMethod.POST)
	public String updateSnack(SnackVO snack, Model model) {
		logger.info("snack update");
		snackService.updateSnack(snack);
		return "redirect:/snack/"+snack.getSnackID();
	}
	
	@RequestMapping(value="/snack/delete", method=RequestMethod.GET)
	public String deleteSnack(int snackID, Model model) {
		logger.info("snack delete get");
		model.addAttribute("snack", snackService.getSnackInfo(snackID));
		return "hr/deleteform";
	}
	
	@RequestMapping(value="/snack/delete", method=RequestMethod.POST)
	public String deleteEmp(int snackID, Model model) {
		logger.info("snack delete post");
		snackService.deleteSnack(snackID);
		return "redirect:/snack";
	}
}