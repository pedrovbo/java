/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import ejbs.CalculadoraLocal;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author pedro
 */
@WebServlet(name = "ServletSoma",
        urlPatterns = {"/ServletSoma"})
public class ServletSoma extends HttpServlet {

    @EJB
    CalculadoraLocal facade;

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");

            out.println("<h1>Servlet ServletSoma: "
                    + facade.somar(2, 3) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
