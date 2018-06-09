//購入画面へ遷移
function toPurchase() {
	var form = document.createElement('form');
	form.action = '/arthur-web/purchase-input';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}


//カート内確認画面へ遷移
function toCartConfirm() {
	var form = document.createElement('form');
	form.action = '/arthur-web/cart-confirm';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

//カート内削除画面へ遷移
function toCartDelete() {
	var form = document.createElement('form');
	form.action = '/arthur-web/cartDelete-confirm';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

// 履歴画面へ遷移
function toHistory() {
	var form = document.createElement('form');
	form.action = '/arthur-web/history';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

// 設定画面へ遷移
function toSetting() {
	var form = document.createElement('form');
	form.action = '/arthur-web/setting';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

//ログアウト
function toLogout() {
	var form = document.createElement('form');
	form.action = '/arthur-web/login';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}
