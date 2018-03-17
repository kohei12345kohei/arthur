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
	 * @return loginId
	 */
	public String getLoginId() {
		return loginId;
	}
	/**
	 * @param loginId セットする loginId
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	/**
	 * @return passeord
	 */
	public String getPasseord() {
		return passeord;
	}
	/**
	 * @param passeord セットする passeord
	 */
	public void setPasseord(String passeord) {
		this.passeord = passeord;
	}


}
