package net.javaguides.springboot.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Expense;
 
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

	public List<Expense> findAll();


	public List<Expense> findAllBycategoryId(Integer categoryid);

}
