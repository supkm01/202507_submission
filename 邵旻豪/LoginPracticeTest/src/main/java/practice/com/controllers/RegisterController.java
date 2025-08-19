package practice.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import practice.com.models.dao.UserDao;
import practice.com.services.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserDao userDao;
	@Autowired
	private UserService userService;

	@GetMapping("/register")
	public String registernew(Model model) {
		model.addAttribute("error", false);
		return "user_register.html";
	}

	@PostMapping("/register")
	public String register(@RequestParam String adminName, @RequestParam String email, @RequestParam String password,
			@RequestParam String studentPassword, Model model) {
		if (userService.createUser(adminName, email, password, studentPassword)) {
			return "user_login.html";
		} else {
			model.addAttribute("error", true);
			return "user_register.html";
		}
	}
}
