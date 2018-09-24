package jp.co.arthur.business.db.dao;

import jp.co.arthur.business.db.entity.UserInfo;

/**
 * ユーザ情報Dao<br>
 *
 */
public interface UserInfoDao {

	/** テーブル名 */
	public static final String TABLE_NAME = "USER_INFO";

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
