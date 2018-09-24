package jp.co.arthur.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.arthur.business.db.crud.select.LoginUserSearchService;
import jp.co.arthur.business.db.entity.LoginUser;
import jp.co.arthur.common.exception.ArthurErrorCode;
import jp.co.arthur.common.web.ArthurView;
import jp.co.arthur.web.form.LoginForm;
import jp.co.arthur.web.service.LoginService;

/**
 * TOP画面コントローラクラス<br>
 *
 */
@Controller
@RequestMapping(value = "/top")
public class TopController {

	/** ログインサービス */
	@Autowired
	private LoginService loginService;
	/** ログインユーザ情報検索サービス */
	@Autowired
	private LoginUserSearchService loginUserSearchService;

	/**
	 * Top画面
	 * @param model
	 * @param request
	 * @param form
	 * @param result
	 * @return
	 */
	@PostMapping("index")
	public String index(Model model, HttpServletRequest request
			, @Valid LoginForm form, BindingResult result) {
		if (result.hasErrors()) {
			return ArthurView.LOGIN.getUrl();
		}
		LoginUser entity = loginUserSearchService.findByLoginId(form.getLoginId());

		if (!loginService.isAuth(entity, form.getPassword())) {
			model.addAttribute("errorMessage", ArthurErrorCode.LOGIN_FAILED.getErrorMessage());
			// パスワードが間違っていた場合
			return ArthurView.LOGIN.getUrl();
		}

		// sessionにアカウントを保持（画面描画時のアカウント表示に使う為）
		request.getSession().setAttribute("account", entity.getAccount());
		model.addAttribute("account", entity.getAccount());

		return ArthurView.TOP.getUrl();
	}

	@GetMapping("index")
	public String index(Model model, HttpServletRequest request) {
		return ArthurView.TOP.getUrl();
	}
}
