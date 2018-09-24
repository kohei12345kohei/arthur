package jp.co.arthur.common.log;

/**
 * logger生成クラス<br>
 *
 */
public class LoggerFactory {

	/**
	 * プライベートコンストラクタ
	 */
	private LoggerFactory() {
	}

	/**
	 * 指定されたclass型のロガーを返す<br>
	 * @param clazz
	 * @return
	 */
	public static Logger getLogger(Class<?> clazz) {
		return new Logger(org.slf4j.LoggerFactory.getLogger(clazz));
	}
}
