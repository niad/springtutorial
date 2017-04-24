package kr.pe.ned.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

	@RequestMapping("/")
	public String index() {
		System.out.println("index");
		return "redirect:/main";
	}
	
	@RequestMapping("/main")
	public void main() {
		System.out.println("main");
	}
	
	@RequestMapping("/login")
	public void login() {
		System.out.println("login");
	}
	
}
