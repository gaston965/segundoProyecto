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
@Table(name = "Ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v"),
    @NamedQuery(name = "Ventas.findByPkIdEnca", query = "SELECT v FROM Ventas v WHERE v.pkIdEnca = :pkIdEnca"),
    @NamedQuery(name = "Ventas.findByNumComprobante", query = "SELECT v FROM Ventas v WHERE v.numComprobante = :numComprobante"),
    @NamedQuery(name = "Ventas.findByFecha", query = "SELECT v FROM Ventas v WHERE v.fecha = :fecha"),
    @NamedQuery(name = "Ventas.findByPagado", query = "SELECT v FROM Ventas v WHERE v.pagado = :pagado"),
    @NamedQuery(name = "Ventas.findByTotal", query = "SELECT v FROM Ventas v WHERE v.total = :total"),
    @NamedQuery(name = "Ventas.findByTotalganacia", query = "SELECT v FROM Ventas v WHERE v.totalganacia = :totalganacia"),
    @NamedQuery(name = "Ventas.findByAct", query = "SELECT v FROM Ventas v WHERE v.act = :act")})
public class Ventas implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalganacia")
    private float totalganacia;
    @Column(name = "act")
    private Boolean act;
    @JoinColumn(name = "fk_id_cli", referencedColumnName = "pk_id_cli")
    @ManyToOne(optional = false)
    private Clientes fkIdCli;
    @JoinColumn(name = "fk_id_emp", referencedColumnName = "pk_id_emp")
    @ManyToOne(optional = false)
    private Empleados fkIdEmp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdEnca")
    private List<DetalleVentas> detalleVentasList;

    public Ventas() {
    }

    public Ventas(Integer pkIdEnca) {
        this.pkIdEnca = pkIdEnca;
    }

    public Ventas(Integer pkIdEnca, String numComprobante, Date fecha, String pagado, float total, float totalganacia) {
        this.pkIdEnca = pkIdEnca;
        this.numComprobante = numComprobante;
        this.fecha = fecha;
        this.pagado = pagado;
        this.total = total;
        this.totalganacia = totalganacia;
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

    public float getTotalganacia() {
        return totalganacia;
    }

    public void setTotalganacia(float totalganacia) {
        this.totalganacia = totalganacia;
    }

    public Boolean getAct() {
        return act;
    }

    public void setAct(Boolean act) {
        this.act = act;
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

    @XmlTransient
    public List<DetalleVentas> getDetalleVentasList() {
        return detalleVentasList;
    }

    public void setDetalleVentasList(List<DetalleVentas> detalleVentasList) {
        this.detalleVentasList = detalleVentasList;
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
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.pkIdEnca == null && other.pkIdEnca != null) || (this.pkIdEnca != null && !this.pkIdEnca.equals(other.pkIdEnca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Ventas[ pkIdEnca=" + pkIdEnca + " ]";
    }
    
}
