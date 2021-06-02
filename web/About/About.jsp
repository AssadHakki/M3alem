<%-- 
    Document   : About
    Created on : 1 juin 2021, 17:39:46
    Author     : Blanco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="${pageContext.request.contextPath}/Assets/Images/M3alem-icon.png">

    <title>Qui sommes-nous ?</title>

    <!-- Style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/About/About.css">

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

<body class="background-image" >
<!-- HEADER BEGIN -->
    <header>
      <div class="toggle-btn" onclick="f1();">
        <span></span>
        <span></span>
        <span class="bottom-span"></span>
      </div>

      <div class="logo">
        <a href="${pageContext.request.contextPath}/index.html"><img class="header-logo" src="${pageContext.request.contextPath}/Assets/Images/M3alem-Logo.png" alt="M3alem Logo"></a>
      </div>
      <nav id="nav">
        <ul>
            <li><a href="${pageContext.request.contextPath}/index.jsp">Acceuil</a></li>
          <li><a href="${pageContext.request.contextPath}/About/About.jsp" id="active-tab">Qui sommes-nous ?</a></li>
          <li><a href="${pageContext.request.contextPath}/Prestataires/Prestataires.jsp">Prestataires</a></li>
          <li><a href="${pageContext.request.contextPath}/Login/Login.jsp">Connexion</a></li>
          <li><a href="${pageContext.request.contextPath}/Register/Register.jsp">Inscription</a></li>
        </ul>
      </nav>
    </header>
<!-- HEADER END -->


  <div class="about-header">
    <h1>À propos de nous</h1>
  </div>
  <div class="about-under-header">
    <div class="about-text">
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi dolorem unde, quas esse obcaecati placeat voluptatum voluptatibus facilis quam corrupti deserunt officia vero delectus consequuntur beatae nemo deleniti, nam minus! Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime fugit esse alias, mollitia aliquam, sunt quae quod illo odio iure dicta repellendus? Fuga rerum quae id culpa dolor similique pariatur. Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit rerum fugiat quas dolorum eos! Excepturi dolor, atque eius accusantium deleniti asperiores itaque, vel nobis provident.
    </div>
    <div class="about-image">
      <img src="${pageContext.request.contextPath}/Assets/Images/about-hero.png" width="400px">
    </div>
  </div>
  <div class="about-contact">
    <h2>Si vous avez besoin de plus d'informations n'hésitez pas à nous contacter ! <br> <br></h2>
    <a href="${pageContext.request.contextPath}/Contact/Contact.jsp">Contactez-nous</a>
    <br><br><br>
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