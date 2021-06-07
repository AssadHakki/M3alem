package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Assets/Images/M3alem-icon.png\">\n");
      out.write("        <title>Acceuil</title>\n");
      out.write("\n");
      out.write("        <!-- Style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.css\">\n");
      out.write("\n");
      out.write("        <!-- Google font  -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- FontAwesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\" crossorigin=\"anonymous\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function f1() {\n");
      out.write("            var navbar = document.getElementById('nav');\n");
      out.write("            navbar.classList.toggle('show');\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <body class=\"background-image\">\n");
      out.write("        <!-- HEADER BEGIN -->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"toggle-btn\" onclick=\"f1();\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("                <span class=\"bottom-span\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\"><img class=\"header-logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Assets/Images/M3alem-Logo.png\" alt=\"M3alem Logo\"></a>\n");
      out.write("            </div>\n");
      out.write("            <nav id=\"nav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\" id=\"active-tab\">Acceuil</a></li>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/About/About.jsp\">Qui sommes-nous ?</a></li>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Prestataires/Prestataires.jsp\">Prestataires</a></li>\n");
      out.write("                        ");

                            if (session.getAttribute("nom") != null) {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Profile/Profile.jsp\">Mon Profil</a></li>\n");
      out.write("                    <li>  <form method=\"POST\" action=\"authentification\">\n");
      out.write("                            <input type=\"submit\" value=\"Se Deconnecter\" name=\"operation\" class=\"linkish\" style=\" background-color: transparent; border: 0; color: whitesmoke; cursor: pointer;\n");
      out.write("                                   display: inline;  outline: none;  font-weight: 100;  text-transform: uppercase; \"/> </form></li>\n");
      out.write("\n");
      out.write("                    ");
   } else {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/Login.jsp\" >Connexion</a></li>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Register/Register.jsp\">Inscription</a></li>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- HEADER END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- TOP MENU BEGIN -->\n");
      out.write("        <div class=\"home-container\">\n");
      out.write("            <div class=\"search-container\" >\n");
      out.write("                <h1>Besoin d'un service ou d'un coup de main ?</h1>\n");
      out.write("                <h2>Trouvez des prestataires autour de vous !</h1>\n");
      out.write("                    <form  action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Rechercher\" method=\"post\">\n");
      out.write("                        <div class=\"search-boxes\">\n");
      out.write("                            <div class=\"search-profession\">\n");
      out.write("                                <label ><i class=\"fa fa-wrench\" style=\"color: #fbf775;\" aria-hidden=\"true\"></i>&nbsp;&nbsp; De quoi avez-vous besoin ? <br></label>\n");
      out.write("                                <select name=\"profession\" id=\"professions\">\n");
      out.write("                                    <option value=\"P01\">Bricolage et Petits travaux</option>\n");
      out.write("                                    <option value=\"P02\">Plomberie</option>\n");
      out.write("                                    <option value=\"P03\">Peinture</option>\n");
      out.write("                                    <option value=\"P04\">Électricité</option>\n");
      out.write("                                    <option value=\"P05\">Menuiserie</option>\n");
      out.write("                                    <option value=\"P06\">Climatisation-Chauffage</option>\n");
      out.write("                                    <option value=\"P07\">Maçonnerie</option>\n");
      out.write("                                    <option value=\"P08\">Mécanique</option>\n");
      out.write("                                    <option value=\"P09\">Femmes de ménages</option>\n");
      out.write("                                    <option value=\"P10\">Jardinier</option>\n");
      out.write("                                    <option value=\"P11\">Entretien piscine</option>\n");
      out.write("                                    <option value=\"P12\">Réparation électroménager</option>\n");
      out.write("                                    <option value=\"P13\">Réparation matériels électroniques</option>\n");
      out.write("                                    <option value=\"P14\">Installation parabole</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"search-ville\">\n");
      out.write("                                <label for=\"ville\"><i class=\"fa fa-map-pin\"  style=\"color: #fbf775;\" aria-hidden=\"true\"></i>&nbsp;&nbsp; Où en avez-vous besoin ? <br></label>\n");
      out.write("                                <select name=\"ville\" id=\"villes\">\n");
      out.write("                                    <option value=\"casablanca\">Casablanca</option>\n");
      out.write("                                    <option value=\"agadir\">Agadir</option>\n");
      out.write("                                    <option value=\"tanger\">Tanger</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"search-btn\">\n");
      out.write("                                <button id=\"rechercher\" type=\"submit\" name=\"index-search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"under-search\">\n");
      out.write("                        <h1 style=\"margin-top: 50px;\">Vous êtes un prestataire ?</h1>\n");
      out.write("\n");
      out.write("                        ");

                            if (session.getAttribute("nom") != null) {
      out.write("\n");
      out.write("                        <h2>Vous pouvez afficher et modifier vos informations que les chercheurs voient sur le site à partir d'ici !</h2>\n");
      out.write("                        <a class=\"register-btnn\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Profile/Profile.jsp\">MON PROFIL</a>\n");
      out.write("                        ");
   } else {
      out.write("\n");
      out.write("                        <h2>Inscrivez-vous afin que votre profil soit accessible via la fonctionnalité de recherche</h2>\n");
      out.write("                        <a class=\"register-btnn\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Register/Register.jsp\">INSCRIPTION</a>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- HOW TO USE BEGIN -->\n");
      out.write("        <div class=\"use-container\">\n");
      out.write("            <h1>COMMENT ÇA MARCHE ?</h1>\n");
      out.write("            <div class=\"cherche-propose\">\n");
      out.write("                <div class=\"je-cherche\">\n");
      out.write("                    <h2>JE CHERCHE UN SERVICE</h2>\n");
      out.write("                    <p>Trouvez la personne qu'il vous faut à l'aide du formulaire de recherche en saisissant vos critères.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"je-propose\">\n");
      out.write("                    <h2>JE PROPOSE MES SERVICES</h2>\n");
      out.write("                    <p>Inscrivez-vous et remplissez le formulaire pour partager vos informations avec des personnes qui ont un besoin dans votre profession.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- HOW TO USE END  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- WHAT WILL YOU LIKE BEGIN-->\n");
      out.write("        <div class=\"like-container\">\n");
      out.write("            <h1>CE QUI VA VOUS PLAIRE !</h1>\n");
      out.write("            <div class=\"like-cards-container\">\n");
      out.write("                <div class=\"like-card\">\n");
      out.write("                    <i class=\"fa fa-users\" aria-hidden=\"true\"></i>\n");
      out.write("                    <h2>Grande variété</h2>\n");
      out.write("                    <p>Accédez à une base de données riche.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"like-card\">\n");
      out.write("                    <i class=\"fa fa-crosshairs\" aria-hidden=\"true\"></i>\n");
      out.write("                    <h2>Recherche ciblée</h2>\n");
      out.write("                    <p>Saisissez vos critères et trouvez la bonne personne.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"like-card\">\n");
      out.write("                    <i class=\"fa fa-life-ring\" aria-hidden=\"true\"></i>\n");
      out.write("                    <h2>Temps gagné</h2>\n");
      out.write("                    <p>Cherchez et comparez les services en quelques clics.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"like-card\">\n");
      out.write("                    <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                    <h2>Compte personnel</h2>\n");
      out.write("                    <p>Votre espace dédié vous permet de gérer facilement votre activité.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"like-card\">\n");
      out.write("                    <i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\n");
      out.write("                    <h2>Espace sécurisé</h2>\n");
      out.write("                    <p>Gardez le contrôle sur vos données.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"like-card\">\n");
      out.write("                    <i class=\"fa fa-cogs\" aria-hidden=\"true\"></i>\n");
      out.write("                    <h2>Optimiser</h2>\n");
      out.write("                    <p>Surveillez votre activité.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- WHAT WILL YOU LIKE END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- CONTACT US BEGIN -->\n");
      out.write("        <div class=\"contact-us-container\">\n");
      out.write("            <div class=\"contact-us-bottom\">\n");
      out.write("                <h1>Si vous avez besoin de plus d'informations n'hésitez pas à nous contacter !</h1>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Contact/Contact.jsp\">CONTACTEZ-NOUS</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- CONTACT US END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- FOOTER BEGIN -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-top\">\n");
      out.write("                <div class=\"footer-top-items\">\n");
      out.write("                    <h2>M3ALEM</h2>\n");
      out.write("                    <p>C'est une plateforme de mise en relation pour la réalisation de services ou d'aides entre particuliers ou professionels.</p>\n");
      out.write("                    <h2>SUIVEZ NOUS</h2>\n");
      out.write("                    <a class=\"fab fa-facebook-f social-icon\" href=\"https://www.facebook.com/\"></a>\n");
      out.write("                    <a class=\"fab fa-twitter social-icon\" href=\"http://www.twitter.com/\"></a>\n");
      out.write("                    <a class=\"fab fa-instagram social-icon\" href=\"http://www.instagram.com/\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-top-items\">\n");
      out.write("                    <h2>LIENS UTILES</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\">Acceuil</a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Prestataires/Prestataires.jsp\">Prestataires</a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/About/About.jsp\">Qui sommes nous?</a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Contact/Contact.jsp\">Contactez nous</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-top-items\">\n");
      out.write("                    <h2>RETROUVEZ-NOUS</h2>\n");
      out.write("                    <i class=\"fa fa-map-pin icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;157 Bis Boulevard 9 Avril Palmier Casablanca Maroc</span>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <i class=\"fa fa-phone icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 33 44 55</span>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <i class=\"fa fa-envelope icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;contact@m3alem.com</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-bottom\">\n");
      out.write("                © 2021 M3alem All rights reserved.\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- FOOTER END -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
