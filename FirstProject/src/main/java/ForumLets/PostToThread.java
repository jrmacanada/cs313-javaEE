/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumLets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.File;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author michaelcavey (Adapted to kdastrup file system)
 */
@WebServlet(name = "PostToThread", urlPatterns = {"/PostToThread"})
public class PostToThread extends HttpServlet {
    
//    public PostToThread(){
//       super();
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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get data from post
        String newpost = request.getParameter("newpost");
        String username = request.getParameter("username");
       
        //get timestamp
        Date date = new Date();
        String time = (date.toString());
        
        //set data
        request.setAttribute("username", username);
        request.setAttribute("newpost", newpost);
        request.setAttribute("time", time);
        
        String path = getServletContext().getRealPath("/") + "forum/thread.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = "";
        String result = "";
        while ((line = reader.readLine()) != null){
        result = result + line + "\n";
        }
        
        //String temp = in.readLine();
        BufferedWriter out = new BufferedWriter(new FileWriter(path));
        out.write("'" + newpost + "'" + "\n" +
                  "Submitted by: " + username + "\n" + 
                  "on " + time + "\n\n" + result + "\n");
        out.close();
        
        
        request.getRequestDispatcher("/forum/listPosts.jsp").forward(request, response);
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
        processRequest(request, response);
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
