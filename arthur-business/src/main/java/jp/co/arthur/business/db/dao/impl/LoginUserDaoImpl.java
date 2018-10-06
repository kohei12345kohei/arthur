package jp.co.arthur.business.db.dao.impl;

import org.springframework.stereotype.Repository;

import jp.co.arthur.business.db.dao.LoginUserDao;
import jp.co.arthur.db.entity.LoginUser;

/**
 * ログインユーザDao実装クラス<br>
 *
 */
@Repository
public class LoginUserDaoImpl implements LoginUserDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LoginUser findByLoginId(String loginId) {
		return new LoginUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create(LoginUser entity) {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LoginUser findByAccount(String account) {

		return new LoginUser();
	}

}
