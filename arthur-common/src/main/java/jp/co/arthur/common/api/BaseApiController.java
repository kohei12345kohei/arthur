package jp.co.arthur.common.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.arthur.common.exception.BaseArthurException;

/**
 * API基底コントローラインターフェース<br>
 *
 */
public interface BaseApiController<Rq extends BaseApiRequest, Rs extends BaseApiResponse> {

	/**
	 * GET通信での処理を行う<br>
	 * @param req
	 * @param resp
	 * @return
	 */
	@GetMapping
	default Rs doGet(HttpServletRequest req, HttpServletResponse resp) {
		Rs response = null;
		try {
			response = execute(req, resp);
		} catch (BaseArthurException e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * POST通信での処理を行う<br>
	 * @param req
	 * @param resp
	 * @return
	 */
	@PostMapping
	default Rs doPost(HttpServletRequest req, HttpServletResponse resp) {
		return doGet(req, resp);
	}

	/**
	 * 継承先で主処理を実装>br>
	 * @param req
	 * @param resp
	 * @return
	 */
	Rs execute(HttpServletRequest req, HttpServletResponse resp) throws BaseArthurException;

}
