package jp.co.arthur.common.exception;

import java.util.StringJoiner;

import jp.co.arthur.common.util.StringUtil;

/**
 * 基底例外クラス<br>
 *
 */
public abstract class BaseArthurException extends Exception {

	/** シリアルバージョンUID */
	private static final long serialVersionUID = 1L;

	/** アーサーエラーコード */
	private ArthurErrorCode errorCode;
	/** 詳細 */
	private String detail;

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
	 * @param detail
	 */
	public BaseArthurException(ArthurErrorCode errorCode, String detail) {
		this.errorCode = errorCode;
		this.detail = detail;
	}

	/**
	 * detailを返す<br>
	 * @return detail
	 */
	public String getDetail() {
		return detail;
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
		joiner.add(this.detail);
		return joiner.toString();
	}

}
