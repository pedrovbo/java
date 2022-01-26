/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import jakarta.annotation.Resource;
import jakarta.jms.Connection;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.JMSException;
import jakarta.jms.MessageProducer;
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
@WebServlet(name = "ServletMessage",
        urlPatterns = {"/ServletMessage"})
public class ServletMessage extends HttpServlet {

    @Resource(mappedName = "jms/SimpleConnectionFactory")
    private ConnectionFactory connectionFactory;
    @Resource(mappedName = "jms/SimpleQueue")
    private Queue queue;

    public void putMessage() throws ServletException {
        try {
            Connection connection
                    = connectionFactory.createConnection();
            Session session
                    = connection.createSession(false,
                            Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer
                    = session.createProducer(queue);
            TextMessage message = session.createTextMessage();
            message.setText("Teste com MDB");
            messageProducer.send(message);
        } catch (JMSException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("");
            out.println("");

            putMessage();

            out.println("<h1>Mensagem Enviada</h1>");
            out.println("");
        }
    }
}
