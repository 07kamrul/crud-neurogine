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

import com.neurogine.models.CategoryModel;
import com.neurogine.services.ICategoryService;

@RestController
@RequestMapping("/api/Categorys")
public class CategoryController {
	@Autowired
	private ICategoryService categoryService;

	@GetMapping("getAllCategory")
	public List<CategoryModel> getAllCategorys() {
		return categoryService.getAllCategorys();
	}

	@GetMapping("getCategoryById/{id}")
	public ResponseEntity<CategoryModel> getCategorybyId(@PathVariable int id) {
		try {
			Optional<CategoryModel> Category = categoryService.getCategoryById(id);
			if (Category.isEmpty()) {
				return new ResponseEntity<>(Category.get(), HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<>(Category.get(), HttpStatus.OK);
			}
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PostMapping("addCategory")
	public ResponseEntity<CategoryModel> addCategory(@RequestBody CategoryModel Category) {
		try {
			CategoryModel addCategory = categoryService.addCategory(Category);
			return new ResponseEntity<>(addCategory, HttpStatus.CREATED);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("editCategory")
	public ResponseEntity<CategoryModel> editCategory(@RequestBody CategoryModel Category) {
		try {
			CategoryModel editCategory = categoryService.addCategory(Category);
			return new ResponseEntity<>(editCategory, HttpStatus.CREATED);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("deleteCategory")
	public ResponseEntity<Void> deleteCategory(@PathVariable int id) {
		try {
			categoryService.deleteCategory(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
