package com.neurogine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.neurogine.models.ProductModel;

public interface IProductService {

	List<ProductModel> getAllProducts();

	Optional<ProductModel> getProductById(int id);

	ProductModel addProduct(ProductModel productModel);

	ProductModel editProduct(ProductModel productModel);

	void deleteProduct(int id);

	List<ProductModel> filterProducts(String name, String category);

	Page<ProductModel> getAllProducts(Pageable pageable);

}
