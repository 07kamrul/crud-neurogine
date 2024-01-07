package com.neurogine.services;

import java.util.List;
import java.util.Optional;

import com.neurogine.models.CategoryModel;

public interface ICategoryService {
	List<CategoryModel> getAllCategorys();

	Optional<CategoryModel> getCategoryById(int id);

	CategoryModel addCategory(CategoryModel categoryModel);

	CategoryModel editCategory(CategoryModel categoryModel);

	void deleteCategory(int id);
}
