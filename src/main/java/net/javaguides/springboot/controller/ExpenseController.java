package net.javaguides.springboot.controller;
  
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Expense;
import net.javaguides.springboot.repository.ExpenseRepository;

//@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "http://rmsystem.ddns.net:3000")
@RestController
@RequestMapping("/api/v1/")

public class ExpenseController {
	@Autowired
	private ExpenseRepository expenseRepository;
	
	
	//get all 
	@GetMapping("/expense")
	public List<Expense> getAllExpense(){
		return expenseRepository.findAll(Sort.by(Direction.ASC,"categoryId"));
	}

	@GetMapping("/expensebycategoryid/{categoryid}")
	public List<Expense> getAllExpenseBycategoryId(@PathVariable Integer categoryid){
	return expenseRepository.findAllBycategoryId(categoryid);
	}
	
	@GetMapping("/expense/{id}")
	public ResponseEntity <Expense> getExpenseById(@PathVariable Long id) {
		Expense expense = expenseRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Expense not found for ID : " + id));
		return ResponseEntity.ok(expense);
	}

	//create  rest api
	@PostMapping("/expense")
	public Expense createExpense(@RequestBody Expense expense) {
		return expenseRepository.save(expense);
	}
	
	// delete rest api
	@DeleteMapping("/expense/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteExpense(@PathVariable Long id){
		Expense expense = expenseRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Expense not exist with id :" + id));
//    	System.out.println("Ready to delete Expense " + id);
		expenseRepository.delete(expense);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
//    	System.out.println("Expense Deleted " + id);

		return ResponseEntity.ok(response);
	}

	// update  rest api
//	@PutMapping("/assets/{id}")
//	public ResponseEntity <Assets> updateAssets(@PathVariable Long id, @RequestBody Assets assetsDetails){
//		Assets assets = assetsRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Assets Not Exist with ID : " + id));
//		
//		assets.setAssetsIdentifier(assetsDetails.getAssetsIdentifier());
//		assets.setAssetsName(assetsDetails.getAssetsName());
//		
//		Assets updatedAssets = assetsRepository.save(assets);
//		return ResponseEntity.ok(updatedAssets);
//	}
	

}
