package com.te.tracking.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.tracking.bean.UserInfo;
import com.te.tracking.exception.UserException;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public UserInfo authenticate(Integer id, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tracking");
		EntityManager manager = factory.createEntityManager();
		UserInfo info = manager.find(UserInfo.class, id);
		if (info != null) {
			if (info.getId() == id && info.getPassword().equals(password)) {
				return info;
			}
		}
		throw new UserException("Invalid credentials");
	}// end of authenticate

	@Override
	public boolean register(UserInfo info) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("tracking");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			return false;
		}
		
	}
	
}
