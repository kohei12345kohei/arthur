package jp.co.arthur.common.exception;

/**
 * アーサー例外コードenum
 *
 */
public enum ArthurErrorCode {

	// -----E系-----
	/** システムエラー */
	EA00001("EA00001", "システムエラーです"),
	/** DBアクセスエラー */
	EA00002("EA00001", "DBアクセスエラーです"),

	// -----login-----
	LOGIN_FAILED("EB00001", "パスワードが間違っています"),

	// -----validate-----
	/** 空文字エラー */
	EMPTY("empty", "空文字が指定されています"),
	/** 必須エラー */
	REQUIRE("require", "必須項目が入力されていません"),
	/** 桁数超過エラー */
	LENGTH_OVER("lengthOver", "桁数が超過しています"),
	/** 桁数不足エラー */
	LENGTH_LACK("lengthLack", "桁数が不足しています"),
	;

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

		for (ArthurErrorCode arthurErrorCode : ArthurErrorCode.class.getEnumConstants()) {
			if (arthurErrorCode.errorCode.equals(errorCode)) {
				return arthurErrorCode;
			}
		}
		return null;
	}
}
