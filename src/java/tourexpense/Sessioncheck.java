/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tourexpense;

/**
 *
 * @author music
 */
import java.io.IOException;  
//import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  


public class Sessioncheck extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                      throws ServletException, IOException {  
        response.setContentType("text/html");  
            //PrintWriter out = response.getWriter()) 
            //request.getRequestDispatcher("home.html").include(request, response);
            
            HttpSession session=request.getSession(false);
            if(session!=null){
                response.sendRedirect("product.html");
            }
            else{
                response.sendRedirect("signin.html");
            }
          
    }  
}  
