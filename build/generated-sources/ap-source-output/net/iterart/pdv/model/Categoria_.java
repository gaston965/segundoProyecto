package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Gastos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T16:13:23")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, Integer> pkIdCat;
    public static volatile SingularAttribute<Categoria, String> cat;
    public static volatile ListAttribute<Categoria, Gastos> gastosList;

}