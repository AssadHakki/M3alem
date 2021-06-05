package org.apache.jsp.Profile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    if (session.getAttribute("nom") == null) {
        request.setAttribute("message", "Vous devez d'abord vous connecter avant d'essayer de rejoindre votre profil");
        response.sendRedirect("./../Login/Login.jsp");

    }
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
      out.write("        <title>Profil</title>\n");
      out.write("\n");
      out.write("        <!-- Style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Profile/Profile.css\">\n");
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
      out.write("/Prestataires/Prestataires.jsp\">Prestataires</a></li>\n");
      out.write("                        ");

                            if (session.getAttribute("nom") != null) {
      out.write("\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Profile/Profile.jsp\" id=\"active-tab\">Mon Profil</a></li>\n");
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
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- HEADER END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");


            out.print("<h2>" + session.getAttribute("nom") + " " + session.getAttribute("prenom") + "</h2>");
            out.print("<p><span style='text-transform: capitalize;'>" + session.getAttribute("ville") + "</span>, " + session.getAttribute("age") + " ans. </p>");
            out.print("<p> Profession : <span>" + session.getAttribute("profession") + ".</span> </p>");
            out.print("<p> Experience : <span>" + session.getAttribute("experience") + ".</span> </p>");

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- CONTENT BEGIN -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"crd-container\">\n");
      out.write("            <div class=\"left-card\">\n");
      out.write("                <img src=\"./../Assets/Images/pdp.png\"> \n");
      out.write("                ");
                    out.print("<h2 style='text-transform: uppercase;'>" + session.getAttribute("nom") + " " + session.getAttribute("prenom") + "</h2>");
                    out.print("<p>" + session.getAttribute("age") + "</p>");
                
      out.write("\n");
      out.write("\n");
      out.write("                <h2>PROFESSION</h2>\n");
      out.write("                ");
 out.print("<p>" + session.getAttribute("profession") + "</p>"); 
      out.write("\n");
      out.write("\n");
      out.write("                <h2>EXPERIENCE</h2>\n");
      out.write("                ");
 out.print("<p>" + session.getAttribute("experience") + "</p>"); 
      out.write("\n");
      out.write("\n");
      out.write("                <h2>A PROPOS</h2>\n");
      out.write("                ");
 out.print("<p>" + session.getAttribute("bio") + "</p>"); 
      out.write("\n");
      out.write("\n");
      out.write("                <h2>ADRESSE</h2>\n");
      out.write("                ");
 out.print("<p>" + session.getAttribute("adresse") + "</p>"); 
      out.write("\n");
      out.write("                ");
 out.print("<p style='text-transform: capitalize;'>" + session.getAttribute("ville") + "</p>"); 
      out.write("\n");
      out.write("\n");
      out.write("                <h2>TELEPHONE</h2>\n");
      out.write("                ");
 out.print("<p>" + session.getAttribute("tel") + "</p>"); 
      out.write("\n");
      out.write("\n");
      out.write("                <h2>E-MAIL</h2>\n");
      out.write("                ");
 out.print("<p style='text-transform: uppercase;'>" + session.getAttribute("email") + "</p>"); 
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"\">    \n");
      out.write("                <div class=\"right-card\">\n");
      out.write("\n");
      out.write("                    <div class=\"row-card\">\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>Nom :</label> <br>\n");
      out.write("                            <input type=\"text\" name=\"nom\" value=\"");
out.print(request.getSession().getAttribute("nom"));
      out.write("\">  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>Prenom :</label> <br>\n");
      out.write("                            <input type=\"text\" name=\"prenom\" value=\"");
out.print(request.getSession().getAttribute("prenom"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row-card\">\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>Date de naissance :</label> <br>\n");
      out.write("                            <input type=\"date\" name=\"datenaissance\" value=\"");
out.print(request.getSession().getAttribute("age"));
      out.write("\">  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>A propos de moi :</label> <br>\n");
      out.write("                            <input type=\"text\" name=\"bio\" value=\"");
out.print(request.getSession().getAttribute("bio"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row-card\">\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>Adresse :</label> <br>\n");
      out.write("                            <input type=\"text\" name=\"adresse\" value=\"");
out.print(request.getSession().getAttribute("adresse"));
      out.write("\">  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>Ville :</label> <br>\n");
      out.write("                            <input type=\"text\" name=\"ville\" value=\"");
out.print(request.getSession().getAttribute("ville"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row-card\">\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>E-mail :</label> <br>\n");
      out.write("                            <input type=\"email\" name=\"email\" value=\"");
out.print(request.getSession().getAttribute("email"));
      out.write("\">  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>Téléphone :</label> <br>\n");
      out.write("                            <input type=\"tel\" name=\"tel\" value=\"");
out.print(request.getSession().getAttribute("tel"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row-card\">\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>Mot de passe actuel :</label> <br>\n");
      out.write("                            <input type=\"password\" name=\"password\"  value=\"");
out.print(request.getSession().getAttribute("password"));
      out.write("\">  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inside-row\">\n");
      out.write("                            <label>Nouveau mot de passe :</label> <br>\n");
      out.write("                            <input type=\"password\" name=\"password\" >  \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row-card\">\n");
      out.write("                        <div class=\"inside-row\" id=\"btnnn\">\n");
      out.write("                            <button type=\"submit\" name=\"operation\" value=\"modifier\" class=\"modifier-btn\">MODIFIER MES INFORMATIONS</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inside-row\" id=\"btnnn\">\n");
      out.write("                            <button type=\"submit\" name=\"operation\" value=\"supprimer\" class=\"supprimer-btn \">SUPPRIMER MON COMPTE</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- CONTENT END -->\n");
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
