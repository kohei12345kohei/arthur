package jp.co.arthur.common.web;

public enum ArthurView {

	/** ログイン画面 */
	LOGIN("login"),
	MENU("menu");

	private String value;

	private ArthurView(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
