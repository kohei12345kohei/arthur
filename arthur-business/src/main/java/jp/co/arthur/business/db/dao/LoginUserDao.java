package jp.co.arthur.business.db.dao;

import jp.co.arthur.db.entity.LoginUser;

/**
 * ログインユーザDao<br>
 *
 */
public interface LoginUserDao {

	/**
	 * ログインIDからログインユーザを返す<br>
	 *
	 * @param loginId
	 *            ログインID
	 * @return
	 */
	LoginUser findByLoginId(String loginId);

	/**
	 * アカウントからログインユーザを返す<br>
	 *
	 * @param account
	 *            アカウント
	 * @return
	 */
	LoginUser findByAccount(String account);

	/**
	 * 作成
	 *
	 * @param entity
	 *            LoginUser
	 */
	void create(LoginUser entity);

}
