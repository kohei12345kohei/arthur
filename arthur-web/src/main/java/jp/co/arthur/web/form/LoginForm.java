package jp.co.arthur.web.form;

import jp.co.arthur.common.web.BaseForm;

/**
 * ログインフォームクラス<br>
 *
 */
public class LoginForm implements BaseForm {

	/** ログインID */
	private String loginId;
	/** パスワード */
	private String passeord;

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
	 * passeordを返す<br>
	 * @return passeord
	 */
	public String getPasseord() {
		return passeord;
	}
	/**
	 * passeordを設定する<br>
	 * @param passeord
	 */
	public void setPasseord(String passeord) {
		this.passeord = passeord;
	}

}
