package jp.co.arthur.business.db.create.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.arthur.business.db.create.PurchaseCreateService;
import jp.co.arthur.common.dao.PurchaseInfoDao;
import jp.co.arthur.common.entity.PurchaseInfo;

/**
 * 購入商品情報作成サービス実装クラス<br>
 *
 */
@Service
public class PurchaseCreateServiceImpl implements PurchaseCreateService {

	/** 購入商品情報Dao */
	@Autowired
	private PurchaseInfoDao purchaseInfoDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void regist(PurchaseInfo entity) {
		purchaseInfoDao.create(entity);
	}

}
