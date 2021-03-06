package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.db.entity.LoginUser;
import jp.co.arthur.web.service.LoginUserSettingDetailService;

/**
 * ログインユーザ設定詳細画面コントローラ<br>
 *
 */
@Controller
@RequestMapping(value = "/loginUserSetting-Detail")
public class LoginUserSettingDetailController {

	/** ログインユーザ設定詳細画面サービス */
	@Autowired
	private LoginUserSettingDetailService service;

	/**
	 * {@inheritDoc}
	 */
	public String getView(Model model, HttpServletRequest request) {

		// sessionに保持しているアカウントからログインユーザ情報を取得する
		String account = (String) request.getSession().getAttribute("account");
		LoginUser entity = service.getLoginUser(account);

		model.addAttribute("entity", entity);


		return ArthurView.LOGIN_USER_SETTING_DETAIL.getUrl();
	}

}
