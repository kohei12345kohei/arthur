package jp.co.arthur.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * POST通信の単一画面基底コントローラインターフェース<br>
 *
 * @param <F>フォームクラス
 */
public interface BaseSimplePostController<F extends BaseForm> {

	/**
	 * POST通信処理を行う<br>
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	@PostMapping
	default String doPost(Model model, HttpServletRequest request, HttpServletResponse response, F form) {
		ArthurView view = this.postView(model, request, response, form);
		return view.getUrl();
	}

	/**
	 * 継承先で実装<br>
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 */
	ArthurView postView(Model model, HttpServletRequest request, HttpServletResponse response, F form);

}
