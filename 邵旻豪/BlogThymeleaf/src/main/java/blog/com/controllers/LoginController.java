package blog.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	// URLは「/login」として、ログイン画面を表示させるメソッドgetLoginPageを作成し、login.htmlを表示させてください
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("error", false);
		return "login.html";
	}

	// **URLは「/login/process」**として**ログイン処理**をする**メソッドloginProcess**を作成し、login.htmlからユーザー名とパスワードを受け取る処理を記載してください。
	@PostMapping("/login/process")
	public String loginProcess(@RequestParam String username, @RequestParam String password, Model model) {
		if (username.equals("admin") && password.equals("1234")) {
			return "blog.html";
		} else {
			model.addAttribute("error", true);
			return "login.html";
		}
	}
}
