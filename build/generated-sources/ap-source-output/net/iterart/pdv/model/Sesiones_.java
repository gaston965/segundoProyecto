package net.iterart.pdv.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T11:43:31")
@StaticMetamodel(Sesiones.class)
public class Sesiones_ { 

    public static volatile SingularAttribute<Sesiones, Integer> pkIdSesiones;
    public static volatile SingularAttribute<Sesiones, Float> cajaFin;
    public static volatile SingularAttribute<Sesiones, Date> inicio;
    public static volatile SingularAttribute<Sesiones, Date> fin;
    public static volatile SingularAttribute<Sesiones, Boolean> abierta;
    public static volatile SingularAttribute<Sesiones, Usuarios> usuariosidusuario;
    public static volatile SingularAttribute<Sesiones, Float> cajaIni;

}