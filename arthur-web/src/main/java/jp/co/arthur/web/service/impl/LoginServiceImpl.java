package jp.co.arthur.web.service.impl;

import java.util.Objects;

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
	public boolean isAuth(LoginUser entity, String password) {

		if (Objects.isNull(entity.getLoginId())) {
			// 指定したログインユーザ情報が存在しない場合
			return false;
		}
		return entity.getPassword().equals(password);
	}


}
