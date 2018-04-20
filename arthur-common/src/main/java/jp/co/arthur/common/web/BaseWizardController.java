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
	 * 遷移先のViewのurlを返す<br>
	 * @param view
	 * @return
	 */
	default String getView(BaseView view) {
		return view.getUrl();
	}

	/**
	 * 入力画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	String input(Model model, HttpServletRequest request, HttpServletResponse response);

	/**
	 * 確認画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @param form
	 * @param result
	 * @return
	 */
	String confirm(Model model, HttpServletRequest request, HttpServletResponse response, F form, BindingResult result);

	/**
	 * 完了画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	String complete(Model model, HttpServletRequest request, HttpServletResponse response);

}
