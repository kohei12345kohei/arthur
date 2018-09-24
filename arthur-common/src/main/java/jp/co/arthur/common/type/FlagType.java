package jp.co.arthur.common.type;

/**
 * フラグ列挙
 *
 */
public enum FlagType implements BaseEnum {

	TRUE("1"),
	FALSE("0");

	private String value;

	private FlagType(String value) {
		this.value = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getValue() {
		return this.value;
	}

	public static FlagType of(String value) {
		return BaseEnum.of(FlagType.class, value);
	}

}
