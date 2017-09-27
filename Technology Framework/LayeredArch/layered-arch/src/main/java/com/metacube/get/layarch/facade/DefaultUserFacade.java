package com.metacube.get.layarch.facade;

import java.util.ArrayList;
import java.util.List;

import com.metacube.get.layarch.dto.UserDto;
import com.metacube.get.layarch.model.User;
import com.metacube.get.layarch.service.UserService;

public class DefaultUserFacade implements UserFacade {
	UserService userService;

	public DefaultUserFacade(UserService userService) {
		this.userService = userService;
	}

	@Override
	public Iterable<UserDto> getAllUsers() {
		List<UserDto> userDtoList = new ArrayList<>();

		for (User user : userService.getAllUsers()) {
			userDtoList.add(modelToDto(user));
		}

		return userDtoList;
	}

	@Override
	public UserDto getUserById(final int id) {
		return modelToDto(userService.getUserById(id));
	}

	protected User dtoToModel(UserDto userDto) {
		if (userDto == null) {
			return null;
		}
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setPrice(userDto.getPrice());
		user.setSource(userDto.getSource());
		return user;
	}

	protected UserDto modelToDto(User user) {
		if (user == null) {
			return null;
		}
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setPrice(user.getPrice());

		userDto.setSource(user.getSource());
		return userDto;
	}
}
