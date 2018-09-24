package jp.co.arthur.business.db.dao;

import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import jp.co.arthur.business.db.entity.LoginUser;

/**
 * ログインユーザDao<br>
 *
 */
public interface LoginUserDao {

	/** テーブル名 */
	public static final String TABLE_NAME = "LOGIN_USER";

	/**
	 * ログインIDからログインユーザを返す<br>
	 *
	 * @param loginId
	 *            ログインID
	 * @return
	 */
	@Select
	LoginUser findByLoginId(String loginId);

	/**
	 * アカウントからログインユーザを返す<br>
	 *
	 * @param account
	 *            アカウント
	 * @return
	 */
	@Select
	LoginUser findByAccount(String account);

	/**
	 * 作成
	 *
	 * @param entity
	 *            LoginUser
	 */
	@Insert
	void create(LoginUser entity);

}
