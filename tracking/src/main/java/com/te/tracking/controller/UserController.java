package com.te.tracking.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.tracking.bean.UserInfo;
import com.te.tracking.service.UserService;

@Controller
public class UserController {

	@Autowired(required = false)
	private UserService service;

	@GetMapping
	public String loginform() {
		return "loginform";
	}

	@PostMapping("/login")
	public String authenticate(Integer id, String password, ModelMap map, HttpServletRequest request) {
		UserInfo info = service.authenticate(id, password);
		if (info != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("isLoggedIn", info);
			return "welcome";
		} else {
			map.addAttribute("err", "Invalid credentials");
			return "loginform";
		}
	}

	@GetMapping("/registerform")
	public String registerUser() {
		return "registerform";
	}

	@PostMapping("/register")
	public String registerUser(UserInfo info, ModelMap map) {
		if (service.register(info)) {
			map.addAttribute("err", "Registered sucessfully");
			return "loginform";
		} else {
			map.addAttribute("err", "data already exist");
			return "registerform";
		}
	}

}
