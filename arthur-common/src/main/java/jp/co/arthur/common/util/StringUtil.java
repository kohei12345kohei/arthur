package jp.co.arthur.common.util;

import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Splitter.MapSplitter;
import com.google.common.base.Strings;

/**
 * 文字列のUtilクラス<br>
 *
 */
public class StringUtil {

	/** 空文字 */
	public static final String EMPTY = "";
	/** スペース */
	public static final String SPACE = " ";
	/** & */
	public static final String AND = "&";
	/** = */
	public static final String EQUAL = "=";
	/** フラグ値：true */
	public static final String FLG_TRUE = "1";
	/** フラグ値：false */
	public static final String FLG_FALSE = "0";
	/** 改行 */
	public static final String NEW_LINE = "\r\n";

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
	 * 指定された文字列を指定した数字分繰り返す<br>
	 * @param target
	 * @param count
	 * @return
	 */
	public static String repeat(String target, int count) {
		return Strings.repeat(target, count);
	}

	/**
	 * 指定されたリストをseparatorで区切った文字列を返す<br>
	 * skipNullがtrueの場合、結果にnullの値を含めない<br>
	 * @param targetList
	 * @param separator
	 * @param skipNull
	 * @return
	 */
	public static String join(List<String> targetList, String separator, boolean skipNull) {
		return skipNull ? Joiner.on(separator).skipNulls().join(targetList) : Joiner.on(separator).join(targetList);
	}

	/**
	 * 指定された文字列をdelimで区切ったリストを返す<br>
	 * @param target
	 * @param separator
	 * @return
	 */
	public static List<String> toList(String target, String separator) {
		return Splitter.on(separator).splitToList(target);
	}

	/**
	 * 指定した文字列からクエリの文字列をmapに変換する<br>
	 * 例)<br>
	 * target = name=hoge&from=huga の場合<br>
	 * (name, hoge) (from, huga)のマップを返す<br>
	 * @param target
	 * @return
	 */
	public static Map<String, String> toQueryMap(String target) {
		Splitter splitter = Splitter.on(AND);
		// trimする
		splitter = splitter.trimResults();

		MapSplitter mapSplitter = splitter.withKeyValueSeparator(EQUAL);
		return mapSplitter.split(target);
	}

	/**
	 * 指定されたフラグ値がtrueかどうか判定する<br>
	 * @param target
	 * @return
	 */
	public static boolean isTrue(String target) {
		return FLG_TRUE.equals(target);
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
