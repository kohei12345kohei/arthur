package jp.co.arthur.common.dao;

import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインユーザDao<br>
 *
 */
public interface LoginUserDao {

	/**
	 * ログインIDからログインユーザを返す<br>
	 * @param loginId
	 * @return
	 */
	LoginUser findLoginUserByLoginId(String loginId);
}
