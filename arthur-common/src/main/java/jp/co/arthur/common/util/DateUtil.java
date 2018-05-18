package jp.co.arthur.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 日付のUtilクラス<br>
 *
 */
public class DateUtil {

	/**
	 * プライベートコンストラクタ<br>
	 */
	private DateUtil() {
	}

	/**
	 * システム日付を返す<br>
	 * @return
	 */
	public static Date getSysDate() {
		return new Date();
	}

	/**
	 * @param targetDate
	 * @param format
	 * @return
	 */
	public static String toString(Date targetDate, DateFormat format) {

		if (Objects.isNull(format) || StringUtil.isEmpty(format.getValue())) {
			return StringUtil.EMPTY;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(format.getValue());
		return dateFormat.format(targetDate);
	}

	/**
	 * 文字列型の日付をDate型の日付に変換する<br>
	 * @param target
	 * @return
	 */
	public static Date toDate(String target, DateFormat dateFormat) {

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat.getValue());
		Date resultDate = null;
		try {
			resultDate = sdf.parse(target);
		} catch (ParseException e) {
			System.out.println("変換に失敗しました");
		}
		return resultDate;

	}

}
