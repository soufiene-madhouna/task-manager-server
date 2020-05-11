package com.soufiene.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.soufiene.module.Roles;
//import com.soufiene.module.User;

import com.soufiene.repository.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		ArrayList roles = new ArrayList<>();
		Roles role = new Roles();
		roles.add(role);
		return new User("user", "user", (Collection<? extends GrantedAuthority>) new ArrayList<Roles>());
		//return new User("user", "user", false, false, false, false, roles);

	}

}
