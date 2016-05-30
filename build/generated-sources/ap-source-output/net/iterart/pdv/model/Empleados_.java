package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Compras;
import net.iterart.pdv.model.Devolucion;
import net.iterart.pdv.model.Gastos;
import net.iterart.pdv.model.Ingresos;
import net.iterart.pdv.model.Usuarios;
import net.iterart.pdv.model.Ventas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-29T23:58:44")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile ListAttribute<Empleados, Compras> comprasList;
    public static volatile ListAttribute<Empleados, Devolucion> devolucionList;
    public static volatile SingularAttribute<Empleados, String> domi;
    public static volatile ListAttribute<Empleados, Ventas> ventasList;
    public static volatile ListAttribute<Empleados, Gastos> gastosList;
    public static volatile SingularAttribute<Empleados, String> apeEmp;
    public static volatile ListAttribute<Empleados, Ingresos> ingresosList;
    public static volatile SingularAttribute<Empleados, Integer> pkIdEmp;
    public static volatile SingularAttribute<Empleados, Usuarios> fkIdUsu;
    public static volatile SingularAttribute<Empleados, Boolean> act;
    public static volatile SingularAttribute<Empleados, String> tele;
    public static volatile SingularAttribute<Empleados, String> dni;
    public static volatile SingularAttribute<Empleados, String> email;

}