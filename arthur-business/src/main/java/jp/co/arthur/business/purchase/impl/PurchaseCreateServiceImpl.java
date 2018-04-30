package jp.co.arthur.business.purchase.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.arthur.business.purchase.PurchaseCreateService;
import jp.co.arthur.common.dao.PurchaseInfoDao;
import jp.co.arthur.common.entity.PurchaseInfo;

@Service
public class PurchaseCreateServiceImpl implements PurchaseCreateService {

	/** 購入商品情報Dao */
	@Autowired
	private PurchaseInfoDao purchaseInfoDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void registPurchaseInfo(PurchaseInfo entity) {
		purchaseInfoDao.registPurchaseInfo(entity);
	}

}
