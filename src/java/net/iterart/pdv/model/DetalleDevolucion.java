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
@Table(name = "DetalleDevolucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleDevolucion.findAll", query = "SELECT d FROM DetalleDevolucion d"),
    @NamedQuery(name = "DetalleDevolucion.findByPkIdLinea", query = "SELECT d FROM DetalleDevolucion d WHERE d.pkIdLinea = :pkIdLinea"),
    @NamedQuery(name = "DetalleDevolucion.findByCantidad", query = "SELECT d FROM DetalleDevolucion d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleDevolucion.findByPrecio", query = "SELECT d FROM DetalleDevolucion d WHERE d.precio = :precio")})
public class DetalleDevolucion implements Serializable {

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
    @JoinColumn(name = "fk_id_enca", referencedColumnName = "pk_id_enca")
    @ManyToOne(optional = false)
    private Devolucion fkIdEnca;
    @JoinColumn(name = "fk_id_Prod", referencedColumnName = "pk_id_prod")
    @ManyToOne(optional = false)
    private Productos fkidProd;

    public DetalleDevolucion() {
    }

    public DetalleDevolucion(Integer pkIdLinea) {
        this.pkIdLinea = pkIdLinea;
    }

    public DetalleDevolucion(Integer pkIdLinea, int cantidad, float precio) {
        this.pkIdLinea = pkIdLinea;
        this.cantidad = cantidad;
        this.precio = precio;
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

    public Devolucion getFkIdEnca() {
        return fkIdEnca;
    }

    public void setFkIdEnca(Devolucion fkIdEnca) {
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
        if (!(object instanceof DetalleDevolucion)) {
            return false;
        }
        DetalleDevolucion other = (DetalleDevolucion) object;
        if ((this.pkIdLinea == null && other.pkIdLinea != null) || (this.pkIdLinea != null && !this.pkIdLinea.equals(other.pkIdLinea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.DetalleDevolucion[ pkIdLinea=" + pkIdLinea + " ]";
    }
    
}
