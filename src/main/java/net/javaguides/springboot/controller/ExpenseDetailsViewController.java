package net.javaguides.springboot.controller;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.ExpenseDetailsView;
import net.javaguides.springboot.repository.ExpenseDetailsViewRepository;
  
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "http://rmsystem.ddns.net:3000")
@RestController
@RequestMapping("/api/v1/")
public class ExpenseDetailsViewController {

	@Autowired
	private ExpenseDetailsViewRepository expenseDetailsViewRepository;
	
	//get all 
	@GetMapping("/expensedetailsview")
	public List<ExpenseDetailsView> getAllExpenseDetailsView(){
		return expenseDetailsViewRepository.findAll();
				}
	
	@GetMapping("/expensedetailsviewbymonth/{month}")
	public List<ExpenseDetailsView> getAllExpenseDetailsViewbymonth(@PathVariable Integer month){
	return expenseDetailsViewRepository.findAllBymonth(month);
	}


//	@GetMapping("/cpysiteassetviewbycpymasterid/{id}")
//	public List<CpySiteAssetView> getAllCpySiteAssetViewBycpymasterid(@PathVariable Integer id){
//		return cpySiteAssetViewRepository1.findAllBycpymasterid(id);
//	}


}
