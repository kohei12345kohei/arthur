package jp.co.arthur.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.arthur.business.db.crud.select.LoginUserSearchService;
import jp.co.arthur.db.entity.LoginUser;
import jp.co.arthur.web.service.LoginUserSettingDetailService;

/**
 * ログインユーザ設定詳細画面サービス実装クラス<br>
 *
 */
@Service
public class LoginUserSettingDetailServiceImpl implements LoginUserSettingDetailService {

	/** ログインユーザ検索サービス */
	@Autowired
	private LoginUserSearchService loginUserSearchService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LoginUser getLoginUser(String account) {
		LoginUser entity = loginUserSearchService.findByAccount(account);
		return entity;
	}

}
