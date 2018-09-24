package jp.co.arthur.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

/**
 * ウィザード形式の基底コントローラ<br>
 *
 * @param <F>
 *            フォームクラス
 */
public abstract class BaseWizardController<F extends BaseForm> {

	/**
	 * 入力画面
	 *
	 * @param model
	 *            Model
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 * @return
	 */
	protected abstract String input(Model model, HttpServletRequest request, HttpServletResponse response);

	/**
	 * 確認画面
	 *
	 * @param model
	 *            Model
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 * @param form
	 *            F
	 * @param result
	 *            BindingResult
	 * @return
	 */
	protected abstract String confirm(Model model, HttpServletRequest request, HttpServletResponse response, F form, BindingResult result);

	/**
	 * 完了画面
	 *
	 * @param model
	 *            Model
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 * @param form
	 *            F
	 * @return
	 */
	protected abstract String complete(Model model, HttpServletRequest request, HttpServletResponse response, F form);

}
