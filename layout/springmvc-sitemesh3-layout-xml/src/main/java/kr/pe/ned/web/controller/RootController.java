package kr.pe.ned.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

	@RequestMapping("/")
	public String index() {
		System.out.println("index");
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("login");
		return "login";
	}
	
}
