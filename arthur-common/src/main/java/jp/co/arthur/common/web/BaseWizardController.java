package jp.co.arthur.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

/**
 * ウィザード形式の基底コントローラクラス<br>
 * @param <F> formクラス
 */
public interface BaseWizardController<F extends BaseForm> {

	/**
	 * 入力画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	default String input(Model model, HttpServletRequest request, HttpServletResponse response) {
		ArthurView view = this.inputView(model, request, response);
		return view.getUrl();
	}

	/**
	 * 入力画面の画面情報を設定する<br>
	 * 継承先で実装<br>
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	ArthurView inputView(Model model, HttpServletRequest request, HttpServletResponse response);

	/**
	 * 確認画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @param form
	 * @param result
	 * @return
	 */
	default String confirm(Model model, HttpServletRequest request, HttpServletResponse response, F form,
			BindingResult result) {
		ArthurView view = this.confirmView(model, request, response, form, result);
		return view.getUrl();
	}

	/**
	 * 確認画面の画面情報を設定する<br>
	 * 継承先で実装<br>
	 * @param model
	 * @param request
	 * @param response
	 * @param form
	 * @param result
	 * @return
	 */
	ArthurView confirmView(Model model, HttpServletRequest request, HttpServletResponse response, F form,
			BindingResult result);

	/**
	 * 完了画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	default String complete(Model model, HttpServletRequest request, HttpServletResponse response) {
		ArthurView view = this.completeView(model, request, response);
		return view.getUrl();
	}

	/**
	 * 完了画面の画面情報を設定する<br>
	 * 継承先で実装<br>
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	ArthurView completeView(Model model, HttpServletRequest request, HttpServletResponse response);

}
