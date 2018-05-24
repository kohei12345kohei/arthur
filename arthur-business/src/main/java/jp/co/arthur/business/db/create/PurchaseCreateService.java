package jp.co.arthur.business.db.create;

import jp.co.arthur.common.entity.PurchaseInfo;

/**
 * 購入商品情報作成サービスインターフェース
 *
 */
public interface PurchaseCreateService {

	/**
	 * 購入商品情報を登録する<br>
	 * @param entity
	 */
	void regist(PurchaseInfo entity);

}
