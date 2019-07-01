

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <title>Principal</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="arquivo.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    <script src="https://www.gstatic.com/firebasejs/5.9.2/firebase.js"></script>
    <script>
        // Initialize Firebase
        var config = {
            apiKey: "AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM",
            authDomain: "healthylife-77c13.firebaseapp.com",
            databaseURL: "https://healthylife-77c13.firebaseio.com",
            projectId: "healthylife",
            storageBucket: "healthylife.appspot.com",
            messagingSenderId: "508711404403"
        };
        firebase.initializeApp(config);
    </script>

</head>
<body background-image= url(life2.png) >

    <jsp:include page="cabecalho.jsp" />

    <div class="container" id="divprincipal">
        <div class="container" id="carrossel" >

            <div id="demo" class="carousel slide" data-ride="carousel">
                <ul class="carousel-indicators">
                    <li data-target="#demo" data-slide-to="0" class="active"></li>
                    <li data-target="#demo" data-slide-to="1"></li>
                    <li data-target="#demo" data-slide-to="2"></li>
                </ul>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="artigo2.jpg" alt="">
                        <div class="carousel-caption">
                            <h3 style="text-decoration-color: black"><a href="artigoAlimenta%C3%A7%C3%A3o2.html" style="text-decoration: none">Pirâmide alimentar – Saiba tudo sobre o modelo de pirâmide brasileira</a></h3>
                        </div>   
                    </div>
                    <div class="carousel-item">
                        <img src="artigo6.jpg" alt="" >
                        <div class="carousel-caption">
                            <h3 style="text-decoration-color: black"><a href="artigoAlimenta%C3%A7%C3%A3o.html" style="text-decoration: none">5 receitas vegetarianas light deliciosas e rápidas de preparar</a></h3>
                        </div>   
                    </div>
                    <div class="carousel-item">
                        <img src="artigo9.jpg" alt="" 
                             >
                        <div class="carousel-caption">
                            <h3 style="text-decoration-color: black"><a href="artigoExercicio3.html" style="text-decoration: none">Exercícios isolados, usar ou não em meu treino?</a></h3>
                        </div>   
                    </div>
                </div>
                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a>
                <a class="carousel-control-next" href="#demo" data-slide="next">
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div>

        </div>
        <div class="container " id="divloginPrincipal">

            <!--  
            <div class="form-group" id="divtextlogin">
              <label for="email">Email address:<input type="email" class="form-control" id="email" style=""></label>
            </div>
            <div >
              <label for="pwd">Password:<input type="password" class="form-control" id="senha"></label>
            </div> 
              <a href="index.html"><button type="button" class="btn justify-content-center text-body font-weight-bolder" style="background-color:aliceblue; position: relative; float:left;left: 40px;width: 90px;height: 40px;top: 10px ">Entrar</button></a>
            <a href="cadastroPrincipal.html"><button type="button">Cadastrar</button></a>-->
        </div>    
    </div>


    <article id="articleExercicio">
        <h1 class="text-center" id="tituloCategorias">EXERCÍCIOS FÍSICOS</h1>

    </article>


    <article id="articleAlimentacao" >
        <h1 class="text-center" id="tituloCategorias">ALIMENTAÇÃO SAUDÁVEL</h1>

    </article>

    <article id="articleReceita" >
        <h1 class="text-center" id="tituloCategorias">RECEITA FIT</h1>

    </article>

    <script>
        firebase.auth().onAuthStateChanged(function (user) {
            if (user) {
                dados(user.uid);
            } else {
                dados(user.uid);
            }
        });

        var contemArtigoAlimentacao = false;
        var contemArtigoExercicio = false;
        var contemArtigoReceita = false;
        function dados(id) {
            ref = firebase.database().ref("artigo");

            ref.once('value').then(snapshot => {
                snapshot.forEach(value => {
                    adicionarPrevia(value.val(), id);
                });
                if (!contemArtigoAlimentacao) {
                    naoContemAlimentacao();
                }
                if (!contemArtigoExercicio) {
                    naoContemExercicio();
                }
                if (!contemArtigoReceita) {
                    naoContemReceita();
                }
            });
        }

        function naoContemAlimentacao() {
            var center = document.createElement("center");

            var h1 = document.createElement("h1");
            h1.setAttribute("style", "font-size: 20px");
            h1.innerText = "Nenhum conteúdo adicionado sobre";
            center.appendChild(h1);

            var a = document.getElementById("articleAlimentacao");
            a.appendChild(center);

        }
        function naoContemExercicio() {
            var center = document.createElement("center");

            var h1 = document.createElement("h1");
            h1.setAttribute("style", "font-size: 20px");
            h1.innerText = "Nenhum conteúdo adicionado sobre";
            center.appendChild(h1);

            var a = document.getElementById("articleExercicio");
            a.appendChild(center);

        }
        function naoContemReceita() {
            var center = document.createElement("center");

            var h1 = document.createElement("h1");
            h1.setAttribute("style", "font-size: 20px");
            h1.innerText = "Nenhum conteúdo adicionado sobre";
            center.appendChild(h1);

            var a = document.getElementById("articleReceita");
            a.appendChild(center);

        }

        function adicionarPrevia(informacao, id) {
            var artigoId = informacao.artigoId;
            var contExercicio = 0;
            var contAlimentacao = 0;
            var contReceita = 0;

            if (informacao.classificacao == "Exercícios físicos" && contExercicio <= 6) {

                var div = document.createElement("div");
                div.setAttribute("class", "card-columns");

                var div1 = document.createElement("div");
                div1.setAttribute("class", "card");
                div.appendChild(div1);

                var img = document.createElement("img");
                img.setAttribute("width", "100px");
                img.setAttribute("id", artigoId);
                div1.appendChild(img);
                var fotopreview = document.getElementById(artigoId);
                firebase.storage().ref('ImgArtigo/' + artigoId).child(informacao.titulo).getDownloadURL().then(url => {
                    fotopreview.src = url;
                });

                var div2 = document.createElement("div");
                div2.setAttribute("class", "card-body");
                div1.appendChild(div2);


                var h5 = document.createElement("h5");
                h5.setAttribute("id", "corpoCard");
                h5.setAttribute("class", "card-title");
                h5.innerHTML = informacao.titulo;
                div2.appendChild(h5);
                div1.appendChild(div2);


                var button = document.createElement("button");
                button.setAttribute("style", "text-align: justify;");
                button.setAttribute("class", "btn btn-dark");
                button.innerHTML = "Ir";
                div2.appendChild(button);
                div1.appendChild(div2);


                var articleAlimentacao = document.getElementById("articleExercicio");
                articleExercicio.appendChild(div);

                contemArtigoExercicio = true;
            }

            if (informacao.classificacao == "Alimentação") {

                var div = document.createElement("div");
                div.setAttribute("class", "card-columns");

                var div1 = document.createElement("div");
                div1.setAttribute("class", "card");
                div.appendChild(div1);

                var img = document.createElement("img");
                img.setAttribute("width", "100px");
                img.setAttribute("id", artigoId);
                div1.appendChild(img);
                var fotopreview = document.getElementById(artigoId);
                firebase.storage().ref('ImgArtigo/' + artigoId).child(informacao.titulo).getDownloadURL().then(url => {
                    fotopreview.src = url;
                });

                var div2 = document.createElement("div");
                div2.setAttribute("class", "card-body");
                div1.appendChild(div2);

                var h5 = document.createElement("h5");
                h5.setAttribute("id", "corpoCard");
                h5.setAttribute("class", "card-title");
                h5.innerHTML = informacao.titulo;
                div2.appendChild(h5);

                var button = document.createElement("button");
                button.setAttribute("style", "text-align: justify;");
                button.setAttribute("class", "btn btn-dark");
                button.innerHTML = "Ir";
                div2.appendChild(button);

                var articleAlimentacao = document.getElementById("articleAlimentacao");
                articleAlimentacao.appendChild(div);

                contemArtigoAlimentacao = true;
            }
            if (informacao.classificacao == "Receita fit") {

                var div = document.createElement("div");
                div.setAttribute("class", "card-columns");

                var div1 = document.createElement("div");
                div1.setAttribute("class", "card");
                div.appendChild(div1);

                var img = document.createElement("img");
                img.setAttribute("width", "100px");
                img.setAttribute("id", artigoId);
                div1.appendChild(img);
                firebase.storage().ref('ImgArtigo/' + artigoId).child(informacao.titulo).getDownloadURL().then(url => {
                    document.getElementById(artigoId).src = url;
                });

                

                var div2 = document.createElement("div");
                div2.setAttribute("class", "card-body");
                div1.appendChild(div2);

                var h5 = document.createElement("h5");
                h5.setAttribute("id", "corpoCard");
                h5.setAttribute("class", "card-title");
                h5.innerHTML = informacao.titulo;
                div2.appendChild(h5);

                var button = document.createElement("button");
                button.setAttribute("style", "text-align: justify;");
                button.setAttribute("class", "btn btn-dark");
                button.innerHTML = "Ir";
                div2.appendChild(button);

                var articleAlimentacao = document.getElementById("articleReceita");
                articleReceita.appendChild(div);

                contemArtigoReceita = true;
            }
        }
    </script>
</body>
<jsp:include page="rodape.jsp" />



