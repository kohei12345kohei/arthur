package jp.co.arthur.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jp.co.arthur.common.type.RegixType;
import jp.co.arthur.common.util.StringUtil;
import jp.co.arthur.common.validator.annotation.Pattern;

/**
 * 型チェックvalidator<br>
 *
 */
public class PatternValidator implements ConstraintValidator<Pattern, String> {

	private RegixType regix;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize(Pattern annotation) {
		this.regix = annotation.regixPattern();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtil.isEmpty(value)) {
			return true;
		}
		return value.matches(this.regix.getValue());
	}

}
