package com.rahul.oauth.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahul.oauth.model.Users;

@Repository
public class UserRepositoryImpl implements UsersRepository {

	@Autowired
	EntityManager em;
	
	@Override
	public Users findByName(String username) {
		String query = "from Users where username =:username";
		return (Users) em.createQuery(query).setParameter("username", username).getSingleResult();
		
	}

}
