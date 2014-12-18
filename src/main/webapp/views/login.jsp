<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <title>Вход в личный кабинет</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="/views/css/bootstrap.min.css" >
    <link rel="stylesheet" href="/views/css/style.css" >

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="/views/js/bootstrap.min.js"></script>
    <script src="/js/main.js"></script>

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body id="signin">

<div class="container">
    <c:url value="/j_spring_security_check" var="loginUrl" />
    <div class="well signin col-md-3">
        <form action="${loginUrl}" method="post">
            <h3 class="text-center text-muted">Вход в кабинет</h3>
            <div class="form-group">
                <label>Логин</label>
                <input type="text" class="form-control" name="j_username" placeholder="Введите логин">
            </div>
            <div class="form-group">
                <label>Пароль</label>
                <input type="password" class="form-control" name="j_password" placeholder="Введите пароль">
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Запомнить меня
                </label>
            </div>
            <button type="submit" class="btn btn-primary btn-lg btn-block">Войти</button>
        </form>
    </div>
</div>

</body>
</html>