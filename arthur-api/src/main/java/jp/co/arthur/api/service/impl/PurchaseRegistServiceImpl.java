package jp.co.arthur.api.service.impl;

import org.springframework.stereotype.Service;

import jp.co.arthur.api.request.PurchaseRegistRequest;
import jp.co.arthur.api.response.PurchaseRegistResponse;
import jp.co.arthur.api.service.PurchaseRegistService;
import jp.co.arthur.common.exception.PurchaseException;

/**
 * 購入商品登録サービス<br>
 *
 */
@Service
public class PurchaseRegistServiceImpl implements PurchaseRegistService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PurchaseRegistResponse execute(PurchaseRegistRequest request) throws PurchaseException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void checkRequest(PurchaseRegistRequest request) throws PurchaseException {
		// TODO 自動生成されたメソッド・スタブ

	}


}
