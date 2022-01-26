/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import model.ProdutoDAO;

/**
 *
 * @author pedro
 */
@WebServlet(name = "ServletProduto", urlPatterns = {"/ServletProduto"})
public class ServletProduto extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        if(acao == null) {
            acao = "listar";
        }
        String paginaDestino = (acao.equals("incluir"))
                ? "ProdutoDados.html" : "ProdutoLista.jsp";
        ProdutoDAO dao = new ProdutoDAO();
        switch(acao) {
            case "incluirX":
                int codigo = new Integer(request.getParameter("codigo"));
                String nome = request.getParameter("nome");
                int quantidade = new Integer(
                        request.getParameter("quantidade"));
                dao.incluir(new Produto(codigo, nome, quantidade));
                break;
            case "excluirX":
                dao.excluir(new Integer(request.getParameter("codigo")));
                break;
        }
        if (!acao.equals("incluir")) {
            request.setAttribute("listaProduto", dao.obterTodos());
        }
        request.getRequestDispatcher(paginaDestino).
                forward(request, response);
                
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
