package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Empresa;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-01-28T03:18:22")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> codigo;
    public static volatile SingularAttribute<Departamento, String> nome;
    public static volatile SingularAttribute<Departamento, Empresa> empresa;

}