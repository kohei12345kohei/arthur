package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseSimplePostController;
import jp.co.arthur.web.form.LoginUserCreateForm;
import jp.co.arthur.web.validator.LoginUserCreateValidator;

/**
 * ログインユーザ作成確認コントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/loginUserCreate-confirm")
public class LoginUserCreateConfirmController implements BaseSimplePostController<LoginUserCreateForm> {

	/**
	 * ログインユーザ作成確認画面<br>
	 */
	@Override
	public ArthurView postView(Model model, HttpServletRequest request, HttpServletResponse response,
			@Validated LoginUserCreateForm form, BindingResult result) {

		if (result.hasErrors()) {
			return ArthurView.LOGIN_USER_CREATE_INPUT;
		}

		// フォーム情報を設定
		model.addAttribute("form", form);

		return ArthurView.LOGIN_USER_CREATE_CONFIRM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@InitBinder("LoginUserCreateForm")
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(new LoginUserCreateValidator());
	}

}
