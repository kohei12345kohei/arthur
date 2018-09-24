package jp.co.arthur.common.api.type;

import jp.co.arthur.common.type.BaseEnum;

public enum ResultType implements BaseEnum {

	FALIURE("failure"),
	SUCCESS("success");

	private String value;

	private ResultType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public static ResultType of(String value) {
		return BaseEnum.of(ResultType.class, value);
	}

}
