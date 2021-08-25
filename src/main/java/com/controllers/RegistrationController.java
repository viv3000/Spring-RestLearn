package com.RestApplication.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController{

	@RequestMapping("/registration")
	String registrationHtml(@RequestParam(name="login", required=false, defaultValue="defaultLogin")String login, @RequestParam(name="password", required=false, defaultValue="defaultPassword")){
		model.addAttribute("login", name);
		return
	}


}
