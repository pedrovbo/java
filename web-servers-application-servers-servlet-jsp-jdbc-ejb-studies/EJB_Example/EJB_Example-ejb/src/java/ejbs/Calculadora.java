/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejbs;

import jakarta.ejb.Stateless;

/**
 *
 * @author pedro
 */
@Stateless
public class Calculadora implements CalculadoraLocal {

    @Override
    public int somar(int a, int b) {
        return a + b;
    }
}
