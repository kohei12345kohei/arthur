package jp.co.arthur.common.web;

/**
 * アーサーURL定義<br>
 *
 */
public enum ArthurView {

	/** ログイン画面 */
	LOGIN("login"),
	/** メニュー画面 */
	MENU("menu"),
	/** ログインユーザ作成入力画面 */
	LOGIN_USER_CREATE_INPUT("loginUserCreate-input"),
	/** ログインユーザ作成確認画面 */
	LOGIN_USER_CREATE_CONFIRM("loginUserCreate-confirm"),
	/** ログインユーザ作成完了画面 */
	LOGIN_USER_CREATE_COMPLETE("loginUserCreate-complete");

	private String url;

	private ArthurView(String url) {
		this.url = url;
	}

	/**
	 * 値を返す<br>
	 * @return
	 */
	public String getUrl() {
		return url;
	}
}
