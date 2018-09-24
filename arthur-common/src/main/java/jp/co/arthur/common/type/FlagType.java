package jp.co.arthur.common.type;

/**
 * フラグ列挙
 *
 */
public enum FlagType {

	TRUE("1"),
	FALSE("0");

	private String value;

	private FlagType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
