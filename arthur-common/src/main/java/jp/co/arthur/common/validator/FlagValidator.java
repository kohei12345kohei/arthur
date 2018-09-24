package jp.co.arthur.common.validator;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jp.co.arthur.common.type.FlagType;
import jp.co.arthur.common.util.StringUtil;
import jp.co.arthur.common.validator.annotation.Flag;

/**
 * フラグチェックvalidator<br>
 *
 */
public class FlagValidator implements ConstraintValidator<Flag, String> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtil.isEmpty(value)) {
			return true;
		}
		return List.of(FlagType.TRUE, FlagType.FALSE).contains(FlagType.of(value));
	}

}
