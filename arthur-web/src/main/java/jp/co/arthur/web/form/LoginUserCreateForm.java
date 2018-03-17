package jp.co.arthur.web.form;

import org.springframework.validation.Validator;

import jp.co.arthur.common.web.BaseForm;

/**
 * ログインユーザ作成フォームクラス<br>
 *
 */
public class LoginUserCreateForm implements BaseForm {

	/** ログインID */
	private String loginId;
	/** パスワード */
	private String password;
	/** 確認用パスワード */
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