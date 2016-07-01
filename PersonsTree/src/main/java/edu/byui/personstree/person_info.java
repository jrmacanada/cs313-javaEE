/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.personstree;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author michaelcavey
 */

@WebServlet(name = "person_info", urlPatterns = {"/person_info"})
public class person_info extends HttpServlet {

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

            /*
            String id = request.getParameter("id");            
            
            try { 
                // Registers the driver?   See   http://www.tutorialspoint.com/jdbc/jdbc-sample-code.htm
                Class.forName("com.mysql.jdbc.Driver");                                                          

                try { 
                    // Connects to database 'ancestors'                
                    Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost/ancestors","myUser","myPass");
                                       
                    // Use MySQL query
                    Statement myStatement = myConnection.createStatement();
                    ResultSet r = myStatement.executeQuery("Select p_id, first_name, last_name, birthday FROM people where id =" + id );

                    List <Person> people = new ArrayList <> ();
                    
                    // Display the results  (TODO - store it instead)
                    while(r.next()) {
                        
                        Person p = new Person();
                        
                        p.setP_id(r.getInt("p_id"));
                        p.setFirst_name(r.getString("first_name"));
                        p.setLast_name(r.getString("last_name"));
                        p.setBirthday(r.getString("birthday"));
                        
                        people.add(p);                                                
                        
//                        String first = r.getString("first_name");
//                        out.print(first + "<br />");
                    }
                    
                    request.setAttribute("people", people);
                    request.getRequestDispatcher("/view_family.jsp").forward(request, response);                        

                    myStatement.close();
                    myConnection.close();
                    r.close();

                } catch (SQLException e){
                    out.println("Error:" + e);
                }
            } catch (ClassNotFoundException e) {
                out.println("Error:" + e);
            }
            
*/                                                                     
 
            
            
            
            
            try {
                // Registers the driver?   See   http://www.tutorialspoint.com/jdbc/jdbc-sample-code.htm
                Class.forName("com.mysql.jdbc.Driver");

                try { 
                    // Set the connection parameters based on whether you are in the home environment or openshift
                    String user = null;
                    String pass = null;
                    String url = null;
                     
                    if(System.getenv("OPENSHIFT_MYSQL_DB_USERNAME") != null) {
                        user = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
                        pass = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
                        url = "jdbc:mysql://" + System.getenv("OPENSHIFT_MYSQL_DB_HOST") + ":" + System.getenv("OPENSHIFT_MYSQL_DB_PORT") + "/ancestors";
                    } else {
                        // Note, in a real program it would be beet not to put the password here, maybe save it in a file or something
                        user = "myUser";
                        pass = "myPass";
                        url = "jdbc:mysql://localhost/ancestors";
                    }

                    // Connect to the database 
                    Connection myConnection = DriverManager.getConnection(url,user,pass);

                    // Get the user's info from the first page 
                    int id = Integer.parseInt(request.getParameter("id"));
                    String first_name = request.getParameter("first_name");
                    String last_name = request.getParameter("last_name");
                    String birthday = request.getParameter("birthday");
                    
                    // Query the ids of all of the person's children
                    Statement myStatement = myConnection.createStatement();
                    ResultSet r = myStatement.executeQuery("Select child FROM relationships WHERE parent = " + id);

                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet person_info</title>");            
                    out.println("</head>");
                    out.println("<body>");

                    // Print the individual's information
                    out.println("<h1>" + first_name + " " + last_name + "</h1>");
                    out.println("<p>" + "Date of birth: " +  birthday + "</p><br /><br />");                                                 
                        
                    out.println("<h2> Children </h2>");
                    
                    // Cycle through the children ids found
                    while(r.next()) {
                         
                        // Query the information of that child
                        Statement myStatement2 = myConnection.createStatement();
                        ResultSet c = myStatement2.executeQuery("Select first_name, last_name, birthday FROM people WHERE p_id = " + r.getInt("child"));                        
                       
                        // Display his or her name and birthday
                        while(c.next()) {
                                                       
                           out.println("<p>" + c.getString("first_name") + " " + c.getString("last_name") + "</p>");                           
                           
                        }
                        
                        myStatement2.close();                    
                        c.close();
                    }
                    
                    out.println("</body>");
                    out.println("</html>");                       

                    myStatement.close();
                    myConnection.close();
                    r.close();

                } catch (SQLException e){
                    out.println("Error:" + e);
                }
            } catch (ClassNotFoundException e) {
                out.println("Error:" + e);
            }
            
            
            
            
            
            
            
/*            
            
            // Get the person's info
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String birthday = request.getParameter("birthday");
                                   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet person_info</title>");            
            out.println("</head>");
            out.println("<body>");
            
            // Display his or her name and birthday
            out.println("<h1>" + first_name + " " + last_name + "</h1>");
            out.println("<p>" + "Date of birth: " +  birthday + "</p>");
            
            out.println("</body>");
            out.println("</html>");                       
            
            */
            
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
