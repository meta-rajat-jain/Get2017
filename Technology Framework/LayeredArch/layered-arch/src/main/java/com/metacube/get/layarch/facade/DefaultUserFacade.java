/*
 * @author Rajat Jain
 * @Project Angular with Mysql
 * @version 1.0
 * @date 27-September-2017
 */
package com.metacube.get.layarch.facade;

import java.util.ArrayList;
import java.util.List;

import com.metacube.get.layarch.dto.UserDto;
import com.metacube.get.layarch.model.User;
import com.metacube.get.layarch.service.UserService;

/**
 * The Class DefaultUserFacade.
 */
public class UserFacade implements BaseFacade {
	
	/** The user service. */
	UserService userService;

	/**
	 * Instantiates a new default user facade.
	 *
	 * @param userService the user service
	 */
	public UserFacade(UserService userService) {
		this.userService = userService;
	}

	/* (non-Javadoc)
	 * @see com.metacube.get.layarch.facade.UserFacade#getAllUsers()
	 */
	@Override
	public Iterable<UserDto> getAllUsers() {
		List<UserDto> userDtoList = new ArrayList<>();

		for (User user : userService.getAllUsers()) {
			userDtoList.add(modelToDto(user));
		}

		return userDtoList;
	}

	/* (non-Javadoc)
	 * @see com.metacube.get.layarch.facade.UserFacade#getUserById(int)
	 */
	@Override
	public UserDto getUserById(final int id) {
		return modelToDto(userService.getUserById(id));
	}

	/**
	 * Dto to model.
	 *
	 * @param userDto the user dto
	 * @return the user
	 */
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

	/**
	 * Model to dto.
	 *
	 * @param user the user
	 * @return the user dto
	 */
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
