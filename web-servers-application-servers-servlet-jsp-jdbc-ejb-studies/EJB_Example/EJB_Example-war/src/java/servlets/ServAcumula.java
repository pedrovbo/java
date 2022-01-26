/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import ejbs.AcumulaSessionLocal;
import jakarta.annotation.Resource;
import jakarta.ejb.EJB;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.JMSContext;
import jakarta.jms.JMSProducer;
import jakarta.jms.Queue;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;
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
@WebServlet(name = "ServAcumula", urlPatterns = {"/ServAcumula"})
public class ServAcumula extends HttpServlet {

    @Resource(mappedName = "jms/SimpleConnectionFactory")
    private ConnectionFactory factory;
    @Resource(mappedName = "jms/SimpleQueue")
    private Queue queue;

    @EJB
    AcumulaSessionLocal acumula;

    public void putMessage(String texto) {
        JMSContext context = factory.createContext(
                Session.AUTO_ACKNOWLEDGE);
        JMSProducer p1 = context.createProducer();
        TextMessage message
                = context.createTextMessage(texto);
        p1.send(queue, message);
    }

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<html><body>");
            putMessage(request.getParameter("x"));
            acumula.addString(request.getParameter("x"));
            acumula.getLista().forEach(texto -> {
                out.println("<li>" + texto + "</li>");
            });

            out.println("</html></body>");
        }
    }

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
