package jp.co.arthur.business.db.entity;

import java.util.Date;

import org.seasar.doma.Entity;

@Entity
public class LoginUser {

	/** ログインID */
	private String loginId;
	/** パスワード */
	private String password;
	/** アカウント */
	private String account;
	/** 有効期限 */
	private Date validDate;
	/** 登録日時 */
	private Date regDate;
	/** 更新日時 */
	private Date updateDate;

	/**
	 * loginIdを返す<br>
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * loginIdを設定する<br>
	 * @param loginId
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * passwordを返す<br>
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * passwordを設定する<br>
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return validDate
	 */
	public Date getValidDate() {
		return validDate;
	}

	/**
	 * @param validDate セットする validDate
	 */
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
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
