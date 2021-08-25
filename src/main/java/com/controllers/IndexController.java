package com.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class IndexController{

	@RequestMapping("/")
	public String home(
			@RequestParam(name="param", required=false, defaultValue="???")String name,
		   	Model model){
				model.addAttribute("name", name);
				return "index";
			}
}
