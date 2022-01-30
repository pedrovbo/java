/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.pvbo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

@WebServlet(name = "DisciplinaWSServlet", urlPatterns = {"/DisciplinaWSServlet"})
public class DisciplinaWSServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation
            = "WEB-INF/wsdl/localhost_8080/DisciplinasWS_Provedor/DisciplinasWS_Provedor.wsdl")
    private com.pvbo.disciplinasws_cliente.DisciplinasWSProvedor_Service service;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                //Criando as instâncias para os métodos dos Web Service
                // a partir das referências ao provedor adicionadas ao projeto
                com.pvbo.disciplinasws_cliente.DisciplinasWSProvedor port
                        = service.getDisciplinasWSProvedorPort();
                com.pvbo.disciplinasws_cliente.DisciplinasWSProvedor port2
                        = service.getDisciplinasWSProvedorPort();

                //Recupera o valor do input hidden, proveniente do formulário
                String serviceName = request.getParameter("service_name");
                String result = null;
                String nomeTema = null;

                //Verifica qual serviço ws deverá ser invocado
                if (serviceName.equals("listar_temas")) {
                    //Armazena na variavel result o retorno do serviço ws
                    result = port.getTema();
                } else if (serviceName.equals("listar_modulos")) {
                    //Adiciona à variavel nomeTema o nome do tema inserido no form
                    nomeTema = request.getParameter("tema_nome");
                    //Armazena na variavel o resultado da invocação do webservice
                    result = port.getModulosTema(nomeTema);
                }

                //Imprimindo a página HTML com o resultado do consumo do WS
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Consumindo Web Services SOAP</title>");
                out.println("</head>");
                out.println("<body>");
                if (serviceName.equals("listar_temas")) {
                    out.println("<h1>Temas existentes</h1>");
                } else if (serviceName.equals("listar_modulos")) {
                    out.println("<h1>Lista de Módulos do Tema: " + nomeTema + "</h1>");
                }
                out.println("<p>" + result + "</p>");
                out.println("</body>");
                out.println("</html>");

            } catch (Exception ex) {
                out.println("exception" + ex);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
