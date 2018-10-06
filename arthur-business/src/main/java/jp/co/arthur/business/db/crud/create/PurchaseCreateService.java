package jp.co.arthur.business.db.crud.create;

import java.util.List;

import jp.co.arthur.db.entity.PurchaseInfo;

/**
 * 購入商品情報作成サービスインターフェース
 *
 */
public interface PurchaseCreateService {

	/**
	 * 登録する<br>
	 *
	 * @param entity
	 *            PurchaseInfo
	 */
	void create(PurchaseInfo entity);

	/**
	 * 登録する
	 *
	 * @param entityList
	 *            List<PurchaseInfo>
	 */
	void create(List<PurchaseInfo> entityList);

}
