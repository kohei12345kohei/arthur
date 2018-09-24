package jp.co.arthur.common.util;

import jp.co.arthur.common.type.BaseEnum;

/**
 * 日付のフォーマットenum
 *
 */
public enum DateFormatType implements BaseEnum {

	YYYYMMDD("yyyy/MM/dd"),
	YYYYMMDD_HHMMSS("yyyy/MM/dd hh:mm:ss");

	private String value;

	private DateFormatType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
