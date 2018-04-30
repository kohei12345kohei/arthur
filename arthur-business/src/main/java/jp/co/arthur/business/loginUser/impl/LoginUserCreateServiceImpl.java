package jp.co.arthur.business.loginUser.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.arthur.business.loginUser.LoginUserCreateService;
import jp.co.arthur.common.dao.LoginUserDao;
import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインユーザ情報 作成サービス実装クラス<br>
 *
 */
@Service
public class LoginUserCreateServiceImpl implements LoginUserCreateService {

	/** ログインDao */
	@Autowired
	private LoginUserDao registLoginUser;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void registLoginUser(LoginUser entity) {
		registLoginUser.registLoginUser(entity);
	}

}
