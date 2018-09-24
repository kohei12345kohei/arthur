package jp.co.arthur.common.util;

import jp.co.arthur.common.type.BaseEnum;

/**
 * 日付のフォーマットの列挙
 *
 */
public enum DateFormatType implements BaseEnum {

	/** yyyy/MM/dd */
	YYYYMMDD("yyyy/MM/dd"),
	/** yyyy/MM/dd hh:mm:ss */
	YYYYMMDD_HHMMSS("yyyy/MM/dd hh:mm:ss");

	/** value */
	private String value;

	private DateFormatType(String value) {
		this.value = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getValue() {
		return this.value;
	}
}
