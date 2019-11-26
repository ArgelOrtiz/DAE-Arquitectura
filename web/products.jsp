<%@page import="java.util.List"%>
<%@page import="app.models.Product"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <title>Productos</title>
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/style.css">
        <link rel="stylesheet" href="resources/css/responsive.css">
        <link rel="stylesheet" href="resources/css/jquery.mCustomScrollbar.min.css">
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    </head>
    <body class="main-layout">
        <%
            HttpSession sesion = request.getSession();
            if (sesion.getAttribute("user") != null && sesion.getAttribute("privilegio") != null) {
                String user = sesion.getAttribute("user").toString();
                String privilegio = sesion.getAttribute("privilegio").toString();
            } else {
                out.print("<script>location.replace('index.jsp');</script>");
            }
        %>

        <!-- loader  -->
        <div class="loader_bg">
            <div class="loader"><img src="resources/images/loading.gif" alt="#" /></div>
        </div>
        <!-- end loader -->
        <!-- header -->
        <header>
            <!-- header inner -->
            <div id="header" class="header">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                            <div class="full">
                                <div class="center-desk">
                                    <div class="logo">
                                        <a href="index.html"><img src="resources/images/logo.png" alt="#" /></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                            <nav class="navigation navbar navbar-expand-md navbar-dark ">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                                    <span class="navbar-toggler-icon"></span>
                                </button>
                                <div class="collapse navbar-collapse" id="navbarsExample04">
                                    <ul class="navbar-nav mr-auto">
                                        <li class="nav-item active">
                                            <a class="nav-link" href="#">Inicio</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#service">Nuestros productos</a>
                                        </li>
                                        <li class="nav-item">
                                            <a id="showModal" class="nav-link" href="#">Ver mi carrito</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="users.jsp">Perfil</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="index.jsp?cerrar=true">Cerrar sesión</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!-- end header inner -->
        <!-- end header -->
        <!-- start modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Carrito de compras</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body"></div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary">Finalizar compra</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- end modal -->
        <!-- banner -->
        <section class="banner_main" 
                 <%
                     HttpSession sesionP = request.getSession();
                     String user = sesion.getAttribute("user").toString();
                     String privilegio = sesion.getAttribute("privilegio").toString();
                     String controlador = "";

                     if (user != null && privilegio != null) {
                         if (!privilegio.equals("Admin")) {
                             out.print("hidden");
                             controlador = "";
                         } else {
                             out.print("");
                             controlador = "ProductInformation";
                         }
                     } else {
                         out.print("<script>location.replace('index.jsp');</script>");
                     }
                 %>

                 >
            <div class="container">
                <div class="row d_flex">
                    <div class="col-md-5">
                        <div class="text-bg">
                            <h1>Bienvenido</h1>
                            <span>Aquí puedes modificar nuestros productos</span>
                            <img id="level_up" src="resources/images/level_up.png" alt="#">
                        </div>
                    </div>
                    <div class="col-md-7">
                        <div id="Products" class="products">
                            <div class="container">
                                <div id="form-products">
                                    <form class="main_form" method="POST" action="./ProductController">
                                        <div class="row">
                                            <div class="col-sm-12 main_title">
                                                <span>Producto</span>
                                            </div>
                                            <div class="col-sm-12">
                                                <label>Identificador</label>
                                                <input class="contactus" type="text" name="id_product" value="${infoProduct.getIdProduct()}">
                                            </div>
                                            <div class="col-sm-12">
                                                <label>Imagen del producto</label>
                                                <input class="contactus" type="text" name="image_path" size="20" value="">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Nombre del producto</label>
                                                <input class="contactus" type="text" name="product_name" value="${infoProduct.getName()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Clave del departamento</label>
                                                <input class="contactus" type="text" name="departament" value="${infoProduct.getDepartament()}">
                                            </div>
                                            <div class="col-sm-12">
                                                <label>Descripción del producto</label>
                                                <input class="textarea" type="text" name="description" value="${infoProduct.getInformation()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Precio unitario</label>
                                                <input class="contactus" type="number" name="unitCost" step="any" value="${infoProduct.getUnitCost()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Existencia</label>
                                                <input class="contactus" type="number" name="stock" value="${infoProduct.getStock()}">
                                            </div>
                                            <div class="col-sm-12">
                                                <button id="btnBuscar" class="btnBlack" value="ReadP" name="actionP">Buscar</button>
                                                <button id="btnInsertar" class="btnBlack" value="CreateP" name="actionP">Insertar</button>
                                                <button id="btnModificar" class="btnBlack" value="UpdateP" name="actionP">Modificar</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end banner -->
        <!-- Productos -->
        <div id="ProductsT" class="productsT">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="titlepage">
                            <h2>Nuestros productos</h2>
                        </div>
                    </div>
                </div>
                <div class="row">

                    <%
                        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAE-ArquitecturaPU");
                        EntityManager em = emf.createEntityManager();
                        List<Product> products = em.createQuery("SELECT p FROM Product p").getResultList();
                    %>
                    <c:forEach var="item" items="<%=products%>">
                        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                            <div class="products-box">
                                <% if (privilegio.equals("Admin")) { %>
                                <form method="POST" action="ProductDelete">
                                    <input type="hidden" name="idTabla" value="${item.getIdProduct()}">
                                    <button class="" name="btnEliminar">
                                        <img class="btnEliminar" src="resources/images/icons/boton-eliminar.png"/>
                                    </button>
                                </form>
                                <% }%>
                                <h1>$ ${item.getUnitCost()}</h1>
                                <img src="resources/images/01.png" alt="#" />
                                <h3>${item.getName()}</h3>
                                <p>${item.getInformation()}</p>
                                <form method="POST" action="<%=controlador%>">
                                    <input class="idTablaP" type="hidden" name="idTablaP" value="${item.getIdProduct()}">
                                    <input class="idNameP" type="hidden" name="idTablaP" value="${item.getName()}">
                                    <% if (privilegio.equals("Admin")) { %>
                                    <a href="#header"><button class="btnBlack" name="btnInformacion">Ver información</button></a>
                                    <% } else { %>
                                    <input type="number" class="unidades">
                                    <input id="agregar" type="button" class="btnBlack agregar" data-toggle="modal" data-target="#exampleModalCenter" name="btnComprar" value="Comprar">  
                                    <% }%>
                                </form>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- end productos -->
        <!--  footer -->
        <footer>
            <div class="footer">
                <div class="copyright">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <p>© 2019 Todos los derechos reservados.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- end footer -->

        <!-- Javascript files-->
        <script src="resources/js/jquery.min.js"></script>
        <script src="resources/js/popper.min.js"></script>
        <script src="resources/js/bootstrap.bundle.min.js"></script>
        <script src="resources/js/jquery-3.0.0.min.js"></script>
        <script src="resources/js/plugin.js"></script>
        <!-- sidebar -->
        <script src="resources/js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="resources/js/custom.js"></script>
        <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
        <!-- propios -->
        <script src="resources/js/principal.js"></script>
    </body>
</html>
