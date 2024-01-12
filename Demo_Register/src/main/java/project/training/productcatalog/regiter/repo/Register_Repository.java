package project.training.productcatalog.regiter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.training.productcatalog.regiter.entity.Register;


public interface Register_Repository extends JpaRepository<Register, Integer> {
	
	Register  findByEmail(String email);

}
