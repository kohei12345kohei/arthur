package jp.co.arthur.business.db.create;

import java.util.List;

import jp.co.arthur.common.entity.LoginUser;

public interface LoginUserCreateService {

	/**
	 * 作成
	 *
	 * @param entity
	 */
	void create(LoginUser entity);

	/**
	 * 作成
	 *
	 * @param entityList
	 */
	void create(List<LoginUser> entityList);

}
