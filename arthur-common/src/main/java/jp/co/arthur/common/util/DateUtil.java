package jp.co.arthur.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 日付のUtilクラス<br>
 *
 */
public class DateUtil {

	/**
	 * プラｲベートコンストラクタ<br>
	 */
	private DateUtil() {
	}

	public static String toString(Date targetDate, DateFormat format) {

		if (Objects.isNull(format) || StringUtil.isEmpty(format.getValue())) {
			return StringUtil.EMPTY;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(format.getValue());
		return dateFormat.format(targetDate);
	}

}
