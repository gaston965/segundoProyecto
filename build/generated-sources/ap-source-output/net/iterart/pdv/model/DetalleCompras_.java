package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Compras;
import net.iterart.pdv.model.Productos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T16:13:23")
@StaticMetamodel(DetalleCompras.class)
public class DetalleCompras_ { 

    public static volatile SingularAttribute<DetalleCompras, Compras> fkIdEnca;
    public static volatile SingularAttribute<DetalleCompras, Productos> fkidProd;
    public static volatile SingularAttribute<DetalleCompras, Float> precio;
    public static volatile SingularAttribute<DetalleCompras, Float> preciogan;
    public static volatile SingularAttribute<DetalleCompras, Integer> cantidad;
    public static volatile SingularAttribute<DetalleCompras, Integer> pkIdLinea;

}