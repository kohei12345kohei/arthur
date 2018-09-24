package jp.co.arthur.common.web;

/**
 * アーサーURL定義<br>
 *
 */
public enum ArthurView implements BaseView {

	/** ログイン画面 */
	LOGIN("login/index"),
	/** メニュー画面 */
	TOP("top/index"),
	/** エラー画面 */
	ERROR("error/index"),
	/** ログインユーザ作成入力画面 */
	LOGIN_USER_REGIST_INPUT("loginUserRegist/input"),
	/** ログインユーザ作成確認画面 */
	LOGIN_USER_REGIST_CONFIRM("loginUserRegist/confirm"),
	/** ログインユーザ作成完了画面 */
	LOGIN_USER_REGIST_COMPLETE("loginUserRegist/complete"),
	/** ログインユーザ設定詳細画面 */
	LOGIN_USER_SETTING_DETAIL("loginUserSetting/detail"),
	/** ログインユーザ設定入力画面 */
	LOGIN_USER_SETTING_INPUT("loginUserSetting/input"),
	/** ログインユーザ設定確認画面 */
	LOGIN_USER_SETTING_CONFIRM("loginUserSetting/confirm"),
	/** ログインユーザ設定完了画面 */
	LOGIN_USER_SETTING_COMPLETE("loginUserSetting/complete"),
	;

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
		return this.url;
	}

	public static ArthurView of(String url) {
		return BaseView.of(ArthurView.class, url);
	}

}
