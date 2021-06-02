/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3alemBackend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class auth extends HttpServlet {

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
            out.println("<title>Servlet auth</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet auth at " + request.getContextPath() + "</h1>");
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

     try {
         
                    

        String operation = request.getParameter("operation");
        
        
        
        if(operation.equals("connecter")){
            
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String req ="select * from personne where email ='"+email+"' and password ='"+password+"'";
            ResultSet r = connexion.Seconnecter().createStatement().executeQuery(req);
            
            System.out.println(req);
            
            if(r.next()){
                request.getSession().setAttribute("nom", r.getObject(2));
                request.getSession().setAttribute("prenom", r.getObject(3));
                request.getRequestDispatcher("/Profile/Profile.jsp").forward(request, response);

                
            }
            else {
               request.setAttribute("message","Erreur: Erreur De Login Ou Password");
               request.getRequestDispatcher("/Login/Login.jsp").forward(request, response);
            }
            
            
        }
        
        
        
        
        
        
        
         if(operation.equals("register")){

             String nom = request.getParameter("nom");
             String prenom = request.getParameter("prenom");
             String dd = request.getParameter("datenaissance");
            
             String adresse = request.getParameter("adresse");
             String ville = request.getParameter("ville");
             String tel = request.getParameter("tel");
             String professions = request.getParameter("professions");
             String experience = request.getParameter("experience");
             String bio = request.getParameter("bio");
             String email = request.getParameter("email");
             String password = request.getParameter("password");
             
               
               
             if(nom.isEmpty() || prenom.isEmpty() || adresse.isEmpty() || ville.isEmpty() || tel.isEmpty() || 
                 professions.isEmpty() || experience.isEmpty() || bio.isEmpty() || email.isEmpty() || password.isEmpty() )
             {
                request.setAttribute("message", "Erreur d'inscription: Veuillez remplir les champs vides.");
                request.getRequestDispatcher("/Register/Register.jsp").forward(request, response);

             }
             else{
                 
                  Date datenaissance = new SimpleDateFormat("yyyy-mm-dd").parse(dd);
                  int age = (new Date().getYear()+1900) - (datenaissance.getYear()+1900);

                 String req = "insert into personne values(ID_PERSONNE.nextval,'"+nom+"','"+prenom+"',"+age+",'"+bio+"','"+adresse+"','"+ville+"','"
                     +tel+"','"+email+"','"+password+"',"+experience+",'"+professions+"')"   ;
                 
                 int r = connexion.Seconnecter().createStatement().executeUpdate(req);
                 
                 System.out.println("hadi hiya RRRRRRRRR"+r);

                 if(r!=0){
                     request.getRequestDispatcher("/Login/Login.jsp").forward(request, response);

                 }
                 else{
                    request.getRequestDispatcher("/Register/Register.jsp").forward(request, response);
                    request.setAttribute("message", "Erreur d'inscription: Veuillez réessayer ultérieurement.");
                 }
             }
         }




     } catch (SQLException ex) {
         Logger.getLogger(auth.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ParseException ex) {
         Logger.getLogger(auth.class.getName()).log(Level.SEVERE, null, ex);
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
