package jp.co.arthur.business.db.crud.create;

import java.util.List;

import jp.co.arthur.db.entity.LoginUser;

public interface LoginUserCreateService {

	/**
	 * 作成
	 *
	 * @param entity
	 *            LoginUser
	 */
	void create(LoginUser entity);

	/**
	 * 作成
	 *
	 * @param entityList
	 *            List<LoginUser>
	 */
	void create(List<LoginUser> entityList);

}
