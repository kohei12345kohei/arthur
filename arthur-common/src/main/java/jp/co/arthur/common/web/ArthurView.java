package jp.co.arthur.common.web;

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

	private String value;

	private ArthurView(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
