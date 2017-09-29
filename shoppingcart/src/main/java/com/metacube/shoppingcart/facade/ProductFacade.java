package com.metacube.shoppingcart.facade;

import java.util.ArrayList;
import java.util.List;

import com.metacube.shoppingcart.dto.ProductDto;
import com.metacube.shoppingcart.enums.Status;
import com.metacube.shoppingcart.modal.Product;
import com.metacube.shoppingcart.service.ProductService;

public class ProductFacade implements BaseFacade {

	ProductService productService;
	public ProductFacade() {

	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@Override
	public Iterable<ProductDto> getAllProducts() {
		List<ProductDto> productDtoList = new ArrayList<>();

		for (Product product : productService.getAllProducts()) {
			productDtoList.add(modelToDto(product));
		}
		System.out.println(productDtoList.toString());
		return productDtoList;
	}

	@Override
	public ProductDto getProductById(int id) {

		return modelToDto(productService.getProductById(id));
	}

	protected Product dtoToModel(ProductDto productDto) {
		if (productDto == null) {
			return null;
		}
		Product user = new Product();
		user.setId(productDto.getId());
		user.setName(productDto.getName());
		user.setPrice(productDto.getPrice());
		return user;
	}

	protected ProductDto modelToDto(Product product) {
		if (product == null) {
			return null;
		}
		ProductDto productDto = new ProductDto();
		productDto.setId(product.getId());
		productDto.setName(product.getName());
		productDto.setPrice(product.getPrice());
		return productDto;
	}

	@Override
	public Status addProduct(Product entity) {

		return productService.addProduct(entity);
	}

	@Override
	public Status deleteProduct(int id) {
		return productService.deleteProduct(id);
	}

	@Override
	public Status editProduct(Product entity, int id) {
		return productService.editProduct(entity, id);
	}
}
