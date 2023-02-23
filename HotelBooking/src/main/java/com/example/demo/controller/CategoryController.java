package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.response.BaseResponse;
import com.example.demo.service.category.CreateCategoryService;
import com.example.demo.service.category.DeleteCategoryService;
import com.example.demo.service.category.GetAllCategoryService;
import com.example.demo.service.category.GetCategoryByIdService;
import com.example.demo.service.category.UpdateCategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CreateCategoryService createCategoryService;
	@Autowired
	private DeleteCategoryService deleteCategoryService;
	@Autowired
	private GetAllCategoryService getAllCategoryService;
	@Autowired
	private GetCategoryByIdService getCategoryByIdService;
	@Autowired
	private UpdateCategoryService updateCategoryService;

	@PostMapping("/category")
	public BaseResponse createCategory(@RequestBody Category category) {
		return createCategoryService.addCategory(category);
	}

	@GetMapping("/category")
	public List<Category> getCategory() {
		return getAllCategoryService.getAllCategory();
	}

	@GetMapping("/category/{id}")
	public Optional<Category> getCategoryById(@PathVariable("id") Long id) {
		return getCategoryByIdService.getCategoryById(id);
	}

	@DeleteMapping("/category/{id}")
	public BaseResponse deleteCategory(@PathVariable("id") Long id) {
		return deleteCategoryService.deleteCategory(id);
	}

	@PutMapping("category")
	public BaseResponse updateCategory(@RequestBody Category category) {
		return updateCategoryService.updateCategory(category);
	}

}
