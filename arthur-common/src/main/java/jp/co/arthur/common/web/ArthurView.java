package jp.co.arthur.common.web;

import jp.co.arthur.common.other.BaseEnum;

/**
 * アーサーURL定義<br>
 *
 */
public enum ArthurView implements BaseView, BaseEnum {

	/** ログイン画面 */
	LOGIN("login"),
	/** メニュー画面 */
	MENU("menu"),
	/** エラー画面 */
	ERROR("error"),
	/** ログインユーザ作成入力画面 */
	LOGIN_USER_REGIST_INPUT("loginUserRegist-input"),
	/** ログインユーザ作成確認画面 */
	LOGIN_USER_REGIST_CONFIRM("loginUserRegist-confirm"),
	/** ログインユーザ作成完了画面 */
	LOGIN_USER_REGIST_COMPLETE("loginUserRegist-complete"),
	/** ログインユーザ設定詳細画面 */
	LOGIN_USER_SETTING_DETAIL("loginUserSetting-detail"),
	/** ログインユーザ設定入力画面 */
	LOGIN_USER_SETTING_INPUT("loginUserSetting-input"),
	/** ログインユーザ設定確認画面 */
	LOGIN_USER_SETTING_CONFIRM("loginUserSetting-confirm"),
	/** ログインユーザ設定完了画面 */
	LOGIN_USER_SETTING_COMPLETE("loginUserSetting-complete"),
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

}
