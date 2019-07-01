package org.apache.jsp.adm;

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div style=\"margin: 0 auto\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "administradorMenu.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <form>\n");
      out.write("    <div id=\"divAdm\" class=\"container form-control justify-content-center\">\n");
      out.write("        <h3>inserir artigo</h3>\n");
      out.write("  <div id=\"login_div\" class=\"main-div\">\n");
      out.write("      \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("      <label for=\"nome\">Titulo</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"tituloArtigo\" placeholder=\"Insira o titulo\" name=\"nome\" required>\n");
      out.write("      <div class=\"valid-feedback\">Válido</div>\n");
      out.write("      <div class=\"invalid-feedback\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"nomeu\">Autor</label>\n");
      out.write("      <input type=\"text\" class=\"form-control \" id=\"autorArtigo\" placeholder=\"Insira o nome do autor\" name=\"nomeu\" required>\n");
      out.write("      <div class=\"valid-feedback\">Válido</div>\n");
      out.write("      <div class=\"invalid-feedback\"></div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Resumo</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"resumoArtigo\" placeholder=\"Insira o resumo\" name=\"email\" required>\n");
      out.write("      <div class=\"valid-feedback\">Válido</div>\n");
      out.write("      <div class=\"invalid-feedback\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Adicionar artigo no formato PDF</label>\n");
      out.write("      <br>\n");
      out.write("      <input  id=\"artigo\" class=\"btn btn-info\" type=\"file\" accept=\".pdf\"  name=\"artigo\" required>\n");
      out.write("      <div class=\"valid-feedback\">Válido</div>\n");
      out.write("      <div class=\"invalid-feedback\"></div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("         <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Adicionar imagem para o artigo </label>\n");
      out.write("      <br>\n");
      out.write("      <input  id=\"imagemArtigo\" class=\"btn btn-info\" type=\"file\" name=\"artigo\" required>\n");
      out.write("      <div class=\"valid-feedback\">Válido</div>\n");
      out.write("      <div class=\"invalid-feedback\"></div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("                            <select class=\"form-control\" id=\"classificacao\">\n");
      out.write("                             <option>Selecione uma classificação...</option>\n");
      out.write("                            <option>Alimentacao</option>\n");
      out.write("                            <option>Exercícios físicos</option>\n");
      out.write("                            <option>Receita fit</option>\n");
      out.write("                            </select>\n");
      out.write("      <!--\n");
      out.write("    <div class=\"form-check form-check-inline\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio1\" value=\"option1\">\n");
      out.write("  <label class=\"form-check-label\" for=\"inlineRadio1\">Exercícios físicos</label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check form-check-inline\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio2\" value=\"option2\">\n");
      out.write("  <label class=\"form-check-label\" for=\"inlineRadio2\">Alimentação</label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check form-check-inline\">\n");
      out.write("  <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio3\" value=\"option3\">\n");
      out.write("  <label class=\"form-check-label\" for=\"inlineRadio3\">Receita</label>\n");
      out.write("</div> -->\n");
      out.write("  <br><br>\n");
      out.write("  <script src=\"adcArtigo.js\"></script>\n");
      out.write("      <a href=\"principal.html\"><button type=\"button\" onclick=\"prosseguir()\" class=\"btn justify-content-center font-weight-bolder\" style=\"background-color:#ffffff; top: 5px; position: relative; left: 250px; \">Inserir</button>  </a>\n");
      out.write("      <button type=\"reset\" value=\"reset\" class=\"btn justify-content-center font-weight-bolder\" style=\"background-color:#ffffff; top: 5px; position: relative; left: 250px; \">Apagar</button>\n");
      out.write("</div>\n");
      out.write("     </div>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("      <script src=\"https://www.gstatic.com/firebasejs/6.1.1/firebase.js\"></script>\n");
      out.write("        <script>\n");
      out.write("          // Your web app's Firebase configuration\n");
      out.write("          var config = {\n");
      out.write("            apiKey: \"AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM\",\n");
      out.write("            authDomain: \"healthylife-77c13.firebaseapp.com\",\n");
      out.write("            databaseURL: \"https://healthylife-77c13.firebaseio.com\",\n");
      out.write("            projectId: \"healthylife\",\n");
      out.write("            storageBucket: \"gs://healthylife.appspot.com\",\n");
      out.write("            messagingSenderId: \"508711404403\",\n");
      out.write("            appId: \"1:508711404403:web:7ba2ae3d67abd79a\"\n");
      out.write("          };\n");
      out.write("          // Initialize Firebase\n");
      out.write("          firebase.initializeApp(config);\n");
      out.write("          \n");
      out.write("          var storage = firebase.storage();\n");
      out.write("          \n");
      out.write("\n");
      out.write("          \n");
      out.write("          var db = firebase.firestore();\n");
      out.write("          \n");
      out.write("          uploadProfileImg = function(){\n");
      out.write("            \n");
      out.write("            var file = ($('#imagemArtigo'))[0].files[0];\n");
      out.write("            console.log(file);\n");
      out.write("            \n");
      out.write("            if(!file){\n");
      out.write("                \n");
      out.write("            }else{\n");
      out.write("            var storageRef = storage.ref('artigo'+file.name);\n");
      out.write("            \n");
      out.write("            var uploadTask = storageRef.put(file);\n");
      out.write("            \n");
      out.write("            uploadTask.on('state_changed', function(snapshot){\n");
      out.write("                \n");
      out.write("            }, function(error){\n");
      out.write("                console.log(error);\n");
      out.write("            }, function(){\n");
      out.write("                console.log('arquivo upload');\n");
      out.write("            });\n");
      out.write("        }    \n");
      out.write("          };\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          db.collection(\"users\").get().then((querySnapshot) => {\n");
      out.write("        querySnapshot.forEach((doc) => {\n");
      out.write("        console.log(`");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" => ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doc.data()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`);\n");
      out.write("         });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        </script>\n");
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
