package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administradorMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Menu adm</title>\n");
      out.write("        <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"position: inherit\">\n");
      out.write("        <div style=\"text-align: center;\">\n");
      out.write("            <br>\n");
      out.write("            <div style=\"text-align: right;\">\n");
      out.write("                <button onclick=\"logout()\" class=\"btn font-weight-bolder\" style=\"background-color:aliceblue\">Deslogar</button>\n");
      out.write("            </div>\n");
      out.write("            <h3 style=\"margin: 0 auto; color: black\">Administador</h3>\n");
      out.write("            <br>\n");
      out.write("            <div class =\"container\" style=\"margin: 0 auto; position: relative\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\" onclick=\"adcArtigo()\">Adicionar artigo</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\" onclick=\"listarArtigo()\">Listar artigos</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\" onclick=\"adcAdm()\">Adicionar administrador</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-info\" onclick=\"listarAdm()\">Listar administradores</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/6.1.1/firebase.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                // Your web app's Firebase configuration\n");
      out.write("          var config = {\n");
      out.write("            apiKey: \"AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM\",\n");
      out.write("            authDomain: \"healthylife-77c13.firebaseapp.com\",\n");
      out.write("            databaseURL: \"https://healthylife-77c13.firebaseio.com\",\n");
      out.write("            projectId: \"healthylife\",\n");
      out.write("            storageBucket: \"healthylife.appspot.com\",\n");
      out.write("            messagingSenderId: \"508711404403\",\n");
      out.write("            appId: \"1:508711404403:web:7ba2ae3d67abd79a\"\n");
      out.write("          };\n");
      out.write("          // Initialize Firebase\n");
      out.write("          firebase.initializeApp(config);\n");
      out.write("          firebase.auth().onAuthStateChanged(function(user) {\n");
      out.write("            if (user) {\n");
      out.write("                // User is signed in.\n");
      out.write("            } else {\n");
      out.write("                // No user is signed in.\n");
      out.write("                window.location=\"administradorLogin.jsp\";\n");
      out.write("            }\n");
      out.write("          });\n");
      out.write("\n");
      out.write("          function login(){\n");
      out.write("            var userEmail = document.getElementById(\"email_field\").value;\n");
      out.write("            var userPass = document.getElementById(\"password_field\").value;\n");
      out.write("\n");
      out.write("            firebase.auth().signInWithEmailAndPassword(userEmail, userPass).catch(function(error) {\n");
      out.write("                        // Handle Errors here.\n");
      out.write("                var errorCode = error.code;\n");
      out.write("                var errorMessage = error.message;\n");
      out.write("\n");
      out.write("                window.alert(\"Error : \" + errorMessage);\n");
      out.write("\n");
      out.write("                        // ...\n");
      out.write("            });\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          function logout(){\n");
      out.write("            firebase.auth().signOut();\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          function adcArtigo(){\n");
      out.write("            window.location=\"administradorAdcArtigo.jsp\";\n");
      out.write("          }\n");
      out.write("          function listarArtigo(){\n");
      out.write("            window.location=\"administradorListarArtigo.jsp\";\n");
      out.write("          }\n");
      out.write("          function adcAdm(){\n");
      out.write("            window.location=\"administradorAdicionar.jsp\";\n");
      out.write("          }\n");
      out.write("          function listarAdm(){\n");
      out.write("            window.location=\"administradorListar.jsp\";\n");
      out.write("          }\n");
      out.write("        </script>\n");
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
