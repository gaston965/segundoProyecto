package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Devolucion;
import net.iterart.pdv.model.Productos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T16:13:23")
@StaticMetamodel(DetalleDevolucion.class)
public class DetalleDevolucion_ { 

    public static volatile SingularAttribute<DetalleDevolucion, Devolucion> fkIdEnca;
    public static volatile SingularAttribute<DetalleDevolucion, Productos> fkidProd;
    public static volatile SingularAttribute<DetalleDevolucion, Float> precio;
    public static volatile SingularAttribute<DetalleDevolucion, Integer> cantidad;
    public static volatile SingularAttribute<DetalleDevolucion, Integer> pkIdLinea;

}