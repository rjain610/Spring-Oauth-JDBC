package com.rahul.oauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rahul.oauth.dao.UsersRepository;
import com.rahul.oauth.model.CustomUserDetails;
import com.rahul.oauth.model.Users;

/**
 * UserDetailsService is a template class provide by Spring which returns UserDetails object ,
 *  in order to use Custom implementation implement this class 
 * @author rahul
 *
 */
@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UsersRepository userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userDao.findByName(username); // checks if username exists
		if (user == null) throw new UsernameNotFoundException("User name not found");
		return new CustomUserDetails(user);
	}

}
