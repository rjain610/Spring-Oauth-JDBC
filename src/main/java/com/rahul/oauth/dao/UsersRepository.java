package com.rahul.oauth.dao;

import org.springframework.stereotype.Repository;

import com.rahul.oauth.model.Users;


public interface UsersRepository {
	
  Users findByName(String username);
}
