package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.business.loginUser.LoginUserCreateService;
import jp.co.arthur.common.entity.LoginUser;
import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseSimplePostController;
import jp.co.arthur.common.web.BaseView;
import jp.co.arthur.web.form.LoginUserCreateForm;
import jp.co.arthur.web.validator.LoginUserCreateValidator;

/**
 * ログインユーザ作成完了画面コントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/loginUserCreate-complete")
public class LoginUserCreateCompleteController implements BaseSimplePostController<LoginUserCreateForm> {

	/** ログインユーザ情報 作成サービスクラス */
	@Autowired
	private LoginUserCreateService loginUserCreateService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	@InitBinder("LoginUserCreateForm")
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(new LoginUserCreateValidator());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseView postView(Model model, HttpServletRequest request, HttpServletResponse response,
			@Validated LoginUserCreateForm form, BindingResult result) {

		if (result.hasErrors()) {
			return ArthurView.LOGIN_USER_CREATE_INPUT;
		}

		LoginUser entity = new LoginUser();
		BeanUtils.copyProperties(form, entity);
		loginUserCreateService.create(entity);

		return ArthurView.LOGIN_USER_CREATE_COMPLETE;
	}

}
