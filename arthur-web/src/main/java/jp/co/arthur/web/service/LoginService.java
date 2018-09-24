package jp.co.arthur.web.service;

import jp.co.arthur.business.db.entity.LoginUser;

/**
 * ログインサービス<br>
 *
 */
public interface LoginService {

	/**
	 * 入力したパスワードがEntityのパスワードが一致しているかどうか確認する<br>
	 *
	 * @param entity
	 *            ログインユーザEntity
	 * @param password
	 *            パスワード
	 * @return
	 */
	boolean isAuth(LoginUser entity, String password);

}
