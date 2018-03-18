package jp.co.arthur.common.exception;

/**
 * アーサー例外コードenum
 *
 */
public enum ArthurErrorCode {

	WA00001("WA00001", ""),

	EMPTY("empty", "");

	private ArthurErrorCode(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/** エラーコード */
	private String errorCode;
	/** エラーメッセージ */
	private String errorMessage;

	/**
	 * errorCodeを返す<br>
	 * @return errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * errorMessageを返す<br>
	 * @return errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * 指定されたエラーコードと一致するアーサーエラーコードを返す<br>
	 * @param errorCode
	 * @return
	 */
	public static ArthurErrorCode of(String errorCode) {

		for (ArthurErrorCode arthurErrorCode : ArthurErrorCode.values()) {
			if (arthurErrorCode.errorCode.equals(errorCode)) {
				return arthurErrorCode;
			}
		}
		return null;
	}
}
