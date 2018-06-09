package jp.co.arthur.business.db.select.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.arthur.business.db.select.LoginUserSearchService;
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
	public LoginUser findByLoginId(String loginId) {
		return loginUserDao.findByLoginId(loginId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LoginUser findByAccount(String account) {
		return loginUserDao.findByAccount(account);
	}

}
