<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <title>Pedidos</title>
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/style.css">
        <link rel="stylesheet" href="resources/css/responsive.css">
        <link rel="stylesheet" href="resources/css/jquery.mCustomScrollbar.min.css">

    </head>
    <body class="main-layout">
        <!-- loader -->
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
                                            <a class="nav-link" href="#">Productos</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Usuarios</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Cerrar sesión</a>
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
                    <div class="col-lg-6">
                        <div class="text-bg">
                            <h1>Bienvenido</h1>
                            <span>Aquí puedes revisar todos los pedidos</span>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="text-bg">
                            <img id="users" src="resources/images/box.png" alt="#">
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end banner -->

        <!-- Table users -->
        <div id="OrdersT" class="orders">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="titlepage">
                            <h2>Ordenes</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <table id="orders-table" class="table table-striped table-dark">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Address</th>
                                <th>Postal code</th>
                                <th>User</th>
                                <th>Status</th>
                                <th>Subtotal</th>
                                <th>Total</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th>1</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th><img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" /></th>
                            </tr>
                            <tr>
                                <th>1</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th><img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" /></th>
                            </tr>
                            <tr>
                                <th>1</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th><img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" /></th>
                            </tr>
                            <tr>
                                <th>1</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th><img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" /></th>
                            </tr>
                            <tr>
                                <th>1</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th><img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" /></th>
                            </tr>
                            <tr>
                                <th>1</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th><img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" /></th>
                            </tr>
                            <tr>
                                <th>1</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th>Cell</th>
                                <th><img class="btnEliminar" src="resources/images/icons/boton-eliminar.png" alt="#" /></th>
                            </tr>
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
        <script>
            $(document).ready(function () {
                $('#orders-table').DataTable();
            });
        </script>
    </body>
</html>
