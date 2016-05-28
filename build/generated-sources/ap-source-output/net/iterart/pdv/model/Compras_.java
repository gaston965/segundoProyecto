package net.iterart.pdv.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.DetalleCompras;
import net.iterart.pdv.model.Empleados;
import net.iterart.pdv.model.Proveedores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T11:43:31")
@StaticMetamodel(Compras.class)
public class Compras_ { 

    public static volatile SingularAttribute<Compras, String> numComprobante;
    public static volatile SingularAttribute<Compras, Date> fecha;
    public static volatile SingularAttribute<Compras, Float> total;
    public static volatile SingularAttribute<Compras, Proveedores> fkIdProv;
    public static volatile SingularAttribute<Compras, String> pagado;
    public static volatile SingularAttribute<Compras, Boolean> act;
    public static volatile ListAttribute<Compras, DetalleCompras> detalleComprasList;
    public static volatile SingularAttribute<Compras, Empleados> fkIdEmp;
    public static volatile SingularAttribute<Compras, Integer> pkIdEnca;

}