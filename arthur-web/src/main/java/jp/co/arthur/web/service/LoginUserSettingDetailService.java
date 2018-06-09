package jp.co.arthur.web.service;

import jp.co.arthur.common.entity.LoginUser;

/**
 * ログインユーザ設定詳細画面サービスインターフェース<br>
 *
 */
public interface LoginUserSettingDetailService {

	/**
	 * 指定されたログインIDからログインユーザ情報を取得する<br>
	 * @param loginId
	 * @return
	 */
	LoginUser getLoginUser(String loginId);

}
