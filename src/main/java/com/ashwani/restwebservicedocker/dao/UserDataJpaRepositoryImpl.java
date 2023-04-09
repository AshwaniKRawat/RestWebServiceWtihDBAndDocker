package com.ashwani.restwebservicedocker.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.ashwani.restwebservicedocker.entity.User;

@Repository
@Transactional
public class UserDataJpaRepositoryImpl {
	private static List<User> users = new ArrayList<>();

	@PersistenceContext
	private EntityManager entityManager;
	

	public List<User> getAllUsers() {
		 TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
		return query.getResultList();
	}

	public void addUser(User user) {
		entityManager.merge(user);
	}

	

}