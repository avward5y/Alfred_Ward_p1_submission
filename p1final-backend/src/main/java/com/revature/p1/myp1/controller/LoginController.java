package com.revature.p1.myp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.revature.p1.myp1.model.Login;
import com.revature.p1.myp1.model.Reimbursement;
import com.revature.p1.myp1.model.Users;
import com.revature.p1.myp1.service.ReimbursementService;
import com.revature.p1.myp1.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	ReimbursementService reimbursementService;
	
	//home login page
	@GetMapping({"/", "/login"})
	public String index(Model model) {		
		return "index";
	}
	//checks credentials
	@PostMapping("/")
	public Users checkLogin(@RequestBody Login login) {
		return userService.userLogin(login.getUsername(), login.getPassword());
	}	
		
	//manager home login page
	@RequestMapping("/managerLogin")
	public String managerLogin() {
		return "managerLogin";
	}
	
	//checks credentials
		@PostMapping("/managerLogin")
	public Users checkManagerLogin(@RequestBody Login login) {
		return userService.userLogin(login.getUsername(), login.getPassword());
	}	
	
	
	//view all claims
	@RequestMapping("viewReimbursement")
	public ModelAndView showReimbursements() {
		ModelAndView mav = new ModelAndView("viewReimbursement");
		List<Reimbursement> list = reimbursementService.findAll();
		mav.addObject("reimbursements", list);
		return mav;
	}
}
