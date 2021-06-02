package org.apache.jsp.Register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Assets/Images/M3alem-icon.png\">\n");
      out.write("    <title>S'inscrire</title>\n");
      out.write("\n");
      out.write("    <!-- Style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Register/Register.css\" />\n");
      out.write("\n");
      out.write("    <!-- Google font  -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- FontAwesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\" crossorigin=\"anonymous\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  function f1(){\n");
      out.write("    var navbar = document.getElementById('nav');\n");
      out.write("    navbar.classList.toggle('show');\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<body class=\"background-image\">\n");
      out.write("<!-- HEADER BEGIN -->\n");
      out.write("    <header>\n");
      out.write("      <div class=\"toggle-btn\" onclick=\"f1();\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span class=\"bottom-span\"></span>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\"><img class=\"header-logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Assets/Images/M3alem-Logo.png\" alt=\"M3alem Logo\"></a>\n");
      out.write("      </div>\n");
      out.write("      <nav id=\"nav\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\">Acceuil</a></li>\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/About/About.jsp\">Qui sommes-nous ?</a></li>\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Prestataires/Prestataires.jsp\">Prestataires</a></li>\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login/Login.jsp\">Connexion</a></li>\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Register/Register.jsp\" id=\"active-tab\">Inscription</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("<!-- HEADER END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"register-container\">\n");
      out.write("        <div class=\"register-header\"><h2>Vous êtes un prestataire ?</h2>\n");
      out.write("            <h3>Inscrivez-vous afin que votre profil soit accessible via la fonctionnalité de recherche\n");
      out.write("            </h3>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"register-form-hero\">\n");
      out.write("            \n");
      out.write("            <form action=\"../auth\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <div class=\"register-form\">\n");
      out.write("\n");
      out.write("                    <div class=\"input-form\">\n");
      out.write("                        <label class=\"label-text\" >Nom de famille :</label>\n");
      out.write("                        <input type=\"text\" name=\"nom\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-form\">\n");
      out.write("                        <label >Prénom :</label>\n");
      out.write("                        <input type=\"text\" name=\"prenom\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-form\">\n");
      out.write("                        <label > Date de naissance : </label>\n");
      out.write("                        <input type=\"date\" name=\"datenaissance\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-form\">\n");
      out.write("                        <label >Adresse :</label>\n");
      out.write("                        <textarea name=\"adresse\" rows=\"3\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                     <div class=\"input-form\">\n");
      out.write("                        <label >Ville :</label>\n");
      out.write("                        <input type=\"text\" name=\"ville\" >\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-form\">\n");
      out.write("                        <label >Téléphone :</label>\n");
      out.write("                        <input type=\"tel\" name=\"tel\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                   <div class=\"input-form\">\n");
      out.write("                       <label>Professions : </label>\n");
      out.write("                       <select name=\"professions\" id=\"professions\">\n");
      out.write("                         <option value=\"P01\">Bricolage-Petits travaux</option>\n");
      out.write("                         <option value=\"P02\">Plomberie</option>\n");
      out.write("                         <option value=\"P03\">Peinture</option>\n");
      out.write("                         <option value=\"P04\">Électricité</option>\n");
      out.write("                         <option value=\"P05\">Menuiserie de bois</option>\n");
      out.write("                         <option value=\"P06\">Menuiserie d'aluminium</option>\n");
      out.write("                         <option value=\"P07\">Soudure-Chaudronnerie</option>\n");
      out.write("                         <option value=\"P08\">Climatisation-Chauffage</option>\n");
      out.write("                         <option value=\"P09\">Maçonnerie</option>\n");
      out.write("                         <option value=\"P10\">Mécanique</option>\n");
      out.write("                         <option value=\"P11\">Marbre</option>\n");
      out.write("                         <option value=\"P12\">Faience mosaïque</option>\n");
      out.write("                         <option value=\"P13\">Rideaux - portes motorisés</option>\n");
      out.write("                         <option value=\"P14\">Tapisserie</option>\n");
      out.write("                         <option value=\"P15\">Jardinier</option>\n");
      out.write("                         <option value=\"P16\">Entretien piscine</option>\n");
      out.write("                         <option value=\"P17\">Chauffeur</option>\n");
      out.write("                         <option value=\"P18\">Réparation électroménager</option>\n");
      out.write("                         <option value=\"P19\">Réparation matériels électroniques</option>\n");
      out.write("                         <option value=\"P20\">Installation parabole</option>\n");
      out.write("                       </select>\n");
      out.write("                   </div>\n");
      out.write("\n");
      out.write("                   <div  class=\"input-form\">\n");
      out.write("                        <label> Années d'expérience :</label>\n");
      out.write("                        <input type=\"number\" name=\"experience\">\n");
      out.write("                   </div>\n");
      out.write("\n");
      out.write("                   <div  class=\"input-form\">\n");
      out.write("                      <label> Biographie :</label>\n");
      out.write("                      <textarea name=\"bio\"  rows=\"4\"></textarea>\n");
      out.write("                   </div>\n");
      out.write("\n");
      out.write("                   <div  class=\"input-form\">\n");
      out.write("                       <label> Email :</label>\n");
      out.write("                       <input type=\"email\" name=\"email\" >\n");
      out.write("                   </div>\n");
      out.write("\n");
      out.write("                   <div  class=\"input-form\">\n");
      out.write("                        <label> Mot de passe :</label>\n");
      out.write("                        <input type=\"password\" name=\"password\" >\n");
      out.write("                   </div>\n");
      out.write("\n");
      out.write("                   <div class=\"register-btn-div\">\n");
      out.write("                       <button type=\"submit\" name=\"operation\" value=\"register\" class=\"register-btn\">S'INSCRIRE</button>\n");
      out.write("                   </div>\n");
      out.write("                    ");
  
                        if(request.getAttribute("message")!=null)
                            out.print("<p style='color: red '>"+request.getAttribute("message")+"</p>");                       
                    
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"login-div\">\n");
      out.write("            <h2> Avez-vous déja un compte ? </h2>\n");
      out.write("             <a class=\"login-btn\" href=\"./../Login/Login.jsp\">Se connecter</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FOOTER BEGIN -->\n");
      out.write("    <footer>\n");
      out.write("      <div class=\"footer-top\">\n");
      out.write("        <div class=\"footer-top-items\">\n");
      out.write("          <h2>M3ALEM</h2>\n");
      out.write("          <p>C'est une plateforme de mise en relation pour la réalisation de services ou d'aides entre particuliers ou professionels.</p>\n");
      out.write("          <h2>SUIVEZ NOUS</h2>\n");
      out.write("          <a class=\"fab fa-facebook-f social-icon\" href=\"https://www.facebook.com/\"></a>\n");
      out.write("          <a class=\"fab fa-twitter social-icon\" href=\"http://www.twitter.com/\"></a>\n");
      out.write("          <a class=\"fab fa-instagram social-icon\" href=\"http://www.instagram.com/\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-top-items\">\n");
      out.write("          <h2>LIENS UTILES</h2>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"./../index.jsp\">Acceuil</a></li>\n");
      out.write("            <li><a href=\"./../Prestataires/Prestataires.jsp\">Prestataires</a></li>\n");
      out.write("            <li><a href=\"./../About/About.jsp\">Qui sommes nous?</a></li>\n");
      out.write("            <li><a href=\"./../Contact/Contact.jsp\">Contactez nous</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-top-items\">\n");
      out.write("          <h2>RETROUVEZ-NOUS</h2>\n");
      out.write("            <i class=\"fa fa-map-pin icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;157 Bis Boulevard 9 Avril Palmier Casablanca Maroc</span>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <i class=\"fa fa-phone icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;+212 5 22 33 44 55</span>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <i class=\"fa fa-envelope icon\" aria-hidden=\"true\"></i><span>&nbsp;&nbsp;&nbsp;contact@m3alem.com</span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"footer-bottom\">\n");
      out.write("        © 2021 M3alem All rights reserved.\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("<!-- FOOTER END -->\n");
      out.write("\n");
      out.write("</body>\n");
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
