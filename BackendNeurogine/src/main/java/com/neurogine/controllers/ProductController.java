package com.neurogine.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neurogine.models.ProductModel;
import com.neurogine.services.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private IProductService productService;

	@GetMapping("getAllProducts")
	public List<ProductModel> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("getProductById/{id}")
	public ResponseEntity<ProductModel> getProductbyId(@PathVariable int id) {
		try {
			Optional<ProductModel> product = productService.getProductById(id);
			if (product.isEmpty()) {
				return new ResponseEntity<>(product.get(), HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<>(product.get(), HttpStatus.OK);
			}
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PostMapping("addProduct")
	public ResponseEntity<ProductModel> addProduct(@RequestBody ProductModel product) {
		try {
			List<ProductModel> email = productService.getProductByEmail(product.getEmail());
			if (email.size() == 0) {
				ProductModel addProduct = productService.addProduct(product);
				return new ResponseEntity<>(addProduct, HttpStatus.CREATED);
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("editProduct")
	public ResponseEntity<ProductModel> editProduct(@RequestBody ProductModel product) {
		try {
			ProductModel editProduct = productService.addProduct(product);
			return new ResponseEntity<>(editProduct, HttpStatus.CREATED);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("deleteProduct")
	public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
		try {
			productService.deleteProduct(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/filter")
	public List<ProductModel> filterProduct(@RequestParam(required = false) String name,
			@RequestParam(required = false) String category) {
		return productService.filterProducts(name, category);
	}
}
