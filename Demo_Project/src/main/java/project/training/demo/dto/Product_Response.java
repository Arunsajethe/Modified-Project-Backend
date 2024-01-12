package project.training.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.training.demo.entity.Feature;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product_Response {

	private int pid;
	
	private String pname;
	
	private String desp;
	
	private String details;
	
	private int maxLocations;
	
	private String category;
	
	private List<Feature> feature;
	
}
