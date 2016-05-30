package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Clientes;
import net.iterart.pdv.model.Empleados;
import net.iterart.pdv.model.Niveles;
import net.iterart.pdv.model.Sesiones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-29T23:58:44")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile ListAttribute<Usuarios, Clientes> clientesList;
    public static volatile ListAttribute<Usuarios, Empleados> empleadosList;
    public static volatile SingularAttribute<Usuarios, String> pass;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuario;
    public static volatile SingularAttribute<Usuarios, Boolean> hab;
    public static volatile SingularAttribute<Usuarios, Niveles> fkIdNivel;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile ListAttribute<Usuarios, Sesiones> sesionesList;

}