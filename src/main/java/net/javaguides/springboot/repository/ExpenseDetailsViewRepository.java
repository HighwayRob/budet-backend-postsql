package net.javaguides.springboot.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.ExpenseDetailsView;

@Repository
public interface ExpenseDetailsViewRepository extends JpaRepository<ExpenseDetailsView, Long>{
	public List<ExpenseDetailsView> findAll();

	public List<ExpenseDetailsView> findAllBymonth(Integer month);
}
