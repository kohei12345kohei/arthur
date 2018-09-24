package jp.co.arthur.common.log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.StringJoiner;

import jp.co.arthur.common.log.annotation.Ignore;
import jp.co.arthur.common.log.annotation.Mask;
import jp.co.arthur.common.type.AccessorType;
import jp.co.arthur.common.util.BeanUtil;
import jp.co.arthur.common.util.DateFormatType;
import jp.co.arthur.common.util.DateUtil;
import jp.co.arthur.common.util.StringUtil;

/**
 * logメッセージ作成クラス<br>
 *
 */
public class LogMessageFactory {

	private static final Logger LOG = LoggerFactory.getLogger(LogMessageFactory.class);

	private static final String MASK = "****";

	/**
	 * プライベートコンストラクタ
	 */
	private LogMessageFactory() {
	}

	/**
	 * ログメッセージを返す<br>
	 * @param bean
	 * @return
	 */
	public static String getMessage(Object bean) {
		StringJoiner body = new StringJoiner(", ");
		Class<?> clazz = bean.getClass();

		for (Field f : BeanUtil.getFieldList(clazz)) {
			if (isIgnore(f)) {
				// 出力非対象項目
				continue;
			}
			String name = f.getName();
			if (isMask(f)) {
				body.add(name + StringUtil.EQUAL + MASK);
			} else {
				body.add(name + StringUtil.EQUAL + editValue(getValue(bean, name)));
			}
		}
		return clazz.getName() + StringUtil.SPACE + body.toString();
	}

	/**
	 * 値を取得<br>
	 *
	 * @param bean
	 *     Bean
	 * @param fieldName
	 *     フィールド名
	 * @return
	 */
	private static Object getValue(Object bean, String fieldName) {
		Object value = null;
		try {
			Method getter = BeanUtil.getAccessor(fieldName, bean.getClass(), AccessorType.GETTER);
			value = getter.invoke(bean);
		} catch (IllegalAccessException e) {
			LOG.error("不正アクセスです" + fieldName, e);
		} catch (IllegalArgumentException e) {
			LOG.error("不正な引数です" + fieldName, e);
		} catch (InvocationTargetException e) {
			LOG.error("項目が不正です" + fieldName, e);
		}

		return value;
	}

	/**
	 * 値を出力用に編集する<br>
	 *
	 * @param value
	 *     値
	 * @return
	 */
	private static String editValue(Object value) {
		String strValue;
		if (BeanUtil.isNull(value)) {
			strValue = StringUtil.EMPTY;
		} else if (value instanceof Date) {
			strValue = DateUtil.toString((Date) value, DateFormatType.YYYYMMDD_HHMMSS);
		} else {
			strValue = value.toString();
		}
		return strValue;
	}

	/**
	 * マスク対象かどうかを返す<br>
	 * @param field
	 * @return
	 */
	private static boolean isMask(Field field) {
		return BeanUtil.notNull(field.getAnnotation(Mask.class));
	}

	/**
	 * ログ出力対象かどうかを返す<br>
	 * @param field
	 * @return
	 */
	private static boolean isIgnore(Field field) {
		return BeanUtil.notNull(field.getAnnotation(Ignore.class));
	}

}
