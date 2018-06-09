package jp.co.arthur.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ログインユーザEntity<br>
 *
 */
@Entity
@Table(name = "LOGIN_USER")
public class LoginUser implements Serializable {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;
	/** ログインID */
	@Id
	@Column(name = "LOGIN_ID", nullable = false, length = 16)
	private String loginId;
	/** パスワード */
	@Column(name = "PASSWORD", nullable = false, length = 16)
	private String password;
	/** アカウント */
	@Column(name = "ACCOUNT", nullable = false, length = 16)
	private String account;
	/** 登録日時 */
	@Column(name = "REG_DATE", nullable = false)
	private Date regDate;
	/** 更新日時 */
	@Column(name = "UPDATE_DATE", nullable = true)
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
