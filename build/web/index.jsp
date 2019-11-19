<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Básico -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Metas para móviles -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <title>Inicio</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <!-- Style CSS -->
        <link rel="stylesheet" href="resources/css/style.css">
        <!-- Responsive CSS -->
        <link rel="stylesheet" href="resources/css/responsive.css">
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="resources/css/jquery.mCustomScrollbar.min.css">
    </head>
    <!-- body -->
    <body class="main-layout">
        <!-- loader  -->
        <div class="loader_bg">
            <div class="loader"><img src="resources/images/loading.gif" alt="#" /></div>
        </div>
        <!-- end loader -->
        <!-- header -->
        <header>
            <!-- header inner -->
            <div class="header">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                            <div class="full">
                                <div class="center-desk">
                                    <div class="logo">
                                        <a href="index.jsp">TextStore</a>
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
                                            <a class="nav-link" href="#ProductsH">Nuestros productos</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#">Ver mi carrito</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="#Login">Iniciar sesión</a>
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
                            <h1>El mejor sitio.<br>DIVIERTETE</h1>
                            <span>Crea tu propia aventura</span>
                            <p>Estamos comprometidos con ofrecer el mejor servicio y precios accesibles para nuestros clientes, buscamos expandirnos para conseguir muchas más licencias.</p>
                            <a href="#Login">Iniciar</a>
                        </div>
                    </div>
                    <div class="col-md-7">
                        <div class="text-img">
                            <figure><img src="resources/images/img.png"/></figure>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end banner -->
        <!-- Products  -->
        <div id="ProductsH" class="productsH">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="titlepage">
                            <h2>Nuevos productos</h2>
                            <p>Lorem ipsum dolor sittem ametamngcing elit, per sed do eiusmoad <br>
                                teimpor sittem elit inuning ut sed.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <!-- Modal prueba -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog modal-dialog-centered" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h3 class="modal-title" id="exampleModalLabel">The Outer Worlds - $500</h3>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        <img src="resources/images/01.png" alt="#" />
                                        <p>Eres Milo y Lola, los mejores amigos que han fallecido recientemente y que de repente se encuentran mirando a la eternidad en el infierno. Pero hay un vacío legal: superen a Satán y les permitirá volver a la Tierra.</p>
                                    </div>
                                    <div class="modal-footer">
                                        <input class="contactus" type="number">
                                        <button type="button" class="btnBlack">Agregar al carrito</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Fin modal prueba -->
                        <div class="products-box">
                            <img src="resources/images/01.png" alt="#" />
                            <h3>Afterparty</h3>
                            <button type="button" class="btnBlack" data-toggle="modal" data-target="#exampleModal">Ver información</button>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img src="resources/images/02.png" alt="#" />
                            <h3>The Outer Worlds</h3>
                            <button type="button" class="btnBlack">Ver información</button>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img src="resources/images/03.png" alt="#" />
                            <h3>ReadySet Heroes</h3>
                            <button type="button" class="btnBlack">Ver información</button>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img src="resources/images/04.png" alt="#" />
                            <h3>Ruiner</h3>
                            <button type="button" class="btnBlack">Ver información</button>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img src="resources/images/05.png" alt="#" />
                            <h3>Control</h3>
                            <button type="button" class="btnBlack">Ver información</button>
                        </div>
                    </div>
                    <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                        <div class="products-box">
                            <img src="resources/images/06.png" alt="#" />
                            <h3>Cyberpunk 2077</h3>
                            <button type="button" class="btnBlack">Ver información</button>
                        </div>
                    </div>
                    <a class="read_more btnBlack" href="#">Read More</a>
                </div>
            </div>
        </div>
        <!-- end Products -->
        <!-- Login - Register -->
        <div id="Login" class="login">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="titlepage">
                            <h2>Unete a nuestra comunidad</h2><br><br>
                            <span>Millones de jugadores alrededor del mundo.</span>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div id="login" class="col-md-6">
                            <form class="main_form" method="POST" action="./UserController">
                                <div class="row">
                                    <div class="col-sm-12 main_title">
                                        <span>Iniciar sesión</span>
                                        <i><img id="icon_gamer" src="resources/images/icons/gamer.png" alt="#"></i>
                                    </div>
                                    <div class="col-sm-12">
                                        <label>Usuario</label>
                                        <input class="contactus" type="text" name="userI">
                                    </div>
                                    <div class="col-sm-12">
                                        <label>Contraseña</label>
                                        <input class="contactus" type="password" name="passwordI">
                                    </div>
                                    <div class="col-sm-12">
                                        <button class="btnBlack" value="Login" name="action">Ingresar</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div id="registro" class="col-md-6">
                            <form class="main_form" method="POST" action="./UserController">
                                <div class="row">
                                    <div class="col-sm-12 main_title">
                                        <span>Registro</span>
                                        <i><img id="icon_gamer" src="resources/images/icons/start.png" alt="#"></i>
                                    </div>
                                    <div class="col-sm-12">
                                        <label>Ingrese un usuario</label>
                                        <input class="contactus" type="text" name="userR">
                                    </div>
                                    <div class="col-sm-12">
                                        <label>Correo electrónico</label>
                                        <input class="contactus" type="text" name="emailR">
                                    </div>
                                    <div class="col-sm-12">
                                        <label>Contraseña</label>
                                        <input class="contactus" type="password" name="passwordR">
                                    </div>
                                    <div class="col-sm-12">
                                        <button class="btnBlack" value="Register" name="action">Registrar</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end Login - Register -->
        <!--  footer -->
        <footer>
            <div class="footer">
                <div class="container">
                    <div class="row">
                        <div class="col-md-10 offset-md-1">
                            <div class="cont">
                                <h3>Contactanos</h3>
                                <span>Te dejamos la información para que puedas hacernos llegar tus opiniones.</span>
                                <p>sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, 
                                    quissed do eiusmod tempor incididunt ut labore et dolore 
                                    magna aliqua. Ut enim ad minim veniam, quis  
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
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

