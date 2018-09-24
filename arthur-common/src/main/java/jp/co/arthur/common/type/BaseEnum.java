package jp.co.arthur.common.type;

import java.util.stream.Stream;

/**
 * 基底列挙
 *
 */
public interface BaseEnum {

	/**
	 * 値を返す<br>
	 * @return
	 */
	String getValue();

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
	public static <T extends BaseEnum> T of(Class<? extends BaseEnum> viewClass, String value) {
		return (T) Stream.of(viewClass.getEnumConstants())
				.filter(e -> e.getValue().equals(value))
				.findFirst()
				.orElse(null);
	}

}
