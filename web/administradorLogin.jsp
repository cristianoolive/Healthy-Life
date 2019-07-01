
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Administrador</title>
        <link href="arquivo.css" rel="stylesheet"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="icon" href="life2.png" type="image/png"/>
    </head>
    
    <body>
        <jsp:include page="cabecalho.jsp" />
        <div id="divlogin"class="form-control">
            <h3>Login</h3>
            <input class="form-control" type="email" placeholder="Email..." id="email_field" style="position: relative; top: 15px" />
            <input class="form-control" type="password" placeholder="Senha..." id="password_field" style="position: relative; top: 30px" />
            <button onclick="login()" class="btn justify-content-center font-weight-bolder" style="background-color:#ffffff; top: 45px; margin-left: auto;
            margin-right: auto;position: inherit;">Entrar</button> 
        </div>

        <script src="https://www.gstatic.com/firebasejs/6.1.1/firebase.js"></script>
        <script>
            // Your web app's Firebase configuration
          var config = {
            apiKey: "AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM",
            authDomain: "healthylife-77c13.firebaseapp.com",
            databaseURL: "https://healthylife-77c13.firebaseio.com",
            projectId: "healthylife",
            storageBucket: "healthylife.appspot.com",
            messagingSenderId: "508711404403",
            appId: "1:508711404403:web:7ba2ae3d67abd79a"
          };
            // Initialize Firebase
          firebase.initializeApp(config);
        </script>
        <script src="administrador.js"></script>
    </body>
</html>