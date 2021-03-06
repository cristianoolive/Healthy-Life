package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alimentacao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Alimentação Saudável</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"arquivo.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\"\n");
      out.write("              integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
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
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"caminho\" class=\"container-fluid\">\n");
      out.write("                <button id=\"btnCaminho\" type=\"button\" class=\"btn text-dark \"><a class=\"font-weight-bold\" href=\"principal.html\"style=\"color: black; font-size: 11px\">PÁGINA INICIAL</a></button>\n");
      out.write("                >\n");
      out.write("                <button id=\"btnCaminho\" type=\"button\" class=\"btn text-dark\"><a class=\"font-weight-bold\" href=\"alimentacao.html\"style=\"color: black; font-size: 11px\">ALIMENTAÇÃO SAUDÁVEL</a></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div style=\"position: relative; position: relative;\n");
      out.write("                 float: center;\n");
      out.write("                 width: 800px;\n");
      out.write("                 margin: 0px auto;\n");
      out.write("                 \" >\n");
      out.write("                <hr>\n");
      out.write("                <b><h1 class=\"text-center\" style=\"position:relative;top: 0px; font-size: 30px;text-decoration-style: solid\">ALIMENTAÇÃO SAUDÁVEL</h1>\n");
      out.write("                </b>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"container\" style=\"background-color: white;\" id=\"listar\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--<div>\n");
      out.write("                    <h2 id=\"tituloArtigo\">Alimentação Saudável: O que é, Benefícios e Cardápio</h2>\n");
      out.write("                    <p id=\"autorArtigo\">Equipe Healthy Life</p>\n");
      out.write("                    <table>\n");
      out.write("                        <td> <img src=\"imagem1.jpg\" id=\"imgArtigo\"></td>\n");
      out.write("                        <td><p id=\"corpoArtigo\">Um guia completo sobre a importância de ter uma alimentação saudável. O que se deve evitar, os alimentos mais recomendados, dicas para não desistir e cardápio completo para quem quer emagrecer e ganhar massa muscular.</p>  \n");
      out.write("                            <p class=\"text-center\"><a href=\"artigoAlimenta%C3%A7%C3%A3o1.html\" class=\"btn btn-dark\">Leia mais</a></p> </td>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <hr>-->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                firebase.auth().onAuthStateChanged(function (user) {\n");
      out.write("                    if (user) {\n");
      out.write("                        dados(user.uid);\n");
      out.write("                    } else {\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                var contemArtigo = false;\n");
      out.write("\n");
      out.write("                function dados(id) {\n");
      out.write("                    ref = firebase.database().ref(\"artigo\");\n");
      out.write("\n");
      out.write("                    ref.once('value').then(snapshot => {\n");
      out.write("                        snapshot.forEach(value => {\n");
      out.write("                            adicionarPrevia(value.val(), id);\n");
      out.write("                        });\n");
      out.write("                        if (!contemArtigo) {\n");
      out.write("                            naoTem();\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function adicionarPrevia(informacao, id) {\n");
      out.write("                    var artigoId = informacao.artigoId;\n");
      out.write("\n");
      out.write("                    if (informacao.classificacao == \"Alimentação\") {\n");
      out.write("\n");
      out.write("                        var div = document.createElement(\"div\");\n");
      out.write("\n");
      out.write("                        var a = document.createElement(\"h2\");\n");
      out.write("                        a.setAttribute(\"style\", \"font-size: 19px\");\n");
      out.write("                        a.setAttribute(\"id\", \"titulo\");\n");
      out.write("                        a.innerHTML = informacao.titulo;\n");
      out.write("                        div.appendChild(a);\n");
      out.write("\n");
      out.write("                        var b = document.createElement(\"p\");\n");
      out.write("                        b.setAttribute(\"style\", \"text-align: justify;font-size: 12px; position: relative;\");\n");
      out.write("                        b.innerHTML = informacao.autor;\n");
      out.write("                        div.appendChild(b);\n");
      out.write("\n");
      out.write("                        var img = document.createElement(\"img\");\n");
      out.write("                        img.setAttribute(\"width\", \"100px\");\n");
      out.write("                        img.setAttribute(\"id\", artigoId);\n");
      out.write("                        img.setAttribute(\"src\", fotopreview);\n");
      out.write("                        div.appendChild(img);\n");
      out.write("                        var fotopreview = document.getElementById(artigoId);\n");
      out.write("                        firebase.storage().ref().child('imgArtigo/' + artigoId).getDownloadURL().then(url => {\n");
      out.write("                            fotopreview.src = url;\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        var p = document.createElement(\"p\");\n");
      out.write("                        p.setAttribute(\"style\", \"text-align: 18px\");\n");
      out.write("                        p.innerHTML = informacao.resumo;\n");
      out.write("                        div.appendChild(p);\n");
      out.write("\n");
      out.write("                        var button = document.createElement(\"button\");\n");
      out.write("                        button.setAttribute(\"style\", \"text-align: justify;\");\n");
      out.write("                        button.setAttribute(\"class\", \"btn btn-dark\");\n");
      out.write("                        button.innerHTML = \"ler mais\";\n");
      out.write("                        div.appendChild(button);\n");
      out.write("\n");
      out.write("                        var br = document.createElement(\"br\");\n");
      out.write("                        div.appendChild(br);\n");
      out.write("                        div.appendChild(br);\n");
      out.write("\n");
      out.write("                        var hr = document.createElement(\"hr\");\n");
      out.write("                        hr.setAttribute(\"style\", \"height:0.5px; border:none; color:\t#DCDCDC\t; background-color:\t#DCDCDC\t; margin-top: auto; margin-bottom: auto;\");\n");
      out.write("                        div.appendChild(hr);\n");
      out.write("\n");
      out.write("                        var br = document.createElement(\"br\");\n");
      out.write("                        div.appendChild(br);\n");
      out.write("\n");
      out.write("                        var listar = document.getElementById(\"listar\");\n");
      out.write("                        listar.appendChild(div);\n");
      out.write("\n");
      out.write("                        contemArtigo = true;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("        </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "rodape.jsp", out, false);
      out.write("\n");
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
