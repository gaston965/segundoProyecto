package net.iterart.pdv.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Empleados;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-29T23:58:44")
@StaticMetamodel(Ingresos.class)
public class Ingresos_ { 

    public static volatile SingularAttribute<Ingresos, Float> val;
    public static volatile SingularAttribute<Ingresos, String> ing;
    public static volatile SingularAttribute<Ingresos, Date> fec;
    public static volatile SingularAttribute<Ingresos, Empleados> empleadospkidemp;
    public static volatile SingularAttribute<Ingresos, Integer> pkIdIng;

}