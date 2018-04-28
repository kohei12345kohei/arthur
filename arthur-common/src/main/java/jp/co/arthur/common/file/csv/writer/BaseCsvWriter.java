package jp.co.arthur.common.file.csv.writer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringJoiner;

import javax.servlet.http.HttpServletResponse;

import org.springframework.util.MimeTypeUtils;

import jp.co.arthur.common.exception.ArthurErrorCode;
import jp.co.arthur.common.exception.BaseArthurIOException;
import jp.co.arthur.common.file.csv.model.BaseCsvModel;
import jp.co.arthur.common.other.Charset;
import jp.co.arthur.common.util.StringUtil;

/**
 * CSV書き込み基底クラス<br>
 * @param <T>CSV出力モデルリスト
 */
public abstract class BaseCsvWriter<T extends BaseCsvModel> {

	/** 囲い文字(デフォルトでは空文字(未指定)) */
	protected String enclosureChar = StringUtil.EMPTY;
	/** モデルリスト */
	protected List<T> modelList;

	/**
	 * コンストラクタ<br>
	 * @param enclosureChar
	 */
	public BaseCsvWriter(String enclosureChar) {
		this.enclosureChar = enclosureChar;
	}

	/**
	 * modelListを返す
	 * @return modelList
	 */
	public List<T> getModelList() {
		return modelList;
	}

	/**
	 * modelListを設定する
	 * @param modelList
	 */
	public void setModelList(List<T> modelList) {
		this.modelList = modelList;
	}

	/**
	 * メイン処理を実施<br>
	 * @param response
	 * @throws BaseArthurIOException
	 */
	public void execute(HttpServletResponse response) throws BaseArthurIOException {

		// ファイル名を取得
		String fileName = getFileName();

		// 初期化処理
		this.init(response, fileName);

		try (PrintWriter writer = response.getWriter()) {
			StringJoiner recordJoiner = new StringJoiner(StringUtil.NEW_LINE);
			// ヘッダーを書込
			writeHeader(recordJoiner);

			// データを書込
			modelList.stream().forEach(model -> writeData(recordJoiner, model));
			writer.print(recordJoiner.toString());

		} catch (BaseArthurIOException e) {
			throw new BaseArthurIOException(ArthurErrorCode.EB00001, "ファイルの出力処理に失敗しました");
		} catch (IOException e) {
			throw new BaseArthurIOException(ArthurErrorCode.EB00001, "ファイルの出力処理に失敗しました");
		}

	}

	/**
	 * 初期処理<br>
	 * @param response
	 * @param fileName
	 */
	private void init(HttpServletResponse response, String fileName) {

		response.setContentType(MimeTypeUtils.APPLICATION_OCTET_STREAM_VALUE + ";charset=" + Charset.UTF_8.toString().toLowerCase());
		response.setHeader("Content-Disposition", "attachment; filename=" + fileName);

	}

	/**
	 * 指定されたデータの書き込み処理を行う<br>
	 * @param joiner
	 * @param data 書き込みたいデータ
	 */
	protected void write(StringJoiner joiner, String data) {
		joiner.add(enclosureChar + data + enclosureChar);
	}

	/**
	 * ファイル名を取得<br>
	 * @return fileName
	 */
	protected abstract String getFileName();

	/**
	 * ヘッダーレコードをつめる<br>
	 * @param recordJoiner
	 */
	protected abstract void writeHeader(StringJoiner recordJoiner);

	/**
	 * データレコードをつめる<br>
	 * @param recordJoiner
	 * @param model
	 */
	protected abstract void writeData(StringJoiner recordJoiner, T model);

}
