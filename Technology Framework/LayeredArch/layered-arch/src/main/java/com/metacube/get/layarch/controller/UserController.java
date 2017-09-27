/*
 * @author Rajat Jain
 * @Project Angular with Mysql
 * @version 1.0
 * @date 27-September-2017
 */
package com.metacube.get.layarch.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.metacube.get.layarch.dao.user.JdbcUserDao;
import com.metacube.get.layarch.facade.DefaultUserFacade;
import com.metacube.get.layarch.facade.UserFacade;
import com.metacube.get.layarch.service.DefaultUserService;

/**
 * The Class UserController.
 */
@Path("/user")
public class UserController {

	/** The user facade. */
	UserFacade userFacade;

	/**
	 * Instantiates a new user controller.
	 */
	public UserController() {
		userFacade = new DefaultUserFacade(new DefaultUserService(
				new JdbcUserDao()));
	}

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {

		return Response.status(Response.Status.OK)
				.entity(userFacade.getAllUsers()).build();

	}

	/**
	 * Gets the users.
	 *
	 * @param id
	 *            the id
	 * @return the users
	 */
	@GET
	@Path("/list/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") int id) {

		return Response.status(Response.Status.OK)
				.entity(userFacade.getUserById(id)).build();

	}

	/**
	 * Gets the users.
	 *
	 * @param id
	 *            the id
	 * @return the users
	 */
	@DELETE
	@Path("/list/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUsers(@PathParam("id") int id) {

		return Response.status(Response.Status.OK)
				.entity(userFacade.getUserById(id)).build();

	}
}
