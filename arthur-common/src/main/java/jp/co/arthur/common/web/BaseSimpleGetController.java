package jp.co.arthur.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * GET通信の単一画面基底コントローラインターフェース<br>
 *
 */
public interface BaseSimpleGetController {

	/**
	 * GET通信処理を行う<br>
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@GetMapping
	default String doGet(Model model, HttpServletRequest request, HttpServletResponse response) {
		ArthurView view = this.getView(model, request, response);
		return view.getValue();
	}

	/**
	 * 継承先で実装<br>
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	public ArthurView getView(Model model, HttpServletRequest request, HttpServletResponse response);

}
