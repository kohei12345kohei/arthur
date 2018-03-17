package jp.co.arthur.common.util;

import java.util.Objects;

/**
 * 文字列のUtilクラス<br>
 *
 */
public class StringUtil {

	/**
	 * プライベートコンストラクタ<br>
	 */
	private StringUtil() {

	}

	/**
	 * 指定された文字列が空文字かどうか判定する<br>
	 * @param target
	 * @return
	 */
	public static boolean isEmpty(String target) {
		return Objects.isNull(target) || target.length() < 1;
	}
}
