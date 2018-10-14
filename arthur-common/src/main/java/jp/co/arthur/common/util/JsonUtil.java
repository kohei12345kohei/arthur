package jp.co.arthur.common.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.arthur.common.log.Logger;
import jp.co.arthur.common.log.LoggerFactory;

/**
 * JsonのUtilクラス<br>
 *
 */
public class JsonUtil {

	private static final Logger LOG = LoggerFactory.getLogger(JsonUtil.class);

	/**
	 * プライベートコンストラクタ<br>
	 */
	private JsonUtil() {
	}

	/**
	 * Json文字列からjavaオブジェクトに変換する<br>
	 * @param target
	 * @param clazz
	 * @return
	 */
	public static <T> T toJavaObject(String target, Class<T> clazz) {

		ObjectMapper mapper = new ObjectMapper();
		T t = null;
		try {
			t = mapper.readValue(target, clazz);
		} catch (JsonParseException e) {
			LOG.error("json形式でない", e);
		} catch (JsonMappingException e) {
			LOG.error("jsonとjavaオブジェクトが紐づいていない", e);
		} catch (IOException e) {
			LOG.error("", e);
		}
		return t;
	}

	/**
	 * javaオブジェクトからJson文字列に変換する<br>
	 * @param target
	 * @return
	 */
	public static String toJsonString(Object target) {

		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(target);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;

	}

}
