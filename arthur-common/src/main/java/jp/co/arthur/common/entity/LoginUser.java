package jp.co.arthur.common.entity;

import java.util.Date;

/**
 * ログインユーザEntityクラス<br>
 *
 */
public class LoginUser {

	/** ログインID */
	private String loginId;
	/** パスワード */
	private String password;
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
