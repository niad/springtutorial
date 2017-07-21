package kr.pe.ned.web.controller.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.pe.ned.model.User;

/**
 * 1. interface org.springframework.validation.Validator 구 2. supports 메서드에서
 * Validator 점검한 class 반환
 * 
 * 
 * REF : http://springsource.tistory.com/18
 * 
 */
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// subclass of interface 등 할당가능한
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		User user = (User) target;

		// if (user.getName() != null || user.getName().length() == 0)
		// errors.rejectValue("name", "field.required");
		// 공백일 경우 반환
		
		// binding 과정중 오류가 발생했을 때 처리
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required.user.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required.user.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "birthday", "field.required.user.birthday", new Object[]{"yyyy-MM-dd"});

		if (user.getAge() == null || user.getAge() <= 0) {
			// reject : target object에 대해 전체 예외
			// rejectValue : 해당하는 value에 대해서만 예외 등록
			errors.rejectValue("age", "field.min.user.age", new Object[] { 0 }, null);
		}
		
	}

}
