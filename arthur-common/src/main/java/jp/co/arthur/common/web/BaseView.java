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
	 * 指定したEnumクラスの指定した値と一致するEnumを返す<br>
	 * 一致するenumがない場合nullを返す<br>
	 * @param viewClass BaseViewを継承したViewのEnum
	 * @param value 検査したい値
	 * @return
	 */
	public static <V extends BaseView> V of(Class<? extends BaseView> view, String url) {

		for (BaseView baseView : view.getEnumConstants()) {
			if (baseView.getUrl().equals(url)) {
				return (V) baseView;
			}
		}
		// 一致しない場合
		return null;
	}
}
