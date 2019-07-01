
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Administrador</title>
        <link rel="icon" href="life2.png" type="image/png"/>
    </head>

    <body>
        <jsp:include page="cabecalho.jsp" />
        <div style="margin: 0 auto">
            <jsp:include page="administradorMenu.jsp" />
        </div>

        <div id="divlogin"class="form-control">
            <h3>Cadastrar</h3>
            <input class="form-control" type="email" placeholder="Email..." id="email_field" style="position: relative; top: 15px" />
            <input class="form-control" type="password" placeholder="Senha..." id="password_field" style="position: relative; top: 30px" />
            <button onclick="create_account()" class="btn justify-content-center font-weight-bolder" style="background-color:#ffffff; top: 45px; margin-left: auto;
                    margin-right: auto;position: inherit;">Cadastrar</button> 
        </div>

        <script src="https://www.gstatic.com/firebasejs/6.1.1/firebase.js"></script>
        <script>
                var config = {
                    apiKey: "AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM",
                    authDomain: "healthylife-77c13.firebaseapp.com",
                    databaseURL: "https://healthylife-77c13.firebaseio.com",
                    projectId: "healthylife",
                    storageBucket: "healthylife.appspot.com",
                    messagingSenderId: "508711404403",
                    appId: "1:508711404403:web:7ba2ae3d67abd79a"
                };

                firebase.initializeApp(config);
        </script>

        <script>
            firebase.auth().onAuthStateChanged(function (user) {
                if (user) {
                    // User is signed in.
                } else {
                    // No user is signed in.
                }
            });

            function create_account() {
                var email = document.getElementById('email_field').value;
                var senha = document.getElementById('password_field').value;

                firebase.auth().createUserWithEmailAndPassword(email, senha).catch(function (error) {
                    var errorCode = error.code;
                    var errorMessage = error.message;
                    //window.alert("Error : " + errorMessage);
                    window.location = "administradorPrincipal.jsp";
                });
            }
        </script>
    </body>
</html>
