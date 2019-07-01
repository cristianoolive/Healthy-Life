package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cabecalho_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>cabeçalho</title>\n");
      out.write("        <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <header>\n");
      out.write("        <nav class=\"navbar navbar-expand-sm justify-content-center \" style=\"background-color:#b0e0e6; border-radius: 15px;\" id=\"nav\" >\n");
      out.write("            <div >\n");
      out.write("  <!-- Brand/logo -->\n");
      out.write("                <a class=\"navbar-brand\" href=\"principal.jsp\"><img src=\"life2.png\" alt=\"logo\" style=\"width:190px;\" class=\"d-inline-block align-top\"></a>\n");
      out.write("            </div>\n");
      out.write("  <!-- Links -->\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\"><a id=\"navitem\" class=\"nav-link text-body font-weight-bolder\" href=\"exercicios.html\">EXERCÍCIOS FÍSICOS</a></li>\n");
      out.write("                <li class=\"nav-item\"><a id=\"navitem\" class=\"nav-link text-body font-weight-bolder\" href=\"alimentacao.html\">ALIMENTAÇÃO SAUDÁVEL</a></li>\n");
      out.write("                <li class=\"nav-item\"><a id=\"navitem\" class=\"nav-link text-body font-weight-bolder\" href=\"#\">RECEITAS FIT</a></li>\n");
      out.write("                <li class=\"nav-item\"><a id=\"navitem\" class=\"nav-link text-body font-weight-bolder\" href=\"comunidadePrincipal.html\">COMUNIDADE</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
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
