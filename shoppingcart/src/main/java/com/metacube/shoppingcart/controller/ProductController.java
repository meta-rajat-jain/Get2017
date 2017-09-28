package com.metacube.shoppingcart.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.metacube.shoppingcart.facade.BaseFacade;
import com.metacube.shoppingcart.modal.Product;
import com.metacube.shoppingcart.spring.Factory;

/**
 * The Class ProductController.
 *
 * This class use is responsible to direct the service on right page
 */
@Path("/product")
public class ProductController {

	/** The product facade. */
	BaseFacade baseFacade;

	/**
	 * Instantiates a new product controller.
	 */
	public ProductController() {
		System.out.println("Facade");
		baseFacade = Factory.getApplicationContext().getBean(BaseFacade.class);
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
				.entity(baseFacade.getAllProducts()).build();

	}

	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProductById(@PathParam("id") int id) {
		return Response.status(Response.Status.OK)
				.entity(baseFacade.getProductById(id)).build();
	}

	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteProductById(@PathParam("id") int id) {
		return Response.status(Response.Status.OK)
				.entity(baseFacade.deleteProduct(id)).build();
	}

	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addProduct(Product product) {
		return Response.status(Response.Status.OK)
				.entity(baseFacade.addProduct(product)).build();
	}

	@PUT
	@Path("/edit/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response editProduct(Product product, @PathParam("id") int id) {
		return Response.status(Response.Status.OK)
				.entity(baseFacade.editProduct(product, id)).build();
	}

}
