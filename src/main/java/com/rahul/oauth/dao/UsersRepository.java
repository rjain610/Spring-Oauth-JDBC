package com.rahul.oauth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.oauth.model.Users;



public interface UsersRepository extends  JpaRepository<Users,Integer>{
	
 Users findByName(String email);
}
