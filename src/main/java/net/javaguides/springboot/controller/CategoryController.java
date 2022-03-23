package net.javaguides.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Category;
import net.javaguides.springboot.repository.CategoryRepository;

//@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "http://rmsystem.ddns.net:3000")
@RestController
@RequestMapping("/api/v1/")

public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	//get all 
	@GetMapping("/category")
	public List<Category> getAllCategory(){
//    	System.out.println("In Category List");
		return categoryRepository.findAll();
		//return categoryRepository.findAll(Sort.by(Direction.ASC,"categoryName"));

	}

	//get  by ID rest api
	@GetMapping("/category/{id}")
	public ResponseEntity <Category> getCategoryById(@PathVariable Long id) {
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category not found for ID : " + id));
//    	System.out.println("Category rec found in GET procedure " + id + category.getCategoryName());
		return ResponseEntity.ok(category);
	}

	// update  rest api
	@PutMapping("/category/{id}")
	public ResponseEntity <Category> updateCategory(@PathVariable Long id, @RequestBody Category categoryDetails){
//    	System.out.println("Category looking for" +  id);
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category Not Exist with ID : " + id));
//    	System.out.println("Category rec found" + id);
		
		category.setCategoryid(categoryDetails.getCategoryid());
		category.setCategoryName(categoryDetails.getCategoryName());
		category.setBudget(categoryDetails.getBudget());
		category.setW1(categoryDetails.getW1());
		category.setW2(categoryDetails.getW2());
		category.setW3(categoryDetails.getW3());
		category.setW4(categoryDetails.getW4());
		category.setW5(categoryDetails.getW5());
		category.setWtotal(categoryDetails.getWtotal());
		category.setExpnet(categoryDetails.getExpnet());
		category.setStatus(categoryDetails.getStatus());
		
		Category updatedCategory = categoryRepository.save(category);
//    	System.out.println("Category after save");

		return ResponseEntity.ok(updatedCategory);
	}

	
	//create  rest api
	@PostMapping("/category")
	public Category createCategory(@RequestBody Category category) {
		return categoryRepository.save(category);
	}
		
	
	
	// delete rest api
	@DeleteMapping("/category/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteCategory(@PathVariable Long id){
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category not exist with id :" + id));
		
		categoryRepository.delete(category);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
