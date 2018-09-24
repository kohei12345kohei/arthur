-- ログイン情報
create table LOGIN_USER (
  -- ログインID
  LOGIN_ID VARCHAR(16),
  -- パスワード
  PASSWORD VARCHAR(16),
  -- アカウント
  ACCOUNT VARCHAR(16),
  -- 登録日時
  REG_DATE TIMESTAMP
  -- 更新日時
  UPDATE_DATE TIMESTAMP
)