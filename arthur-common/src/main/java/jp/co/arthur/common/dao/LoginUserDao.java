package jp.co.arthur.common.dao;

import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインユーザDao<br>
 *
 */
public interface LoginUserDao {

	/** テーブル名 */
	public static final String TABLE_NAME = "LOGIN_USER";

	/**
	 * ログインIDからログインユーザを返す<br>
	 * @param loginId
	 * @return
	 */
	LoginUser findLoginUserByLoginId(String loginId);

	/**
	 * 作成
	 * @param entity
	 */
	void registLoginUser(LoginUser entity);

}
