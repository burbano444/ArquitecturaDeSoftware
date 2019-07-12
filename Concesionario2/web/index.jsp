<%-- 
    Document   : index
    Created on : 12/07/2019, 02:57:23 AM
    Author     : burbano444
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="icon" type="image/png" href="images/logo2.png" />
        <title> CONCESIONARIO FOURWEELS </title>
    </head>

    <body>
<!BARRA DE NAVEGACION>        
        <nav class="red darken-3">
            <div class="nav-wrapper" >
                <a class="brand-logo black-text">FOURWHEELS</a>
                <a class="brand-logo center"><img class="center" class="materialboxed" width="65" src="images/logo2.png"></a> 
                <ul class="right hide-on-med-and-down">
                    <li><a class="waves-effect black btn modal-trigger" href="#modal1" >INGRESAR<i class="material-icons right">account_balance</i></a></li>
                    <li><a class="waves-effect black btn modal-trigger" href="#modal2">REGISTRARME <i class="material-icons right">add_circle_outline</i></a></li>
                </ul>
            </div>
        </nav>

<!FORMULARIO INGRESO>
        <!-- Modal Structure -->
        <div id="modal1" class="modal red darken-3">
            <div class="modal-content">
                <div class="row">
                  <form class="col s12">
                    <div class="row">
                        <div class="input-field col s6">
                            <i class="material-icons prefix">contact_mail</i>
                            <input id="email1" type="email" class="validate">
                            <label for="email1" class="black-text">E-MAIL</label>
                        </div>
                        <div class="input-field col s6">
                            <i class="material-icons prefix">lock</i>
                            <input id="password1" type="password" class="validate">
                            <label for="password1" class="black-text">PASSWORD</label>
                        </div>
                    </div>
                  </form>
                </div>
            </div>
            <div class="modal-footer red darken-3">
                <a href="#!" class="modal-close waves-effect waves-black btn-flat">ACEPTAR</a>
                <a href="#!" class="modal-close waves-effect waves-black btn-flat">CANCELAR</a>
            </div>
        </div>
            
<!FORMULARIO REGISTRO>           
        <div id="modal2" class="modal red darken-3">
            <div class="modal-content">
                <div class="row">
                    <form class="col s12">
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">account_circle</i>
                                <input id="nombre" type="text" class="validate">
                                <label for="first_name" class="black-text">NOMBRE COMPLETO</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">assignment_ind</i>
                                <input id="id" type="number" class="validate">
                                <label for="id" class="black-text">IDENTIFICACION</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">lock</i>
                                <input id="password2" type="password" class="validate">
                                <label for="password2" class="black-text">PASSWORD</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">verified_user</i>
                                <input id="password3" type="password" class="validate">
                                <label for="password3" class="black-text">CONFIRMA PASSWORD</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">contact_mail</i>
                                <input id="email2" type="email" class="validate">
                                <label for="email2" class="black-text">E-MAIL</label>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer red darken-3">
                <a href="#!" class="modal-close waves-effect waves-black btn-flat">ACEPTAR</a>
                <a href="#!" class="modal-close waves-effect waves-black btn-flat">CANCELAR</a>
            </div>
        </div>
    
<!PARALLAZ>      
        <div class="parallax-container">
            <div class="parallax"><img src="images/car-4.jpg"></div>
        </div>
        <div class="section red darken-3">
            <div class="row container">
                <h2 class="header">VENTAS DE CARROS</h2>
                <p class="grey-text text-darken-3 lighten-3"><h3>En esta plataforma podras encontrar los mejores carros, al precio que deseeas, registrate y busca todos los modelos que tenemos disponibles para ti.</h3></p>
            </div>
        </div>
        <div class="parallax-container">
            <div class="parallax"><img src="images/car-17.jpg"></div>
        </div>
             
<!FOOTER>       
        <footer class="red darken-3" class="page-footer">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h3 class="white-text">NOSOTROS</h3>
                        <p class="grey-text text-lighten-4"><h5 class="white-text">Si tienes alguna duda de nuestra plataforma, puedes contactarte con alguno de los siguientes empleados.</h5></p>
                    </div>
                    <div class="col l4 offset-l2 s12">
                        <h5 class="white-text">EMPLEADOS</h5>
                        <ul>
                            <li><a class="waves-effect black btn modal-trigger" href="#modal3">Manuela</a></li>
                            <li><a class="waves-effect black btn modal-trigger" href="#modal4">Pablo</a></li>
                            <li><a class="waves-effect black btn modal-trigger" href="#modal5">Alejo</a></li>
                            <li><a class="waves-effect black btn modal-trigger" href="#modal6">Escobar</a></li>
                            <li><a class="waves-effect black btn modal-trigger" href="#modal7">Joiner</a></li>
                            <li><a class="waves-effect black btn modal-trigger" href="#modal8">Daniel</a></li>
                            <li><a class="waves-effect black btn modal-trigger" href="#modal9">Cristian</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    © 2019 Copyright Text
                </div>
            </div>
        </footer>

        <div id="modal3" class="modal red darken-3">
            <img class="materialboxed" width="600" src="images/manuela.png">                
        </div>
        <div id="modal4" class="modal red darken-3">
            <img class="materialboxed" width="600" src="images/pablo.png">         
        </div>
        <div id="modal5" class="modal red darken-3">
            <img class="materialboxed" width="600" src="images/alejo.png">          
        </div>
        <div id="modal6" class="modal red darken-3">
            <img class="materialboxed" width="600" src="images/escobar.png">          
        </div>
        <div id="modal7" class="modal red darken-3">
            <img class="materialboxed" width="600" src="images/joiner.png">         
        </div>
        <div id="modal8" class="modal red darken-3">
            <img class="materialboxed" width="600" src="images/burba.png">          
        </div>
        <div id="modal9" class="modal red darken-3">
            <img class="materialboxed" width="600" src="images/henao.png">          
        </div>

<!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
      <script>$(document).ready(function(){$('.modal').modal();});</script>
      <script>$(document).ready(function (){$('.parallax').parallax();});</script>
    </body>
</html>
