package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Productos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-30T15:56:40")
@StaticMetamodel(Rubros.class)
public class Rubros_ { 

    public static volatile SingularAttribute<Rubros, String> rubro;
    public static volatile SingularAttribute<Rubros, Integer> pkIdRubro;
    public static volatile SingularAttribute<Rubros, Boolean> hab;
    public static volatile ListAttribute<Rubros, Productos> productosList;

}