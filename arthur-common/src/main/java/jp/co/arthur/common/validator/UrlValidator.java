package jp.co.arthur.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jp.co.arthur.common.type.RegixType;
import jp.co.arthur.common.util.StringUtil;
import jp.co.arthur.common.validator.annotation.Url;

/**
 * URLチェックvalidator<br>
 *
 */
public class UrlValidator implements ConstraintValidator<Url, String> {

	private final String REGIX = RegixType.URL.getValue();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (StringUtil.isEmpty(value)) {
			return true;
		}
		return value.matches(REGIX);
	}

}
