<%-- 
    Document   : Contact
    Created on : 1 juin 2021, 17:45:35
    Author     : Blanco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="./../Assets/Images/M3alem-icon.png">
    <title>Contactez nous</title>

    <!-- Style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Contact/Contact.css">

    <!-- Google font  -->
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">

    <!-- FontAwesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />

</head>

<script type="text/javascript">
  function f1(){
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
                    <li><a href="${pageContext.request.contextPath}/Profile/Profile.jsp">Mon Profil</a></li>
                    <li>  <form method="POST" action="../authentification">
                            <input type="submit" value="Se Deconnecter" name="operation" class="linkish" style=" background-color: transparent; border: 0; color: whitesmoke; cursor: pointer;
                                   display: inline;  outline: none;  font-weight: 100;  text-transform: uppercase; "/> </form></li>

                    <%   } else {%>
                    <li><a href="${pageContext.request.contextPath}/Login/Login.jsp" >Connexion</a></li>
                    <li><a href="${pageContext.request.contextPath}/Register/Register.jsp">Inscription</a></li>
                        <% }                        %>
        </ul>
      </nav>
    </header>
<!-- HEADER END -->



    <div class="fcf-body">
        <div id="fcf-form">
        <h2 class="fcf-h3">CONTACTEZ NOUS</h2>

        <form id="fcf-form-id" class="fcf-form-class" method="post" action="">
            
            <div class="fcf-form-group">
                <label for="Name" class="fcf-label">Votre nom : </label>
                <div class="fcf-input-group">
                    <input type="text" id="Name" name="Name" class="fcf-form-control" required>
                </div>
            </div>

            <div class="fcf-form-group">
                <label for="Email" class="fcf-label">Votre email :</label>
                <div class="fcf-input-group">
                    <input type="email" id="Email" name="Email" class="fcf-form-control" required>
                </div>
            </div>

            <div class="fcf-form-group">
                <label for="Message" class="fcf-label">Votre message :</label>
                <div class="fcf-input-group">
                    <textarea id="Message" name="Message" class="fcf-form-control" rows="6" maxlength="3000" required></textarea>
                </div>
            </div>

            <div class="fcf-form-group">
                <button type="submit" id="fcf-button" class="fcf-btn fcf-btn-primary fcf-btn-lg fcf-btn-block">Envoyer le message</button>
            </div>
        </form>
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
