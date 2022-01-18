package com.assesment.PMS.PMS.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesment.PMS.PMS.model.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, Integer>{

	Optional<UserLogin> findByuserName(String userName);
}
