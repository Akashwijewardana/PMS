package com.assesment.PMS.PMS.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.assesment.PMS.PMS.model.UserLogin;
import com.assesment.PMS.PMS.model.UserLoginDetails;
import com.assesment.PMS.PMS.repository.UserLoginRepository;

@Service
public class UserLoginService implements UserDetailsService {


	@Autowired
	private UserLoginRepository userLoginRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<UserLogin> userLogin = userLoginRepository.findByuserName(username);
		userLogin.orElseThrow(() -> new UsernameNotFoundException("User name is not exists :"+username));
		return userLogin.map(UserLoginDetails::new).get();
				
		
	}
}
