package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administradorLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <title>Login Administrador</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"arquivo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/6.1.1/firebase-app.js\"></script>\n");
      out.write("\n");
      out.write("<!-- TODO: Add SDKs for Firebase products that you want to use\n");
      out.write("     https://firebase.google.com/docs/web/setup#config-web-app -->\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      // Your web app's Firebase configuration\n");
      out.write("      var firebaseConfig = {\n");
      out.write("        apiKey: \"AIzaSyA1NCVLZhoOGkwfNTrpZl0Y4-n7QnZsEfM\",\n");
      out.write("        authDomain: \"healthylife-77c13.firebaseapp.com\",\n");
      out.write("        databaseURL: \"https://healthylife-77c13.firebaseio.com\",\n");
      out.write("        projectId: \"healthylife\",\n");
      out.write("        storageBucket: \"healthylife.appspot.com\",\n");
      out.write("        messagingSenderId: \"508711404403\",\n");
      out.write("        appId: \"1:508711404403:web:7ba2ae3d67abd79a\"\n");
      out.write("      };\n");
      out.write("      // Initialize Firebase\n");
      out.write("      firebase.initializeApp(firebaseConfig);\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("   \n");
      out.write("  <div id=\"login_div\" class=\"main-div\">\n");
      out.write("    <h3>Firebase Web login Example</h3>\n");
      out.write("    <input type=\"email\" placeholder=\"Email...\" id=\"email_field\" />\n");
      out.write("    <input type=\"password\" placeholder=\"Password...\" id=\"password_field\" />\n");
      out.write("\n");
      out.write("    <button onclick=\"login()\">Login to Account</button>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div id=\"user_div\" class=\"loggedin-div\">\n");
      out.write("    <h3>Welcome User</h3>\n");
      out.write("    <p id=\"user_para\">Welcome to Firebase web login Example. You're currently logged in.</p>\n");
      out.write("    <button onclick=\"logout()\">Logout</button>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"https://www.gstatic.com/firebasejs/4.8.1/firebase.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    // Initialize Firebase\n");
      out.write("    var config = {\n");
      out.write("      apiKey: \"AIzaSyBPmZU5GIVK_6iDzROpMaYgUaqVu4FadlY\",\n");
      out.write("      authDomain: \"fir-web-login-8b7c5.firebaseapp.com\",\n");
      out.write("      databaseURL: \"https://fir-web-login-8b7c5.firebaseio.com\",\n");
      out.write("      projectId: \"fir-web-login-8b7c5\",\n");
      out.write("      storageBucket: \"fir-web-login-8b7c5.appspot.com\",\n");
      out.write("      messagingSenderId: \"301701306998\"\n");
      out.write("    };\n");
      out.write("    firebase.initializeApp(config);\n");
      out.write("  </script>\n");
      out.write("  <script src=\"administrador.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
