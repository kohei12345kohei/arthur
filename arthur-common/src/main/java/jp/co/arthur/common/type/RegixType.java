package jp.co.arthur.common.type;

import java.util.regex.Pattern;

/**
 * 正規表現列挙<br>
 *
 */
public enum RegixType implements BaseEnum {

	/** 半角数字 */
	HALF_NUMBER("^[0-9]*$"),
	/** 半角数字とピリオド */
	HALF_NUMBER_PERIOD("^[0-9.]*$"),
	/** 半角英数字 */
	HALF_CHAR("^[0-9a-zA-Z]*$"),
	/** URL */
	URL("http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?"),
	/** メールアドレス */
	MAIL_ADDRESS("[A-Za-z0-9._+]+@[A-Za-z]+.[A-Za-z]");

	/** 正規表現 */
	private String value;

	/**
	 * コンストラクタ<br>
	 *
	 * @param pattern
	 *     正規表現
	 */
	private RegixType(String value) {
		this.value = value;
	}

	/**
	 * 正規表現を返す<br>
	 *
	 * @return
	 */
	@Override
	public String getValue() {
		return this.value;
	}

	/**
	 * 指定した文字列(target)が指定した正規表現(patter)かどうか判定する<br>
	 * 正しい場合true, 異なる場合falseを返す<br>
	 *
	 * @param target
	 *     対象文字列
	 * @param pattern
	 *     正規表現
	 * @return
	 */
	public static boolean isPattern(String target, RegixType pattern) {
		return Pattern.compile(pattern.getValue()).matcher(target).find();
	}

}
