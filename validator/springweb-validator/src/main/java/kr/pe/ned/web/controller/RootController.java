package kr.pe.ned.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class RootController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		log.debug("index");
		return "index";
	}
	
}
