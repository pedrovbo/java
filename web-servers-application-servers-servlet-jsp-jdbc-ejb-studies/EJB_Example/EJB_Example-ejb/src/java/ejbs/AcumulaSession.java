/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package ejbs;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author pedro
 */
@Stateful
public class AcumulaSession implements AcumulaSessionLocal {

    private List<String> lista;
    
    @PostConstruct
    private void initializeBean(){
        lista = new ArrayList<>();
    }
    
    @Override
    public void addString(String texto){
        lista.add(texto);
    }

    @Override
    public List<String> getLista() {
        return lista;
    }
}
