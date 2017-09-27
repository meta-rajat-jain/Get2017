package com.metacube.get.layarch.facade;

import com.metacube.get.layarch.dto.UserDto;

public interface UserFacade {
	Iterable<UserDto> getAllUsers();
	UserDto getUserById(int id);
}
