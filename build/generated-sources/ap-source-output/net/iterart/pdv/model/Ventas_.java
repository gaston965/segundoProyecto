package net.iterart.pdv.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Clientes;
import net.iterart.pdv.model.DetalleVentas;
import net.iterart.pdv.model.Empleados;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T11:43:31")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, String> numComprobante;
    public static volatile SingularAttribute<Ventas, Date> fecha;
    public static volatile SingularAttribute<Ventas, Float> total;
    public static volatile ListAttribute<Ventas, DetalleVentas> detalleVentasList;
    public static volatile SingularAttribute<Ventas, String> pagado;
    public static volatile SingularAttribute<Ventas, Boolean> act;
    public static volatile SingularAttribute<Ventas, Clientes> fkIdCli;
    public static volatile SingularAttribute<Ventas, Float> totalganacia;
    public static volatile SingularAttribute<Ventas, Empleados> fkIdEmp;
    public static volatile SingularAttribute<Ventas, Integer> pkIdEnca;

}