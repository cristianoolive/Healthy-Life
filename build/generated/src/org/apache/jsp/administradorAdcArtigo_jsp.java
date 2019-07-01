package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administradorAdcArtigo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Adicionar Artigo</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>    \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write("\n");
      out.write("        <div style=\"margin: 0 auto\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "administradorMenu.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <div id=\"divAdm\" class=\"container form-control justify-content-center\">\n");
      out.write("                <h3>inserir artigo</h3>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"titulo\">Título</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"titulo\" placeholder=\"Insira o título\" required>\n");
      out.write("                    <div class=\"valid-feedback\">Válido</div>\n");
      out.write("                    <div class=\"invalid-feedback\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"autor\">Autor</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"autor\" placeholder=\"Insira o nome do autor\" required>\n");
      out.write("                    <div class=\"valid-feedback\">Válido</div>\n");
      out.write("                    <div class=\"invalid-feedback\"></div>\n");
      out.write("                    \n");
      out.write("                    <select class=\"form-control\" id=\"classificacao\">\n");
      out.write("                    <option>Selecione uma classificação...</option>\n");
      out.write("                    <option>Equipe Healthy Life</option>\n");
      out.write("                </select> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"resumo\">Resumo</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" rows=\"3\" id=\"resumo\" placeholder=\"Insira o resumo\" required>\n");
      out.write("                    <div class=\"valid-feedback\">Válido</div>\n");
      out.write("                    <div class=\"invalid-feedback\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"pwd\">Adicionar artigo no formato PDF</label>\n");
      out.write("                    <br>\n");
      out.write("                    <input  id=\"artigo\" class=\"btn btn-info\" type=\"file\" accept=\".pdf\"  name=\"artigoPdf\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Adicionar imagem para o artigo</label>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"file\" class=\"btn btn-info file-upload\" id=\"alterar-imagem\">\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"valid-feedback\">Válido</div>\n");
      out.write("                    <div class=\"invalid-feedback\"></div>\n");
      out.write("                </div>\n");
      out.write("                <select class=\"form-control\" id=\"classificacao\">\n");
      out.write("                    <option>Selecione uma classificação...</option>\n");
      out.write("                    <option>Alimentação</option>\n");
      out.write("                    <option>Exercícios físicos</option>\n");
      out.write("                    <option>Receita fit</option>\n");
      out.write("                </select> \n");
      out.write("                <br><br>\n");
      out.write("                <button type=\"button\" onclick=\"prosseguir()\" class=\"btn justify-content-center font-weight-bolder\" style=\"background-color:#ffffff; top: 5px; position: relative; left: 250px; \">Inserir</button> \n");
      out.write("                <button type=\"reset\" value=\"reset\" class=\"btn justify-content-center font-weight-bolder\" style=\"background-color:#ffffff; top: 5px; position: relative; left: 250px; \">Apagar</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/6.1.1/firebase.js\"></script>\n");
      out.write("        <script>\n");
      out.write("        var firebaseConfig = {\n");
      out.write("            apiKey: \"AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM\",\n");
      out.write("            authDomain: \"healthylife-77c13.firebaseapp.com\",\n");
      out.write("            databaseURL: \"https://healthylife-77c13.firebaseio.com\",\n");
      out.write("            projectId: \"healthylife\",\n");
      out.write("            storageBucket: \"gs://healthylife.appspot.com\",\n");
      out.write("            messagingSenderId: \"508711404403\",\n");
      out.write("            appId: \"1:508711404403:web:7ba2ae3d67abd79a\"\n");
      out.write("        };\n");
      out.write("        firebase.initializeApp(firebaseConfig);\n");
      out.write("        var database = firebase.database();\n");
      out.write("        var storage = firebase.storage();\n");
      out.write("        var arquivo;\n");
      out.write("        var arquivoArtigo = document.getElementById(\"artigo\");\n");
      out.write("        var artigo;\n");
      out.write("\n");
      out.write("        window.onload = function () {\n");
      out.write("            var uploadfoto = document.getElementById('alterar-imagem');\n");
      out.write("           // var fotopreview = document.getElementById('artigo');\n");
      out.write("           \n");
      out.write("            uploadfoto.addEventListener('change', function (e) {\n");
      out.write("                arquivo = e.target.files[0];\n");
      out.write("                showThumbnail(this.files);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            arquivoArtigo.onchange = function (event) {\n");
      out.write("                artigo = event.target.files[0];\n");
      out.write("          };\n");
      out.write("\n");
      out.write("            function showThumbnail(files) {\n");
      out.write("                if (files && files[0]) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        fotopreview.src = e.target.result;\n");
      out.write("                    }\n");
      out.write("                    reader.readAsDataURL(files[0]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        function prosseguir() {\n");
      out.write("            var titulo = document.getElementById(\"titulo\").value;\n");
      out.write("            var autor = document.getElementById(\"autor\").value;\n");
      out.write("            var resumo = document.getElementById(\"resumo\").value;\n");
      out.write("            var classificacao = document.getElementById(\"classificacao\").value;\n");
      out.write("\n");
      out.write("            if (!isEmpty(titulo) && !isEmpty(autor) && !isEmpty(resumo)  && !isEmpty(classificacao) ) {\n");
      out.write("                adicionar(titulo, autor, resumo,  classificacao);\n");
      out.write("            } else {\n");
      out.write("                alert(\"Erro: Preencha todos os campos obrigatórios (*)\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function isEmpty(val) {\n");
      out.write("            return (val === undefined || val == null || val.length <= 0) ? true : false;\n");
      out.write("        }\n");
      out.write("        function adicionar(titulo, autor, resumo, classificacao){\n");
      out.write("            var id = firebase.auth().currentUser.uid;\n");
      out.write("            var uid = gerarUid();\n");
      out.write("            firebase.database().ref().child('artigo/' + uid).set({\n");
      out.write("                titulo: titulo,\n");
      out.write("                autor: autor,\n");
      out.write("                resumo: resumo,\n");
      out.write("                classificacao: classificacao,\n");
      out.write("                artigoId: uid,\n");
      out.write("                idAdm : id\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            firebase.storage().ref('Artigo/'+uid).child(titulo).put(artigo).then(snapshot => {\n");
      out.write("                console.log('snapshot', snapshot);\n");
      out.write("\n");
      out.write("                uploadTask.snapshot.ref.getDownloadURL().then(function(downloadURL) {\n");
      out.write("                    console.log('File available at', downloadURL);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            const reader = new FileReader();\n");
      out.write("            reader.readAsDataURL(arquivo);\n");
      out.write("            reader.onload = function () {\n");
      out.write("                console.log(reader.result);\n");
      out.write("                const base64 = reader.result.split('base64,')[1];\n");
      out.write("\n");
      out.write("                firebase.storage().ref('ImgArtigo/'+uid).child(titulo).putString(base64, 'base64', {contentType: 'image/png'}).then(snapshot => {\n");
      out.write("                    console.log('snapshot', snapshot);\n");
      out.write("                    window.location=\"administradorPrincipal.jsp\";\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function gerarUid() {\n");
      out.write("          return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {\n");
      out.write("            var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);\n");
      out.write("            return v.toString(16);\n");
      out.write("          });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("                </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
