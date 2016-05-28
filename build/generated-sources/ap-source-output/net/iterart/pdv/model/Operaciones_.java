package net.iterart.pdv.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Clientes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T11:43:31")
@StaticMetamodel(Operaciones.class)
public class Operaciones_ { 

    public static volatile SingularAttribute<Operaciones, String> descr;
    public static volatile SingularAttribute<Operaciones, Float> compra;
    public static volatile SingularAttribute<Operaciones, Date> fecha;
    public static volatile SingularAttribute<Operaciones, Boolean> act;
    public static volatile SingularAttribute<Operaciones, Clientes> fkIdCli;
    public static volatile SingularAttribute<Operaciones, Float> saldo;
    public static volatile SingularAttribute<Operaciones, Integer> pkIdOpe;
    public static volatile SingularAttribute<Operaciones, Float> pago;

}