
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Artigo</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="arquivo.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="icon" href="life2.png" type="image/png"/>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
              integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
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
            var database = firebase.database();
            var storage = firebase.storage();
        </script>
    </head>
    <body>
        <jsp:include page="cabecalho.jsp"></jsp:include>

            <div id="caminho" class="container-fluid">
                <button id="btnCaminho" type="button" class="btn text-dark "><a class="font-weight-bold" href="index.jsp"style="color: black; font-size: 11px">PÁGINA INICIAL</a></button>
                >
                <button id="btnCaminho" type="button" class="btn text-dark"><a class="font-weight-bold" href="exercicio.jsp"style="color: black; font-size: 11px">RECEITAS FIT</a></button>
            </div>

            <div style="position: relative; position: relative;
                 float: center;
                 width: 800px;
                 margin: 0px auto;
                 " >

                <div class="container" style="background-color: white;" id="listar">

                </div>

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
                        if (!contemArtigo) {
                            naoContem();
                        }
                    });
                }


                // função pra ler querystring
                function queryString(parameter) {
                    var loc = location.search.substring(1, location.search.length);
                    var param_value = false;
                    var params = loc.split("&");
                    for (i = 0; i < params.length; i++) {
                        param_name = params[i].substring(0, params[i].indexOf('='));
                        if (param_name == parameter) {
                            param_value = params[i].substring(params[i].indexOf('=') + 1)
                        }
                    }
                    if (param_value) {
                        return param_value;
                    } else {
                        return undefined;
                    }
                }

                var variavel = queryString("chamarId");

                function adicionarPrevia(informacao, id) {
                    var artigoId = informacao.artigoId;

                    if (informacao.classificacao == "Receita fit" && variavel == artigoId) {

                        var div = document.createElement("div");
                        var center = document.createElement("center");

                        var a = document.createElement("h2");
                        a.setAttribute("style", "font-size: 25px");
                        a.setAttribute("id", "titulo");
                        a.innerHTML = informacao.titulo;
                        center.appendChild(a)
                        div.appendChild(center);

                        var b = document.createElement("p");
                        b.setAttribute("style", "text-align: justify;font-size: 12px; position: relative;");
                        b.innerHTML = informacao.autor;
                        div.appendChild(b);

                        var img = document.createElement("img");
                        img.setAttribute("width", "400px");
                        img.setAttribute("src", "");
                        img.setAttribute("id", "fotoD");
                        div.appendChild(img);

                        firebase.storage().ref('ImgArtigo/' + variavel).child(informacao.titulo).getDownloadURL().then(url => {

                          
                            document.getElementById("fotoD").src = url;
                           
                        });




                        //refEst = storageRef.child('ImgArtigo' + artigoId);
                        //refEst.getDownloadURL().then(function (url) {
                        // foto.src =  url;

                        //}).catch(function (error) {
                        //    console.log("erro");
                        //});


                        var p = document.createElement("p");
                        p.setAttribute("style", "text-align: 18px");
                        p.innerHTML = informacao.resumo;
                        div.appendChild(p);

                        var iframe = document.createElement("iframe");
                        iframe.setAttribute("width", "700");
                        iframe.setAttribute("height", "1000");
                        iframe.setAttribute("id", "artigo");
                        iframe.setAttribute("style", "border: none");
                        div.appendChild(iframe);
                        firebase.storage().ref('Artigo/' + variavel).child(informacao.titulo).getDownloadURL().then(url => {
                            var artigo = document.getElementById("artigo");
                            artigo.src = url;
                        });
                        
                       //  firebase.storage().ref('Regras').child(nome).getDownloadURL().then(url => {
            //console.log("string para download", url);
        //});



                        var br = document.createElement("br");
                        div.appendChild(br);
                        div.appendChild(br);

                        var listar = document.getElementById("listar");
                        listar.appendChild(div);

                        //button.innerHTML = options.innerHTML + "<button type="button">Clique</button>";

                        function chamar() {
                            var chamarId = artigoId;
                            window.location.href = "artigoExercicio.jsp?object=" + chamarId;

                        }
                        contemArtigo = true;




                    }
                }
            </script>
        </body>
    <jsp:include page="rodape.jsp"></jsp:include>
</html>
