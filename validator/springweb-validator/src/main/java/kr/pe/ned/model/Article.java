package kr.pe.ned.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Article {

	// https://spring.io/guides/gs/validating-form-input/

	private Long id;
	
	@NotNull
	@Size(min = 2, max = 80)
	private String title;
	@NotNull
	@Size(min = 2, max = 800)
	private String content;

	private Date createdAt;

}
