/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iterart.pdv.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "Operaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operaciones.findAll", query = "SELECT o FROM Operaciones o"),
    @NamedQuery(name = "Operaciones.findByPkIdOpe", query = "SELECT o FROM Operaciones o WHERE o.pkIdOpe = :pkIdOpe"),
    @NamedQuery(name = "Operaciones.findByDescr", query = "SELECT o FROM Operaciones o WHERE o.descr = :descr"),
    @NamedQuery(name = "Operaciones.findByPago", query = "SELECT o FROM Operaciones o WHERE o.pago = :pago"),
    @NamedQuery(name = "Operaciones.findByCompra", query = "SELECT o FROM Operaciones o WHERE o.compra = :compra"),
    @NamedQuery(name = "Operaciones.findByFecha", query = "SELECT o FROM Operaciones o WHERE o.fecha = :fecha"),
    @NamedQuery(name = "Operaciones.findBySaldo", query = "SELECT o FROM Operaciones o WHERE o.saldo = :saldo"),
    @NamedQuery(name = "Operaciones.findByAct", query = "SELECT o FROM Operaciones o WHERE o.act = :act")})
public class Operaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_ope")
    private Integer pkIdOpe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descr")
    private String descr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pago")
    private Float pago;
    @Column(name = "compra")
    private Float compra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saldo")
    private float saldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "act")
    private boolean act;
    @JoinColumn(name = "fk_id_cli", referencedColumnName = "pk_id_cli")
    @ManyToOne(optional = false)
    private Clientes fkIdCli;

    public Operaciones() {
    }

    public Operaciones(Integer pkIdOpe) {
        this.pkIdOpe = pkIdOpe;
    }

    public Operaciones(Integer pkIdOpe, String descr, Date fecha, float saldo, boolean act) {
        this.pkIdOpe = pkIdOpe;
        this.descr = descr;
        this.fecha = fecha;
        this.saldo = saldo;
        this.act = act;
    }

    public Integer getPkIdOpe() {
        return pkIdOpe;
    }

    public void setPkIdOpe(Integer pkIdOpe) {
        this.pkIdOpe = pkIdOpe;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Float getPago() {
        return pago;
    }

    public void setPago(Float pago) {
        this.pago = pago;
    }

    public Float getCompra() {
        return compra;
    }

    public void setCompra(Float compra) {
        this.compra = compra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    public Clientes getFkIdCli() {
        return fkIdCli;
    }

    public void setFkIdCli(Clientes fkIdCli) {
        this.fkIdCli = fkIdCli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdOpe != null ? pkIdOpe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operaciones)) {
            return false;
        }
        Operaciones other = (Operaciones) object;
        if ((this.pkIdOpe == null && other.pkIdOpe != null) || (this.pkIdOpe != null && !this.pkIdOpe.equals(other.pkIdOpe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Operaciones[ pkIdOpe=" + pkIdOpe + " ]";
    }
    
}
