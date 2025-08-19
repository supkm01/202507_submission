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
public class LoginController {

	@Autowired
	private UserDao userDao;
	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String loginnew(Model model) {
		model.addAttribute("error", false);
		return "user_login.html";
	}

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, Model model) {
		if (userService.loginCheck(email, password)) {
			model.addAttribute("error", true);
			return "user_login.html";
		} else {
			return "user_menu.html";
		}
	}
}
