package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Productos;
import net.iterart.pdv.model.Ventas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T00:34:26")
@StaticMetamodel(DetalleVentas.class)
public class DetalleVentas_ { 

    public static volatile SingularAttribute<DetalleVentas, Ventas> fkIdEnca;
    public static volatile SingularAttribute<DetalleVentas, Productos> fkidProd;
    public static volatile SingularAttribute<DetalleVentas, Float> precio;
    public static volatile SingularAttribute<DetalleVentas, Float> preciogan;
    public static volatile SingularAttribute<DetalleVentas, Integer> cantidad;
    public static volatile SingularAttribute<DetalleVentas, Integer> pkIdLinea;

}