package jp.co.arthur.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public PurchaseRegistResponse execute(HttpServletRequest req, HttpServletResponse resp) throws BaseArthurException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
