package com.upgrad.mavgrad.controller;

import com.upgrad.mavgrad.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/users/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "users/login";
	}
}