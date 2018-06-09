function regist() {

	var form = document.createElement('form');
	form.action = './loginUserRegist-input';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();

}
