package jp.co.arthur.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

/**
 * ウィザード形式の基底コントローラクラス<br>
 *
 */
public interface BaseWizardController {

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
	 * @return
	 */
	String confirm(Model model, HttpServletRequest request, HttpServletResponse response);

	/**
	 * 完了画面表示
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	String complete(Model model, HttpServletRequest request, HttpServletResponse response);

}
