package jp.co.arthur.common.exception;

import java.util.stream.Stream;

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


	// -----IO系-----
	EB00001("EB00001", "ファイルの出力に失敗しました"),

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
		return this.errorCode;
	}

	/**
	 * errorMessageを返す<br>
	 * @return errorMessage
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}

	/**
	 * 指定されたエラーコードと一致するアーサーエラーコードを返す<br>
	 * @param errorCode
	 * @return
	 */
	public static ArthurErrorCode of(String errorCode) {
		return Stream.of(ArthurErrorCode.class.getEnumConstants())
				.filter(code -> code.errorCode.equals(errorCode))
				.findFirst()
				.orElse(null);
	}
}
