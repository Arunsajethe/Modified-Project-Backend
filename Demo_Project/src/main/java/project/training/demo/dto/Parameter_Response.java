package project.training.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.training.demo.entity.Parameter_Type;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Parameter_Response {
	
private int para_id;
	
	private String para_name;
	
	private String para_desp;
	
	private String para_details;
	
	private Parameter_Type para_type;

}
