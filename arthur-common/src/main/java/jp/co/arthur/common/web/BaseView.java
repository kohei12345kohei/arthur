package jp.co.arthur.common.web;

import java.util.stream.Stream;

/**
 * 基底View<br>
 * 各画面のviewはこのインターフェースを継承すること<br>
 *
 */
public interface BaseView {

	/**
	 * URLを返す<br>
	 *
	 * @return
	 */
	String getUrl();

	/**
	 * 指定したEnumクラスの指定した値と一致するEnumを返す<br>
	 * 一致するEnumがない場合nullを返す<br>
	 *
	 * @param viewClass
	 *            BaseViewを継承したViewのEnum
	 * @param url
	 *            検査したい値
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <V extends BaseView> V of(Class<? extends BaseView> viewClass, String url) {
		return (V) Stream.of(viewClass.getEnumConstants())
				.filter(view -> view.getUrl().equals(url))
				.findFirst()
				.orElse(null);
	}
}
