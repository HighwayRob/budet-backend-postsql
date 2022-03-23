package net.javaguides.springboot.repository;
   
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.CategoryView;
 
@Repository
public interface CategoryViewRepository extends JpaRepository<CategoryView, Long>{
	public List<CategoryView> findAll();
}

