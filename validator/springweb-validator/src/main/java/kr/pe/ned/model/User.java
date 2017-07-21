package kr.pe.ned.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

	private Long id;
	private String name;
	private String email;
	
	private Integer age = 0;
	
	private Date birthday;
	
	
}

