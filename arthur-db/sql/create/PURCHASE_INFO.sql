-- 購入商品情報
create table PURCHASE_INFO (
    -- 購入情報情報ID
    PURCHASE_INFO_ID INT,
    -- アカウント名
    ACCOUNT VARCHAR(16),
    -- 商品ID
    ITEM_ID VARCHAR(16),
    -- 商品名
    ITEM_NAME VARCHAR(64),
    -- 商品金額(単品)
    ITEM_UNIT_MONEY INT,
    -- 商品数
    ITEM_AMOUNT INT,
    -- 登録日時
    REG_DATE TIMESTAMP,
    -- 更新日時
    UPDATE_DATE TIMESTAMP
)
