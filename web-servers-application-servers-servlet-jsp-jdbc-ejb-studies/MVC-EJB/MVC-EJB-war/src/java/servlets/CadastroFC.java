/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import control.DepartamentoFacadeLocal;
import control.EmpresaFacadeLocal;
import frontcontroller.DepartamentoStrategy;
import frontcontroller.EmpresaStrategy;
import frontcontroller.Strategy;
import java.io.IOException;
import java.util.HashMap;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "CadastroFC", urlPatterns = {"/CadastroFC"})
public class CadastroFC extends HttpServlet {

    @EJB
    EmpresaFacadeLocal empresaFacade;
    @EJB
    DepartamentoFacadeLocal departamentoFacade;

    private final HashMap< String, Strategy> estrategia
            = new HashMap<>();
    private final HashMap< String, String> acoes = new HashMap<>();

    @Override
    public void init() throws ServletException {
        super.init();
        estrategia.put("empresa", new EmpresaStrategy(
                empresaFacade));
        estrategia.put("departamento", new DepartamentoStrategy(
                departamentoFacade, empresaFacade));
        String[] acoesEmpresa
                = {"listaEmp", "incEmp", "incEmpExec", "excEmpExec"};
        for (String acao : acoesEmpresa) {
            acoes.put(acao, "empresa");
        }
        String[] acoesDepto
                = {"listaDep", "incDep", "incDepExec", "excDepExec"};
        for (String acao : acoesDepto) {
            acoes.put(acao, "departamento");
        }
    }

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        if (acao == null) {
            throw new ServletException("Parâmetro acao requerido");
        }
        Strategy st = estrategia.get(acoes.get(acao));
        request.getRequestDispatcher(st.executar(acao, request)).
                forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
