package com.metacube.get.layarch.service;

import com.metacube.get.layarch.dao.user.UserDao;
import com.metacube.get.layarch.model.User;

public class DefaultUserService implements UserService {
	UserDao userDao;

	public DefaultUserService(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Iterable<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUserById(final int id) {
		return userDao.findOne(id);
	}
}
