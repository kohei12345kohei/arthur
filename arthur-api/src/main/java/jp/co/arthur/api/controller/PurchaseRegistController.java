package jp.co.arthur.api.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import jp.co.arthur.api.request.PurchaseRegistRequest;
import jp.co.arthur.api.response.PurchaseRegistResponse;
import jp.co.arthur.api.service.PurchaseRegistService;
import jp.co.arthur.common.api.BaseApiRestController;
import jp.co.arthur.common.exception.BaseArthurException;

/**
 * 購入商品登録コントローラ<br>
 *
 */
@RestController
public class PurchaseRegistController implements BaseApiRestController<PurchaseRegistRequest, PurchaseRegistResponse> {


	@Autowired
	private PurchaseRegistService purchaseRegistService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PurchaseRegistResponse execute(PurchaseRegistRequest request) throws BaseArthurException {

		PurchaseRegistResponse response = purchaseRegistService.execute(request);
		return response;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PurchaseRegistRequest toRequest(HttpServletRequest request) throws BaseArthurException {

		// APIリクエストクラス
		PurchaseRegistRequest apiRequest = new PurchaseRegistRequest();

		return apiRequest;
	}

}
