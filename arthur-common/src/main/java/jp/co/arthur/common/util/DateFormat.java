package jp.co.arthur.common.util;

/**
 * 日付のフォーマットenum
 *
 */
public enum DateFormat {

	YYYYMMDD("yyyy/MM/dd"),
	YYYYMMDD_HHMMSS("yyyy/MM/dd hh:mm:ss");

	private String value;

	private DateFormat(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
