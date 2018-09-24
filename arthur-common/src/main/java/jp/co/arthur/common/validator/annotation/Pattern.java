package jp.co.arthur.common.validator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import jp.co.arthur.common.type.RegixType;
import jp.co.arthur.common.validator.PatternValidator;

/**
 * 型チェックvalidator<br>
 * @see jp.co.arthur.common.validator.PatternValidator
 *
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = PatternValidator.class)
public @interface Pattern {

	RegixType regixPattern();

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
