package net.iterart.pdv.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Clientes;
import net.iterart.pdv.model.DetalleDevolucion;
import net.iterart.pdv.model.Empleados;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-27T10:47:33")
@StaticMetamodel(Devolucion.class)
public class Devolucion_ { 

    public static volatile SingularAttribute<Devolucion, String> numComprobante;
    public static volatile SingularAttribute<Devolucion, Date> fecha;
    public static volatile SingularAttribute<Devolucion, Float> total;
    public static volatile SingularAttribute<Devolucion, String> pagado;
    public static volatile SingularAttribute<Devolucion, Boolean> act;
    public static volatile SingularAttribute<Devolucion, Clientes> fkIdCli;
    public static volatile ListAttribute<Devolucion, DetalleDevolucion> detalleDevolucionList;
    public static volatile SingularAttribute<Devolucion, Empleados> fkIdEmp;
    public static volatile SingularAttribute<Devolucion, Integer> pkIdEnca;

}