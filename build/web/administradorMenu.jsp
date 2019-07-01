
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Menu adm</title>
          <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="arquivo.css" >
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>
    
    <body>
        <div style="text-align: center;">
            <br>
            <div style="text-align: right; position: inherit">
                <button onclick="logout()" class="btn font-weight-bolder" style="background-color:aliceblue">Deslogar</button>
            </div>
            <h3 style="margin: 0 auto; color: black">Administador</h3>
            <br>
            <div class ="container" style="margin: 0 auto; position: relative">
                <button type="button" class="btn btn-info" onclick="adcArtigo()">Adicionar artigo</button>
                <button type="button" class="btn btn-info" onclick="listarArtigo()">Listar artigos</button>
                <button type="button" class="btn btn-info" onclick="adcAdm()">Adicionar administrador</button>
                <button type="button" class="btn btn-info" onclick="listarAdm()">Listar administradores</button>
            </div>
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
          firebase.auth().onAuthStateChanged(function(user) {
            if (user) {
                // User is signed in.
            } else {
                // No user is signed in.
                window.location="administradorLogin.jsp";
            }
          });

          function login(){
            var userEmail = document.getElementById("email_field").value;
            var userPass = document.getElementById("password_field").value;

            firebase.auth().signInWithEmailAndPassword(userEmail, userPass).catch(function(error) {
                        // Handle Errors here.
                var errorCode = error.code;
                var errorMessage = error.message;

                window.alert("Error : " + errorMessage);

                        // ...
            });
          }

          function logout(){
            firebase.auth().signOut();
          }

          function adcArtigo(){
            window.location="administradorAdcArtigo.jsp";
          }
          function listarArtigo(){
            window.location="administradorListarArtigo.jsp";
          }
          function adcAdm(){
            window.location="administradorAdicionar.jsp";
          }
          function listarAdm(){
            window.location="administradorListar.jsp";
          }
        </script>
    </body>
</html>
