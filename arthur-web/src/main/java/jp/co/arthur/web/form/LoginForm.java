package jp.co.arthur.web.form;

/**
 * ログインフォームクラス<br>
 *
 */
public class LoginForm {

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
