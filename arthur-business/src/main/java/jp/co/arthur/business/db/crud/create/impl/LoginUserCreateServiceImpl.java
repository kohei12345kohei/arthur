package jp.co.arthur.business.db.crud.create.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.arthur.business.db.crud.create.LoginUserCreateService;
import jp.co.arthur.business.db.dao.LoginUserDao;
import jp.co.arthur.business.db.entity.LoginUser;

/**
 * ログインユーザ情報 作成サービス実装クラス<br>
 *
 */
@Service
public class LoginUserCreateServiceImpl implements LoginUserCreateService {

	/** ログインユーザ情報Dao */
	@Autowired
	private LoginUserDao loginUserDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create(LoginUser entity) {
		loginUserDao.create(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create(List<LoginUser> entityList) {
		entityList.stream().forEach(entity -> loginUserDao.create(entity));
	}

}
