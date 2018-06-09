-- ログイン情報
create table LOGIN_USER (
  -- ログインID
  LOGIN_ID varchar2(16),
  -- パスワード
  PASSWORD varchar2(16),
  -- アカウント
  ACCOUNT varchar2(16),
  -- 登録日時
  REG_DATE date
  -- 更新日時
  UPDATE_DATE date
)