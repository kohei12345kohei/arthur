package jp.co.arthur.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

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
		// TODO 自動生成されたメソッド・スタブ

	}

}
