package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("        <title>Usuarios</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"main-layout\">\n");
      out.write("        <!-- loader  -->\n");
      out.write("        <div class=\"loader_bg\">\n");
      out.write("            <div class=\"loader\"><img src=\"resources/images/loading.gif\" alt=\"#\" /></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end loader -->\n");
      out.write("        <!-- header -->\n");
      out.write("        <header>\n");
      out.write("            <!-- header inner -->\n");
      out.write("            <div id=\"header\" class=\"header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section\">\n");
      out.write("                            <div class=\"full\">\n");
      out.write("                                <div class=\"center-desk\">\n");
      out.write("                                    <div class=\"logo\">\n");
      out.write("                                        <a href=\"index.html\"><img src=\"resources/images/logo.png\" alt=\"#\" /></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-9 col-lg-9 col-md-9 col-sm-9\">\n");
      out.write("                            <nav class=\"navigation navbar navbar-expand-md navbar-dark \">\n");
      out.write("                                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample04\" aria-controls=\"navbarsExample04\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"collapse navbar-collapse\" id=\"navbarsExample04\">\n");
      out.write("                                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                                        <li class=\"nav-item active\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"#\">Inicio</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"#service\">Nuestros productos</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"#\">Ver mi carrito</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"#contact\">Iniciar sesión</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- end header inner -->\n");
      out.write("        <!-- end header -->\n");
      out.write("        <!-- banner -->\n");
      out.write("        <section class=\"banner_main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row d_flex\">\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"text-bg\">\n");
      out.write("                            <h1>Bienvenido</h1>\n");
      out.write("                            <span>Aquí puedes modificar a nuestros usuarios</span>\n");
      out.write("                            <img id=\"users\" src=\"resources/images/users.png\" alt=\"#\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-7\">\n");
      out.write("                        <div id=\"Users\" class=\"users\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div id=\"form-users\">\n");
      out.write("                                    <form class=\"main_form\" method=\"POST\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-12 main_title\">\n");
      out.write("                                                <span>Usuario</span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Identificador</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"id\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Usuario</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"user\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Primer apellido</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"f_name\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Segundo apellido</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"l_name\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Contraseña</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"password\" name=\"password\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Correo electrónico</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"email\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Teléfono celular</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"number\" name=\"cellphone\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Tipo de usuario</label>\n");
      out.write("                                                <select class=\"contactus\">\n");
      out.write("                                                    <option >Administrador</option>\n");
      out.write("                                                    <option >Trabajador</option>\n");
      out.write("                                                    <option >Cliente</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-12\">\n");
      out.write("                                                <button id=\"btnBuscar\" class=\"btnBlack\">Buscar</button>\n");
      out.write("                                                <button id=\"btnInsertar\" class=\"btnBlack\">Insertar</button>\n");
      out.write("                                                <button id=\"btnModificar\" class=\"btnBlack\">Modificar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- end banner -->\n");
      out.write("        <!-- Table users -->\n");
      out.write("        <div id=\"UsersT\" class=\"users\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"titlepage\">\n");
      out.write("                            <h2>Tu carrito de compras</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <table class=\"table table-striped table-dark\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>#</th>\n");
      out.write("                                <th>Heading</th>\n");
      out.write("                                <th>Heading</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>1</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>1</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>1</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>1</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>1</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                                <th>Cell</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end table users -->\n");
      out.write("\n");
      out.write("        <!-- Javascript files-->\n");
      out.write("        <script src=\"resources/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/jquery-3.0.0.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/plugin.js\"></script>\n");
      out.write("        <!-- sidebar -->\n");
      out.write("        <script src=\"resources/js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/custom.js\"></script>\n");
      out.write("        <script src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\n");
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
