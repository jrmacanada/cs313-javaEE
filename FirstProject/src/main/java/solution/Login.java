/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sburton
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    
//    public Login(){
//        super();
//    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
        
        // obviously these belong in a DB or something...
//        String correctName = "SetName";
//        String correctPassword = "SetWord";

//        String username = request.getParameter("txtUsername");
//        String password = request.getParameter("txtPassword");

//        if (username != null && password != null
//                && username.equals(correctName) && password.equals(correctPassword)) {

            // correct username and password!
//            request.getSession().setAttribute("username", username);
//            response.sendRedirect("/solution/welcome.jsp");
//        } else {
//            response.sendRedirect("/solution/badLogin.jsp");
//        }
//    }

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
//        processRequest(request, response);

        // obviously these belong in a DB or something...
        String correctName = "SetName";
        String correctPassword = "SetWord";

        String username = request.getParameter("txtUsername");
        String password = request.getParameter("txtPassword");

        if (username != null && password != null
                && username.equals(correctName) && password.equals(correctPassword)) {

            // correct username and password!
            request.getSession().setAttribute("username", username);
            response.sendRedirect("/FirstProject/solution/welcome.jsp");
        } else {
            response.sendRedirect("/FirstProject/solution/badLogin.jsp");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

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
