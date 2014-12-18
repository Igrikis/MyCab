$(document).ready(function(){

	$('.signin form').submit(function(){

		// собираем данные с формы
        var name = $('#user_login').val();
        var pass = $('#user_password').val();

			return false;

	});
				
}); //final