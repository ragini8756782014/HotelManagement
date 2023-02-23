package com.example.demo.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.response.BaseResponse;

@Component
public class UpdateCategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public BaseResponse updateCategory(Category category) {
		validate();
		invalidChecks();
		Category c = convertEntity(category);
		categoryRepository.save(c);
		BaseResponse baseresponse = new BaseResponse();
		baseresponse.setStatus(HttpStatus.ACCEPTED.value());
		baseresponse.setMessage("your room has been successfully registered");
		return baseresponse;
	}

	private Category convertEntity(Category category) {
		Category c = new Category();
		c.setCategoryType(category.getCategoryType());
		c.setNoOfBed(category.getNoOfBed());
		c.setCategoryid(category.getCategoryid());
		return c;
	}

	private void validate() {

	}

	private void invalidChecks() {

	}

}
