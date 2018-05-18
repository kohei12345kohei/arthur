package jp.co.arthur.web.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import jp.co.arthur.common.web.BaseForm;

/**
 * ログインユーザ作成フォームクラス<br>
 *
 */
public class LoginUserRegistForm implements BaseForm {

	/** ログインID */
	@NotEmpty(message = "ログインIDは必須です")
	private String loginId;
	/** パスワード */
	@Size(min = 8, max = 16, message = "パスワードは{min}文字以上{max}文字以下です")
	@NotEmpty(message = "パスワードは必須です")
	private String password;
	/** 確認用パスワード */
	@Size(min = 8, max = 16, message = "確認用パスワードは{min}文字以上{max}文字以下です")
	@NotEmpty(message = "確認用パスワードは必須です")
	private String confirmPassword;

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
	 * confirmPasswordを返す<br>
	 * @return confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * confirmPasswordを設定する<br>
	 * @param confirmPassword
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
