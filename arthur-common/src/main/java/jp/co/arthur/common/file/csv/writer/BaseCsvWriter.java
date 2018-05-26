package jp.co.arthur.common.file.csv.writer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.util.MimeTypeUtils;

import jp.co.arthur.common.exception.ArthurErrorCode;
import jp.co.arthur.common.exception.BaseArthurIOException;
import jp.co.arthur.common.file.csv.CsvConfig;
import jp.co.arthur.common.file.csv.annotation.CsvColumn;
import jp.co.arthur.common.file.csv.model.BaseCsvModel;
import jp.co.arthur.common.other.Charset;
import jp.co.arthur.common.util.StringUtil;

/**
 * CSV書込 基底クラス<br>
 *
 * @param <T>
 *            CSV出力モデルリスト
 */
public abstract class BaseCsvWriter<T extends BaseCsvModel> {

	/** CSV設定情報クラス */
	private CsvConfig conf;
	/** モデルリスト */
	protected List<T> modelList;

	/**
	 * コンストラクタ<br>
	 *
	 * @param conf
	 *            CSV設定情報クラス
	 * @param modelList
	 *            出力モデルクラスリスト
	 */
	public BaseCsvWriter(CsvConfig conf, List<T> modelList) {
		this.conf = conf;
		this.modelList = modelList;
	}

	/**
	 * メイン処理を実施<br>
	 *
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
	 *
	 * @param response
	 *            HttpServletResponse
	 * @param fileName
	 */
	private void init(HttpServletResponse response, String fileName) {

		response.setContentType(
				MimeTypeUtils.APPLICATION_OCTET_STREAM_VALUE + ";charset=" + Charset.UTF_8.toString().toLowerCase());
		response.setHeader("Content-Disposition", "attachment; filename=" + fileName);

	}

	/**
	 * 指定されたデータの書き込み処理を行う<br>
	 *
	 * @param joiner
	 *            StringJoiner
	 * @param data
	 *            書き込みたいデータ
	 */
	protected void write(StringJoiner joiner, String data) {
		String enclosureChar = conf.isEnclosureFlag() ? conf.getEnclosureChar() : StringUtil.EMPTY;
		joiner.add(enclosureChar + data + enclosureChar);
	}

	/**
	 * 指定したクラス型のフィールドについた@CsvColumnのorder順にCsvOrderMapを返す<br>
	 *
	 * @param clazz
	 * @return
	 */
	protected Map<Integer, CsvColumn> getCsvColumnOrder(Class<T> clazz) {

		Map<Integer, CsvColumn> orderMap = new TreeMap<Integer, CsvColumn>();
		List.of(clazz.getDeclaredFields()).stream()
			.map(field -> field.getAnnotation(CsvColumn.class))
			.forEach(column -> orderMap.put(column.order(), column));

		return orderMap;
	}

	/**
	 * ファイル名を取得<br>
	 *
	 * @return fileName
	 */
	protected abstract String getFileName();

	/**
	 * ヘッダーレコードをつめる<br>
	 *
	 * @param recordJoiner
	 */
	protected abstract void writeHeader(StringJoiner recordJoiner);

	/**
	 * データレコードをつめる<br>
	 *
	 * @param recordJoiner
	 * @param model
	 */
	protected abstract void writeData(StringJoiner recordJoiner, T model);

}
