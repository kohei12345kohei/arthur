package jp.co.arthur.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import jp.co.arthur.common.exception.ArthurErrorCode;
import jp.co.arthur.web.form.LoginUserCreateForm;

/**
 * アカウント作成画面valdiateクラス<br>
 *
 */
public class LoginUserCreateValidator implements Validator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return LoginUserCreateValidator.class.isAssignableFrom(clazz);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void validate(Object target, Errors errors) {

		LoginUserCreateForm form = (LoginUserCreateForm) target;

		// 必須チェックを行う
		ValidationUtils.rejectIfEmpty(errors, "loginId", ArthurErrorCode.EMPTY.getErrorCode());
		ValidationUtils.rejectIfEmpty(errors, "password", ArthurErrorCode.EMPTY.getErrorCode());

	}

}
