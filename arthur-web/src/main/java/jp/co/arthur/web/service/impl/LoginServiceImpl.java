package jp.co.arthur.web.service.impl;

import org.springframework.stereotype.Service;

import jp.co.arthur.web.form.LoginForm;
import jp.co.arthur.web.service.LoginService;

/**
 * ログインサービス実装クラス<br>
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAuth(LoginForm form) {

		return false;
	}

}
