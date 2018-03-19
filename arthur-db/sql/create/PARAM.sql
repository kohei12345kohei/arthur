-- 定数情報
create table PARAM (
    -- メインキー
    MAINKEY varchar2(64),
    -- サブキー
    SUBKEY varchar2(64),
    -- 値
    VALUE varchar2(64),
    -- コメント
    COMMENT varchar2(64),
    -- 登録日時
    REG_DATE date
)