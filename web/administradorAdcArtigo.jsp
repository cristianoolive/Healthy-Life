
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Adicionar Artigo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="arquivo.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
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

        <form>
            <div id="divAdm" class="container form-control justify-content-center">
                <h3>inserir artigo</h3>
                <div class="form-group">
                    <label for="titulo">Título</label>
                    <input type="text" class="form-control" id="titulo" placeholder="Insira o título" required>
                    <div class="valid-feedback">Válido</div>
                    <div class="invalid-feedback"></div>
                </div>
                <div class="form-group">
                    <label for="autor">Autor</label>
                    <select class="form-control" id="autor">
                        <option>Selecione um autor...</option>
                        <option>Equipe Healthy Life</option>
                    </select> 
                </div>
                <div class="form-group">
                    <label for="resumo">Resumo</label>
                    <input type="text" class="form-control" rows="3" id="resumo" placeholder="Insira o resumo" required>
                    <div class="valid-feedback">Válido</div>
                    <div class="invalid-feedback"></div>
                </div>
                <div class="form-group">
                    <label for="pwd">Adicionar artigo no formato PDF</label>
                    <br>
                    <input  id="artigo" class="btn btn-info" type="file" accept=".pdf"  name="artigoPdf" required>
                </div>
                <div class="form-group">
                    <label>Adicionar imagem para o artigo</label>
                    <br>
                    <input type="file" class="btn btn-info file-upload" id="alterar-imagem">
                    <br>
                    <div class="valid-feedback">Válido</div>
                    <div class="invalid-feedback"></div>
                </div>
                <div class="form-group">
                    <label for="autor">Classificação</label>
                    <select class="form-control" id="classificacao">
                        <option>Selecione uma classificação...</option>
                        <option>Alimentação</option>
                        <option>Exercícios físicos</option>
                        <option>Receita fit</option>
                    </select> 
                </div>

                <br><br>
                <button type="button" onclick="prosseguir()" class="btn justify-content-center font-weight-bolder" style="background-color:#ffffff; top: 5px; position: relative; left: 250px; ">Inserir</button> 
                <button type="reset" value="reset" class="btn justify-content-center font-weight-bolder" style="background-color:#ffffff; top: 5px; position: relative; left: 250px; ">Apagar</button>
            </div>
        </form>

        <script src="https://www.gstatic.com/firebasejs/6.1.1/firebase.js"></script>
        <script>
                    var firebaseConfig = {
                        apiKey: "AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM",
                        authDomain: "healthylife-77c13.firebaseapp.com",
                        databaseURL: "https://healthylife-77c13.firebaseio.com",
                        projectId: "healthylife",
                        storageBucket: "gs://healthylife.appspot.com",
                        messagingSenderId: "508711404403",
                        appId: "1:508711404403:web:7ba2ae3d67abd79a"
                    };
                    firebase.initializeApp(firebaseConfig);
                    var database = firebase.database();
                    var storage = firebase.storage();
                    var arquivo;
                    var arquivoArtigo = document.getElementById("artigo");
                    var artigo;

                    window.onload = function () {
                        var uploadfoto = document.getElementById('alterar-imagem');
                        // var fotopreview = document.getElementById('artigo');

                        uploadfoto.addEventListener('change', function (e) {
                            arquivo = e.target.files[0];
                            showThumbnail(this.files);
                        });

                        arquivoArtigo.onchange = function (event) {
                            artigo = event.target.files[0];
                        };

                        function showThumbnail(files) {
                            if (files && files[0]) {
                                var reader = new FileReader();
                                reader.onload = function (e) {
                                    fotopreview.src = e.target.result;
                                }
                                reader.readAsDataURL(files[0]);
                            }
                        }
                    };

                    function prosseguir() {
                        var titulo = document.getElementById("titulo").value;
                        var autor = document.getElementById("autor").value;
                        var resumo = document.getElementById("resumo").value;
                        var classificacao = document.getElementById("classificacao").value;

                        if (!isEmpty(titulo) && !isEmpty(autor) && !isEmpty(resumo) && !isEmpty(classificacao)) {
                            adicionar(titulo, autor, resumo, classificacao);
                        } else {
                            alert("Erro: Preencha todos os campos obrigatórios (*)");
                        }
                    }

                    function isEmpty(val) {
                        return (val === undefined || val == null || val.length <= 0) ? true : false;
                    }
                    function adicionar(titulo, autor, resumo, classificacao) {
                        var id = firebase.auth().currentUser.uid;
                        var uid = gerarUid();
                        firebase.database().ref().child('artigo/' + uid).set({
                            titulo: titulo,
                            autor: autor,
                            resumo: resumo,
                            classificacao: classificacao,
                            artigoId: uid,
                            idAdm: id
                        });

                        firebase.storage().ref('Artigo/' + uid).child(titulo).put(artigo).then(snapshot => {
                            console.log('snapshot', snapshot);

                            uploadTask.snapshot.ref.getDownloadURL().then(function (downloadURL) {
                                console.log('File available at', downloadURL);
                            });
                        });

                        const reader = new FileReader();
                        reader.readAsDataURL(arquivo);
                        reader.onload = function () {
                            console.log(reader.result);
                            const base64 = reader.result.split('base64,')[1];

                            firebase.storage().ref('ImgArtigo/' + uid).child(titulo).putString(base64, 'base64', {contentType: 'image/png'}).then(snapshot => {
                                console.log('snapshot', snapshot);
                                window.location = "administradorPrincipal.jsp";
                            });
                        }

                    }

                    function gerarUid() {
                        return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
                            var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);
                            return v.toString(16);
                        });
                    }


        </script>
    </body>
</html>



