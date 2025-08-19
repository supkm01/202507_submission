package practice.com.controllers;

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
	// メソッド名 「getLoginPage」
	// エラーの可否の情報を画面に渡す
	// login.htmlを表示させる
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("error", false);
		return "login.html";
	}
	
	// URL 「/login/process」
		// メソッド名 「login」
		// 入力された情報を引数で受け取る
	@PostMapping("/login/process")
	public String login(@RequestParam String adminEmail,
			@RequestParam String password,
			Model model) {
		// ログインチェック
		// もし、loginCheckの結果がtureの場合、「email」のデータを渡しwelcome.htmlを表示する
		// そうでない場合、エラーの可否の情報を画面に渡す⇒login.htmlを表示
			if (adminService.loginCheck(adminEmail, password)) {
					model.addAttribute("email", adminEmail);
					return "welcome.html";
				} else {
					model.addAttribute("error", true);
					return "login.html";
				}
	}
}
