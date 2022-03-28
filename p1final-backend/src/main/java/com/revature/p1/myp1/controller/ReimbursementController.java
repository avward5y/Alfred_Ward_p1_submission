package com.revature.p1.myp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.revature.p1.myp1.model.Reimbursement;
import com.revature.p1.myp1.service.ReimbursementService;

@Controller
public class ReimbursementController {
	
	@Autowired
	ReimbursementService reimbursementService;
	

	//view all claims
//	@RequestMapping("viewReimbursement")
//	public ModelAndView showReimbursements() {
//		ModelAndView mav = new ModelAndView("viewReimbursement");
//		List<Reimbursement> list = reimbursementService.findAll();
//		mav.addObject("reimbursements", list);
//		return mav;
//	}
	
	@RequestMapping("/viewReimbursement")
	public String viewReimbursementPage(Model model) {
		model.addAttribute("listOfReimbursements", reimbursementService.findAll());
		return "viewReimbursement.html";
	}
	
	//creates new reimbursement object 
	@GetMapping("/newClaim")
	public ModelAndView showNewClaimForm() {
		ModelAndView mav = new ModelAndView("newClaim");
		Reimbursement newReimbursement = new Reimbursement();
		mav.addObject("Reimbursement", newReimbursement);
		return mav;
	}
	//saves new reimbursement claim
	@PostMapping("/saveClaim")
	public String saveClaim(@ModelAttribute Reimbursement newReimbursement) {
		reimbursementService.saveReimbursement(newReimbursement);
		return "redirect:/viewReimbursement";
	}

}
	
