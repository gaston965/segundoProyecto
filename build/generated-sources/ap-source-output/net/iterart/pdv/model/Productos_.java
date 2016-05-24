package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.DetalleCompras;
import net.iterart.pdv.model.DetalleDevolucion;
import net.iterart.pdv.model.DetalleVentas;
import net.iterart.pdv.model.Rubros;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T10:55:15")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Float> procentaje;
    public static volatile SingularAttribute<Productos, Float> preciov2;
    public static volatile SingularAttribute<Productos, Rubros> rubrosIdRubro;
    public static volatile SingularAttribute<Productos, Float> preciocompra;
    public static volatile SingularAttribute<Productos, Float> preciov;
    public static volatile SingularAttribute<Productos, String> descr;
    public static volatile ListAttribute<Productos, DetalleVentas> detalleVentasList;
    public static volatile SingularAttribute<Productos, Boolean> act;
    public static volatile SingularAttribute<Productos, Integer> stockMin;
    public static volatile ListAttribute<Productos, DetalleCompras> detalleComprasList;
    public static volatile SingularAttribute<Productos, Float> procentaje2;
    public static volatile SingularAttribute<Productos, Integer> pkIdProd;
    public static volatile SingularAttribute<Productos, String> codProv;
    public static volatile SingularAttribute<Productos, Integer> stock;
    public static volatile ListAttribute<Productos, DetalleDevolucion> detalleDevolucionList;

}