package jp.co.arthur.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import jp.co.arthur.common.exception.ArthurErrorCode;
import jp.co.arthur.web.form.LoginUserRegistForm;

/**
 * アカウント作成画面valdiateクラス<br>
 *
 */
public class LoginUserRegistValidator implements Validator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return LoginUserRegistValidator.class.isAssignableFrom(clazz);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void validate(Object target, Errors errors) {

		LoginUserRegistForm form = (LoginUserRegistForm) target;

		// 必須チェックを行う
		ValidationUtils.rejectIfEmpty(errors, "loginId", ArthurErrorCode.EMPTY.getErrorCode());
		ValidationUtils.rejectIfEmpty(errors, "password", ArthurErrorCode.EMPTY.getErrorCode());

	}

}
