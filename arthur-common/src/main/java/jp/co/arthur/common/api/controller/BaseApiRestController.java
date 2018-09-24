package jp.co.arthur.common.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jp.co.arthur.common.api.request.BaseApiRequest;
import jp.co.arthur.common.api.response.BaseApiResponse;
import jp.co.arthur.common.api.response.ErrorResponse;
import jp.co.arthur.common.api.type.ResultType;
import jp.co.arthur.common.exception.BaseArthurException;

/**
 * API基底コントローラインターフェース<br>
 *
 * @param <Rq>
 *            リクエストクラス
 * @param <Rs>
 *            レスポンスクラス
 */
public abstract class BaseApiRestController<Rq extends BaseApiRequest, Rs extends BaseApiResponse> {

	/**
	 * POST通信での処理を行う<br>
	 *
	 * @param request
	 *            Rq extends BaseApiReques
	 * @return Rs extends BaseApiResponse
	 */
	@PostMapping
	public Rs doPost(@RequestBody Rq request) {
		Rs response = null;
		try {
			response = this.execute(request);
			response.setResult(ResultType.SUCCESS);
		} catch (BaseArthurException e) {
			response = (Rs) new ErrorResponse(e);
			System.out.println(e.toString());
		}
		return response;
	}

	/**
	 * 継承先で主処理を実装<br>
	 *
	 * @param request
	 *            Rq
	 * @return APIレスポンスクラス Rs
	 * @throws BaseArthurException
	 */
	protected abstract Rs execute(Rq request) throws BaseArthurException;

}
