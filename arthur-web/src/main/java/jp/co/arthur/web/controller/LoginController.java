package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.dao.LoginUserDao;
import jp.co.arthur.common.entity.LoginUser;
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
	/** ログインDao */
	@Autowired
	private LoginUserDao loginUserDao;

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
	public BaseView postView(Model model, HttpServletRequest request, HttpServletResponse response, LoginForm form, BindingResult result) {

		LoginUser entity = loginUserDao.findLoginUserByLoginId(form.getLoginId());
		System.out.println(entity.getLoginId());

		if (!loginService.isAuth(entity, form.getLoginId())) {
			// パスワードが間違っていた場合
			return ArthurView.LOGIN;
		}

		// sessionにアカウントを保持（画面描画時のアカウント表示に使う為）
		request.getSession().setAttribute("account", entity.getAccount());



		return ArthurView.MENU;
	}

	/**
	 * {@inheritDoc}
	 * @deprecated
	 */
	@Override
	@InitBinder("LoginForm")
	public void initBinder(WebDataBinder binder) {
		// ログイン処理のため中身なし
	}

}
