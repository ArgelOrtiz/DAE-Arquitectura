package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import app.models.Product;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <title>Productos</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/responsive.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"main-layout\">\r\n");
      out.write("        ");

            HttpSession sesion = request.getSession();
            if(sesion.getAttribute("user") != null && sesion.getAttribute("privilegio") != null){
                String user = sesion.getAttribute("user").toString();
                String privilegio = sesion.getAttribute("privilegio").toString();
            } else {
                out.print("<script>location.replace('index.jsp');</script>");
            }
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- loader  -->\r\n");
      out.write("        <div class=\"loader_bg\">\r\n");
      out.write("            <div class=\"loader\"><img src=\"resources/images/loading.gif\" alt=\"#\" /></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end loader -->\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <header>\r\n");
      out.write("            <!-- header inner -->\r\n");
      out.write("            <div id=\"header\" class=\"header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section\">\r\n");
      out.write("                            <div class=\"full\">\r\n");
      out.write("                                <div class=\"center-desk\">\r\n");
      out.write("                                    <div class=\"logo\">\r\n");
      out.write("                                        <a href=\"index.html\"><img src=\"resources/images/logo.png\" alt=\"#\" /></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xl-9 col-lg-9 col-md-9 col-sm-9\">\r\n");
      out.write("                            <nav class=\"navigation navbar navbar-expand-md navbar-dark \">\r\n");
      out.write("                                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample04\" aria-controls=\"navbarsExample04\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <div class=\"collapse navbar-collapse\" id=\"navbarsExample04\">\r\n");
      out.write("                                    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                                        <li class=\"nav-item active\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"#\">Inicio</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"#service\">Nuestros productos</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"#\">Ver mi carrito</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"index.jsp?cerrar=true\">Cerrar sesión</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- end header inner -->\r\n");
      out.write("        <!-- end header -->\r\n");
      out.write("        <!-- banner -->\r\n");
      out.write("        <section class=\"banner_main\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row d_flex\">\r\n");
      out.write("                    <div class=\"col-md-5\">\r\n");
      out.write("                        <div class=\"text-bg\">\r\n");
      out.write("                            <h1>Bienvenido</h1>\r\n");
      out.write("                            <span>Aquí puedes modificar nuestros productos</span>\r\n");
      out.write("                            <img id=\"level_up\" src=\"resources/images/level_up.png\" alt=\"#\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-7\">\r\n");
      out.write("                        <div id=\"Products\" class=\"products\">\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <div id=\"form-products\">\r\n");
      out.write("                                    <form class=\"main_form\" method=\"POST\" action=\"./ProductController\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-sm-12 main_title\">\r\n");
      out.write("                                                <span>Producto</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-12\">\r\n");
      out.write("                                                <label>Identificador</label>\r\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"id_product\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${infoProduct.getIdProduct()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-12\">\r\n");
      out.write("                                                <label>Imagen del producto</label>\r\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"image_path\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${infoProduct.getImagePath()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6\">\r\n");
      out.write("                                                <label>Nombre del producto</label>\r\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"product_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${infoProduct.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6\">\r\n");
      out.write("                                                <label>Clave del departamento</label>\r\n");
      out.write("                                                <input class=\"contactus\" type=\"text\" name=\"departament\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${infoProduct.getDepartament()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-12\">\r\n");
      out.write("                                                <label>Descripción del producto</label>\r\n");
      out.write("                                                <input class=\"textarea\" type=\"text\" name=\"description\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${infoProduct.getInformation()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6\">\r\n");
      out.write("                                                <label>Precio unitario</label>\r\n");
      out.write("                                                <input class=\"contactus\" type=\"number\" name=\"unitCost\" step=\"any\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${infoProduct.getUnitCost()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6\">\r\n");
      out.write("                                                <label>Existencia</label>\r\n");
      out.write("                                                <input class=\"contactus\" type=\"number\" name=\"stock\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${infoProduct.getStock()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-12\">\r\n");
      out.write("                                                <button id=\"btnBuscar\" class=\"btnBlack\" value=\"ReadP\" name=\"actionP\">Buscar</button>\r\n");
      out.write("                                                <button id=\"btnInsertar\" class=\"btnBlack\" value=\"CreateP\" name=\"actionP\">Insertar</button>\r\n");
      out.write("                                                <button id=\"btnModificar\" class=\"btnBlack\" value=\"UpdateP\" name=\"actionP\">Modificar</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- end banner -->\r\n");
      out.write("        <!-- Productos -->\r\n");
      out.write("        <div id=\"ProductsT\" class=\"productsT\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"titlepage\">\r\n");
      out.write("                            <h2>Nuestros productos</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    ");
 
                        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAE-ArquitecturaPU");
                        EntityManager em = emf.createEntityManager();
                        List<Product> products = em.createQuery("SELECT p FROM Product p").getResultList();
                    
      out.write("\r\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("item");
      _jspx_th_c_forEach_0.setItems(products);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\r\n");
            out.write("                        <div class=\"products-box\">\r\n");
            out.write("                            <form method=\"POST\" action=\"ProductDelete\">\r\n");
            out.write("                                <input type=\"hidden\" name=\"idTabla\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getIdProduct()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("                                <button class=\"btn btn-outline-danger btn-sm\" name=\"btnEliminar\">\r\n");
            out.write("                                    <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\"/>\r\n");
            out.write("                                </button>\r\n");
            out.write("                            </form>\r\n");
            out.write("                            \r\n");
            out.write("                            <img src=\"resources/images/01.png\" alt=\"#\" />\r\n");
            out.write("                            <h3>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h3>\r\n");
            out.write("                            <form method=\"POST\" action=\"ProductInformation\">\r\n");
            out.write("                                <input type=\"hidden\" name=\"idTablaP\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getIdProduct()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("                                <a href=\"#header\"><button class=\"btnBlack\" href=\"#header\" name=\"btnInformacion\">Ver información</button></a>\r\n");
            out.write("                            </form>\r\n");
            out.write("                            \r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\r\n");
      out.write("                        <div class=\"products-box\">\r\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\r\n");
      out.write("                            <img src=\"resources/images/01.png\" alt=\"#\" />\r\n");
      out.write("                            <h3>Afterparty</h3>\r\n");
      out.write("                            <a href=\"#header\"><button class=\"btnBlack\" href=\"#header\">Ver información</button></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\r\n");
      out.write("                        <div class=\"products-box\">\r\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\r\n");
      out.write("                            <img src=\"resources/images/02.png\" alt=\"#\" />\r\n");
      out.write("                            <h3>The Outer Worlds</h3>\r\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\r\n");
      out.write("                        <div class=\"products-box\">\r\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\r\n");
      out.write("                            <img src=\"resources/images/03.png\" alt=\"#\" />\r\n");
      out.write("                            <h3>ReadySet Heroes</h3>\r\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\r\n");
      out.write("                        <div class=\"products-box\">\r\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\r\n");
      out.write("                            <img src=\"resources/images/04.png\" alt=\"#\" />\r\n");
      out.write("                            <h3>Ruiner</h3>\r\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\r\n");
      out.write("                        <div class=\"products-box\">\r\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\r\n");
      out.write("                            <img src=\"resources/images/05.png\" alt=\"#\" />\r\n");
      out.write("                            <h3>Control</h3>\r\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\r\n");
      out.write("                        <div class=\"products-box\">\r\n");
      out.write("                            <img class=\"btnEliminar\" src=\"resources/images/icons/boton-eliminar.png\" alt=\"#\" />\r\n");
      out.write("                            <img src=\"resources/images/06.png\" alt=\"#\" />\r\n");
      out.write("                            <h3>Cyberpunk 2077</h3>\r\n");
      out.write("                            <a type=\"button\" class=\"btnBlack\" href=\"#header\">Ver información</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end productos -->\r\n");
      out.write("        <!--  footer -->\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <p>© 2019 Todos los derechos reservados.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- end footer -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Javascript files-->\r\n");
      out.write("        <script src=\"resources/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/jquery-3.0.0.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/plugin.js\"></script>\r\n");
      out.write("        <!-- sidebar -->\r\n");
      out.write("        <script src=\"resources/js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/custom.js\"></script>\r\n");
      out.write("        <script src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
