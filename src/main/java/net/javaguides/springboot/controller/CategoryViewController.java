package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.CategoryView;
import net.javaguides.springboot.repository.CategoryViewRepository;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "http://rmsystem.ddns.net:3000")
@RestController
@RequestMapping("/api/v1/")
public class CategoryViewController {

	@Autowired
	private CategoryViewRepository categoryViewRepository;
	
	//get all 
	@GetMapping("/categoryview")
	public List<CategoryView> getAllCategoryView(){
		return categoryViewRepository.findAll();
				}

//	@GetMapping("/cpysiteassetviewbycpymasterid/{id}")
//	public List<CpySiteAssetView> getAllCpySiteAssetViewBycpymasterid(@PathVariable Integer id){
//		return cpySiteAssetViewRepository1.findAllBycpymasterid(id);
//	}


}
