package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Compras;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T10:40:52")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, Boolean> act;
    public static volatile SingularAttribute<Proveedores, Integer> pkIdPro;
    public static volatile ListAttribute<Proveedores, Compras> comprasList;
    public static volatile SingularAttribute<Proveedores, String> apePro;
    public static volatile SingularAttribute<Proveedores, String> domi;
    public static volatile SingularAttribute<Proveedores, String> tele;
    public static volatile SingularAttribute<Proveedores, String> pathImg;
    public static volatile SingularAttribute<Proveedores, String> dni;
    public static volatile SingularAttribute<Proveedores, String> email;

}