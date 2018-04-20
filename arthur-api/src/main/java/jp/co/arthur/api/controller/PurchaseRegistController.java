package jp.co.arthur.api.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RestController;

import jp.co.arthur.api.request.PurchaseRegistRequest;
import jp.co.arthur.api.response.PurchaseRegistResponse;
import jp.co.arthur.common.api.BaseApiController;
import jp.co.arthur.common.exception.BaseArthurException;

/**
 * 購入商品登録コントローラ<br>
 *
 */
@RestController
public class PurchaseRegistController implements BaseApiController<PurchaseRegistRequest, PurchaseRegistResponse> {

	@Override
	public PurchaseRegistResponse execute(PurchaseRegistRequest request) throws BaseArthurException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public PurchaseRegistRequest toRequest(HttpServletRequest request) throws BaseArthurException {

		// APIリクエストクラス
		PurchaseRegistRequest apiRequest = new PurchaseRegistRequest();

		return apiRequest;
	}

}
