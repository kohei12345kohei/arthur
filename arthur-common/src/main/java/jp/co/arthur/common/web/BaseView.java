package jp.co.arthur.common.web;

/**
 * 基底View<br>
 * 各画面のviewはこのインターフェースを継承すること<br>
 *
 */
public interface BaseView {

	/**
	 * URLを返す<br>
	 * @return
	 */
	String getUrl();

	/**
	 * URLと一致するviewを返す<br>
	 * @param url
	 * @return
	 */
	BaseView of(String url);
}
