<%-- 
    Document   : Prestataires
    Created on : 1 juin 2021, 17:55:59
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

    <title>Prestataires</title>

    <!-- Style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Prestataires/Prestataires.css">

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
          <li><a href="${pageContext.request.contextPath}/Prestataires/Prestataires.jsp" id="active-tab">Prestataires</a></li>
                <%
                            if (session.getAttribute("nom") != null) {%>
                    <li><a href="${pageContext.request.contextPath}/Profile/Profile.jsp">Mon Profil</a></li>
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




    <div class="search-container" >
        <h1>Trouvez des prestataires autour de vous !</h1>
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
    </div>


    <div class="cards-container">
        

        <div class="father" >
                    
          <div class="card">
            <img class="image" src="${pageContext.request.contextPath}/Assets/Images/handyman.jpg">
            <h2 class="fullname"> Nom Prenom</h2>
            <p class="service">Profession</p>
            <p class="bio">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quam repellendus dicta, sed odit vitae nam consectetur dolorum sunt.</p>
            <a href="#">Voir plus</a>
          </div>

          <div class="card">
            <img class="image" src="${pageContext.request.contextPath}/Assets/Images/handyman.jpg">
            <h2 class="fullname"> Nom Prenom</h2>
            <p class="service">Profession</p>
            <p class="bio">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quam repellendus dicta, sed odit vitae nam consectetur dolorum sunt.</p>
            <a href="#">Voir plus</a>
          </div>

          <div class="card">
            <img class="image" src="${pageContext.request.contextPath}/Assets/Images/handyman.jpg">
            <h2 class="fullname"> Nom Prenom</h2>
            <p class="service">Profession</p>
            <p class="bio">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quam repellendus dicta, sed odit vitae nam consectetur dolorum sunt.</p>
            <a href="#">Voir plus</a>
          </div>

          <div class="card">
            <img class="image" src="${pageContext.request.contextPath}/Assets/Images/handyman.jpg">
            <h2 class="fullname"> Nom Prenom</h2>
            <p class="service">Profession</p>
            <p class="bio">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quam repellendus dicta, sed odit vitae nam consectetur dolorum sunt.</p>
            <a href="#">Voir plus</a>
          </div>

          <div class="card">
            <img class="image" src="${pageContext.request.contextPath}/Assets/Images/handyman.jpg">
            <h2 class="fullname"> Nom Prenom</h2>
            <p class="service">Profession</p>
            <p class="bio">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quam repellendus dicta, sed odit vitae nam consectetur dolorum sunt.</p>
            <a href="#">Voir plus</a>
          </div>

          <div class="card">
            <img class="image" src="${pageContext.request.contextPath}/Assets/Images/handyman.jpg">
            <h2 class="fullname"> Nom Prenom</h2>
            <p class="service">Profession</p>
            <p class="bio">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quam repellendus dicta, sed odit vitae nam consectetur dolorum sunt.</p>
            <a href="#">Voir plus</a>
          </div>

          <div class="card">
            <img class="image" src="${pageContext.request.contextPath}/Assets/Images/handyman.jpg">
            <h2 class="fullname"> Nom Prenom</h2>
            <p class="service">Profession</p>
            <p class="bio">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quam repellendus dicta, sed odit vitae nam consectetur dolorum sunt.</p>
            <a href="#">Voir plus</a>
          </div>




           
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