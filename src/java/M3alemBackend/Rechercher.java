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
public class Rechercher extends HttpServlet {

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
            out.println("<title>Servlet Rechercher</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Rechercher at " + request.getContextPath() + "</h1>");
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
        

        if (request.getParameter("search") != null) {
            
            String profession = request.getParameter("profession");
            String ville = request.getParameter("ville");
           
                try {
                    String req = "select * from personne natural join profession where upper(ville)='"+ville.toUpperCase()+"' and id_profession ='"+profession+"' ORDER BY id_personne DESC ";
                   
                    
                    ResultSet R = connexion.Seconnecter().createStatement().executeQuery(req);
                    System.out.println(req);
                    request.setAttribute("result", R);
                    request.getRequestDispatcher("Prestataires/Prestataires.jsp").forward(request, response);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Rechercher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        

         if (request.getParameter("index-search") != null) {
            
            String profession = request.getParameter("profession");
            String ville = request.getParameter("ville");
           
                try {
                    String req = "select * from personne natural join profession where upper(ville)='"+ville.toUpperCase()+"' and id_profession ='"+profession+"' ORDER BY id_personne DESC ";
                   
                    
                    ResultSet R = connexion.Seconnecter().createStatement().executeQuery(req);
                    System.out.println(req);
                    request.setAttribute("result", R);
                    request.getRequestDispatcher("Prestataires/Prestataires.jsp").forward(request, response);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Rechercher.class.getName()).log(Level.SEVERE, null, ex);
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
