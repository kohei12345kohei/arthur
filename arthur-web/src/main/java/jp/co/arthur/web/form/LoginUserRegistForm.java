package jp.co.arthur.web.form;

import jp.co.arthur.common.log.annotation.Mask;
import jp.co.arthur.common.validator.annotation.Max;
import jp.co.arthur.common.validator.annotation.Min;
import jp.co.arthur.common.validator.annotation.Required;
import jp.co.arthur.common.web.BaseForm;

/**
 * ログインユーザ作成フォームクラス<br>
 *
 */
public class LoginUserRegistForm implements BaseForm {

	/** ログインID */
	@Required(message = "ログインIDは必須です")
	private String loginId;
	/** パスワード */
	@Mask
	@Max(size = 16, message = "パスワードが範囲外の値です")
	@Min(size = 4, message = "パスワードが範囲外の値です")
	@Required(message = "パスワードは必須です")
	private String password;
	/** 確認用パスワード */
	@Mask
	@Max(size = 16, message = "確認用パスワードが範囲外の値です")
	@Min(size = 4, message = "確認用パスワードが範囲外の値です")
	@Required(message = "確認用パスワードは必須です")
	private String confirmPassword;

	/**
	 * loginIdを返す<br>
	 *
	 * @return loginId ログインID
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * loginIdを設定する<br>
	 *
	 * @param loginId
	 *            ログインID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * passwordを返す<br>
	 *
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * passwordを設定する<br>
	 *
	 * @param password
	 *            パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * confirmPasswordを返す<br>
	 *
	 * @return confirmPassword 確認用パスワード
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * confirmPasswordを設定する<br>
	 *
	 * @param confirmPassword
	 *            確認用パスワード
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
