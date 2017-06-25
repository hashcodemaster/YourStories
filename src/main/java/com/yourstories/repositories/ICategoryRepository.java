package com.yourstories.repositories;

import java.util.List;

import com.yourstories.model.Author;
import com.yourstories.model.Category;

public interface ICategoryRepository {

	List<Category> getAllCategory();
	Category getCategory(String id);
	Category createCategory(Category category);
	Category updateCategory(Category category);
	void deleteCategory(Category category);
	void deleteCategory(String id);
}
