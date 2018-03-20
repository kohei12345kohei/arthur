package jp.co.arthur.common.other;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * deleteのマーカーアノテーション<br>
 *
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface Delete {

}
