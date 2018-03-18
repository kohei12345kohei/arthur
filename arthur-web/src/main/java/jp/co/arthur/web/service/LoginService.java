package jp.co.arthur.web.service;

import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインサービス<br>
 *
 */
public interface LoginService {

	/**
	 * ログインフォームがログイン可能かどうか判定する<br>
	 * @param entity
	 * @param loginId
	 * @return
	 */
	boolean isAuth(LoginUser entity, String loginId);

}
