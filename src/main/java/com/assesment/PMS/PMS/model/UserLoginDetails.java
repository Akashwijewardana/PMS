package com.assesment.PMS.PMS.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class UserLoginDetails implements UserDetails {

	

	private String username;
	

	private String password;
	

	private Boolean user_status;
	
	private List<GrantedAuthority> user_role ;

	public UserLoginDetails (UserLogin userLogin) {
		this.username= userLogin.getUserName();
		this.password = userLogin.getPassword();
		this.user_status = userLogin.getUser_status();
		this.user_role = Arrays.stream(userLogin.getUser_role().split(","))
		.map(SimpleGrantedAuthority::new)
		.collect(Collectors.toList());
	}
	
	
	
	
	
	public UserLoginDetails() {
		
		
	}





	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return user_role;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return user_status;
	}



	
	
}
