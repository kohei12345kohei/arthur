package jp.co.arthur.common.dao;

import java.util.List;

import jp.co.arthur.common.entity.PurchaseInfo;

/**
 * 購入商品情報Dao<br>
 *
 */
public interface PurchaseInfoDao {

	/** テーブル名 */
	public static final String TABLE_NAME = "PURCHASE_INFO";

	/**
	 * 更新
	 *
	 * @param purchaseInfo
	 *            購入商品情報
	 */
	void update(PurchaseInfo entity);

	/**
	 * 作成
	 *
	 * @param entity
	 *            購入商品情報
	 */
	void create(PurchaseInfo entity);

	/**
	 * 指定されたアカウントに紐づく購入商品情報を返す
	 *
	 * @param account
	 *            アカウント名
	 * @return
	 */
	List<PurchaseInfo> findByAccount(String account);

	/**
	 * 指定された購入商品IDに紐づく購入商品情報を返す
	 *
	 * @param purchaseInfoId
	 *            購入商品情報ID
	 * @return
	 */
	PurchaseInfo findByPurchaseInfoId(String purchaseInfoId);
}
