<%-- 
    Document   : Profile
    Created on : 1 juin 2021, 22:14:53
    Author     : Blanco
--%>
<%
    if (session.getAttribute("nom") == null) {
        request.setAttribute("message", "Vous devez d'abord vous connecter avant d'essayer de rejoindre votre profil");
        response.sendRedirect("./../Login/Login.jsp");

    }%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="${pageContext.request.contextPath}/Assets/Images/M3alem-icon.png">
        <title>Profil</title>

        <!-- Style -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Profile/Profile.css">

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
                        <%
                            if (session.getAttribute("nom") != null) {%>
                    <li><a href="${pageContext.request.contextPath}/Profile/Profile.jsp" id="active-tab">Mon Profil</a></li>
                    <li>  <form method="POST" action="../auth">
                            <input type="submit" value="Se Deconnecter" name="operation" class="linkish" style=" background-color: transparent; border: 0; color: whitesmoke; cursor: pointer;
                                   display: inline;  outline: none;  font-weight: 100;  text-transform: uppercase; "/> </form></li>

                    <%   } else {%>
                    <li><a href="${pageContext.request.contextPath}/Login/Login.jsp">Connexion</a></li>
                    <li><a href="${pageContext.request.contextPath}/Register/Register.jsp">Inscription</a></li>
                        <% }                        %>

                </ul>
            </nav>
        </header>
        <!-- HEADER END -->





        <!-- CONTENT BEGIN -->


        <div class="crd-container">
            <div class="left-card">
                <img src="./../Assets/Images/pdp.png"> 
                <%                    out.print("<h2 style='text-transform: uppercase;'>" + session.getAttribute("nom") + " " + session.getAttribute("prenom") + "</h2>");
                    out.print("<p>" + session.getAttribute("age") + "</p>");
                %>

                <h2>PROFESSION</h2>
                <% out.print("<p>" + session.getAttribute("profession") + "</p>"); %>

                <h2>EXPERIENCE</h2>
                <% out.print("<p>" + session.getAttribute("experience") + "</p>"); %>

                <h2>A PROPOS</h2>
                <% out.print("<p>" + session.getAttribute("bio") + "</p>"); %>

                <h2>ADRESSE</h2>
                <% out.print("<p>" + session.getAttribute("adresse") + "</p>"); %>
                <% out.print("<p style='text-transform: capitalize;'>" + session.getAttribute("ville") + "</p>"); %>

                <h2>TELEPHONE</h2>
                <% out.print("<p>" + session.getAttribute("tel") + "</p>"); %>

                <h2>E-MAIL</h2>
                <% out.print("<p style='text-transform: uppercase;'>" + session.getAttribute("email") + "</p>"); %>
            </div>

            <form action="">    
                <div class="right-card">

                    <div class="row-card">
                        <div class="inside-row">
                            <label>Nom :</label> <br>
                            <input type="text" name="nom" value="<%out.print(request.getSession().getAttribute("nom"));%>">  
                        </div>
                        <div class="inside-row">
                            <label>Prenom :</label> <br>
                            <input type="text" name="prenom" value="<%out.print(request.getSession().getAttribute("prenom"));%>">
                        </div>
                    </div>

                    <div class="row-card">
                        <div class="inside-row">
                            <label>Date de naissance :</label> <br>
                            <input type="date" name="datenaissance" value="<%out.print(request.getSession().getAttribute("age"));%>">  
                        </div>
                        <div class="inside-row">
                            <label>A propos de moi :</label> <br>
                            <input type="text" name="bio" value="<%out.print(request.getSession().getAttribute("bio"));%>">
                        </div>
                    </div>

                    <div class="row-card">
                        <div class="inside-row">
                            <label>Adresse :</label> <br>
                            <input type="text" name="adresse" value="<%out.print(request.getSession().getAttribute("adresse"));%>">  
                        </div>
                        <div class="inside-row">
                            <label>Ville :</label> <br>
                            <input type="text" name="ville" value="<%out.print(request.getSession().getAttribute("ville"));%>">
                        </div>
                    </div>

                    <div class="row-card">
                        <div class="inside-row">
                            <label>E-mail :</label> <br>
                            <input type="email" name="email" value="<%out.print(request.getSession().getAttribute("email"));%>">  
                        </div>
                        <div class="inside-row">
                            <label>Téléphone :</label> <br>
                            <input type="tel" name="tel" value="<%out.print(request.getSession().getAttribute("tel"));%>">
                        </div>
                    </div>



                    <div class="row-card">
                        <div class="inside-row">
                            <label>Mot de passe actuel :</label> <br>
                            <input type="password" name="password"  value="<%out.print(request.getSession().getAttribute("pass"));%>">  
                        </div>
                        <div class="inside-row">
                            <label>Nouveau mot de passe :</label> <br>
                            <input type="password" name="password"  value="<%out.print(request.getSession().getAttribute("pass"));%>" >  
                        </div>
                    </div>

                    <div class="row-card">
                        <div class="inside-row" id="btnnn">
                            <button type="submit" name="operation" value="modifier" class="modifier-btn">MODIFIER MES INFORMATIONS</button>
                        </div>
                        <div class="inside-row" id="btnnn">
                            <button type="submit" name="operation" value="supprimer" class="supprimer-btn ">SUPPRIMER MON COMPTE</button>
                        </div>
                    </div>

                </div>
            </form>
        </div>




        <!-- CONTENT END -->








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