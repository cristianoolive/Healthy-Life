
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Adm</title>
        <link href="arquivo.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="arquivo.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link rel="icon" href="life2.png" type="image/png"/>
    </head>
    <body>
<jsp:include page="cabecalho.jsp" />
    
        <div style="margin: 0 auto">
        <jsp:include page="administradorMenu.jsp" />
        </div>
        
        <br>
        
    
        <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Email</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td></td>
    </tr>
  </tbody>
</table>
        
        <input type="button" onclick="listar()">
        
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

<script>
        var admin = require("firebase-admin");

    var serviceAccount = require("path/to/serviceAccountKey.json");

    admin.initializeApp({
      credential: admin.credential.cert(serviceAccount),
      databaseURL: "https://healthylife-77c13.firebaseio.com"
    });
    
      function listar(){

          function listAllUsers(nextPageToken) {
          // List batch of users, 1000 at a time.
          admin.auth().listUsers(1000, nextPageToken)
            .then(function(listUsersResult) {
              listUsersResult.users.forEach(function(userRecord) {
                console.log('user', userRecord.toJSON());
              });
              if (listUsersResult.pageToken) {
                // List next batch of users.
                listAllUsers(listUsersResult.pageToken);
              }
            })
            .catch(function(error) {
              console.log('Error listing users:', error);
            });
        }
        // Start listing users from the beginning, 1000 at a time.
        listAllUsers();
            }
</script>
        
        
        <script>
            
            
        </script>
    </body>
</html>
