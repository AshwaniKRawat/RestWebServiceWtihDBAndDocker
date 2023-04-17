package com.ashwani.restwebservicedocker.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ashwani.restwebservicedocker.entity.User;

@Repository
@Transactional
public class UserDataJpaRepositoryImpl {
	private static List<User> users = new ArrayList<>();
	private final static Logger LOGGER = LoggerFactory.getLogger(UserDataJpaRepositoryImpl.class);
	@PersistenceContext
	private EntityManager entityManager;
	

	public List<User> getAllUsers() {
		LOGGER.info("getAllUsers() IN");
		 TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
		 LOGGER.info("getAllUsers() OUT");
		return query.getResultList();
	}

	public void addUser(User user) {
		LOGGER.info("addUser() IN");
		entityManager.merge(user);
		 LOGGER.info("addUser() OUT");
	}

	

}