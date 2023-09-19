package com.yesgaori.memo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yesgaori.memo.user.domain.User;
import com.yesgaori.memo.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User addUser(
			String loginId
			, String password
			, String name
			, String email) {
		
		User user = User.builder()
						.loginId(loginId)
						.password(password)
						.name(name)
						.email(email)
						.build();
		
		return userRepository.save(user);
		
	}
	
	
}
