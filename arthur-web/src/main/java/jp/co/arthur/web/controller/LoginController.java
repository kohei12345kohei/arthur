package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseView;
import jp.co.arthur.web.form.LoginForm;

/**
 * ログインコントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

	/**
	 * フォームクラスを返す<br>
	 * @return
	 */
	@ModelAttribute
	public LoginForm setUpForm() {
		return new LoginForm();
	}

	/**
	 * ログイン画面
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@GetMapping("index")
	public BaseView index(Model model, HttpServletRequest request, HttpServletResponse response) {
		return ArthurView.LOGIN;
	}

}
