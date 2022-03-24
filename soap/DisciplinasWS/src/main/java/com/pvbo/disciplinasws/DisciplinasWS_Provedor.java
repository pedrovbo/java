/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/EjbWebService.java to edit this template
 */
package com.pvbo.disciplinasws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author pedro
 */
@WebService(serviceName = "DisciplinasWS_Provedor")
@Stateless()
public class DisciplinasWS_Provedor {

    String[] tema = {"Webservices", "Programação Servidor com Java",
        "JPA e JEE"};

    Map<String, ArrayList> modulos = new HashMap<>();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetTema")
    public String GetTema() {
        //TODO write your implementation code here:
        return Arrays.toString(tema);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetModulosTema")
    public String GetModulosTema(@WebParam(name = "tema") String tema) {
        //TODO write your implementation code here:
        ArrayList<String> modulo3 = new ArrayList();
        modulo3.add("Webserver Tomcat");
        modulo3.add("App Server GlassFish");
        modulo3.add("Servlet e JSP");

        ArrayList<String> modulo4 = new ArrayList();
        modulo4.add("Tecnologia JPA");
        modulo4.add("Entrepise Java Beans");
        modulo4.add("Arquitetura MVC");

        ArrayList<String> modulo5 = new ArrayList();
        modulo5.add("Conceitos Web Services");
        modulo5.add("Utilizando SOAP em Java");
        modulo5.add("Utilizando REST em Java");

        //Populando o HashMap com os nomes dos módulos,
        //  usando como chave o nome do tema
        modulos.put("Programacao Servidor com Java", modulo3);
        modulos.put("JPA e JEE", modulo4);
        modulos.put("Webservices", modulo5);

        String modulosTema = "Módulos: ";

        if (modulos.containsKey(tema)) {
            ArrayList<String> listModulos = modulos.get(tema);
            for (String item : listModulos) {
                modulosTema += " - " + item;
            }
            return modulosTema;
        } else {
            return "Não encontrou";
        }
    }
}
