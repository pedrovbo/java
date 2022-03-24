/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontcontroller;

import control.DepartamentoFacadeLocal;
import control.EmpresaFacadeLocal;
import javax.servlet.http.HttpServletRequest;
import model.Departamento;
import model.Empresa;

/**
 *
 * @author pedro
 */
public class DepartamentoStrategy
        extends Strategy< DepartamentoFacadeLocal> {

    private final EmpresaFacadeLocal empresaFacade;

    public DepartamentoStrategy(DepartamentoFacadeLocal facade,
            EmpresaFacadeLocal empresaFacade) {
        super(facade);
        this.empresaFacade = empresaFacade;
    }

    @Override
    public String executar(String acao,
            HttpServletRequest request) {
        String paginaDestino = "ListaDepartamento.jsp";
        switch (acao) {
            case "listaDep":
                request.setAttribute("lista", facade.findAll());
                break;
            case "excDepExec":
                Integer codigo = new Integer(request.getParameter("cod"));
                facade.remove(facade.find(codigo));
                request.setAttribute("lista", facade.findAll());
                break;
            case "incDepExec":
                String nome = request.getParameter("nome");
                Integer codEmpresa = new Integer(
                        request.getParameter("cod_empresa"));
                Empresa empresa = empresaFacade.find(codEmpresa);
                Departamento departamento = new Departamento();
                departamento.setNome(nome);
                departamento.setEmpresa(empresa);
                facade.create(departamento);
                request.setAttribute("lista", facade.findAll());
                break;
            case "incDep":
                request.setAttribute("listaEmp",
                        empresaFacade.findAll());
                paginaDestino = "DadosDepartamento.jsp";
                break;
        }
        return paginaDestino;
    }
}
