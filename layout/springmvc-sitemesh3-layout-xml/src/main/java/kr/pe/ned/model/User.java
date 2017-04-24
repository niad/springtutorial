package kr.pe.ned.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

	private Long id;
	private String name;
	private String email;
	
}
