package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.business.db.crud.select.LoginUserSearchService;
import jp.co.arthur.business.db.entity.LoginUser;
import jp.co.arthur.common.exception.ArthurErrorCode;
import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.common.web.BaseSimpleGetController;
import jp.co.arthur.common.web.BaseSimplePostController;
import jp.co.arthur.common.web.BaseView;
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
	/** ログインユーザ情報検索サービス */
	@Autowired
	private LoginUserSearchService loginUserSearchService;

	/**
	 * フォームクラスを返す<br>
	 * @return
	 */
	@ModelAttribute
	public LoginForm setUpForm() {
		return new LoginForm();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseView getView(Model model, HttpServletRequest request, HttpServletResponse response) {
		return ArthurView.LOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseView postView(Model model, HttpServletRequest request, HttpServletResponse response
			, @Valid LoginForm form, BindingResult result) {

		if (result.hasErrors()) {
			return ArthurView.LOGIN;
		}

		LoginUser entity = loginUserSearchService.findByLoginId(form.getLoginId());

		if (!loginService.isAuth(entity, form.getPassword())) {
			model.addAttribute("errorMessage", ArthurErrorCode.LOGIN_FAILED.getErrorMessage());
			// パスワードが間違っていた場合
			return ArthurView.LOGIN;
		}

		// sessionにアカウントを保持（画面描画時のアカウント表示に使う為）
		request.getSession().setAttribute("account", entity.getAccount());
		model.addAttribute("account", entity.getAccount());

		return ArthurView.MENU;
	}

	/**
	 * {@inheritDoc}
	 * @deprecated
	 */
	@Deprecated
	@Override
	@InitBinder("LoginForm")
	public void initBinder(WebDataBinder binder) {
		// ログイン処理のため中身なし
	}

}
