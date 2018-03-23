package jp.co.arthur.common.exception;

import java.util.StringJoiner;

import jp.co.arthur.common.util.StringUtil;

/**
 * 基底例外クラス<br>
 *
 */
public abstract class BaseArthurException extends Exception {

	/** アーサーエラーコード */
	private ArthurErrorCode errorCode;
	/** 例外メッセージ */
	private String execptionMessage;

	/**
	 * デフォルトコンストラクタ<br>
	 */
	public BaseArthurException() {

	}

	/**
	 * 例外設定するコンストラクタ<br>
	 * @param errorCode
	 */
	public BaseArthurException(ArthurErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 例外設定するコンストラクタ<br>
	 * @param errorCode
	 * @param execptionMessage
	 */
	public BaseArthurException(ArthurErrorCode errorCode, String execptionMessage) {
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
		StringJoiner joiner = new StringJoiner(StringUtil.SPACE);
		joiner.add(this.errorCode.getErrorCode());
		joiner.add(this.errorCode.getErrorMessage());
		joiner.add(this.execptionMessage);
		return joiner.toString();
	}

}
