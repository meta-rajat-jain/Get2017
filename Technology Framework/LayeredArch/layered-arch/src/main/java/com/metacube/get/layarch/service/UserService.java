package com.metacube.get.layarch.service;

import com.metacube.get.layarch.model.User;

public interface UserService {
	Iterable<User> getAllUsers();
	User getUserById(int id);
}
