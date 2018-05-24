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
	LoginUser findByLoginId(String loginId);

	/**
	 * アカウントからログインユーザを返す<br>
	 * @param account
	 * @return
	 */
	LoginUser findByAccount(String account);

	/**
	 * 作成
	 * @param entity
	 */
	void create(LoginUser entity);

}
