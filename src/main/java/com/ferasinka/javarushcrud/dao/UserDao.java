package com.ferasinka.javarushcrud.dao;

import com.ferasinka.javarushcrud.model.User;

import java.util.List;

public interface UserDao {
	void addUser(User user);

	void updateUser(User user);

	void removeUser(int id);

	User getUserById(int id);

	List<User> getUserByName(String name);

	List<List<User>> listUsers();
}
