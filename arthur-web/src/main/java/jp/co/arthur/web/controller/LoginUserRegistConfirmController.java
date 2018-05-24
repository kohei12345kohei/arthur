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
import jp.co.arthur.web.form.LoginUserRegistForm;
import jp.co.arthur.web.validator.LoginUserCreateValidator;

/**
 * ログインユーザ作成確認コントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/loginUserRegist-confirm")
public class LoginUserRegistConfirmController implements BaseSimplePostController<LoginUserRegistForm> {

	/**
	 * ログインユーザ作成確認画面<br>
	 */
	@Override
	public ArthurView postView(Model model, HttpServletRequest request, HttpServletResponse response,
			@Validated LoginUserRegistForm form, BindingResult result) {

		if (result.hasErrors()) {
			// validationエラーが存在する場合
			return ArthurView.LOGIN_USER_REGIST_INPUT;
		}

		// フォーム情報を設定
		model.addAttribute("form", form);

		return ArthurView.LOGIN_USER_REGIST_CONFIRM;
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
