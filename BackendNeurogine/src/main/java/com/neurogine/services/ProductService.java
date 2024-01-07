package com.neurogine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.neurogine.models.ProductModel;
import com.neurogine.respositories.IProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepository productRepository;

	@Override
	public List<ProductModel> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Optional<ProductModel> getProductById(int id) {
		return productRepository.findById(id);
	}

	@Override
	public ProductModel addProduct(ProductModel productModel) {
		return productRepository.save(productModel);
	}

	@Override
	public ProductModel editProduct(ProductModel productModel) {
		return productRepository.save(productModel);
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<ProductModel> filterProducts(String name, String category) {
		return productRepository.findAll();
	}

	@Override
	public Page<ProductModel> getAllProducts(Pageable pageable) {
		return productRepository.findAll(pageable);
	}

	@Override
	public List<ProductModel> getProductByEmail(String email) {
		return productRepository.findByEmail(email);
	}

}
