package net.javaguides.springboot.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.ExpenseSummaryView;
 
@Repository
public interface ExpenseSummaryViewRepository extends JpaRepository<ExpenseSummaryView, Long>{
	public List<ExpenseSummaryView> findAll();
}
