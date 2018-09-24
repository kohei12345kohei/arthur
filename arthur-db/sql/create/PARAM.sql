-- 定数情報
create table PARAM (
    -- メインキー
    MAINKEY VARCHAR(64),
    -- サブキー
    SUBKEY VARCHAR(64),
    -- 値
    VALUE VARCHAR(64),
    -- コメント
    COMMENT VARCHAR(64),
    -- 登録日時
    REG_DATE TIMESTAMP
)