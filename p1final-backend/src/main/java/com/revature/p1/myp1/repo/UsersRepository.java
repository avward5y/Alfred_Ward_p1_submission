package com.revature.p1.myp1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p1.myp1.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

		public Users getUserByUsernameAndPassword(String username, String password);
		
		public Users getUserByUsername(String username);
}
