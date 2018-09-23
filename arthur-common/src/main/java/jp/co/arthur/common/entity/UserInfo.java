package jp.co.arthur.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザ情報Entity<br>
 * ユーザ情報の設定を定義<br>
 *
 */
public class UserInfo implements Serializable {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;

	/** アカウント */
	private String account;
	/** 登録日時 */
	private Date regDate;
	/** 更新日時 */
	private Date updateDate;


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
	/**
	 * updateDateを返す<br>
	 * @return updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * updateDateを設定する<br>
	 * @param updateDate
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
