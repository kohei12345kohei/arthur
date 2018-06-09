-- 購入商品情報
create table PURCHASE_INFO (
    -- 購入情報情報ID
    PURCHASE_INFO_ID varchar2(16),
    -- アカウント名
    ACCOUNT varchar2(16),
    -- 商品ID
    ITEM_ID varchar2(16),
    -- 商品名
    ITEM_NAME varchar2(64),
    -- 商品金額(単品)
    ITEM_UNIT_MONEY number,
    -- 商品数
    ITEM_AMOUNT number,
    -- 登録日時
    REG_DATE date
)
