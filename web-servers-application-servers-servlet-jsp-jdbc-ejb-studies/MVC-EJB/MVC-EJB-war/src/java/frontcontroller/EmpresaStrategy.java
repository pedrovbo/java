/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontcontroller;

import control.EmpresaFacadeLocal;
import javax.servlet.http.HttpServletRequest;
import model.Empresa;

/**
 *
 * @author pedro
 */
public class EmpresaStrategy
        extends Strategy<EmpresaFacadeLocal> {

    public EmpresaStrategy(EmpresaFacadeLocal facade) {
        super(facade);
    }

    @Override
    public String executar(String acao,
            HttpServletRequest request) {
        String paginaDestino = "ListaEmpresa.jsp";
        switch (acao) {
            case "listaEmp":
                request.setAttribute("lista", facade.findAll());
                break;
            case "excEmpExec":
                Integer codigo
                        = new Integer(request.getParameter("cod"));
                facade.remove(facade.find(codigo));
                request.setAttribute("lista", facade.findAll());
                break;
            case "incEmpExec":
                String razaoSocial
                        = request.getParameter("razao_social");
                Empresa empresa = new Empresa();
                empresa.setRazaoSocial(razaoSocial);
                facade.create(empresa);
                request.setAttribute("lista", facade.findAll());
                break;
            case "incEmp":
                paginaDestino = "DadosEmpresa.jsp";
                break;
        }
        return paginaDestino;
    }
}
