package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseSimplePostController;
import jp.co.arthur.web.form.LoginUserCreateForm;

/**
 * ログインユーザ作成確認コントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/loginUserCreate-confirm")
public class LoginUserCreateConfirmController implements BaseSimplePostController<LoginUserCreateForm> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ArthurView postView(Model model
							, HttpServletRequest request
							, HttpServletResponse response
							, LoginUserCreateForm form) {


		return ArthurView.LOGIN_USER_CREATE_CONFIRM;
	}

}
