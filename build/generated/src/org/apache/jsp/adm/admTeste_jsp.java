package org.apache.jsp.adm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admTeste_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"pt\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <title>Criar artigo</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\"\n");
      out.write("              integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"../js/jquery.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class='body-home'>      \n");
      out.write("        <div class=\"container\" style=\"background-color: white; margin-bottom: 2%\">\n");
      out.write("            <div class=\"row col-sm-12\" style=\"padding: 16px\">\n");
      out.write("                <!-- Imagem do Campeonato -->\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("              \n");
      out.write("                        <!-- Icone -->\n");
      out.write("                        <!-- Alterar Imagem -->\n");
      out.write("                        <input type=\"file\" class=\"text-center center-block file-upload\" id=\"alterar-imagem\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <form class=\"form\" action=\"##\" method=\"post\" id=\"register\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <label>Nome</label><label class=\"asterisco\">*</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"titulo\" placeholder=\"Nome\" title=\"Informe o nome do artigo\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <label>Autor</label><label class=\"asterisco\">*</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"autor\" placeholder=\"Nome\" title=\"Informe o nome do artigo\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <!-- Box de Descrição -->\n");
      out.write("                                <label for=\"comment\">Resumo</label><label class=\"asterisco\">*</label>\n");
      out.write("                                <textarea class=\"form-control\" rows=\"3\" id=\"resumo\" placeholderid=\"resumo\" =\"Descrição sobre o artigo: fale sobre o time, os jogadores...\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div class=\"coal-xs-6\">\n");
      out.write("                            <!-- Combo-box de Classificação -->\n");
      out.write("                            <label>Classificação</label><label class=\"asterisco\">*</label>\n");
      out.write("                            <a href=\"#\"><i class=\"material-icons\" style=\"font-size:14px; color: grey\">help_outline</i></a>\n");
      out.write("                            <select class=\"form-control\" id=\"classificacao\">\n");
      out.write("                                <option>Selecione uma classificação...</option>\n");
      out.write("                                <option>Alimentação</option>\n");
      out.write("                                <option>Exercício</option>\n");
      out.write("                                <option>Receita</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-xs-12\">\n");
      out.write("                            <!-- Box de Enviar arquivo de regra -->\n");
      out.write("                            <div class=\"custom-file\">\n");
      out.write("                                <label class=\"custom-file-label\" style=\"margin-left: 0%; margin-top: 1%\" for=\"customFile\">Enviar as regras (.pdf)</label>\n");
      out.write("                                <input type=\"file\" class=\"custom-file-input\" style=\"margin-left: 0%\" id=\"regras\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-xs-6\">\n");
      out.write("                            <!-- Botões de Cancelar -->\n");
      out.write("                            <button class=\"btn btn-cancel\" onclick=\"location.href = '../jsp/meus-campeonatos.jsp'\" type=\"button\"><i class=\"glyphicon glyphicon-remove\"></i> Cancelar</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-xs-6\" style=\"margin-bottom: 2%\">\n");
      out.write("                            <!-- Botões de Prosseguir -->\n");
      out.write("                            <button class=\"btn btn-lg btn-primary\" style=\"float: right\" onclick=\"prosseguir()\" type=\"button\"> </i>Prosseguir</button>\n");
      out.write("                        </div>\n");
      out.write("                        <p></p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       <!-- <script src=\"adcArtigo.js\"></script> -->\n");
      out.write("              <script src=\"https://www.gstatic.com/firebasejs/6.1.1/firebase.js\"></script>\n");
      out.write("        <script>\n");
      out.write("          // Your web app's Firebase configuration\n");
      out.write("          var firebaseConfig = {\n");
      out.write("            apiKey: \"AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM\",\n");
      out.write("            authDomain: \"healthylife-77c13.firebaseapp.com\",\n");
      out.write("            databaseURL: \"https://healthylife-77c13.firebaseio.com\",\n");
      out.write("            projectId: \"healthylife\",\n");
      out.write("            storageBucket: \"gs://healthylife.appspot.com\",\n");
      out.write("            messagingSenderId: \"508711404403\",\n");
      out.write("            appId: \"1:508711404403:web:7ba2ae3d67abd79a\"\n");
      out.write("          };\n");
      out.write("          // Initialize Firebase\n");
      out.write("          firebase.initializeApp(firebaseConfig);\n");
      out.write("            var database = firebase.database();\n");
      out.write("          var storage = firebase.storage();\n");
      out.write("          \n");
      out.write("          var arquivo;\n");
      out.write("var arquivoRegras = document.getElementById(\"regras\");\n");
      out.write("var regras;\n");
      out.write("\n");
      out.write("//vai ser executado depois de toda a página ser carregada\n");
      out.write("window.onload = function () {\n");
      out.write("\n");
      out.write("    //variaveis de referencia da imagem e do input\n");
      out.write("    var uploadfoto = document.getElementById('alterar-imagem');\n");
      out.write("   // var fotopreview = document.getElementById('artigo');\n");
      out.write("\n");
      out.write("\n");
      out.write("    uploadfoto.addEventListener('change', function (e) {\n");
      out.write("        arquivo = e.target.files[0];\n");
      out.write("        showThumbnail(this.files);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    arquivoRegras.onchange = function (event) {\n");
      out.write("        regras = event.target.files[0];\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    function showThumbnail(files) {\n");
      out.write("        if (files && files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                fotopreview.src = e.target.result;\n");
      out.write("            }\n");
      out.write("            reader.readAsDataURL(files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function prosseguir() {\n");
      out.write("    var titulo = document.getElementById(\"titulo\").value;\n");
      out.write("    var autor = document.getElementById(\"autor\").value;\n");
      out.write("    var resumo = document.getElementById(\"resumo\").value;\n");
      out.write("    var classificacao = document.getElementById(\"classificacao\").value;\n");
      out.write("\n");
      out.write("\n");
      out.write("    if (!isEmpty(titulo) && !isEmpty(autor) && !isEmpty(resumo)  && !isEmpty(classificacao) ) {\n");
      out.write("        adicionar(titulo, autor, resumo,  classificacao);\n");
      out.write("    } else {\n");
      out.write("        alert(\"Erro: Preencha todos os campos obrigatórios (*)\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function isEmpty(val) {\n");
      out.write("    return (val === undefined || val == null || val.length <= 0) ? true : false;\n");
      out.write("}\n");
      out.write("function adicionar(titulo, autor, resumo, classificacao){\n");
      out.write("    var id = firebase.auth().currentUser.uid;\n");
      out.write("    var uid = gerarUid();\n");
      out.write("    firebase.database().ref().child('artigo/' + uid).set({\n");
      out.write("        titulo: titulo,\n");
      out.write("        autor: autor,\n");
      out.write("        resumo: resumo,\n");
      out.write("        artigoId: uid,\n");
      out.write("        classificacao: classificacao,\n");
      out.write("        idAdm : id\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    firebase.storage().ref('Regras/'+uid).child(titulo).put(regras).then(snapshot => {\n");
      out.write("        console.log(\"snapshot\", snapshot);\n");
      out.write("        firebase.storage().ref('Regras').child(titulo).getDownloadURL().then(url => {\n");
      out.write("            console.log(\"string para download\", url);\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    const reader = new FileReader();\n");
      out.write("    reader.readAsDataURL(arquivo);\n");
      out.write("    reader.onload = function () {\n");
      out.write("        console.log(reader.result);\n");
      out.write("        const base64 = reader.result.split('base64,')[1];\n");
      out.write("\n");
      out.write("        firebase.storage().ref('Artigo/'+uid).child(titulo).putString(base64, 'base64', {contentType: 'image/png'}).then(snapshot => {\n");
      out.write("            console.log('snapshot', snapshot);\n");
      out.write("            window.location.href='../jsp/campeonato.jsp';\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("     \n");
      out.write("}\n");
      out.write("\n");
      out.write("function gerarUid() {\n");
      out.write("  return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {\n");
      out.write("    var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);\n");
      out.write("    return v.toString(16);\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
