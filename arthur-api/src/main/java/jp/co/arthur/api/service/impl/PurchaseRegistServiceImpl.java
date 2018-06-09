package jp.co.arthur.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.arthur.api.request.PurchaseRegistRequest;
import jp.co.arthur.api.response.PurchaseRegistResponse;
import jp.co.arthur.api.service.PurchaseRegistService;
import jp.co.arthur.business.db.create.PurchaseCreateService;
import jp.co.arthur.common.entity.PurchaseInfo;
import jp.co.arthur.common.exception.PurchaseException;;

/**
 * 購入商品登録サービス<br>
 *
 */
@Service
public class PurchaseRegistServiceImpl implements PurchaseRegistService {

	/** 購入商品情報作成サービス */
	@Autowired
	private PurchaseCreateService purchaseCreateService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PurchaseRegistResponse execute(PurchaseRegistRequest request) throws PurchaseException {

		// Entityに変換
		PurchaseInfo entity = toEntity(request);

		// DBに登録
		purchaseCreateService.create(entity);

		// responseに変換
		PurchaseRegistResponse response = toResponse(entity);

		return response;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void checkRequest(PurchaseRegistRequest request) throws PurchaseException {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * 購入商品情報Entityに変換する<br>
	 * @param request
	 * @return
	 */
	private PurchaseInfo toEntity(PurchaseRegistRequest request) {
		PurchaseInfo entity = new PurchaseInfo();
		return entity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PurchaseRegistResponse toResponse(PurchaseInfo entity) {
		PurchaseRegistResponse response = new PurchaseRegistResponse();
		return response;
	}


}
