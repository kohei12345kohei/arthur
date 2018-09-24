package jp.co.arthur.common.api.response;

import jp.co.arthur.common.exception.ArthurErrorCode;
import jp.co.arthur.common.exception.BaseArthurException;

/**
 * 例外レスポンスクラス<br>
 *
 */
public class ErrorResponse extends BaseApiResponse {

	/** エラーコード */
	private ArthurErrorCode errorCode;
	/** 詳細 */
	private String detail;

	/**
	 * コンストラクタ<br>
	 *
	 * @param e
	 */
	public ErrorResponse(BaseArthurException e) {
		super.setResult(1);
		this.errorCode = e.getErrorCode();
		this.detail = e.getDetail();
	}

	/**
	 * errorCodeを返す<br>
	 *
	 * @return errorCode
	 */
	public ArthurErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * detailを返す<br>
	 *
	 * @return detail
	 */
	public String getDetail() {
		return detail;
	}

}
