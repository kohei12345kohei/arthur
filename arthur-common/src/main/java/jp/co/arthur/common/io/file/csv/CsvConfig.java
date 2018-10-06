package jp.co.arthur.common.io.file.csv;

/**
 * CSV設定情報<br>
 * 今後、追加するCSV設定情報は本クラスで定義する<br>
 *
 */
public class CsvConfig {

	/** ファイル名 */
	private String fileName;
	/** 囲み文字利用フラグ */
	private boolean enclosureFlag;
	/** 囲み文字 */
	private String enclosureChar;
	/** ヘッダー有無 */
	private boolean hasHeader;

	/**
	 * fileNameを返す<br>
	 *
	 * @return fileName fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * fileNameを設定する<br>
	 *
	 * @param fileName
	 *            fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * enclosureFlagを返す<br>
	 *
	 * @return enclosureFlag enclosureFlag
	 */
	public boolean isEnclosureFlag() {
		return enclosureFlag;
	}

	/**
	 * enclosureFlagを設定する<br>
	 *
	 * @param enclosureFlag
	 *            enclosureFlag
	 */
	public void setEnclosureFlag(boolean enclosureFlag) {
		this.enclosureFlag = enclosureFlag;
	}

	/**
	 * enclosureCharを返す<br>
	 *
	 * @return enclosureChar enclosureChar
	 */
	public String getEnclosureChar() {
		return enclosureChar;
	}

	/**
	 * enclosureCharを設定する<br>
	 *
	 * @param enclosureChar
	 *            enclosureChar
	 */
	public void setEnclosureChar(String enclosureChar) {
		this.enclosureChar = enclosureChar;
	}

	/**
	 * hasHeaderを返す<br>
	 *
	 * @return hasHeader hasHeader
	 */
	public boolean isHasHeader() {
		return hasHeader;
	}

	/**
	 * hasHeaderを設定する<br>
	 *
	 * @param hasHeader
	 *            hasHeader
	 */
	public void setHasHeader(boolean hasHeader) {
		this.hasHeader = hasHeader;
	}

}
