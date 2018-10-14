package jp.co.arthur.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jp.co.arthur.common.type.RegixType;
import jp.co.arthur.common.util.StringUtil;
import jp.co.arthur.common.validator.annotation.MailAddress;

/**
 * メールアドレス形式チェックvalidator<br>
 *
 */
public class MailAddressValidator implements ConstraintValidator<MailAddress, String> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtil.isEmpty(value)) {
			return true;
		}
		return value.matches(RegixType.MAIL_ADDRESS.getValue());
	}

}
