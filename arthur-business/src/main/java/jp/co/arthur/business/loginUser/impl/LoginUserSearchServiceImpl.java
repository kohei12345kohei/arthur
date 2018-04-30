package jp.co.arthur.business.loginUser.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.arthur.business.loginUser.LoginUserSearchService;
import jp.co.arthur.common.dao.LoginUserDao;
import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインユーザ情報検索サービス実装クラス<br>
 *
 */
@Service
public class LoginUserSearchServiceImpl implements LoginUserSearchService {

	/** ログインDao */
	@Autowired
	private LoginUserDao loginUserDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LoginUser findLoginUserByLoginId(String loginId) {
		return loginUserDao.findLoginUserByLoginId(loginId);
	}

}
