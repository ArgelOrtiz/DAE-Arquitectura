<%@page import="java.util.List"%>
<%@page import="app.models.User"%>
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
        <title>Usuarios</title>
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
                                            <a class="nav-link" href="products.jsp">Nuestros productos</a>
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
        <section class="banner_main">
            <div class="container">
                <div class="row d_flex">
                    <div class="col-md-5">
                        <div class="text-bg">
                            <h1>Bienvenido</h1>
                            <span>Aquí puedes modificar a nuestros usuarios</span>
                            <img id="users" src="resources/images/users.png" alt="#">
                        </div>
                    </div>
                    <div class="col-md-7">
                        <div id="Users" class="users">
                            <div class="container">
                                <div id="form-users">
                                    <form class="main_form" method="POST" action="./UserController">
                                        <div class="row">
                                            <div class="col-sm-12 main_title">
                                                <span>Usuario</span>
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Identificador</label>
                                                <input class="contactus" type="text" name="id_user" value="${infoUser.getIdUser()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Usuario</label>
                                                <input class="contactus" type="text" name="user" value="${infoUser.getNickname()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Primer apellido</label>
                                                <input class="contactus" type="text" name="f_name" value="${infoUser.getFirstName()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Segundo apellido</label>
                                                <input class="contactus" type="text" name="l_name" value="${infoUser.getLastName()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Contraseña</label>
                                                <input class="contactus" type="password" name="password">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Correo electrónico</label>
                                                <input class="contactus" type="text" name="email" value="${infoUser.getEmail()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Teléfono celular</label>
                                                <input class="contactus" type="number" name="cellphone" value="${infoUser.getCellphone()}">
                                            </div>
                                            <div class="col-sm-6">
                                                <label>Tipo de usuario</label>
                                                <select class="contactus" name="user_type">
                                                    <option value="Admin">Administrador</option>
                                                    <option value="Customer">Cliente</option>
                                                </select>
                                            </div>
                                            <div class="col-sm-12">
                                                <button id="btnBuscar" class="btnBlack" value="Read" name="action">Buscar</button>
                                                <button id="btnInsertar" class="btnBlack" value="Insert" name="action">Insertar</button>
                                                <button id="btnModificar" class="btnBlack" value="Update" name="action">Modificar</button>
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
        <!-- Table users -->
        <div id="UsersT" class="users" 
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
                <div class="row">
                    <div class="col-md-12">
                        <div class="titlepage">
                            <h2>Todos nuestros usuarios</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <table class="table table-striped table-dark">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>User</th>
                                <th>Tipo usuario</th>
                                <th>Nombre/s</th>
                                <th>Apellidos</th>
                                <th>Teléfono</th>
                                <th>Correo</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                                EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAE-ArquitecturaPU");
                                EntityManager em = emf.createEntityManager();
                                List<User> users = em.createQuery("SELECT u FROM User u").getResultList();
                            %>
                            <c:forEach var="item" items="<%=users%>">
                            <tr>
                                <th>${item.getIdUser()}</th>
                                <th>${item.getNickname()}</th>
                                <th>${item.getUserType()}</th>
                                <th>${item.getFirstName()}</th>
                                <th>${item.getLastName()}</th>
                                <th>${item.getCellphone()}</th>
                                <th>${item.getEmail()}</th>
                                <th>
                                    <form method="POST" action="UserDelete">
                                        <input type="hidden" name="idTabla" value="${item.getIdUser()}">
                                        <button class="btn btn-outline-danger btn-sm" name="btnEliminar">X</button>
                                    </form>
                                </th>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <!-- end table users -->
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
