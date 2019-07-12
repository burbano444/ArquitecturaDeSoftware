package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\" />\n");
      out.write("        <title> CONCESIONARIO FOURWEELS </title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("<!BARRA DE NAVEGACION>        \n");
      out.write("        <nav class=\"red darken-3\">\n");
      out.write("            <div class=\"nav-wrapper\" >\n");
      out.write("                <a class=\"brand-logo black-text\">FOURWHEELS</a>\n");
      out.write("                <a class=\"brand-logo center\"><img class=\"center\" class=\"materialboxed\" width=\"65\" src=\"images/logo2.png\"></a> \n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal1\" >INGRESAR<i class=\"material-icons right\">account_balance</i></a></li>\n");
      out.write("                    <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal2\">REGISTRARME <i class=\"material-icons right\">add_circle_outline</i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("<!FORMULARIO INGRESO>\n");
      out.write("        <!-- Modal Structure -->\n");
      out.write("        <div id=\"modal1\" class=\"modal red darken-3\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <form class=\"col s12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <i class=\"material-icons prefix\">contact_mail</i>\n");
      out.write("                            <input id=\"email1\" type=\"email\" class=\"validate\">\n");
      out.write("                            <label for=\"email1\" class=\"black-text\">E-MAIL</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6\">\n");
      out.write("                            <i class=\"material-icons prefix\">lock</i>\n");
      out.write("                            <input id=\"password1\" type=\"password\" class=\"validate\">\n");
      out.write("                            <label for=\"password1\" class=\"black-text\">PASSWORD</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer red darken-3\">\n");
      out.write("                <a href=\"#!\" class=\"modal-close waves-effect waves-black btn-flat\">ACEPTAR</a>\n");
      out.write("                <a href=\"#!\" class=\"modal-close waves-effect waves-black btn-flat\">CANCELAR</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("<!FORMULARIO REGISTRO>           \n");
      out.write("        <div id=\"modal2\" class=\"modal red darken-3\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form class=\"col s12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                                <input id=\"nombre\" type=\"text\" class=\"validate\">\n");
      out.write("                                <label for=\"first_name\" class=\"black-text\">NOMBRE COMPLETO</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">assignment_ind</i>\n");
      out.write("                                <input id=\"id\" type=\"number\" class=\"validate\">\n");
      out.write("                                <label for=\"id\" class=\"black-text\">IDENTIFICACION</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">lock</i>\n");
      out.write("                                <input id=\"password2\" type=\"password\" class=\"validate\">\n");
      out.write("                                <label for=\"password2\" class=\"black-text\">PASSWORD</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">verified_user</i>\n");
      out.write("                                <input id=\"password3\" type=\"password\" class=\"validate\">\n");
      out.write("                                <label for=\"password3\" class=\"black-text\">CONFIRMA PASSWORD</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field col s12\">\n");
      out.write("                                <i class=\"material-icons prefix\">contact_mail</i>\n");
      out.write("                                <input id=\"email2\" type=\"email\" class=\"validate\">\n");
      out.write("                                <label for=\"email2\" class=\"black-text\">E-MAIL</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer red darken-3\">\n");
      out.write("                <a href=\"#!\" class=\"modal-close waves-effect waves-black btn-flat\">ACEPTAR</a>\n");
      out.write("                <a href=\"#!\" class=\"modal-close waves-effect waves-black btn-flat\">CANCELAR</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("<!PARALLAZ>      \n");
      out.write("        <div class=\"parallax-container\">\n");
      out.write("            <div class=\"parallax\"><img src=\"images/car-4.jpg\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section red darken-3\">\n");
      out.write("            <div class=\"row container\">\n");
      out.write("                <h2 class=\"header\">VENTAS DE CARROS</h2>\n");
      out.write("                <p class=\"grey-text text-darken-3 lighten-3\"><h3>En esta plataforma podras encontrar los mejores carros, al precio que deseeas, registrate y busca todos los modelos que tenemos disponibles para ti.</h3></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"parallax-container\">\n");
      out.write("            <div class=\"parallax\"><img src=\"images/car-17.jpg\"></div>\n");
      out.write("        </div>\n");
      out.write("             \n");
      out.write("<!FOOTER>       \n");
      out.write("        <footer class=\"red darken-3\" class=\"page-footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col l6 s12\">\n");
      out.write("                        <h3 class=\"white-text\">NOSOTROS</h3>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\"><h5 class=\"white-text\">Si tienes alguna duda de nuestra plataforma, puedes contactarte con alguno de los siguientes empleados.</h5></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col l4 offset-l2 s12\">\n");
      out.write("                        <h5 class=\"white-text\">EMPLEADOS</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal3\">Manuela</a></li>\n");
      out.write("                            <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal4\">Pablo</a></li>\n");
      out.write("                            <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal5\">Alejo</a></li>\n");
      out.write("                            <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal6\">Escobar</a></li>\n");
      out.write("                            <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal7\">Joiner</a></li>\n");
      out.write("                            <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal8\">Daniel</a></li>\n");
      out.write("                            <li><a class=\"waves-effect black btn modal-trigger\" href=\"#modal9\">Cristian</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    © 2019 Copyright Text\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <div id=\"modal3\" class=\"modal red darken-3\">\n");
      out.write("            <img class=\"materialboxed\" width=\"600\" src=\"images/manuela.png\">                \n");
      out.write("        </div>\n");
      out.write("        <div id=\"modal4\" class=\"modal red darken-3\">\n");
      out.write("            <img class=\"materialboxed\" width=\"600\" src=\"images/pablo.png\">         \n");
      out.write("        </div>\n");
      out.write("        <div id=\"modal5\" class=\"modal red darken-3\">\n");
      out.write("            <img class=\"materialboxed\" width=\"600\" src=\"images/alejo.png\">          \n");
      out.write("        </div>\n");
      out.write("        <div id=\"modal6\" class=\"modal red darken-3\">\n");
      out.write("            <img class=\"materialboxed\" width=\"600\" src=\"images/escobar.png\">          \n");
      out.write("        </div>\n");
      out.write("        <div id=\"modal7\" class=\"modal red darken-3\">\n");
      out.write("            <img class=\"materialboxed\" width=\"600\" src=\"images/joiner.png\">         \n");
      out.write("        </div>\n");
      out.write("        <div id=\"modal8\" class=\"modal red darken-3\">\n");
      out.write("            <img class=\"materialboxed\" width=\"600\" src=\"images/burba.png\">          \n");
      out.write("        </div>\n");
      out.write("        <div id=\"modal9\" class=\"modal red darken-3\">\n");
      out.write("            <img class=\"materialboxed\" width=\"600\" src=\"images/henao.png\">          \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("<!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("      <script>$(document).ready(function(){$('.modal').modal();});</script>\n");
      out.write("      <script>$(document).ready(function (){$('.parallax').parallax();});</script>\n");
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
