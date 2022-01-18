package com.assesment.PMS.PMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.assesment.PMS.PMS.service.UserLoginService;

@EnableWebSecurity
public class Configaration extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserLoginService userLoginService;
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(userLoginService)
		.passwordEncoder(bCryptPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable();
		http.authorizeRequests()
		.antMatchers("/").permitAll();
		/*
		 * http.authorizeRequests()
		 * .antMatchers("/viewPharmacist").hasAnyRole("ADMIN","USER") .antMatchers(
		 * "/addpharmacist/**", "/deletepharmacist/**").hasAnyRole("ADMIN")
		 * .anyRequest().authenticated() .and() .formLogin() .permitAll() .and()
		 * .logout() .invalidateHttpSession(true) .permitAll() .logoutRequestMatcher(new
		 * AntPathRequestMatcher("/logout")) .and()
		 * .exceptionHandling().accessDeniedPage("/404");
		 */
		}



	
	
	
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
