package project.training.productcatalog.bundle.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bundle {

	@Id
	private String bundle_id;
	
	private String bundle_name;
	
	private String bundle_desp;
	
	private String bundle_category;
	
	private List<Integer> product_id;
	
	
}
