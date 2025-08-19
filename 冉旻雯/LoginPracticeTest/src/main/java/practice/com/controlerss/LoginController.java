package practice.com.controlerss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import practice.com.services.AdminService;

@Controller
public class LoginController {
	@Autowired
	private AdminService adminService;
	// ログイン画面表示
	// URL 「/login」
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		// エラーの可否の情報を画面に渡す
		model.addAttribute("error", false);
		// user_login.htmlを表示させる
		return "/user_login";
	}

//	 URL 「/login/process」
	@PostMapping("/login/process")
//	 該当しないメールアドレス及びパスワードを入力した場合は、
//	 エラーメッセージが出力されるように実装する
	public String login(@RequestParam String email,
			@RequestParam String password,
			Model model) {
		if(adminService.loginCheck(email, password)) {
			model.addAttribute("email", email);
			return "user_menu.html";
		}else{
			model.addAttribute("error", true);
			return "user_login.html";
		}
	}
	
	
}
