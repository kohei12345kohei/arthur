package jp.co.arthur.web.service;

import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインサービス<br>
 *
 */
public interface LoginService {

	/**
	 * 入力したパスワードがEntityのパスワードが一致しているかどうか確認する<br>
	 * @param entity
	 * @param password
	 * @return
	 */
	boolean isAuth(LoginUser entity, String password);

}
