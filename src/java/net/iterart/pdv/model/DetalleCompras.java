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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "DetalleCompras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleCompras.findAll", query = "SELECT d FROM DetalleCompras d"),
    @NamedQuery(name = "DetalleCompras.findByPkIdLinea", query = "SELECT d FROM DetalleCompras d WHERE d.pkIdLinea = :pkIdLinea"),
    @NamedQuery(name = "DetalleCompras.findByCantidad", query = "SELECT d FROM DetalleCompras d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleCompras.findByPrecio", query = "SELECT d FROM DetalleCompras d WHERE d.precio = :precio"),
    @NamedQuery(name = "DetalleCompras.findByPreciogan", query = "SELECT d FROM DetalleCompras d WHERE d.preciogan = :preciogan")})
public class DetalleCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_linea")
    private Integer pkIdLinea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private float precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "preciogan")
    private float preciogan;
    @JoinColumn(name = "fk_id_enca", referencedColumnName = "pk_id_enca")
    @ManyToOne(optional = false)
    private Compras fkIdEnca;
    @JoinColumn(name = "fk_id_Prod", referencedColumnName = "pk_id_prod")
    @ManyToOne(optional = false)
    private Productos fkidProd;

    public DetalleCompras() {
    }

    public DetalleCompras(Integer pkIdLinea) {
        this.pkIdLinea = pkIdLinea;
    }

    public DetalleCompras(Integer pkIdLinea, int cantidad, float precio, float preciogan) {
        this.pkIdLinea = pkIdLinea;
        this.cantidad = cantidad;
        this.precio = precio;
        this.preciogan = preciogan;
    }

    public Integer getPkIdLinea() {
        return pkIdLinea;
    }

    public void setPkIdLinea(Integer pkIdLinea) {
        this.pkIdLinea = pkIdLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPreciogan() {
        return preciogan;
    }

    public void setPreciogan(float preciogan) {
        this.preciogan = preciogan;
    }

    public Compras getFkIdEnca() {
        return fkIdEnca;
    }

    public void setFkIdEnca(Compras fkIdEnca) {
        this.fkIdEnca = fkIdEnca;
    }

    public Productos getFkidProd() {
        return fkidProd;
    }

    public void setFkidProd(Productos fkidProd) {
        this.fkidProd = fkidProd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdLinea != null ? pkIdLinea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCompras)) {
            return false;
        }
        DetalleCompras other = (DetalleCompras) object;
        if ((this.pkIdLinea == null && other.pkIdLinea != null) || (this.pkIdLinea != null && !this.pkIdLinea.equals(other.pkIdLinea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.DetalleCompras[ pkIdLinea=" + pkIdLinea + " ]";
    }
    
}
