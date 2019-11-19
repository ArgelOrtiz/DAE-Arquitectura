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
    </head>
    <body class="main-layout">
        <%
            HttpSession sesion = request.getSession();
            if(sesion.getAttribute("user") != null && sesion.getAttribute("privilegio") != null){
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
                                        <a href="index.html">TextStore</a>
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
                                            <a class="nav-link" href="#">Ver mi carrito</a>
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
        <!-- banner -->
        <section class="banner_main" 
                 <% 
                    HttpSession sesionP = request.getSession();
                    String user = sesion.getAttribute("user").toString();
                    String privilegio = sesion.getAttribute("privilegio").toString();
                    
                    if(user != null && privilegio != null){
                        if(!privilegio.equals("Admin")){
                            out.print("hidden");
                        } else {
                            out.print("");
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
                                    <form class="main_form" method="POST" action="./ProductController" enctype="multipart/form-data">
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
                                                <input class="contactus" type="file" name="image_path" size="20" value="kjmnhmj">
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
                            <form method="POST" action="ProductDelete">
                                <input type="hidden" name="idTabla" value="${item.getIdProduct()}">
                                <button class="" name="btnEliminar">
                                    <img class="btnEliminar" src="resources/images/icons/boton-eliminar.png"/>
                                </button>
                            </form>
                            
                            <img src="resources/images/01.png" alt="#" />
                            <h3>${item.getName()}</h3>
                            <form method="POST" action="ProductInformation">
                                <input type="hidden" name="idTablaP" value="${item.getIdProduct()}">
                                <a href="#header"><button class="btnBlack" href="#header" name="btnInformacion">Ver información</button></a>
                            </form>
                            
                        </div>
                    </div>
                    </c:forEach>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" />
                            <img src="resources/images/01.png" alt="#" />
                            <h3>Afterparty</h3>
                            <a href="#header"><button class="btnBlack" href="#header">Ver información</button></a>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" />
                            <img src="resources/images/02.png" alt="#" />
                            <h3>The Outer Worlds</h3>
                            <a type="button" class="btnBlack" href="#header">Ver información</a>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" />
                            <img src="resources/images/03.png" alt="#" />
                            <h3>ReadySet Heroes</h3>
                            <a type="button" class="btnBlack" href="#header">Ver información</a>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" />
                            <img src="resources/images/04.png" alt="#" />
                            <h3>Ruiner</h3>
                            <a type="button" class="btnBlack" href="#header">Ver información</a>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" />
                            <img src="resources/images/05.png" alt="#" />
                            <h3>Control</h3>
                            <a type="button" class="btnBlack" href="#header">Ver información</a>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" />
                            <img src="resources/images/06.png" alt="#" />
                            <h3>Cyberpunk 2077</h3>
                            <a type="button" class="btnBlack" href="#header">Ver información</a>
                        </div>
                    </div>
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
    </body>
</html>
