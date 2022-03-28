package com.revature.p1.myp1.service;

import java.util.List;

import com.revature.p1.myp1.model.Users;

public interface UserService {
	
	public Users userLogin(String username, String password);
	
	public Users userLogout();
	
	public Users viewUser (String User);
	
	public Users updateUser(int id, Users users);
	
	public List<Users> findAll();
}
