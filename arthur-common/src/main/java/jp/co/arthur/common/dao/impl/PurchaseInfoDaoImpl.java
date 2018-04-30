package jp.co.arthur.common.dao.impl;

import java.util.List;

import jp.co.arthur.common.dao.PurchaseInfoDao;
import jp.co.arthur.common.entity.PurchaseInfo;
import jp.co.arthur.common.other.Insert;
import jp.co.arthur.common.other.Select;
import jp.co.arthur.common.other.Update;

/**
 * 購入商品情報Dao実装クラス
 *
 */
public class PurchaseInfoDaoImpl implements PurchaseInfoDao {

	/**
	 * {@inheritDoc}
	 */
	@Update
	@Override
	public void updatePurchaseInfo(PurchaseInfo purchaseInfo) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Insert
	@Override
	public void registPurchaseInfo(PurchaseInfo entity) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Select
	@Override
	public List<PurchaseInfo> findByAccount(String account) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Select
	@Override
	public PurchaseInfo findByPurchaseInfoId(String purchaseInfoId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
