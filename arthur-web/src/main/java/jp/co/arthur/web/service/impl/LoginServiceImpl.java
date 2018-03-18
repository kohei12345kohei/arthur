package jp.co.arthur.web.service.impl;

import org.springframework.stereotype.Service;

import jp.co.arthur.common.entity.LoginUser;
import jp.co.arthur.web.service.LoginService;

/**
 * ログインサービス実装クラス<br>
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAuth(LoginUser entity, String loginId) {
		return entity.getLoginId().equals(loginId);
	}


}
