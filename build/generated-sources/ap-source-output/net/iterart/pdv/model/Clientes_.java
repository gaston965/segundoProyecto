package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Devolucion;
import net.iterart.pdv.model.Operaciones;
import net.iterart.pdv.model.Usuarios;
import net.iterart.pdv.model.Ventas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T16:13:23")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile ListAttribute<Clientes, Devolucion> devolucionList;
    public static volatile SingularAttribute<Clientes, String> domi;
    public static volatile SingularAttribute<Clientes, Integer> pkIdCli;
    public static volatile ListAttribute<Clientes, Ventas> ventasList;
    public static volatile SingularAttribute<Clientes, Float> saldo;
    public static volatile SingularAttribute<Clientes, Usuarios> fkIdUsu;
    public static volatile SingularAttribute<Clientes, Boolean> act;
    public static volatile SingularAttribute<Clientes, String> apeCli;
    public static volatile SingularAttribute<Clientes, Float> montoLimite;
    public static volatile SingularAttribute<Clientes, String> tele;
    public static volatile SingularAttribute<Clientes, String> dni;
    public static volatile SingularAttribute<Clientes, String> email;
    public static volatile ListAttribute<Clientes, Operaciones> operacionesList;

}