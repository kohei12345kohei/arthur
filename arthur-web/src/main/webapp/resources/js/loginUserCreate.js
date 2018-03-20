function create() {

	var form = document.createElement('form');
	form.action = '/arthur-web/loginUserCreate-input';
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();

}
