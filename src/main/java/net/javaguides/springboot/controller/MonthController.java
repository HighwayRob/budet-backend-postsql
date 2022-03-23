package net.javaguides.springboot.controller;
   
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Month;
import net.javaguides.springboot.repository.MonthRepository;
 
//@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "http://rmsystem.ddns.net:3000")
@RestController
@RequestMapping("/api/v1/")

public class MonthController {
	@Autowired
	private MonthRepository monthRepository;
	
	
	//get all 
	@GetMapping("/month")
	public List<Month> getAllMonth(){
//    	System.out.println("In Month List");
		return monthRepository.findAll();
		//return monthRepository.findAll(Sort.by(Direction.ASC,"monthName"));

	}

	//get  by ID rest api
	@GetMapping("/month/{id}")
	public ResponseEntity <Month> getMonthById(@PathVariable Long id) {
		Month month = monthRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Month not found for ID : " + id));
//    	System.out.println("Month rec found in GET procedure " + id + month.getMonth());
		return ResponseEntity.ok(month);
	}

	// update  rest api
	@PutMapping("/month/{id}")
	public ResponseEntity <Month> updateMonth(@PathVariable Long id, @RequestBody Month monthDetails){
//    	System.out.println("Month looking for" +  id);
		Month month = monthRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Month Not Exist with ID : " + id));
//    	System.out.println("Month rec found");
		
		month.setMonthid(monthDetails.getMonthid());
		month.setMonth(monthDetails.getMonth());
		
		Month updatedMonth = monthRepository.save(month);
//    	System.out.println("Month after save");

		return ResponseEntity.ok(updatedMonth);
	}

	
	//create  rest api
//	@PostMapping("/assets")
//	public Assets createAssets(@RequestBody Assets assets) {
//		assets.setAssetsCreated(new SimpleDateFormat("YYYY-MM-DD HH:MM:SS").format(Calendar.getInstance().getTime()));
//		return assetsRepository.save(assets);
//	}
		
	
	
	// delete rest api
//	@DeleteMapping("/assets/{id}")
//	public ResponseEntity<Map<String, Boolean>> deleteAssets(@PathVariable Long id){
//		Assets assets = assetsRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Assets not exist with id :" + id));
//		
//		assetsRepository.delete(assets);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return ResponseEntity.ok(response);
//	}

}
