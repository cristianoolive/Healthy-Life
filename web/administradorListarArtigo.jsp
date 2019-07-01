
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Artigo</title>
        <link href="arquivo.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="arquivo.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
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
            var database = firebase.database();
            var storage = firebase.storage();
        </script>
    </head>
    <body>

        <jsp:include page="cabecalho.jsp" />

        <div style="margin: 0 auto">
            <jsp:include page="administradorMenu.jsp" />
        </div>

        <br>

        <div class="container" style="background-color: white;" id="listar">

        </div>

        <script>
            firebase.auth().onAuthStateChanged(function (user) {
                if (user) {
                    dados(user.uid);
                } else {
                    dados(user.uid);
                }
            });

            var contemArtigo = false;

            function dados(id) {
                ref = firebase.database().ref("artigo");

                ref.once('value').then(snapshot => {
                    snapshot.forEach(value => {
                        adicionarPrevia(value.val(), id);
                    });
                   
                });
            }


            function adicionarPrevia(informacao, id) {
                var artigoId = informacao.artigoId;
                
                    var table = document.createElement("table");
                    table.setAttribute("class", "table table-hover");

                    var thead = document.createElement("thead");
                    table.appendChild(thead);

                    var tr = document.createElement("tr");
                    thead.appendChild(tr);

                    var th = document.createElement("th");
                    th.setAttribute("scope", "col");
                    th.innerText = "Titulo";
                    tr.appendChild(th);

                    var th = document.createElement("th");
                    th.setAttribute("scope", "col");
                    th.innerText = "Autor";
                    tr.appendChild(th);

                    var th = document.createElement("th");
                    th.setAttribute("scope", "col");
                    th.innerText = "Categoria";
                    tr.appendChild(th);

                    var th = document.createElement("th");
                    th.setAttribute("scope", "col");
                    th.innerText = "Opções";
                    tr.appendChild(th);

                    var tbody = document.createElement("tbody");
                    table.appendChild(tbody);

                    var tr = document.createElement("tr");
                    tbody.appendChild(tr);

                    var td = document.createElement("td");
                    td.innerHTML = informacao.titulo;
                    tr.appendChild(td);

                    var td = document.createElement("td");
                    td.innerHTML = informacao.autor;
                    tr.appendChild(td);

                    var td = document.createElement("td");
                    td.innerHTML = informacao.classificacao;
                    tr.appendChild(td);

                    var td = document.createElement("td");
                    tr.appendChild(td);

                    var button = document.createElement("button");
                    button.setAttribute("class", "btn btn-danger");
                    button.innerHTML = "Excluir";
                    td.appendChild(button);





                    var listar = document.getElementById("listar");
                    listar.appendChild(table);

                    //button.innerHTML = options.innerHTML + "<button type="button">Clique</button>";



                   
                
            }
        </script>

    </body>
</html>
