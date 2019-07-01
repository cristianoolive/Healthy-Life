package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administradorAdicionar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Adicionar Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write("\n");
      out.write("        <div style=\"margin: 0 auto\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "administradorMenu.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"divlogin\"class=\"form-control\">\n");
      out.write("            <h3>Cadastrar</h3>\n");
      out.write("            <input class=\"form-control\" type=\"email\" placeholder=\"Email...\" id=\"email_field\" style=\"position: relative; top: 15px\" />\n");
      out.write("            <input class=\"form-control\" type=\"password\" placeholder=\"Senha...\" id=\"password_field\" style=\"position: relative; top: 30px\" />\n");
      out.write("            <button onclick=\"create_account()\" class=\"btn justify-content-center font-weight-bolder\" style=\"background-color:#ffffff; top: 45px; margin-left: auto;\n");
      out.write("            margin-right: auto;position: inherit;\">Cadastrar</button> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/6.1.1/firebase.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var config = {\n");
      out.write("            apiKey: \"AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM\",\n");
      out.write("            authDomain: \"healthylife-77c13.firebaseapp.com\",\n");
      out.write("            databaseURL: \"https://healthylife-77c13.firebaseio.com\",\n");
      out.write("            projectId: \"healthylife\",\n");
      out.write("            storageBucket: \"healthylife.appspot.com\",\n");
      out.write("            messagingSenderId: \"508711404403\",\n");
      out.write("            appId: \"1:508711404403:web:7ba2ae3d67abd79a\"\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            firebase.initializeApp(config);\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            firebase.auth().onAuthStateChanged(function(user) {\n");
      out.write("                if (user) {\n");
      out.write("                    // User is signed in.\n");
      out.write("                  } else { \n");
      out.write("                    // No user is signed in.\n");
      out.write("                  }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function create_account(){\n");
      out.write("                var email = document.getElementById('email_field').value;\n");
      out.write("                var senha = document.getElementById('password_field').value;   \n");
      out.write("\n");
      out.write("                firebase.auth().createUserWithEmailAndPassword(email, senha).catch(function(error) {\n");
      out.write("                    var errorCode = error.code;\n");
      out.write("                    var errorMessage = error.message;\n");
      out.write("                        //window.alert(\"Error : \" + errorMessage);\n");
      out.write("                    window.location=\"administradorPrincipal.jsp\";\n");
      out.write("                });\n");
      out.write("            }\n");
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
