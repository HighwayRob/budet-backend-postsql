package net.javaguides.springboot.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Category;
 
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	public List<Category> findAll();

}
