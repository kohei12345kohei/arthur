function create() {
	var form = document.createElement('form');
	form.action = '/arthur/loginUserCreate-input';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}
