package com.example.demo.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.example.demo.repository.CategoryRepository;
import com.example.demo.response.BaseResponse;

@Component
public class DeleteCategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public BaseResponse deleteCategory(Long id) {
		categoryRepository.deleteById(id);
		BaseResponse baseresponse = new BaseResponse();
		baseresponse.setStatus(HttpStatus.ACCEPTED.value());
		baseresponse.setMessage("your category has been successfully deleted");
		return baseresponse;

	}
}
