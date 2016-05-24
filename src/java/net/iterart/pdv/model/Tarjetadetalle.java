/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iterart.pdv.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "Tarjeta_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjetadetalle.findAll", query = "SELECT t FROM Tarjetadetalle t"),
    @NamedQuery(name = "Tarjetadetalle.findByPkIdTarjetadetalle", query = "SELECT t FROM Tarjetadetalle t WHERE t.pkIdTarjetadetalle = :pkIdTarjetadetalle"),
    @NamedQuery(name = "Tarjetadetalle.findByInteres", query = "SELECT t FROM Tarjetadetalle t WHERE t.interes = :interes"),
    @NamedQuery(name = "Tarjetadetalle.findByPagos", query = "SELECT t FROM Tarjetadetalle t WHERE t.pagos = :pagos")})
public class Tarjetadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_tarjetadetalle")
    private Integer pkIdTarjetadetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "interes")
    private Float interes;
    @Column(name = "PAGOS")
    private Integer pagos;
    @JoinColumn(name = "Tarjetas_pk_id_tarjeta", referencedColumnName = "pk_id_tarjeta")
    @ManyToOne(optional = false)
    private Tarjetas tarjetaspkidtarjeta;

    public Tarjetadetalle() {
    }

    public Tarjetadetalle(Integer pkIdTarjetadetalle) {
        this.pkIdTarjetadetalle = pkIdTarjetadetalle;
    }

    public Integer getPkIdTarjetadetalle() {
        return pkIdTarjetadetalle;
    }

    public void setPkIdTarjetadetalle(Integer pkIdTarjetadetalle) {
        this.pkIdTarjetadetalle = pkIdTarjetadetalle;
    }

    public Float getInteres() {
        return interes;
    }

    public void setInteres(Float interes) {
        this.interes = interes;
    }

    public Integer getPagos() {
        return pagos;
    }

    public void setPagos(Integer pagos) {
        this.pagos = pagos;
    }

    public Tarjetas getTarjetaspkidtarjeta() {
        return tarjetaspkidtarjeta;
    }

    public void setTarjetaspkidtarjeta(Tarjetas tarjetaspkidtarjeta) {
        this.tarjetaspkidtarjeta = tarjetaspkidtarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdTarjetadetalle != null ? pkIdTarjetadetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetadetalle)) {
            return false;
        }
        Tarjetadetalle other = (Tarjetadetalle) object;
        if ((this.pkIdTarjetadetalle == null && other.pkIdTarjetadetalle != null) || (this.pkIdTarjetadetalle != null && !this.pkIdTarjetadetalle.equals(other.pkIdTarjetadetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Tarjetadetalle[ pkIdTarjetadetalle=" + pkIdTarjetadetalle + " ]";
    }
    
}
