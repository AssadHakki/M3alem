/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3alemBackend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Blanco
 */
public class MiseAJour extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MiseAJour</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MiseAJour at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            String operation = request.getParameter("operation");

            if (operation.equals("supprimer")) {
                try {
                    String email = request.getParameter("emailw");
                    String password = request.getParameter("passw");
                    String req = "delete from personne where email ='" + email + "' and password ='" + password + "'";
                    System.out.println(req);
                    
                    int r = connexion.Seconnecter().createStatement().executeUpdate(req);

                    if (r != 0) {
                        request.getSession().invalidate();
                        response.sendRedirect("index.jsp");
                    } else {
                        response.sendRedirect("Profile/Profile.jsp");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(auth.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
             if (operation.equals("modifier")) {
            try {
                String id_p = request.getSession().getAttribute("id_personne").toString();
                String nom = request.getParameter("nomw");
                String prenom = request.getParameter("prenomw");
                String dd = request.getParameter("datenaissancew");
                String bio = request.getParameter("biow");
                String adresse = request.getParameter("adressew");
                String ville = request.getParameter("villew");
                String email = request.getParameter("emailw");
                String tel = request.getParameter("telw");
                String pass = request.getParameter("passw");
                String newpass = request.getParameter("newpassw");
                
                String req;
                
                  if (bio.isEmpty()) {
                    bio = "Ma biographie est encore vide.";
                }
               
                if (nom.isEmpty() || prenom.isEmpty() || dd.isEmpty() || bio.isEmpty() || adresse.isEmpty() 
                        || ville.isEmpty()|| email.isEmpty()|| tel.isEmpty() || pass.isEmpty() ) {
                    request.setAttribute("message", "Erreur de modification: veillez remplir les champs.");
                    request.getRequestDispatcher("Profile/Profile.jsp").forward(request, response);
                } else {
                    
                    if(newpass.isEmpty()){
                         req = "update personne set nom='" + nom + "',prenom='" + prenom + "',"
                                + "datenaissance = to_date('"+dd+"','yyyy-mm-dd'), bio='"+bio.replace("'", "''")+"',adresse='"+adresse+"',ville='"+ville+"',"
                                + "tel='"+tel+"',email='"+email+"',password='"+pass+"' where id_personne = " +id_p;
                    }
                    else{
                          req = "update personne set nom='" + nom + "',prenom='" + prenom + "',"
                                + "datenaissance = to_date('"+dd+"','yyyy-mm-dd'), bio='"+bio.replace("'", "''")+"',adresse='"+adresse+"',ville='"+ville+"',"
                                + "tel='"+tel+"',email='"+email+"',password='"+newpass+"' where id_personne = " +id_p;
                    }
                    
                    
                    System.out.println(req);
                    int r = connexion.Seconnecter().createStatement().executeUpdate(req);

                    if (r != 0) {
                        response.sendRedirect("Profile/Profile.jsp");
                    } else {
                        response.sendRedirect("Profile/Profile.jsp");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(auth.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
