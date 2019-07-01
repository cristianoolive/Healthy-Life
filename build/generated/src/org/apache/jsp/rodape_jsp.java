package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rodape_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>rodape</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--<footer  class=\"text-white\"style=\"position:relative; float: right;top:50px;width:100%; background-color: #b0e0e6; \">\n");
      out.write("    <div class=\"container text-center text-md-left\" style=\"position: relative; color:#000;\">\n");
      out.write("        <div style=\"font-size: 14px; height: 0px\">\n");
      out.write("          <h6 class=\"font-weight-bold\">HEALTHY LIFE</h6>\n");
      out.write("          <p>\n");
      out.write("            <a href=\"principal.html\" style=\" color:#000;\" >Pagina Inicial</a>\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            <a href=\"#!\" style=\" color:#000;\" >Sugestões</a>\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            <a href=\"administradorLogin.jsp\" style=\" color:#000;\" >Administrador</a>\n");
      out.write("          </p>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("          <div class=\"text-center\">\n");
      out.write("          <img class=\" justify-center py-3 \"src=\"life2.png\" style=\"position: relative; justify-content: center; width:200px;heigth:5px;\" >\n");
      out.write("          </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer-copyright text-center py-3\" style=\"color:#000;\">© 2019 Copyright: \n");
      out.write("      <a> Healthy Life</a>\n");
      out.write("    </div>\n");
      out.write("  </footer>-->\n");
      out.write("           <footer class=\"py-lg-4 py-md-3 py-sm-3 py-3\">\n");
      out.write("      <div class=\"container py-lg-5 py-md-5 py-sm-4 py-4 text-center\">\n");
      out.write("         <div class=\"footer-headder mb-lg-4 mb-3\">\n");
      out.write("            <h2><a href=\"index.html\"  style=\"text-transform: capitalize; font-family: 'sans-serif'\"> <img style=\"height: 1%;width: 3%\" src=\"images/logo.png\" alt=\"\" class=\"img-fluid\">Art's Exchanges</a></h2>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"row address-contact-form\">\n");
      out.write("            <div class=\" footer-contact-list col-lg-4 col-md-4\">\n");
      out.write("               <h6 class=\"mb-3\">Endereço\n");
      out.write("               </h6>\n");
      out.write("               <p>Avenida sete de setembro, <br>1975 - Centro, Manaus \n");
      out.write("               </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-contact-list col-lg-4 col-md-4\">\n");
      out.write("               <h6 class=\"mb-3\">Telefone</h6>\n");
      out.write("               <p>(92) 99652-4296</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-contact-list col-lg-4 col-md-4\">\n");
      out.write("               <h6 class=\"mb-3\">Email</h6>\n");
      out.write("               <p><a href=\"http://gmail.com\">projetolped@gmail.com</a></p>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"bottem-down-footer mt-lg-4 mt-3\">\n");
      out.write("            <p> \n");
      out.write("               © 2019 Art's Exchanges. Todos os direitos reservados\n");
      out.write("            </p>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("   </footer>\n");
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
