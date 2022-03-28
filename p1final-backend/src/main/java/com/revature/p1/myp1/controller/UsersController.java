package com.revature.p1.myp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p1.myp1.model.Users;
import com.revature.p1.myp1.service.ReimbursementService;
import com.revature.p1.myp1.service.UserService;

@RestController
public class UsersController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public String viewUsersPage(Model model) {
		model.addAttribute("listOfUsers", userService.findAll());
		return "index";
	}
	
	/*@GetMapping("/users")
	public List<Users> getUsers() {
		return userService.findAll();
	
	}
	*/
	
	@GetMapping("/users/{username}")
	public Users getUserByUsername(String username) {
		return userService.viewUser(username);
	}

}
