package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseSimpleGetController;
import jp.co.arthur.web.form.LoginUserRegistForm;

/**
 * ログインユーザ作成入力画面コントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/loginUserRegist-input")
public class LoginUserRegistInputController implements BaseSimpleGetController {

	/**
	 * フォームクラスを返す<br>
	 *
	 * @return
	 */
	@ModelAttribute
	public LoginUserRegistForm setUpForm() {
		return new LoginUserRegistForm();
	}

	/**
	 * ログインユーザ作成入力画面<br>
	 */
	@Override
	public ArthurView getView(Model model, HttpServletRequest request, HttpServletResponse response) {
		return ArthurView.LOGIN_USER_REGIST_INPUT;
	}

}
