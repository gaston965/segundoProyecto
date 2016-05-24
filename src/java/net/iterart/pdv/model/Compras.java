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
@Table(name = "Compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compras.findAll", query = "SELECT c FROM Compras c"),
    @NamedQuery(name = "Compras.findByPkIdEnca", query = "SELECT c FROM Compras c WHERE c.pkIdEnca = :pkIdEnca"),
    @NamedQuery(name = "Compras.findByNumComprobante", query = "SELECT c FROM Compras c WHERE c.numComprobante = :numComprobante"),
    @NamedQuery(name = "Compras.findByFecha", query = "SELECT c FROM Compras c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Compras.findByPagado", query = "SELECT c FROM Compras c WHERE c.pagado = :pagado"),
    @NamedQuery(name = "Compras.findByTotal", query = "SELECT c FROM Compras c WHERE c.total = :total"),
    @NamedQuery(name = "Compras.findByAct", query = "SELECT c FROM Compras c WHERE c.act = :act")})
public class Compras implements Serializable {

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
    private List<DetalleCompras> detalleComprasList;
    @JoinColumn(name = "fk_id_emp", referencedColumnName = "pk_id_emp")
    @ManyToOne(optional = false)
    private Empleados fkIdEmp;
    @JoinColumn(name = "fk_id_prov", referencedColumnName = "pk_id_pro")
    @ManyToOne(optional = false)
    private Proveedores fkIdProv;

    public Compras() {
    }

    public Compras(Integer pkIdEnca) {
        this.pkIdEnca = pkIdEnca;
    }

    public Compras(Integer pkIdEnca, String numComprobante, Date fecha, String pagado, float total) {
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
    public List<DetalleCompras> getDetalleComprasList() {
        return detalleComprasList;
    }

    public void setDetalleComprasList(List<DetalleCompras> detalleComprasList) {
        this.detalleComprasList = detalleComprasList;
    }

    public Empleados getFkIdEmp() {
        return fkIdEmp;
    }

    public void setFkIdEmp(Empleados fkIdEmp) {
        this.fkIdEmp = fkIdEmp;
    }

    public Proveedores getFkIdProv() {
        return fkIdProv;
    }

    public void setFkIdProv(Proveedores fkIdProv) {
        this.fkIdProv = fkIdProv;
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
        if (!(object instanceof Compras)) {
            return false;
        }
        Compras other = (Compras) object;
        if ((this.pkIdEnca == null && other.pkIdEnca != null) || (this.pkIdEnca != null && !this.pkIdEnca.equals(other.pkIdEnca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Compras[ pkIdEnca=" + pkIdEnca + " ]";
    }
    
}
