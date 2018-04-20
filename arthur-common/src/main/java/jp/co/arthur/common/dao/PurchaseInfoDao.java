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
	 * @param purchaseInfo
	 */
	void update(PurchaseInfo purchaseInfo);

	/**
	 * 作成
	 * @param entity
	 */
	void insert(PurchaseInfo entity);

	/**
	 * 指定されたアカウントに紐づく購入商品情報を返す
	 * @param account
	 * @return
	 */
	List<PurchaseInfo> selectByAccount(String account);

	/**
	 * 指定された購入商品IDに紐づく購入商品情報を返す
	 * @param purchaseInfoId
	 * @return
	 */
	PurchaseInfo selectByPurchaseInfoId(String purchaseInfoId);
}
