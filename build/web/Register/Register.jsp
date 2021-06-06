<%-- 
    Document   : Register
    Created on : 1 juin 2021, 17:54:46
    Author     : Blanco
--%>

<%
    if (session.getAttribute("id_personne") != null) {
        response.sendRedirect("./../index.jsp");
        return;
    }%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="${pageContext.request.contextPath}/Assets/Images/M3alem-icon.png">
        <title>S'inscrire</title>

        <!-- Style -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Register/Register.css" />

        <!-- Google font  -->
        <link href="https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">

        <!-- FontAwesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />

    </head>

    <script type="text/javascript">
        function f1() {
            var navbar = document.getElementById('nav');
            navbar.classList.toggle('show');
        }
    </script>

    <body class="background-image">
        <!-- HEADER BEGIN -->
        <header>
            <div class="toggle-btn" onclick="f1();">
                <span></span>
                <span></span>
                <span class="bottom-span"></span>
            </div>

            <div class="logo">
                <a href="${pageContext.request.contextPath}/index.jsp"><img class="header-logo" src="${pageContext.request.contextPath}/Assets/Images/M3alem-Logo.png" alt="M3alem Logo"></a>
            </div>
            <nav id="nav">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/index.jsp">Acceuil</a></li>
                    <li><a href="${pageContext.request.contextPath}/About/About.jsp">Qui sommes-nous ?</a></li>
                    <li><a href="${pageContext.request.contextPath}/Prestataires/Prestataires.jsp">Prestataires</a></li>
                    <li><a href="${pageContext.request.contextPath}/Login/Login.jsp" >Connexion</a></li>
                    <li><a href="${pageContext.request.contextPath}/Register/Register.jsp" id="active-tab">Inscription</a></li>
                </ul>
            </nav>
        </header>
        <!-- HEADER END -->



        <div class="register-container">
            <div class="register-header"><h2>Vous êtes un prestataire ?</h2>
                <h3>Inscrivez-vous afin que votre profil soit accessible via la fonctionnalité de recherche
                </h3>
            </div>


            <div class="register-form-hero">
  
                <form action="${pageContext.request.contextPath}/authentification" method="POST">
                    
                    <div class="register-form">
                        <p style="color: red;   text-align:center; border: 1px solid red; padding: 20px;  margin: 0 0 40px; font-weight: 100;">Les champs marqués d'un * sont obligatoires.</p>
                        <div class="input-form">
                            <label class="label-text" ><span style="color: red">*</span>  Nom de famille :</label>
                            <input type="text" name="nom">
                        </div>

                        <div class="input-form">
                            <label ><span style="color: red">*</span>  Prénom :</label>
                            <input type="text" name="prenom">
                        </div>

                        <div class="input-form">
                            <label ><span style="color: red">*</span> Date de naissance : </label>
                            <input type="date" name="datenaissance">

                        </div>

                        <div class="input-form">
                            <label ><span style="color: red">*</span>  Adresse :</label>
                            <textarea name="adresse" rows="3"></textarea>
                        </div>


                        <div class="input-form">
                            <label><span style="color: red">*</span>  Ville :</label>
                            <input type="text" name="ville" >
                        </div>

                        <div class="input-form">
                            <label><span style="color: red">*</span>  Téléphone :</label>
                            <input type="tel" name="tel">
                        </div>



                        <div class="input-form">
                            <label><span style="color: red">*</span>  Professions : </label>
                            <select name="professions" id="professions">
                                <option value="P01">Bricolage et Petits travaux</option>
                                <option value="P02">Plomberie</option>
                                <option value="P03">Peinture</option>
                                <option value="P04">Électricité</option>
                                <option value="P05">Menuiserie</option>
                                <option value="P06">Climatisation-Chauffage</option>
                                <option value="P07">Maçonnerie</option>
                                <option value="P08">Mécanique</option>
                                <option value="P09">Femmes de ménages</option>
                                <option value="P10">Jardinier</option>
                                <option value="P11">Entretien piscine</option>
                                <option value="P12">Réparation électroménager</option>
                                <option value="P13">Réparation matériels électroniques</option>
                                <option value="P14">Installation parabole</option>
                            </select>
                        </div>

                        <div  class="input-form">
                            <label> &nbsp;&nbsp; Années d'expérience :</label>
                            <select name="experience" id="experience">
                                <option value="Entre 1 et 3 ans">Entre 1 et 3 ans</option>
                                <option value="Entre 4 et 7 ans">Entre 4 et 7 ans</option>
                                <option value="Entre 7 et 10 ans">Entre 7 et 10 ans</option>
                                <option value="Plus de 10 ans">Plus de 10 ans</option>
                            </select>
                        </div>

                        <div  class="input-form">
                            <label> &nbsp;&nbsp; Biographie :</label>
                            <textarea name="bio"  rows="4" ></textarea>
                        </div>

                        <div  class="input-form">
                            <label> <span style="color: red">*</span>  Email :</label>
                            <input type="email" name="email" >
                        </div>

                        <div  class="input-form">
                            <label> <span style="color: red">*</span>  Mot de passe :</label>
                            <input type="password" name="password" >
                        </div>

                        <%
                            if (request.getAttribute("message") != null) {
                                out.print("<p style='color: red;   text-align:center; border: 1px solid red; padding: 20px;  margin: 20px 0 20px; font-weight: 100;'>" + request.getAttribute("message") + "</p>");
                            }
                          
                        %>

                        <div class="register-btn-div">
                            <button type="submit" name="operation" value="register" class="register-btn">S'INSCRIRE</button>
                        </div>


                    </div>
                </form>
            </div>
            <div class="login-div">
                <h2> Avez-vous déja un compte ? </h2>
                <a class="login-btn" href="${pageContext.request.contextPath}/Login/Login.jsp">Se connecter</a>
            </div>
        </div>








        <!-- FOOTER BEGIN -->
        <footer>
            <div class="footer-top">
                <div class="footer-top-items">
                    <h2>M3ALEM</h2>
                    <p>C'est une plateforme de mise en relation pour la réalisation de services ou d'aides entre particuliers ou professionels.</p>
                    <h2>SUIVEZ NOUS</h2>
                    <a class="fab fa-facebook-f social-icon" href="https://www.facebook.com/"></a>
                    <a class="fab fa-twitter social-icon" href="http://www.twitter.com/"></a>
                    <a class="fab fa-instagram social-icon" href="http://www.instagram.com/"></a>
                </div>
                <div class="footer-top-items">
                    <h2>LIENS UTILES</h2>
                    <ul>
                        <li><a href="${pageContext.request.contextPath}/index.jsp">Acceuil</a></li>
                        <li><a href="${pageContext.request.contextPath}/Prestataires/Prestataires.jsp">Prestataires</a></li>
                        <li><a href="${pageContext.request.contextPath}/About/About.jsp">Qui sommes nous?</a></li>
                        <li><a href="${pageContext.request.contextPath}/Contact/Contact.jsp">Contactez nous</a></li>
                    </ul>
                </div>
                <div class="footer-top-items">
                    <h2>RETROUVEZ-NOUS</h2>
                    <i class="fa fa-map-pin icon" aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;157 Bis Boulevard 9 Avril Palmier Casablanca Maroc</span>
                    <br>
                    <br>
                    <i class="fa fa-phone icon" aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 33 44 55</span>
                    <br>
                    <br>
                    <i class="fa fa-envelope icon" aria-hidden="true"></i><span>&nbsp;&nbsp;&nbsp;contact@m3alem.com</span>
                </div>
            </div>
            <div class="footer-bottom">
                © 2021 M3alem All rights reserved.
            </div>
        </footer>
        <!-- FOOTER END -->

    </body>
</html>