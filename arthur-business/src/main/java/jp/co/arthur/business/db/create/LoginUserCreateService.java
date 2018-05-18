package jp.co.arthur.business.db.create;

import jp.co.arthur.common.entity.LoginUser;

public interface LoginUserCreateService {

	/**
	 * 作成
	 * @param entity
	 */
	void regist(LoginUser entity);

}
