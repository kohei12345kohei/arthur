package jp.co.arthur.common.dao.impl;

import java.util.Date;

import jp.co.arthur.common.dao.LoginUserDao;
import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインユーザDao実装クラス<br>
 *
 */
public class LoginUserDaoImpl implements LoginUserDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LoginUser findLoginUserByLoginId(String loginId) {

		LoginUser loginUser = new LoginUser();
		loginUser.setLoginId(loginId);
		loginUser.setPassword("password");
		loginUser.setRegDate(new Date());
		loginUser.setUpdateDate(new Date());

		return loginUser;
	}

}
