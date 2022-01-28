package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Departamento;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-01-28T03:18:22")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile ListAttribute<Empresa, Departamento> departamentoList;
    public static volatile SingularAttribute<Empresa, Integer> codigo;
    public static volatile SingularAttribute<Empresa, String> razaoSocial;

}