package jp.co.arthur.business.db.dao.impl;

import org.springframework.stereotype.Repository;

import jp.co.arthur.business.db.dao.UserInfoDao;
import jp.co.arthur.business.db.entity.UserInfo;

/**
 * ユーザ情報Dao実装クラス<br>
 *
 */
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create(UserInfo entity) {

	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfo findByAccount(String account) {
		return new UserInfo();
	}

}
