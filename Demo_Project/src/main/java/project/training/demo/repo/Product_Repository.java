package project.training.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.training.demo.entity.Product;

public interface Product_Repository extends JpaRepository<Product, Integer> {
	
	

}
