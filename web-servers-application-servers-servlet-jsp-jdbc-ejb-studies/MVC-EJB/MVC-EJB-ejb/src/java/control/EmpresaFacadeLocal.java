/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control;

import java.util.List;
import javax.ejb.Local;
import model.Empresa;

/**
 *
 * @author pedro
 */
@Local
public interface EmpresaFacadeLocal {

    void create(Empresa empresa);

    void edit(Empresa empresa);

    void remove(Empresa empresa);

    Empresa find(Object id);

    List<Empresa> findAll();

    List<Empresa> findRange(int[] range);

    int count();
    
}
