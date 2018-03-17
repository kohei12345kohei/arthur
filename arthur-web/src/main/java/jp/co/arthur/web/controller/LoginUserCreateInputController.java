package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseSimpleGetController;

/**
 * ログインユーザ作成入力画面コントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/loginUserCreate-input")
public class LoginUserCreateInputController implements BaseSimpleGetController {

	/**
	 * ログインユーザ作成入力画面<br>
	 */
	@Override
	public ArthurView getView(Model model, HttpServletRequest request, HttpServletResponse response) {
		return ArthurView.LOGIN_USER_CREATE_INPUT;
	}

}
