/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iterart.pdv.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "Tarjetas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjetas.findAll", query = "SELECT t FROM Tarjetas t"),
    @NamedQuery(name = "Tarjetas.findByPkIdTarjeta", query = "SELECT t FROM Tarjetas t WHERE t.pkIdTarjeta = :pkIdTarjeta"),
    @NamedQuery(name = "Tarjetas.findByTarjeta", query = "SELECT t FROM Tarjetas t WHERE t.tarjeta = :tarjeta")})
public class Tarjetas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_tarjeta")
    private Integer pkIdTarjeta;
    @Size(max = 45)
    @Column(name = "tarjeta")
    private String tarjeta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarjetaspkidtarjeta")
    private List<Tarjetadetalle> tarjetadetalleList;

    public Tarjetas() {
    }

    public Tarjetas(Integer pkIdTarjeta) {
        this.pkIdTarjeta = pkIdTarjeta;
    }

    public Integer getPkIdTarjeta() {
        return pkIdTarjeta;
    }

    public void setPkIdTarjeta(Integer pkIdTarjeta) {
        this.pkIdTarjeta = pkIdTarjeta;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    @XmlTransient
    public List<Tarjetadetalle> getTarjetadetalleList() {
        return tarjetadetalleList;
    }

    public void setTarjetadetalleList(List<Tarjetadetalle> tarjetadetalleList) {
        this.tarjetadetalleList = tarjetadetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdTarjeta != null ? pkIdTarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetas)) {
            return false;
        }
        Tarjetas other = (Tarjetas) object;
        if ((this.pkIdTarjeta == null && other.pkIdTarjeta != null) || (this.pkIdTarjeta != null && !this.pkIdTarjeta.equals(other.pkIdTarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Tarjetas[ pkIdTarjeta=" + pkIdTarjeta + " ]";
    }
    
}
