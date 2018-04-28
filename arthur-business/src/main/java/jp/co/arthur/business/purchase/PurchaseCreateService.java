package jp.co.arthur.business.purchase;

import jp.co.arthur.common.entity.PurchaseInfo;

public interface PurchaseCreateService {

	/**
	 * 購入商品情報を登録する<br>
	 * @param entity
	 */
	void registPurchaseInfo(PurchaseInfo entity);

}
