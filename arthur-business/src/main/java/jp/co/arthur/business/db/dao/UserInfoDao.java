package jp.co.arthur.business.db.dao;

import jp.co.arthur.db.entity.UserInfo;

/**
 * ユーザ情報Dao<br>
 *
 */
public interface UserInfoDao {

	/**
	 * 作成
	 * @param entity
	 */
	void create(UserInfo entity);

	/**
	 * アカウントからログインユーザを返す<br>
	 * @param account
	 * @return
	 */
	UserInfo findByAccount(String account);
}
