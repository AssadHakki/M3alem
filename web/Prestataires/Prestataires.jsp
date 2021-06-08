<%-- 
    Document   : Prestataires
    Created on : 1 juin 2021, 17:55:59
    Author     : Blanco
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="M3alemBackend.connexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="${pageContext.request.contextPath}/Assets/Images/M3alem-icon.png">

        <title>Prestataires</title>

        <!-- Style -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Prestataires/Prestataires.css">

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
                    <li><a href="${pageContext.request.contextPath}/Prestataires/Prestataires.jsp" id="active-tab">Prestataires</a></li>
                        <%
                            if (session.getAttribute("nom") != null) {%>
                    <li><a href="${pageContext.request.contextPath}/Profile/Profile.jsp">Mon Profil</a></li>
                    <li>  <form method="POST" action="${pageContext.request.contextPath}/authentification">
                            <input type="submit" value="Se Deconnecter" name="operation" class="linkish" style=" background-color: transparent; border: 0; color: whitesmoke; cursor: pointer;
                                   display: inline;  outline: none;  font-weight: 100;  text-transform: uppercase; "/> </form></li>

                    <%   } else {%>
                    <li><a href="${pageContext.request.contextPath}/Login/Login.jsp">Connexion</a></li>
                    <li><a href="${pageContext.request.contextPath}/Register/Register.jsp">Inscription</a></li>
                        <% }%>
                </ul>
            </nav>
        </header>
        <!-- HEADER END -->


        <form action="${pageContext.request.contextPath}/Rechercher" method="post">

            <div class="search-container" >
                <h1>Trouvez des prestataires autour de vous !</h1>
                <div class="search-boxes">
                    <div class="search-profession">
                        <label for="profession"><i class="fa fa-wrench" aria-hidden="true"></i> De quoi avez-vous besoin ? <br></label>
                        <select name="profession" id="professions">
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
                    <div class="search-ville">
                        <label for="ville"><i class="fa fa-map-pin" aria-hidden="true"></i> Où en avez-vous besoin ? <br></label>
                        <select name="ville" id="villes">
                            <option value="casablanca">Casablanca</option>
                            <option value="agadir">Agadir</option>
                            <option value="tanger">Tanger</option>
                        </select>
                    </div>
                    <div class="search-btn">
                        <button id="rechercher" type="submit" name="search"><i class="fa fa-search" aria-hidden="true"></i></button>
                    </div>
                </div>
            </div>

        </form>

        <div class="cards-container">


            <%
                ResultSet R;
                if (request.getAttribute("result") != null) {
                    R = (ResultSet) request.getAttribute("result");
                } else {
                    R = connexion.Seconnecter().createStatement().executeQuery("select * from personne natural join profession ORDER BY id_personne DESC");
                }

                if (!R.next()) {
                    // ResultSet is empty
                    out.print("<div class='empty-result' style='font-size:25px; text-transform:uppercase; text-align:center; margin:200px 0 110px;'>Aucun prestataire trouvé.</div>");
                } else {

                    while (R.next()) {
                        String dd = R.getObject(5).toString();
                        Date datenaissance = new SimpleDateFormat("yyyy-mm-dd").parse(dd);
                        int age = (new Date().getYear() + 1900) - (datenaissance.getYear() + 1900);

                        out.print(
                                "<div class='first-card'> "
                                + "<div class='left-side'>"
                                + "<h2>" + R.getObject(3) + " " + R.getObject(4) + "</h2>"
                                + "<p><span style='text-transform: capitalize;'>" + R.getObject(8) + "</span>, " + age + " ans</p>"
                                + "<p>Profession : <span>" + R.getObject(13) + "</span> </p>"
                                + "<p>Experience : <span>" + R.getObject(12) + "</span> </p>"
                                + "<a class='seeMoreBtn' href='" + request.getContextPath()
                                + "/SeeMore/SeeMore.jsp?id_personne=" + R.getObject(2) + "'style='padding:8px 20px; color:#fffb7f; border:1px solid #fffb7f; border-radius:8px; text-decoration:none; font-weight:500;'><i class='fa fa-plus' style='margin:20px 0;' aria-hidden='true'> </i>&nbsp; VOIR PLUS</a>"
                                + "</div>"
                                + "<img src='" + request.getContextPath() + "/Assets/Images/pdp.png' >"
                                + "</div>"
                        );
                    }
                }
            %>


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