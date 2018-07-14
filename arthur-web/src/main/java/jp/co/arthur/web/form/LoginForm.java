package jp.co.arthur.web.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jp.co.arthur.common.web.BaseForm;

/**
 * ログインフォームクラス<br>
 *
 */
public class LoginForm implements BaseForm {

	/** ログインID */
	@NotEmpty(message = "ログインIDは必須です")
	@Pattern(regexp = "^[0-9a-zA-Z]*$", message = "ログインIDが半角英数でありません")
	@Size(min = 2, max = 16, message = "ログインIDが範囲外の値です")
	private String loginId;
	/** パスワード */
	@NotEmpty(message = "パスワードが未入力です")
	@Pattern(regexp = "^[0-9a-zA-Z]*$", message = "パスワードが半角英数でありません")
	@Size(min = 2, max = 16, message = "パスワードが範囲外の値です")
	private String password;

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

}
