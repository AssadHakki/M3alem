<%-- 
    Document   : index
    Created on : 1 juin 2021, 17:30:54
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
    <title>Acceuil</title>

    <!-- Style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/index.css">

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
          <li><a href="${pageContext.request.contextPath}/index.jsp" id="active-tab">Acceuil</a></li>
          <li><a href="${pageContext.request.contextPath}/About/About.jsp">Qui sommes-nous ?</a></li>
          <li><a href="${pageContext.request.contextPath}/Prestataires/Prestataires.jsp">Prestataires</a></li>
          <li><a href="${pageContext.request.contextPath}/Login/Login.jsp">Connexion</a></li>
          <li><a href="${pageContext.request.contextPath}/Register/Register.jsp">Inscription</a></li>
        </ul>
      </nav>
    </header>
<!-- HEADER END -->


<!-- TOP MENU BEGIN -->
<div class="home-container">
  <div class="search-container" >
    <h1>Besoin d'un service ou d'un coup de main ?</h1>
    <h2>Trouvez des prestataires autour de vous !</h1>
    <div class="search-boxes">
      <div class="search-profession">
        <label for="profession"><i class="fa fa-wrench" aria-hidden="true"></i> De quoi avez-vous besoin ? <br></label>
        <select name="professions" id="professions">
          <option value="bricolage_petits_travaux">Bricolage-Petits travaux</option>
          <option value="plomberie">Plomberie</option>
          <option value="peinture">Peinture</option>
          <option value="electricite">Électricité</option>
          <option value="m_bois">Menuiserie de bois</option>
          <option value="m_aluminium">Menuiserie d'aluminium</option>
          <option value="soudure_chaudronnerie">Soudure-Chaudronnerie</option>
          <option value="climatisation_chauffage">Climatisation-Chauffage</option>
          <option value="maconnerie">Maçonnerie</option>
          <option value="mecanique">Mécanique</option>
          <option value="marbre">Marbre</option>
          <option value="faience_mosaique">Faience mosaïque</option>
          <option value="rideaux_portes_motorises">Rideaux - portes motorisés</option>
          <option value="tapisserie">Tapisserie</option>
          <option value="jardinier">Jardinier</option>
          <option value="entretien_piscine">Entretien piscine</option>
          <option value="chauffeur">Chauffeur</option>
          <option value="electromenager">Réparation électroménager</option>
          <option value="materiels_electroniques">Réparation matériels électroniques</option>
          <option value="parabole">Installation parabole</option>
          <option value="surveillance">Installation caméra de surveillance</option>
        </select>
      </div>
      <div class="search-ville">
        <label for="ville"><i class="fa fa-map-pin" aria-hidden="true"></i> Où en avez-vous besoin ? <br></label>
        <select name="villes" id="villes">
          <option value="casablanca">Casablanca</option>
          <option value="agadir">Agadir</option>
          <option value="tanger">Tanger</option>
        </select>
      </div>
      <div class="search-btn">
        <button id="rechercher" type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
      </div>
   </div>

   <div class="under-search">
      <h1 style="margin-top: 50px;">Vous êtes un prestataire ?</h1>
      <h2>Inscrivez-vous afin que votre profil soit accessible via la fonctionnalité de recherche</h2>
      <a class="register-btnn" href="${pageContext.request.contextPath}/Register/Register.jsp">INSCRIPTION</a>
   </div>
  </div>
</div>
<!-- TOP MENU END -->

<!-- RAPID SEARCH BEGIN -->
<div class="rapid-search-container">
  <div class="rapid-search-header">
    <h1>RECHERCHE RAPIDE</h1>
  </div>
  <div class="rapid-search-cards">
    
    <div class="search-card">
      <h2>Casablanca</h2>
      <a href="#">Femme de ménage à Casablanca <br></a>
      <a href="#">Peintre à Casablanca <br></a>
      <a href="#">Menuisier à Casablanca <br></a>
      <a href="#">Électricien à Casablanca<br></a>
      <a href="#">Aluminium à Casablanca <br></a>
      <a href="#">Carrelage à Casablanca <br></a>
    
    </div>
    
    <div class="search-card">
      <h2>Agadir</h2>
      <a href="#">Femme de ménage à Agadir <br></a>
      <a href="#">Peintre à Agadir <br></a>
      <a href="#">Menuisier à Agadir <br></a>
      <a href="#">Électricien à Agadir<br></a>
      <a href="#">Aluminium à Agadir <br></a>
      <a href="#">Carrelage à Agadir <br></a>
    
    </div>
  
    <div class="search-card">
      <h2>Tanger</h2>
      <a href="#">Femme de ménage à Tanger <br></a>
      <a href="#">Peintre à Tanger <br></a>
      <a href="#">Menuisier à Tanger <br></a>
      <a href="#">Électricien à Tanger<br></a>
      <a href="#">Aluminium à Tanger <br></a>
      <a href="#">Carrelage à Tanger <br></a>
    

    </div>

  </div>

</div>
<!-- RAPID SEARCH END -->


<!-- HOW TO USE BEGIN -->
<div class="use-container">
  <h1>COMMENT ÇA MARCHE ?</h1>
  <div class="cherche-propose">
    <div class="je-cherche">
      <h2>JE CHERCHE UN SERVICE</h2>
      <p>Trouvez la personne qu'il vous faut à l'aide du formulaire de recherche en saisissant vos critères.</p>
    </div>
    <div class="je-propose">
      <h2>JE PROPOSE MES SERVICES</h2>
      <p>Inscrivez-vous et remplissez le formulaire pour partager vos informations avec des personnes qui ont un besoin dans votre profession.</p>
    </div>
  </div>
</div>
<!-- HOW TO USE END  -->


<!-- WHAT WILL YOU LIKE BEGIN-->
<div class="like-container">
  <h1>CE QUI VA VOUS PLAIRE !</h1>
  <div class="like-cards-container">
    <div class="like-card">
      <i class="fa fa-users" aria-hidden="true"></i>
      <h2>Grande variété</h2>
      <p>Accédez à une base de données riche.</p>
    </div>
    <div class="like-card">
      <i class="fa fa-crosshairs" aria-hidden="true"></i>
      <h2>Recherche ciblée</h2>
      <p>Saisissez vos critères et trouvez la bonne personne.</p>
    </div>
    <div class="like-card">
      <i class="fa fa-life-ring" aria-hidden="true"></i>
      <h2>Temps gagné</h2>
      <p>Cherchez et comparez les services en quelques clics.</p>
    </div>
    <div class="like-card">
      <i class="fa fa-user" aria-hidden="true"></i>
      <h2>Compte personnel</h2>
      <p>Votre espace dédié vous permet de gérer facilement votre activité.</p>
    </div>
    <div class="like-card">
      <i class="fa fa-lock" aria-hidden="true"></i>
      <h2>Espace sécurisé</h2>
      <p>Gardez le contrôle sur vos données.</p>
    </div>
    <div class="like-card">
      <i class="fa fa-cogs" aria-hidden="true"></i>
      <h2>Optimiser</h2>
      <p>Surveillez votre activité.</p>
    </div>
  </div>
</div>
<!-- WHAT WILL YOU LIKE END -->



<!-- CONTACT US BEGIN -->
<div class="contact-us-container">
  <div class="contact-us-bottom">
    <h1>Si vous avez besoin de plus d'informations n'hésitez pas à nous contacter !</h1>
    <a href="${pageContext.request.contextPath}/Contact/Contact.jsp">CONTACTEZ-NOUS</a>
  </div>
</div>
<!-- CONTACT US END -->









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
