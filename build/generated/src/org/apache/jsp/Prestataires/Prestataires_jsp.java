package org.apache.jsp.Prestataires;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Prestataires_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <title>Prestataires</title>\n");
      out.write("\n");
      out.write("        <!-- Style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Prestataires/Prestataires.css\">\n");
      out.write("\n");
      out.write("        <!-- Google font  -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- FontAwesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\" crossorigin=\"anonymous\" />\n");
      out.write("\n");
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
      out.write("\n");
      out.write("    <body class=\"background-image\">\n");
      out.write("        <!-- HEADER BEGIN -->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"toggle-btn\" onclick=\"f1();\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("                <span class=\"bottom-span\"></span>\n");
      out.write("            </div>\n");
      out.write("\n");
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
      out.write("/index.jsp\">Acceuil</a></li>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/About/About.jsp\">Qui sommes-nous ?</a></li>\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Prestataires/Prestataires.jsp\" id=\"active-tab\">Prestataires</a></li>\n");
      out.write("                        ");

                            if (session.getAttribute("nom") != null) {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Profile/Profile.jsp\">Mon Profil</a></li>\n");
      out.write("                    <li>  <form method=\"POST\" action=\"../auth\">\n");
      out.write("                            <input type=\"submit\" value=\"Se Deconnecter\" name=\"operation\" class=\"linkish\" style=\" background-color: transparent; border: 0; color: whitesmoke; cursor: pointer;\n");
      out.write("                                   display: inline;  outline: none;  font-weight: 100;  text-transform: uppercase; \"/> </form></li>\n");
      out.write("\n");
      out.write("                    ");
   } else {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/Login.jsp\">Connexion</a></li>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"search-container\" >\n");
      out.write("            <h1>Trouvez des prestataires autour de vous !</h1>\n");
      out.write("            <div class=\"search-boxes\">\n");
      out.write("                <div class=\"search-profession\">\n");
      out.write("                    <label for=\"profession\"><i class=\"fa fa-wrench\" aria-hidden=\"true\"></i> De quoi avez-vous besoin ? <br></label>\n");
      out.write("                    <select name=\"professions\" id=\"professions\">\n");
      out.write("                        <option value=\"bricolage_petits_travaux\">Bricolage-Petits travaux</option>\n");
      out.write("                        <option value=\"plomberie\">Plomberie</option>\n");
      out.write("                        <option value=\"peinture\">Peinture</option>\n");
      out.write("                        <option value=\"electricite\">Électricité</option>\n");
      out.write("                        <option value=\"m_bois\">Menuiserie de bois</option>\n");
      out.write("                        <option value=\"m_aluminium\">Menuiserie d'aluminium</option>\n");
      out.write("                        <option value=\"soudure_chaudronnerie\">Soudure-Chaudronnerie</option>\n");
      out.write("                        <option value=\"climatisation_chauffage\">Climatisation-Chauffage</option>\n");
      out.write("                        <option value=\"maconnerie\">Maçonnerie</option>\n");
      out.write("                        <option value=\"mecanique\">Mécanique</option>\n");
      out.write("                        <option value=\"marbre\">Marbre</option>\n");
      out.write("                        <option value=\"faience_mosaique\">Faience mosaïque</option>\n");
      out.write("                        <option value=\"rideaux_portes_motorises\">Rideaux - portes motorisés</option>\n");
      out.write("                        <option value=\"tapisserie\">Tapisserie</option>\n");
      out.write("                        <option value=\"jardinier\">Jardinier</option>\n");
      out.write("                        <option value=\"entretien_piscine\">Entretien piscine</option>\n");
      out.write("                        <option value=\"chauffeur\">Chauffeur</option>\n");
      out.write("                        <option value=\"electromenager\">Réparation électroménager</option>\n");
      out.write("                        <option value=\"materiels_electroniques\">Réparation matériels électroniques</option>\n");
      out.write("                        <option value=\"parabole\">Installation parabole</option>\n");
      out.write("                        <option value=\"surveillance\">Installation caméra de surveillance</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-ville\">\n");
      out.write("                    <label for=\"ville\"><i class=\"fa fa-map-pin\" aria-hidden=\"true\"></i> Où en avez-vous besoin ? <br></label>\n");
      out.write("                    <select name=\"villes\" id=\"villes\">\n");
      out.write("                        <option value=\"casablanca\">Casablanca</option>\n");
      out.write("                        <option value=\"agadir\">Agadir</option>\n");
      out.write("                        <option value=\"tanger\">Tanger</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search-btn\">\n");
      out.write("                    <button id=\"rechercher\" type=\"submit\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"cards-container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"first-card\">\n");
      out.write("                <div class=\"left-side\">\n");
      out.write("                    <h2>HAMID DAMIDI</h2>\n");
      out.write("                    <p>Casablanca, <span>90 ans</span></p>\n");
      out.write("                    <p>Profession : <span>Plomberie</span> </p>\n");
      out.write("                    <p>Experience : <span>Entre 5 et 10 ans</span> </p>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Assets/Images/pdp.png\" alt=\"\" >\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              <div class=\"first-card\">\n");
      out.write("                <div class=\"left-side\">\n");
      out.write("                    <h2>HAMID DAMIDI</h2>\n");
      out.write("                    <p>Casablanca, <span>90 ans</span></p>\n");
      out.write("                    <p>Profession : <span>Plomberie</span> </p>\n");
      out.write("                    <p>Experience : <span>Entre 5 et 10 ans</span> </p>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Assets/Images/pdp.png\" alt=\"\" >\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              <div class=\"first-card\">\n");
      out.write("                <div class=\"left-side\">\n");
      out.write("                    <h2>HAMID DAMIDI</h2>\n");
      out.write("                    <p>Casablanca, <span>90 ans</span></p>\n");
      out.write("                    <p>Profession : <span>Plomberie</span> </p>\n");
      out.write("                    <p>Experience : <span>Entre 5 et 10 ans</span> </p>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Assets/Images/pdp.png\" alt=\"\" >\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
      out.write("</html>");
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
