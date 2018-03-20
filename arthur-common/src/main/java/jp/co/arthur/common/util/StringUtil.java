package jp.co.arthur.common.util;

import com.google.common.base.Strings;

/**
 * 文字列のUtilクラス<br>
 *
 */
public class StringUtil {

	/** 空文字 */
	public static final String EMPTY = "";

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
		return Strings.isNullOrEmpty(target);
	}

	/**
	 * 指定されたフラグ値がtrueかどうか判定する<br>
	 * @param target
	 * @return
	 */
	public static boolean isTrue(String target) {
		return "1".equals(target);
	}

	/**
	 * 指定されたフラグ値がfalseかどうか判定する<br>
	 * @param target
	 * @return
	 */
	public static boolean isFalse(String target) {
		return !isTrue(target);
	}
}
