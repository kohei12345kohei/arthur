package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseSimpleGetController;
import jp.co.arthur.common.web.BaseSimplePostController;
import jp.co.arthur.web.form.LoginForm;
import jp.co.arthur.web.service.LoginService;

/**
 * ログインコントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController implements BaseSimpleGetController, BaseSimplePostController<LoginForm> {

	/** ログインサービス */
	@Autowired
	private LoginService loginService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ArthurView getView(Model model, HttpServletRequest request, HttpServletResponse response) {
		return ArthurView.LOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ArthurView postView(Model model, HttpServletRequest request, HttpServletResponse response, LoginForm form) {

		return ArthurView.MENU;
	}

}
