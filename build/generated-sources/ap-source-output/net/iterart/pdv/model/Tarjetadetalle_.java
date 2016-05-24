package net.iterart.pdv.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.iterart.pdv.model.Tarjetas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-24T19:51:47")
@StaticMetamodel(Tarjetadetalle.class)
public class Tarjetadetalle_ { 

    public static volatile SingularAttribute<Tarjetadetalle, Integer> pkIdTarjetadetalle;
    public static volatile SingularAttribute<Tarjetadetalle, Tarjetas> tarjetaspkidtarjeta;
    public static volatile SingularAttribute<Tarjetadetalle, Integer> pagos;
    public static volatile SingularAttribute<Tarjetadetalle, Float> interes;

}