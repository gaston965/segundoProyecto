package net.iterart.pdv.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Categoria;
import net.iterart.pdv.model.Empleados;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T10:40:52")
@StaticMetamodel(Gastos.class)
public class Gastos_ { 

    public static volatile SingularAttribute<Gastos, Integer> pkIdGas;
    public static volatile SingularAttribute<Gastos, Float> val;
    public static volatile SingularAttribute<Gastos, Categoria> categoriapkidcat;
    public static volatile SingularAttribute<Gastos, Date> fec;
    public static volatile SingularAttribute<Gastos, String> gas;
    public static volatile SingularAttribute<Gastos, Empleados> empleadospkidemp;

}