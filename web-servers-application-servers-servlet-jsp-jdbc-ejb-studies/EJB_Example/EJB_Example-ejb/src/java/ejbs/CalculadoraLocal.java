/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejbs;

import jakarta.ejb.Local;

/**
 *
 * @author pedro
 */
@Local
public interface CalculadoraLocal {

    int somar(int a, int b);
}
