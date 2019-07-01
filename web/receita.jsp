<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <title>Receitas Fit</title>
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
        </script>

    </head>

    <body>

        <jsp:include page="cabecalho.jsp"></jsp:include>


            <div id="caminho" class="container-fluid">
                <button id="btnCaminho" type="button" class="btn text-dark "><a class="font-weight-bold" href="principal.html"style="color: black; font-size: 11px">PÁGINA INICIAL</a></button>
                >
                <button id="btnCaminho" type="button" class="btn text-dark"><a class="font-weight-bold" href="alimentacao.html"style="color: black; font-size: 11px">RECEITAS FIT</a></button>
            </div>



            <div style="position: relative; position: relative;
                 float: center;
                 width: 800px;
                 margin: 0px auto;
                 " >
                <hr>
                <b><h1 class="text-center" style="position:relative;top: 0px; font-size: 30px;text-decoration-style: solid">RECEITAS FIT</h1>
                </b>
                <hr>

                <div class="container" style="background-color: white;" id="listar">

                </div>


                <!--<div>
                    <h2 id="tituloArtigo">Alimentação Saudável: O que é, Benefícios e Cardápio</h2>
                    <p id="autorArtigo">Equipe Healthy Life</p>
                    <table>
                        <td> <img src="imagem1.jpg" id="imgArtigo"></td>
                        <td><p id="corpoArtigo">Um guia completo sobre a importância de ter uma alimentação saudável. O que se deve evitar, os alimentos mais recomendados, dicas para não desistir e cardápio completo para quem quer emagrecer e ganhar massa muscular.</p>  
                            <p class="text-center"><a href="artigoAlimenta%C3%A7%C3%A3o1.html" class="btn btn-dark">Leia mais</a></p> </td>
                    </table>
                </div>
                
                
                <hr>-->

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

                function naoContem() {
                    var center = document.createElement("center");

                    var h1 = document.createElement("h1");
                    h1.setAttribute("style", "font-size: 20px");
                    h1.innerText = "Nenhuma Receita fit adicionada";
                    center.appendChild(h1);
                  
                    var a = document.getElementById("listar");
                    a.appendChild(center);
                }

                function adicionarPrevia(informacao, id) {
                    var artigoId = informacao.artigoId;

                    if (informacao.classificacao == "Receita fit") {

                        var div = document.createElement("div");

                        var a = document.createElement("h2");
                        a.setAttribute("style", "font-size: 19px");
                        a.setAttribute("id", "titulo");
                        a.innerHTML = informacao.titulo;
                        div.appendChild(a);

                        var b = document.createElement("p");
                        b.setAttribute("style", "text-align: justify;font-size: 12px; position: relative;");
                        b.innerHTML = informacao.autor;
                        div.appendChild(b);

                        var img = document.createElement("img");
                        img.setAttribute("width", "200px");
                        img.setAttribute("id", artigoId);
                        div.appendChild(img);
               
                        firebase.storage().ref('ImgArtigo/' + artigoId).child(informacao.titulo).getDownloadURL().then(url => {
                            document.getElementById(artigoId).src = url;
                        });

                        var p = document.createElement("p");
                        p.setAttribute("style", "text-align: 18px");
                        p.innerHTML = informacao.resumo;
                        div.appendChild(p);

                        var button = document.createElement("button");
                        button.setAttribute("style", "text-align: justify;");
                        button.setAttribute("class", "btn btn-dark");
                        button.innerHTML = "ler mais";
                        var chamarId = artigoId;
                        button.onclick = function() { chamar(chamarId); };
                          function chamar(chamarId) {    
                            window.location.href = "artigoReceita.jsp?chamarId="+chamarId;

                        }
                        div.appendChild(button);

                        var br = document.createElement("br");
                        div.appendChild(br);
                        div.appendChild(br);

                       

                        var br = document.createElement("br");
                        div.appendChild(br);

                        var listar = document.getElementById("listar");
                        listar.appendChild(div);

                        contemArtigo = true;
                    }
                }
            </script>
        </body>
    <jsp:include page="rodape.jsp"></jsp:include>
</html>