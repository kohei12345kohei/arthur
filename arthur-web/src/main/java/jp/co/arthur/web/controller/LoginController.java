package jp.co.arthur.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.arthur.web.form.LoginForm;
import jp.co.arthur.web.service.LoginService;

/**
 * ログインコントローラクラス<br>
 *
 */
@Controller
public class LoginController {

	/** ログインサービス */
	@Autowired
	private LoginService loginService;

	/**
	 * ログイン画面を表示する<br>
	 * @return
	 */
	@GetMapping(value = "/login")
	public String login() {
		return "/login";
	}

	@PostMapping(value = "/menu")
	public String toMenu(ModelMap modelMap, LoginForm loginForm) {
		return "/menu";
	}

}
