package jp.co.arthur.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.arthur.common.exception.BaseArthurException;

/**
 * ウィザード形式の基底コントローラクラス<br>
 * @param <F> フォームクラス
 */
public interface BaseWizardController<F extends BaseForm> {

	/**
	 * 入力画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@GetMapping
	default String input(Model model, HttpServletRequest request, HttpServletResponse response) {
		BaseView view;
		try {
			view = this.inputView(model, request, response);
		} catch (BaseArthurException e) {
			e.printStackTrace();
			view = ArthurView.ERROR;
		}
		return view.getUrl();
	}

	/**
	 * 確認画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @param form
	 * @param result
	 * @return
	 */
	@PostMapping
	default String confirm(Model model, HttpServletRequest request, HttpServletResponse response, F form, BindingResult result) {
		BaseView view;
		try {
			view = this.confirmView(model, request, response, form, result);
		} catch (BaseArthurException e) {
			e.printStackTrace();
			view = ArthurView.ERROR;
		}
		return view.getUrl();
	}



	/**
	 * 完了画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @param form
	 * @return
	 */
	@PostMapping
	default String complete(Model model, HttpServletRequest request, HttpServletResponse response, F form) {
		BaseView view;
		try {
			view = this.completeView(model, request, response, form);
		} catch (BaseArthurException e) {
			e.printStackTrace();
			view = ArthurView.ERROR;
		}
		return view.getUrl();
	}

	/**
	 * Validateを設定<br>
	 * @param binder
	 */
	void initBinder(WebDataBinder binder);

	/**
	 * 入力画面を描画する<br>
	 * 継承先で実装<br>
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	BaseView inputView(Model model, HttpServletRequest request, HttpServletResponse response) throws BaseArthurException;

	/**
	 * 確認画面を描画する<br>
	 * 継承先で実装<br>
	 * @param model
	 * @param request
	 * @param response
	 * @param form
	 * @param result
	 * @return
	 */
	BaseView confirmView(Model model, HttpServletRequest request, HttpServletResponse response, @Valid F form, BindingResult result)throws BaseArthurException;

	/**
	 * 完了画面を描画する<br>
	 * 継承先で実装<br>
	 * @param model
	 * @param request
	 * @param response
	 * @param form
	 * @return
	 */
	BaseView completeView(Model model, HttpServletRequest request, HttpServletResponse response, F form) throws BaseArthurException;

}
