package jp.co.arthur.business.db.crud.select;

import jp.co.arthur.db.entity.LoginUser;

/**
 * ログインユーザ情報検索サービスインターフェース<br>
 *
 */
public interface LoginUserSearchService {

	/**
	 * 指定されたログインIDのログインユーザ情報を検索する<br>
	 *
	 * @param loginId
	 *            ログインID
	 * @return
	 */
	LoginUser findByLoginId(String loginId);

	/**
	 * 指定されたアカウントのログインユーザ情報を検索する<br>
	 *
	 * @param account
	 *            アカウント
	 * @return
	 */
	LoginUser findByAccount(String account);
}
