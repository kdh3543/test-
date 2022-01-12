package kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RanhwiController {

	@RequestMapping("ranhwi")
	public String home() {
		
		return "home";
	}
}
