package kr.pe.ned.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.pe.ned.model.User;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping( method = RequestMethod.GET)
	public String index(Model model) {
		return "redirect:/user/list";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void list(Model model) {

		System.out.println("call user list");
		
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setId(1L);
		user.setName("user1");
		user.setEmail("user1@test.com");
		users.add(user);
		
		user = new User();
		user.setId(2L);
		user.setName("user2");
		user.setEmail("user2@test.com");
		users.add(user);
		
		model.addAttribute("users", users);
//		model.addAttribute("topMenu", "MENU_USER");
		
	}
		
	@RequestMapping(value = "new", method = RequestMethod.GET)
	public void newForm() {
		System.out.println("show new form");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String register(User user) {
		System.out.println("register new user :" + user);
		return "redirect:/user";
	}
	
	@RequestMapping(value = "{userId}", method = RequestMethod.GET)
	public void show(
			@PathVariable("userId") Long userId,
			Model model) {

		System.out.println("show user : " + userId);
		User user = new User();
		user.setId(1L);
		user.setName("user1");
		user.setEmail("user1@test.com");
		
		model.addAttribute("user", user);
		
	}

	@RequestMapping(value = "{userId}/edit", method = RequestMethod.GET)
	public void edit(
			@PathVariable("userId") Long userId,
			Model model) {

		System.out.println("edit user : " + userId);
		User user = new User();
		user.setId(1L);
		user.setName("user1");
		user.setEmail("user1@test.com");
		
		model.addAttribute("user", user);
		
	}

	
	@RequestMapping(value = "{userId}", method = RequestMethod.POST)
	public String modify(
			@PathVariable("userId") Long userId,
			User user,
			Model model) {
		
		user.setId(userId);

		System.out.println("modify user : " + user);
		
		return "redirect:/user/" + userId;
	}

	@RequestMapping(value = "{userId}/delete", method = RequestMethod.POST)
	public String delete(
			@PathVariable("userId") Long userId,
			Model model) {

		System.out.println("delete user : " + userId);
		
		return "redirect:/user";
	}
	
}
