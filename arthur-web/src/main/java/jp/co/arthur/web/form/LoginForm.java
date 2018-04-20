package jp.co.arthur.web.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import jp.co.arthur.common.web.BaseForm;

/**
 * ログインフォームクラス<br>
 *
 */
public class LoginForm implements BaseForm {

	/** ログインID */
	@NotEmpty(message = "ログインIDは必須です")
	private String loginId;
	/** パスワード */
	@Size(min = 8, max = 16, message = "パスワードは{min}文字以上{max}文字以下です")
	@NotEmpty(message = "パスワードは必須です")
	private String password;

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

}
