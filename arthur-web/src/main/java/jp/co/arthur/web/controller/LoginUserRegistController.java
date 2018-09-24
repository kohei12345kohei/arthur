package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.business.db.crud.create.LoginUserCreateService;
import jp.co.arthur.business.db.entity.LoginUser;
import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseWizardController;
import jp.co.arthur.web.form.LoginUserRegistForm;

/**
 * ログインユーザ作成完了画面コントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/loginUserRegist")
public class LoginUserRegistController extends BaseWizardController<LoginUserRegistForm> {

	/** ログインユーザ情報 作成サービスクラス */
	@Autowired
	private LoginUserCreateService loginUserCreateService;

	@ModelAttribute("loginUserRegistForm")
	public LoginUserRegistForm setUpForm() {
		return new LoginUserRegistForm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@GetMapping("/input")
	protected String input(Model model, HttpServletRequest request, HttpServletResponse response) {
		return ArthurView.LOGIN_USER_REGIST_INPUT.getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@PostMapping("/confirm")
	protected String confirm(Model model, HttpServletRequest request, HttpServletResponse response,
			LoginUserRegistForm form, BindingResult result) {
		if (result.hasErrors()) {
			// validationエラーが存在する場合
			return ArthurView.LOGIN_USER_REGIST_INPUT.getUrl();
		}

		// フォーム情報を設定
		model.addAttribute("form", form);

		return ArthurView.LOGIN_USER_REGIST_CONFIRM.getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@PostMapping("/complete")
	public String complete(Model model, HttpServletRequest request, HttpServletResponse response,
			@Valid LoginUserRegistForm form) {

		LoginUser entity = new LoginUser();
		BeanUtils.copyProperties(form, entity);
		loginUserCreateService.create(entity);

		model.addAttribute("form", form);

		return ArthurView.LOGIN_USER_REGIST_COMPLETE.getUrl();
	}

}
