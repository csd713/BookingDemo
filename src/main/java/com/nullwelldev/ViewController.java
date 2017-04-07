package com.nullwelldev;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("datetime",new Date());
		model.addAttribute("username","CSD");
		
		return "index";
	}
}