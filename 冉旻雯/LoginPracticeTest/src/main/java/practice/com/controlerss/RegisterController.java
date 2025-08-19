package practice.com.controlerss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import practice.com.services.AdminService;
import practice.com.models.dao.AdminDao;
import practice.com.models.entity.Admin;

@Controller
public class RegisterController {

	@Autowired
	private AdminService adminService;

	// 登録画面表示
	// 表示するためのURL：/register
	@GetMapping("/register")
	public String getRegisterPage(Model model) {
		model.addAttribute("error", false);
		// 表示するファイルの名前：user_register.html
		return "user_register.html";
	}

	@PostMapping("/register/process")
	public String registerProcess(@RequestParam String adminName, @RequestParam String email,
			@RequestParam String password, Model model) {
		if (!adminService.createAdmin(adminName, email, password)) {
			model.addAttribute("error", true);
			return "user_register.html";
		} else {
			return "user_login.html";
		}

	}

}
