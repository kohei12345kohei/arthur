package jp.co.arthur.common.type;

/**
 * Charset列挙<br>
 *
 */
public enum Charset implements BaseEnum {

	MS_932("MS932"),
	UTF_8("UTF-8");

	private String value;

	private Charset(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

}
