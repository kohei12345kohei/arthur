package jp.co.arthur.api.service;

import jp.co.arthur.api.request.PurchaseRegistRequest;
import jp.co.arthur.api.response.PurchaseRegistResponse;
import jp.co.arthur.common.api.service.BaseService;
import jp.co.arthur.db.entity.PurchaseInfo;

/**
 * 購入商品登録サービス<br>
 *
 */
public interface PurchaseRegistService extends BaseService<PurchaseRegistRequest, PurchaseRegistResponse> {

	/**
	 * 商品購入情報EntityをResponseに変換する<br>
	 * @param entity
	 * @return
	 */
	PurchaseRegistResponse toResponse(PurchaseInfo entity);
}
