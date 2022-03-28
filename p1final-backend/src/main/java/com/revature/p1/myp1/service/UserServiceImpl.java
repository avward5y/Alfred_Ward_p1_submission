package com.revature.p1.myp1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p1.myp1.model.Reimbursement;
import com.revature.p1.myp1.model.Users;
import com.revature.p1.myp1.repo.UsersRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UsersRepository userRepository;

	@Override
	public Users userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUsernameAndPassword(username, password);
	}

	@Override
	public Users userLogout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users viewUser(String username) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUsername(username);
	}

	@Override
	public Users updateUser(int id, Users users) {
		// TODO Auto-generated method stub
		return userRepository.save(users);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	
}
