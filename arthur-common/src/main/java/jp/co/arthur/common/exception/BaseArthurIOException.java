package jp.co.arthur.common.exception;

import java.io.IOException;
import java.util.StringJoiner;

/**
 * アーサーIO例外クラス<br>
 *
 */
public class BaseArthurIOException extends IOException {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;


	/** アーサーエラーコード */
	private ArthurErrorCode errorCode;
	/** 例外メッセージ */
	private String execptionMessage;

	/**
	 * デフォルトコンストラクタ<br>
	 */
	public BaseArthurIOException() {

	}

	/**
	 * 例外設定するコンストラクタ<br>
	 * @param errorCode
	 */
	public BaseArthurIOException(ArthurErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 例外設定するコンストラクタ<br>
	 * @param errorCode
	 * @param execptionMessage
	 */
	public BaseArthurIOException(ArthurErrorCode errorCode, String execptionMessage) {
		this.errorCode = errorCode;
		this.execptionMessage = execptionMessage;
	}

	/**
	 * errorCodeを返す<br>
	 * @return errorCode
	 */
	public ArthurErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * エラーメッセージを組み立てて返す<br>
	 */
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(" ");
		joiner.add(this.errorCode.getErrorCode());
		joiner.add(this.errorCode.getErrorMessage());
		joiner.add(this.execptionMessage);
		return joiner.toString();
	}

}
