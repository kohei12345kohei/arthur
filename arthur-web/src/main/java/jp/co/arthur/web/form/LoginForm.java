package jp.co.arthur.web.form;

import jp.co.arthur.common.log.annotation.Mask;
import jp.co.arthur.common.type.RegixType;
import jp.co.arthur.common.validator.annotation.Max;
import jp.co.arthur.common.validator.annotation.Min;
import jp.co.arthur.common.validator.annotation.Pattern;
import jp.co.arthur.common.validator.annotation.Required;
import jp.co.arthur.common.web.BaseForm;

/**
 * ログインフォームクラス<br>
 *
 */
public class LoginForm implements BaseForm {

	/** ログインID */
	@Required(message = "ログインIDは必須です")
	@Pattern(regixPattern = RegixType.HALF_CHAR, message = "ログインIDが半角英数でありません")
	@Max(size = 16, message = "ログインIDが範囲外の値です")
	@Min(size = 4, message = "ログインIDが範囲外の値です")
	private String loginId;
	/** パスワード */
	@Mask
	@Required(message = "パスワードは必須です")
	@Pattern(regixPattern = RegixType.HALF_CHAR, message = "パスワードが半角英数でありません")
	@Max(size = 16, message = "パスワードが範囲外の値です")
	@Min(size = 4, message = "パスワードが範囲外の値です")
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
