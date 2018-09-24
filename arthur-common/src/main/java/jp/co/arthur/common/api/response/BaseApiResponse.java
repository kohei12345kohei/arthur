package jp.co.arthur.common.api.response;

/**
 * API基底レスポンスクラス<br>
 *
 */
public abstract class BaseApiResponse {

	/** 結果 */
	private int result;

	/**
	 * resultを返す<br>
	 * @return result
	 */
	public int getResult() {
		return result;
	}

	/**
	 * resultを設定する<br>
	 * @param result
	 */
	public void setResult(int result) {
		this.result = result;
	}

}
