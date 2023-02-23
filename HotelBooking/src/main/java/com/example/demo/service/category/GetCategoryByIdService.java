package com.example.demo.service.category;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;

@Component
public class GetCategoryByIdService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Optional<Category> getCategoryById(Long id) {
		return categoryRepository.findById(id);

	}
}
