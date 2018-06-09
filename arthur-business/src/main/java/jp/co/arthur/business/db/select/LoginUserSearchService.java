package jp.co.arthur.business.db.select;

import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインユーザ情報検索サービスインターフェース<br>
 *
 */
public interface LoginUserSearchService {

	/**
	 * 指定されたログインIDのログインユーザ情報を検索する<br>
	 * @param loginId
	 * @return
	 */
	LoginUser findByLoginId(String loginId);

	/**
	 * 指定されたアカウントのログインユーザ情報を検索する<br>
	 * @param account
	 * @return
	 */
	LoginUser findByAccount(String account);
}
