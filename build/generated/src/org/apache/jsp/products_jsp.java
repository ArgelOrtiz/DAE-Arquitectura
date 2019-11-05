package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Productos</title>\n");
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
      out.write("                            <span>Aquí puedes modificar nuestros productos</span>\n");
      out.write("                            <img id=\"level_up\" src=\"resources/images/level_up.png\" alt=\"#\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-7\">\n");
      out.write("                        <div id=\"Products\" class=\"products\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div id=\"form-products\">\n");
      out.write("                                    <form class=\"main_form\" method=\"POST\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-12 main_title\">\n");
      out.write("                                                <span>Producto</span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-12\">\n");
      out.write("                                                <label>Identificador</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"id\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-12\">\n");
      out.write("                                                <label>Imagen del producto</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"file\" name=\"ruta_imagen\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Nombre del producto</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"nombre_producto\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Clave del departamento</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"departamento\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-12\">\n");
      out.write("                                                <label>Descripción dle producto</label>\n");
      out.write("                                                <input class=\"textarea\" type=\"text\" name=\"descripcion_producto\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Precio unitario</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"number\" name=\"costo_unidad\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <label>Existencia</label>\n");
      out.write("                                                <input class=\"contactus\" type=\"number\" name=\"existencia\">\n");
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
      out.write("        <!-- Tabla productos -->\n");
      out.write("        <div id=\"ProductsT\" class=\"productsT\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"titlepage\">\n");
      out.write("                            <h2>Nuestros productos</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                        <div class=\"products-box\">\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\n");
      out.write("                            <img src=\"resources/images/01.png\" alt=\"#\" />\n");
      out.write("                            <h3>Afterparty</h3>\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                        <div class=\"products-box\">\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\n");
      out.write("                            <img src=\"resources/images/02.png\" alt=\"#\" />\n");
      out.write("                            <h3>The Outer Worlds</h3>\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                        <div class=\"products-box\">\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\n");
      out.write("                            <img src=\"resources/images/03.png\" alt=\"#\" />\n");
      out.write("                            <h3>ReadySet Heroes</h3>\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                        <div class=\"products-box\">\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\n");
      out.write("                            <img src=\"resources/images/04.png\" alt=\"#\" />\n");
      out.write("                            <h3>Ruiner</h3>\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                        <div class=\"products-box\">\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\n");
      out.write("                            <img src=\"resources/images/05.png\" alt=\"#\" />\n");
      out.write("                            <h3>Control</h3>\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                        <div class=\"products-box\">\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\n");
      out.write("                            <img src=\"resources/images/06.png\" alt=\"#\" />\n");
      out.write("                            <h3>Cyberpunk 2077</h3>\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end tabla productos -->\n");
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
