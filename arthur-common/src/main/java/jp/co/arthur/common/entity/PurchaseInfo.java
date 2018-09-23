package jp.co.arthur.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 購入商品情報Entity
 *
 */
public class PurchaseInfo implements Serializable {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;
	/** 購入商品情報ID */
	private String purchaseInfoId;
	/** アカウント */
	private String account;
	/** 商品ID */
	private String itemId;
	/** 商品名 */
	private String itemName;
	/** 商品金額(単品) */
	private BigDecimal itemUnitMoney;
	/** 商品数 */
	private BigDecimal itemAmount;
	/** 登録日時 */
	private Date regDate;

	/**
	 * purchaseInfoIdを返す<br>
	 * @return purchaseInfoId
	 */
	public String getPurchaseInfoId() {
		return purchaseInfoId;
	}

	/**
	 * purchaseInfoIdを設定する<br>
	 * @param purchaseInfoId
	 */
	public void setPurchaseInfoId(String purchaseInfoId) {
		this.purchaseInfoId = purchaseInfoId;
	}

	/**
	 * accountを返す<br>
	 * @return account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * accountを設定する<br>
	 * @param account
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * itemIdを返す<br>
	 * @return itemId
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * itemIdを設定する<br>
	 * @param itemId
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * itemNameを返す<br>
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * itemNameを設定する<br>
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * itemUnitMoneyを返す<br>
	 * @return itemUnitMoney
	 */
	public BigDecimal getItemUnitMoney() {
		return itemUnitMoney;
	}

	/**
	 * itemUnitMoneyを設定する<br>
	 * @param itemUnitMoney
	 */
	public void setItemUnitMoney(BigDecimal itemUnitMoney) {
		this.itemUnitMoney = itemUnitMoney;
	}

	/**
	 * itemAmountを返す<br>
	 * @return itemAmount
	 */
	public BigDecimal getItemAmount() {
		return itemAmount;
	}

	/**
	 * itemAmountを設定する<br>
	 * @param itemAmount
	 */
	public void setItemAmount(BigDecimal itemAmount) {
		this.itemAmount = itemAmount;
	}

	/**
	 * regDateを返す<br>
	 * @return regDate
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * regDateを設定する<br>
	 * @param regDate
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
