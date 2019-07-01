package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administradorListarArtigo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listar Artigo</title>\n");
      out.write("        <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
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
      out.write("            var storage = firebase.storage();\n");
      out.write("        </script>\n");
      out.write("        <link rel=\"icon\" href=\"life2.png\" type=\"image/png\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"margin: 0 auto\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "administradorMenu.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"background-color: white;\" id=\"listar\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            firebase.auth().onAuthStateChanged(function (user) {\n");
      out.write("                if (user) {\n");
      out.write("                    dados(user.uid);\n");
      out.write("                } else {\n");
      out.write("                    dados(user.uid);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            var contemArtigo = false;\n");
      out.write("\n");
      out.write("            function dados(id) {\n");
      out.write("                ref = firebase.database().ref(\"artigo\");\n");
      out.write("\n");
      out.write("                ref.once('value').then(snapshot => {\n");
      out.write("                    snapshot.forEach(value => {\n");
      out.write("                        adicionarPrevia(value.val(), id);\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function adicionarPrevia(informacao, id) {\n");
      out.write("                var artigoId = informacao.artigoId;\n");
      out.write("\n");
      out.write("                var table = document.createElement(\"table\");\n");
      out.write("                table.setAttribute(\"class\", \"table table-hover\");\n");
      out.write("\n");
      out.write("                var thead = document.createElement(\"thead\");\n");
      out.write("                table.appendChild(thead);\n");
      out.write("\n");
      out.write("                var tr = document.createElement(\"tr\");\n");
      out.write("                thead.appendChild(tr);\n");
      out.write("\n");
      out.write("                var th = document.createElement(\"th\");\n");
      out.write("                th.setAttribute(\"scope\", \"col\");\n");
      out.write("                th.innerText = \"Titulo\";\n");
      out.write("                tr.appendChild(th);\n");
      out.write("\n");
      out.write("                var th = document.createElement(\"th\");\n");
      out.write("                th.setAttribute(\"scope\", \"col\");\n");
      out.write("                th.innerText = \"Autor\";\n");
      out.write("                tr.appendChild(th);\n");
      out.write("\n");
      out.write("                var th = document.createElement(\"th\");\n");
      out.write("                th.setAttribute(\"scope\", \"col\");\n");
      out.write("                th.innerText = \"Categoria\";\n");
      out.write("                tr.appendChild(th);\n");
      out.write("\n");
      out.write("                var th = document.createElement(\"th\");\n");
      out.write("                th.setAttribute(\"scope\", \"col\");\n");
      out.write("                th.innerText = \"Opções\";\n");
      out.write("                tr.appendChild(th);\n");
      out.write("\n");
      out.write("                var tbody = document.createElement(\"tbody\");\n");
      out.write("                table.appendChild(tbody);\n");
      out.write("\n");
      out.write("                var tr = document.createElement(\"tr\");\n");
      out.write("                tbody.appendChild(tr);\n");
      out.write("\n");
      out.write("                var td = document.createElement(\"td\");\n");
      out.write("                td.innerHTML = informacao.titulo;\n");
      out.write("                tr.appendChild(td);\n");
      out.write("\n");
      out.write("                var td = document.createElement(\"td\");\n");
      out.write("                td.innerHTML = informacao.autor;\n");
      out.write("                tr.appendChild(td);\n");
      out.write("\n");
      out.write("                var td = document.createElement(\"td\");\n");
      out.write("                td.innerHTML = informacao.classificacao;\n");
      out.write("                tr.appendChild(td);\n");
      out.write("\n");
      out.write("                var td = document.createElement(\"td\");\n");
      out.write("                tr.appendChild(td);\n");
      out.write("\n");
      out.write("                var button = document.createElement(\"button\");\n");
      out.write("                button.setAttribute(\"class\", \"btn btn-danger\");\n");
      out.write("                button.onclick = function() { deletar(artigoId); };\n");
      out.write("                button.innerHTML = \"Excluir\";\n");
      out.write("                td.appendChild(button);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                var listar = document.getElementById(\"listar\");\n");
      out.write("                listar.appendChild(table);\n");
      out.write("\n");
      out.write("                //button.innerHTML = options.innerHTML + \"<button type=\"button\">Clique</button>\";\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function deletar(artigoId) {\n");
      out.write("                firebase.database().ref('artigo').child(artigoId).remove().then(() => {\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                firebase.storage().ref('ImgArtigo/' + artigoId).child(informacao.titulo).delete().then(function () {\n");
      out.write("                }).catch(function (error) {\n");
      out.write("                    console.log(\"erro: \", error);\n");
      out.write("                });\n");
      out.write("                 firebase.storage().ref(\"Artigo/\" + artigoId).child(informacao.titulo).delete().then(function () {\n");
      out.write("                 }).catch(function (error) {\n");
      out.write("                 console.log(\"erro: \", error);\n");
      out.write("                 \n");
      out.write("                 });\n");
      out.write("                 window.location.href=\"administradorListarArtigo.jsp\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
