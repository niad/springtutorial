package kr.pe.ned.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.pe.ned.model.User;
import kr.pe.ned.web.controller.validator.UserValidator;
import kr.pe.ned.web.conveter.StringToDatePropertyEditorSupport;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("user")
@Slf4j
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		if (log.isDebugEnabled())
			log.debug("== user list ==");

		ModelAndView mav = new ModelAndView("user/user_list");
		return mav;
	}

	@RequestMapping(value = "new", method = RequestMethod.GET)
	public ModelAndView newForm() {
		if (log.isDebugEnabled())
			log.debug("== user new form ==");

		ModelAndView mav = new ModelAndView("user/user_new");
		mav.addObject("user", new User()); // 빈 객체를 생성해서 전달해야함
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user, BindingResult bindingResult) {

		if (log.isDebugEnabled()) {
			log.debug("== register user ==");
			log.debug("{}", user);
		}

		UserValidator validator = new UserValidator();
		validator.validate(user, bindingResult);

		ModelAndView mav = new ModelAndView();
		if (bindingResult.hasErrors()) {
			if (log.isDebugEnabled())
				log.debug("== fail registered ==");

			mav.addObject("user", user);
			mav.setViewName("user/user_new");

		} else {
			if (log.isDebugEnabled())
				log.debug("== successful registered ==");

			mav.setViewName("redirect:/user");
		}

		return mav;
	}

	// 각 Controller 별로 별도로 Binding 클래스로 연결
	// 참조 : http://springsource.tistory.com/15
	@InitBinder
	public void customizeBinding(WebDataBinder binder) {
		// 정해진 데이터 형식만 전달된다는 보장이 있을 경우 처리가능
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		dateFormatter.setLenient(false);
		binder.registerCustomEditor(Date.class, "birthday", new StringToDatePropertyEditorSupport(dateFormatter));
	}

}
