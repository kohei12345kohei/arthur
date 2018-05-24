function regist() {

	var form = document.createElement('form');
	form.action = '/arthur-web/loginUserRegist-input';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();

}
