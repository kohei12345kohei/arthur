package jp.co.arthur.business.loginUser;

import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインユーザ情報検索サービスインターフェース<br>
 *
 */
public interface LoginUserSearchService {

	/**
	 * 指定されたログインユーザ情報を検索する<br>
	 * @param loginId
	 * @return
	 */
	LoginUser findLoginUserByLoginId(String loginId);
}
