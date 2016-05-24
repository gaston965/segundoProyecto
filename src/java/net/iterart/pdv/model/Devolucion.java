/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iterart.pdv.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "Devolucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Devolucion.findAll", query = "SELECT d FROM Devolucion d"),
    @NamedQuery(name = "Devolucion.findByPkIdEnca", query = "SELECT d FROM Devolucion d WHERE d.pkIdEnca = :pkIdEnca"),
    @NamedQuery(name = "Devolucion.findByNumComprobante", query = "SELECT d FROM Devolucion d WHERE d.numComprobante = :numComprobante"),
    @NamedQuery(name = "Devolucion.findByFecha", query = "SELECT d FROM Devolucion d WHERE d.fecha = :fecha"),
    @NamedQuery(name = "Devolucion.findByPagado", query = "SELECT d FROM Devolucion d WHERE d.pagado = :pagado"),
    @NamedQuery(name = "Devolucion.findByTotal", query = "SELECT d FROM Devolucion d WHERE d.total = :total"),
    @NamedQuery(name = "Devolucion.findByAct", query = "SELECT d FROM Devolucion d WHERE d.act = :act")})
public class Devolucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_enca")
    private Integer pkIdEnca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "num_comprobante")
    private String numComprobante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "pagado")
    private String pagado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private float total;
    @Column(name = "act")
    private Boolean act;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdEnca")
    private List<DetalleDevolucion> detalleDevolucionList;
    @JoinColumn(name = "fk_id_cli", referencedColumnName = "pk_id_cli")
    @ManyToOne(optional = false)
    private Clientes fkIdCli;
    @JoinColumn(name = "fk_id_emp", referencedColumnName = "pk_id_emp")
    @ManyToOne(optional = false)
    private Empleados fkIdEmp;

    public Devolucion() {
    }

    public Devolucion(Integer pkIdEnca) {
        this.pkIdEnca = pkIdEnca;
    }

    public Devolucion(Integer pkIdEnca, String numComprobante, Date fecha, String pagado, float total) {
        this.pkIdEnca = pkIdEnca;
        this.numComprobante = numComprobante;
        this.fecha = fecha;
        this.pagado = pagado;
        this.total = total;
    }

    public Integer getPkIdEnca() {
        return pkIdEnca;
    }

    public void setPkIdEnca(Integer pkIdEnca) {
        this.pkIdEnca = pkIdEnca;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Boolean getAct() {
        return act;
    }

    public void setAct(Boolean act) {
        this.act = act;
    }

    @XmlTransient
    public List<DetalleDevolucion> getDetalleDevolucionList() {
        return detalleDevolucionList;
    }

    public void setDetalleDevolucionList(List<DetalleDevolucion> detalleDevolucionList) {
        this.detalleDevolucionList = detalleDevolucionList;
    }

    public Clientes getFkIdCli() {
        return fkIdCli;
    }

    public void setFkIdCli(Clientes fkIdCli) {
        this.fkIdCli = fkIdCli;
    }

    public Empleados getFkIdEmp() {
        return fkIdEmp;
    }

    public void setFkIdEmp(Empleados fkIdEmp) {
        this.fkIdEmp = fkIdEmp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdEnca != null ? pkIdEnca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolucion)) {
            return false;
        }
        Devolucion other = (Devolucion) object;
        if ((this.pkIdEnca == null && other.pkIdEnca != null) || (this.pkIdEnca != null && !this.pkIdEnca.equals(other.pkIdEnca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Devolucion[ pkIdEnca=" + pkIdEnca + " ]";
    }
    
}
