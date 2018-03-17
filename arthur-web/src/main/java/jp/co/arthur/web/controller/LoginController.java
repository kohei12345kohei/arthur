package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.dao.LoginUserDao;
import jp.co.arthur.common.entity.LoginUser;
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
	@Autowired
	private LoginUserDao loginUserDao;

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
		LoginUser entity = loginUserDao.findLoginUserByLoginId(form.getLoginId());
		System.out.println(entity.getLoginId());
		return ArthurView.MENU;
	}

}
