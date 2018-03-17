package jp.co.arthur.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.arthur.common.dao.LoginUserDao;
import jp.co.arthur.common.dao.impl.LoginUserDaoImpl;

/**
 * アーサーwebで使いたいdaoを定義する<br>
 *
 */
@Configuration
public class ArthurWebDaoConfig {

	/**
	 * ログインユーザDaoを設定<br>
	 * @return
	 */
	@Bean("loginUserDao")
	public LoginUserDao loginUserDao() {
		return new LoginUserDaoImpl();
	}
}
