package jp.co.arthur.common.api.response;

import jp.co.arthur.common.api.type.ResultType;

/**
 * API基底レスポンスクラス<br>
 *
 */
public abstract class BaseApiResponse {

	/** 結果 */
	private ResultType result;

	/**
	 * resultを返す<br>
	 * @return result
	 */
	public ResultType getResult() {
		return result;
	}

	/**
	 * resultを設定する<br>
	 * @param result
	 */
	public void setResult(ResultType result) {
		this.result = result;
	}

}
