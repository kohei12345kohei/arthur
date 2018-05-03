package jp.co.arthur.common.web;

/**
 * アーサーURL定義<br>
 *
 */
public enum ArthurView implements BaseView {

	/** ログイン画面 */
	LOGIN("login"),
	/** メニュー画面 */
	MENU("menu"),
	/** エラー画面 */
	ERROR("error"),
	/** ログインユーザ作成入力画面 */
	LOGIN_USER_CREATE_INPUT("loginUserCreate-input"),
	/** ログインユーザ作成確認画面 */
	LOGIN_USER_CREATE_CONFIRM("loginUserCreate-confirm"),
	/** ログインユーザ作成完了画面 */
	LOGIN_USER_CREATE_COMPLETE("loginUserCreate-complete");

	/** URL */
	private String url;

	private ArthurView(String url) {
		this.url = url;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getUrl() {
		return url;
	}

}
