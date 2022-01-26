/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pedro
 */
@WebServlet(name="ServletLogin1", urlPatterns = {"/ServletLogin1"})
public class ServletLogin extends HttpServlet {
   @Override
   protected void doPost(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {
      String acao = request.getParameter("acao");
      if(acao==null)
         throw new ServletException("Parâmetro Requerido");
      HttpSession session = request.getSession();
      switch(acao){
      case "conectar":
         if(request.getParameter("login").equals("admin")&&
            request.getParameter("senha").equals("123")){
            session.setAttribute("usuario", "Administrador");
            response.sendRedirect("Segura.jsp");
         } else {
            request.setAttribute("erro","Dados inválidos.");
            RequestDispatcher rd =
               request.getRequestDispatcher("Login.jsp");
            rd.forward(request,response);
         }
         break;
      case "desconectar":
         session.invalidate();
         response.sendRedirect("index.html");               
         break;
      default:
         throw new ServletException("Parâmetro incorreto");
      }
   }
}