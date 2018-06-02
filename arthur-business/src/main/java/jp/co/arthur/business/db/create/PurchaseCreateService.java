package jp.co.arthur.business.db.create;

import java.util.List;

import jp.co.arthur.common.entity.PurchaseInfo;

/**
 * 購入商品情報作成サービスインターフェース
 *
 */
public interface PurchaseCreateService {

	/**
	 * 登録する<br>
	 *
	 * @param entity
	 */
	void create(PurchaseInfo entity);

	/**
	 * 登録する
	 *
	 * @param entityList
	 */
	void create(List<PurchaseInfo> entityList);

}
