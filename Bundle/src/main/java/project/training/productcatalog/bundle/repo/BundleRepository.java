package project.training.productcatalog.bundle.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.training.productcatalog.bundle.entity.Bundle;

public interface BundleRepository extends JpaRepository<Bundle, String> {
	
	@Query("from Bundle where bundle_id = ?1")
	Bundle gettingBundleById(String id);

		
}
