package project.training.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Feature_Response {
	
	private int fid;
	
	private String fname;
	
	private String fdesp;
	
	private String fdetails;
	
	private List<Parameter_Response> parameters;

}
