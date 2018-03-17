package jp.co.arthur.web.service;

import jp.co.arthur.web.form.LoginForm;

/**
 * ログインサービス<br>
 *
 */
public interface LoginService {

	boolean isAuth(LoginForm form);

}
