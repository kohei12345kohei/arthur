package jp.co.arthur.common.file.csv.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

	/**
	 * 値
	 */
	String value() default "";

	/**
	 * 順序
	 */
	int order() default 1;

}
