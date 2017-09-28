/*
 * @author Rajat Jain
 * @Project Angular with Mysql
 * @version 1.0
 * @date 27-September-2017
 */
package com.metacube.get.layarch.facade;

import com.metacube.get.layarch.dto.UserDto;

/**
 * The Interface UserFacade.
 */
public interface BaseFacade {
	
	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	Iterable<UserDto> getAllUsers();
	
	/**
	 * Gets the user by id.
	 *
	 * @param id the id
	 * @return the user by id
	 */
	UserDto getUserById(int id);
}
