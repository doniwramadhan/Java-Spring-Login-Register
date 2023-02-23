package com.info.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.info.modul.User;
import com.info.webdto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

