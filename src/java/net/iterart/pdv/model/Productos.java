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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "Productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findByPkIdProd", query = "SELECT p FROM Productos p WHERE p.pkIdProd = :pkIdProd"),
    @NamedQuery(name = "Productos.findByCodProv", query = "SELECT p FROM Productos p WHERE p.codProv = :codProv"),
    @NamedQuery(name = "Productos.findByDescr", query = "SELECT p FROM Productos p WHERE p.descr = :descr"),
    @NamedQuery(name = "Productos.findByPreciocompra", query = "SELECT p FROM Productos p WHERE p.preciocompra = :preciocompra"),
    @NamedQuery(name = "Productos.findByProcentaje", query = "SELECT p FROM Productos p WHERE p.procentaje = :procentaje"),
    @NamedQuery(name = "Productos.findByProcentaje2", query = "SELECT p FROM Productos p WHERE p.procentaje2 = :procentaje2"),
    @NamedQuery(name = "Productos.findByStock", query = "SELECT p FROM Productos p WHERE p.stock = :stock"),
    @NamedQuery(name = "Productos.findByStockMin", query = "SELECT p FROM Productos p WHERE p.stockMin = :stockMin"),
    @NamedQuery(name = "Productos.findByPreciov", query = "SELECT p FROM Productos p WHERE p.preciov = :preciov"),
    @NamedQuery(name = "Productos.findByPreciov2", query = "SELECT p FROM Productos p WHERE p.preciov2 = :preciov2"),
    @NamedQuery(name = "Productos.findByAct", query = "SELECT p FROM Productos p WHERE p.act = :act")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_prod")
    private Integer pkIdProd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "cod_prov")
    private String codProv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descr")
    private String descr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "preciocompra")
    private float preciocompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "procentaje")
    private float procentaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "procentaje2")
    private float procentaje2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock")
    private int stock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock_min")
    private int stockMin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "preciov")
    private float preciov;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preciov2")
    private Float preciov2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "act")
    private boolean act;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidProd")
    private List<DetalleDevolucion> detalleDevolucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidProd")
    private List<DetalleCompras> detalleComprasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkidProd")
    private List<DetalleVentas> detalleVentasList;
    @JoinColumn(name = "RUBROS_ID_RUBRO", referencedColumnName = "pk_id_rubro")
    @ManyToOne(optional = false)
    private Rubros rubrosIdRubro;

    public Productos() {
    }

    public Productos(Integer pkIdProd) {
        this.pkIdProd = pkIdProd;
    }

    public Productos(Integer pkIdProd, String codProv, String descr, float preciocompra, float procentaje, float procentaje2, int stock, int stockMin, float preciov, boolean act) {
        this.pkIdProd = pkIdProd;
        this.codProv = codProv;
        this.descr = descr;
        this.preciocompra = preciocompra;
        this.procentaje = procentaje;
        this.procentaje2 = procentaje2;
        this.stock = stock;
        this.stockMin = stockMin;
        this.preciov = preciov;
        this.act = act;
    }

    public Integer getPkIdProd() {
        return pkIdProd;
    }

    public void setPkIdProd(Integer pkIdProd) {
        this.pkIdProd = pkIdProd;
    }

    public String getCodProv() {
        return codProv;
    }

    public void setCodProv(String codProv) {
        this.codProv = codProv;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public float getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(float preciocompra) {
        this.preciocompra = preciocompra;
    }

    public float getProcentaje() {
        return procentaje;
    }

    public void setProcentaje(float procentaje) {
        this.procentaje = procentaje;
    }

    public float getProcentaje2() {
        return procentaje2;
    }

    public void setProcentaje2(float procentaje2) {
        this.procentaje2 = procentaje2;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public float getPreciov() {
        return preciov;
    }

    public void setPreciov(float preciov) {
        this.preciov = preciov;
    }

    public Float getPreciov2() {
        return preciov2;
    }

    public void setPreciov2(Float preciov2) {
        this.preciov2 = preciov2;
    }

    public boolean getAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    @XmlTransient
    public List<DetalleDevolucion> getDetalleDevolucionList() {
        return detalleDevolucionList;
    }

    public void setDetalleDevolucionList(List<DetalleDevolucion> detalleDevolucionList) {
        this.detalleDevolucionList = detalleDevolucionList;
    }

    @XmlTransient
    public List<DetalleCompras> getDetalleComprasList() {
        return detalleComprasList;
    }

    public void setDetalleComprasList(List<DetalleCompras> detalleComprasList) {
        this.detalleComprasList = detalleComprasList;
    }

    @XmlTransient
    public List<DetalleVentas> getDetalleVentasList() {
        return detalleVentasList;
    }

    public void setDetalleVentasList(List<DetalleVentas> detalleVentasList) {
        this.detalleVentasList = detalleVentasList;
    }

    public Rubros getRubrosIdRubro() {
        return rubrosIdRubro;
    }

    public void setRubrosIdRubro(Rubros rubrosIdRubro) {
        this.rubrosIdRubro = rubrosIdRubro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdProd != null ? pkIdProd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.pkIdProd == null && other.pkIdProd != null) || (this.pkIdProd != null && !this.pkIdProd.equals(other.pkIdProd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Productos[ pkIdProd=" + pkIdProd + " ]";
    }
    
}
