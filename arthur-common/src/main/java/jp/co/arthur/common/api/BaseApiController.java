package jp.co.arthur.common.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.arthur.common.exception.BaseArthurException;

/**
 * API基底コントローラインターフェース<br>
 * @param <Rq> リクエストクラス
 * @param <Rs> レスポンスクラス
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
			Rq request = toRequest(req);
			response = this.execute(request);
			response.setResult(0);
		} catch (BaseArthurException e) {
			response = (Rs) new ErrorResponse(e);
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
	 * 継承先で主処理を実装<br>
	 * @param request
	 * @return APIレスポンスクラス
	 * @throws BaseArthurException
	 */
	Rs execute(Rq request) throws BaseArthurException;

	/**
	 * Requestクラスに変換する<br>
	 * @param request HttpServletRequest
	 * @return APIリクエストクラス
	 * @throws BaseArthurException
	 */
	Rq toRequest(HttpServletRequest request) throws BaseArthurException;


}
