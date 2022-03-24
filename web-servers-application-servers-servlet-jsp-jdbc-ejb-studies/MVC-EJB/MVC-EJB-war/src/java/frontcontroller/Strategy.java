/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontcontroller;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author pedro
 */
public abstract class Strategy<K>{
protected final K facade;
public Strategy(K facade) {
    this.facade = facade;
}
public abstract String executar(String acao,
                HttpServletRequest request);
}
