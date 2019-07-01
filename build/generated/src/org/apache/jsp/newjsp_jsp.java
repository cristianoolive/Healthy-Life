package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Meus campeonatos</title>\n");
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
      out.write("\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/6.1.1/firebase.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            // Your web app's Firebase configuration\n");
      out.write("            var config = {\n");
      out.write("                apiKey: \"AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM\",\n");
      out.write("                authDomain: \"healthylife-77c13.firebaseapp.com\",\n");
      out.write("                databaseURL: \"https://healthylife-77c13.firebaseio.com\",\n");
      out.write("                projectId: \"healthylife\",\n");
      out.write("                storageBucket: \"healthylife.appspot.com\",\n");
      out.write("                messagingSenderId: \"508711404403\",\n");
      out.write("                appId: \"1:508711404403:web:7ba2ae3d67abd79a\"\n");
      out.write("            };\n");
      out.write("            // Initialize Firebase\n");
      out.write("            firebase.initializeApp(config);\n");
      out.write("            var database = firebase.database();\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"body-home\">\n");
      out.write("        <div class=\"container\" style=\"background-color: white;\" id=\"listar\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <h3><b>Meus campeonatos</b></h3>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <h5 class=\"help-block\" style=\"margin-bottom: 1%\">Nesta seção, você tem acesso a todos os campeonatos criados por você.</h5>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("//Busca o id do usuario logado\n");
      out.write("            firebase.auth().onAuthStateChanged((usuario) => {\n");
      out.write("                if (usuario) {\n");
      out.write("                    informacoes(usuario.uid);\n");
      out.write("                } else {\n");
      out.write("                    console.log(\"nao tem usuario logado\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            var existeCampeonato = false;\n");
      out.write("//função para mostrar informações\n");
      out.write("            function informacoes(id) {\n");
      out.write("                ref = firebase.database().ref(\"artigo\");\n");
      out.write("\n");
      out.write("                ref.once('value').then(snapshot => {\n");
      out.write("                    snapshot.forEach(value => {\n");
      out.write("                        adicionaCampeonatosATela(value.val(), id);\n");
      out.write("                    });\n");
      out.write("                    if (!existeCampeonato) {\n");
      out.write("                        naoTem();\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function adicionaCampeonatosATela(informacao, id) {\n");
      out.write("                var artigoId = informacao.artigoId;\n");
      out.write("\n");
      out.write("                //Compara se o usuario atual e gerente do campeonato\n");
      out.write("                if (informacao.idAdm === id) {\n");
      out.write("                    // Cria a div do campeonato\n");
      out.write("                    var div = document.createElement(\"div\");\n");
      out.write("                    div.setAttribute(\"class\", \"col-sm-12\");\n");
      out.write("\n");
      out.write("                    //Cria a tabela\n");
      out.write("                    var table = document.createElement(\"table\");\n");
      out.write("                    table.setAttribute(\"style\", \"background: white; border-top :1px solid #C4C4C4; border-bottom :1px solid #C4C4C4; margin-bottom: 16px\");\n");
      out.write("\n");
      out.write("                    //Cria tr\n");
      out.write("                    var tr = document.createElement(\"tr\");\n");
      out.write("\n");
      out.write("                    //Cria td\n");
      out.write("                    var td = document.createElement(\"td\");\n");
      out.write("                    td.setAttribute(\"width\", \"8%\");\n");
      out.write("                    td.setAttribute(\"style\", \"padding: 8px; padding-right: 12px\");\n");
      out.write("\n");
      out.write("                    //cria center\n");
      out.write("                    var center = document.createElement(\"center\");\n");
      out.write("\n");
      out.write("                    //cria img\n");
      out.write("                    var img = document.createElement(\"img\");\n");
      out.write("                    img.setAttribute(\"src\", \"../imagens/championship-icon.png\");\n");
      out.write("                    img.setAttribute(\"class\", \"avatar img-circle\");\n");
      out.write("                    img.setAttribute(\"alt\", \"avatar\");\n");
      out.write("                    img.setAttribute(\"width\", \"90px\");\n");
      out.write("                    img.setAttribute(\"id\", artigoId);\n");
      out.write("\n");
      out.write("                    //coloca a tag img dentro de center\n");
      out.write("                    center.appendChild(img);\n");
      out.write("\n");
      out.write("                    //coloca a tag  center dentro de td\n");
      out.write("                    td.appendChild(center);\n");
      out.write("\n");
      out.write("                    //coloca o td dentro do tr\n");
      out.write("                    tr.appendChild(td);\n");
      out.write("\n");
      out.write("                    //Cria td1\n");
      out.write("                    var td1 = document.createElement(\"td\");\n");
      out.write("                    td1.setAttribute(\"style\", \"vertical-align: top; margin-top: 8px\");\n");
      out.write("\n");
      out.write("                    //cria a \n");
      out.write("                    var a = document.createElement(\"a\");\n");
      out.write("                    a.setAttribute(\"style\", \"font-size: 19px; color: #333333\");\n");
      out.write("                    a.setAttribute(\"href\", \"campeonato.jsp\");\n");
      out.write("                    a.setAttribute(\"id\", \"nomeCampeonato\");\n");
      out.write("                    a.innerHTML = informacao.titulo; //colocar em bold\n");
      out.write("\n");
      out.write("                    //coloca o a dentro do td1\n");
      out.write("                    td1.appendChild(a);\n");
      out.write("\n");
      out.write("                    //cria um p\n");
      out.write("                    var b = document.createElement(\"p\");\n");
      out.write("                    b.setAttribute(\"style\", \"text-align: justify;color: #878787font-size: 12px; position: relative;\");\n");
      out.write("                    b.innerHTML = informacao.autor;\n");
      out.write("\n");
      out.write("                    //coloca o p dentro do td1\n");
      out.write("                    td1.appendChild(b);\n");
      out.write("                    \n");
      out.write("                    var p = document.createElement(\"p\");\n");
      out.write("                    p.setAttribute(\"style\", \"text-align: justify;color: #878787\");\n");
      out.write("                    p.innerHTML = informacao.resumo;\n");
      out.write("\n");
      out.write("                    //coloca o p dentro do td1\n");
      out.write("                    td1.appendChild(p);\n");
      out.write("                    \n");
      out.write("                    var button = document.createElement(\"button\");\n");
      out.write("                    button.setAttribute(\"style\", \"text-align: justify;color: #878787\");\n");
      out.write("                    button.setAttribute(\"class\", \"btn btn-dark\");\n");
      out.write("                    button.innerHTML =\"ler mais\";\n");
      out.write("\n");
      out.write("                    //coloca o p dentro do td1\n");
      out.write("                    td1.appendChild(button);\n");
      out.write("                    //coloca o td1 dentro tr\n");
      out.write("                    tr.appendChild(td1);\n");
      out.write("\n");
      out.write("                    //Cria o td das opcoes de editar, excluir e ver mais\n");
      out.write("                    var td2 = document.createElement(\"td\");\n");
      out.write("                    td2.setAttribute(\"style\", \"vertical-align: top; padding-top: 8px; text-align: right\");\n");
      out.write("\n");
      out.write("                    //coloca o td2 dentro tr\n");
      out.write("                    tr.appendChild(td2);\n");
      out.write("\n");
      out.write("                    //coloca o tr dentro do table\n");
      out.write("                    table.appendChild(tr);\n");
      out.write("\n");
      out.write("                    //coloca o table dentro do div\n");
      out.write("                    div.appendChild(table);\n");
      out.write("\n");
      out.write("                    //coloca o resultado do javascript dentro do hrml\n");
      out.write("                    var listar = document.getElementById(\"listar\");\n");
      out.write("\n");
      out.write("                    listar.appendChild(div);\n");
      out.write("\n");
      out.write("                    var fotopreview = document.getElementById(artigoId);\n");
      out.write("                    firebase.storage().ref().child(\"imgArtigo/\" + artigoId).getDownloadURL().then(url => {\n");
      out.write("                        fotopreview.src = url;\n");
      out.write("                    });\n");
      out.write("                    existeCampeonato = true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
