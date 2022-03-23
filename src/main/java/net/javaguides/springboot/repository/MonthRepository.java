package net.javaguides.springboot.repository;
   
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Month;
 
@Repository
public interface MonthRepository extends JpaRepository<Month, Long>{

	public List<Month> findAll();

}
