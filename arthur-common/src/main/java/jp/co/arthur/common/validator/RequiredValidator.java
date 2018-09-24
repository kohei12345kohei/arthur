package jp.co.arthur.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jp.co.arthur.common.util.BeanUtil;
import jp.co.arthur.common.util.StringUtil;
import jp.co.arthur.common.validator.annotation.Required;

/**
 * 必須チェックvalidator<br>
 *
 */
public class RequiredValidator implements ConstraintValidator<Required, Object> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {

		if (BeanUtil.isNull(value)) {
			return false;
		} else {
			// String文字列の場合、空文字が入ってくる為チェック
			return !StringUtil.isEmpty(value.toString());
		}

	}

}
