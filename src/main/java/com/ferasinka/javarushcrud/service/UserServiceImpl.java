package com.ferasinka.javarushcrud.service;

import com.ferasinka.javarushcrud.dao.UserDao;
import com.ferasinka.javarushcrud.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	@Transactional
	public void removeUser(int id) {
		userDao.removeUser(id);
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	@Transactional
	public List<User> getUserByName(String name) {
		return userDao.getUserByName(name);
	}

	@Override
	@Transactional
	public List<List<User>> listUsers() {
		return userDao.listUsers();
	}
}
