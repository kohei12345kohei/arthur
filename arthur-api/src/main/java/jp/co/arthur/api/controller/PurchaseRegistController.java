package jp.co.arthur.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.arthur.api.request.PurchaseRegistRequest;
import jp.co.arthur.api.response.PurchaseRegistResponse;
import jp.co.arthur.api.service.PurchaseRegistService;
import jp.co.arthur.common.api.controller.BaseApiRestController;
import jp.co.arthur.common.exception.BaseArthurException;

/**
 * 購入商品登録コントローラ<br>
 *
 */
@RestController
@RequestMapping(value = "/purchaseRegist", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
public class PurchaseRegistController extends BaseApiRestController<PurchaseRegistRequest, PurchaseRegistResponse> {

	/** 購入商品情報登録サービス */
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

}
