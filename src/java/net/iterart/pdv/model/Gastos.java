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
@Table(name = "Gastos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gastos.findAll", query = "SELECT g FROM Gastos g"),
    @NamedQuery(name = "Gastos.findByPkIdGas", query = "SELECT g FROM Gastos g WHERE g.pkIdGas = :pkIdGas"),
    @NamedQuery(name = "Gastos.findByFec", query = "SELECT g FROM Gastos g WHERE g.fec = :fec"),
    @NamedQuery(name = "Gastos.findByGas", query = "SELECT g FROM Gastos g WHERE g.gas = :gas"),
    @NamedQuery(name = "Gastos.findByVal", query = "SELECT g FROM Gastos g WHERE g.val = :val")})
public class Gastos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_gas")
    private Integer pkIdGas;
    @Column(name = "fec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fec;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "gas")
    private String gas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "val")
    private float val;
    @JoinColumn(name = "Empleados_pk_id_emp", referencedColumnName = "pk_id_emp")
    @ManyToOne(optional = false)
    private Empleados empleadospkidemp;
    @JoinColumn(name = "Categoria_pk_id_cat", referencedColumnName = "pk_id_cat")
    @ManyToOne(optional = false)
    private Categoria categoriapkidcat;

    public Gastos() {
    }

    public Gastos(Integer pkIdGas) {
        this.pkIdGas = pkIdGas;
    }

    public Gastos(Integer pkIdGas, String gas, float val) {
        this.pkIdGas = pkIdGas;
        this.gas = gas;
        this.val = val;
    }

    public Integer getPkIdGas() {
        return pkIdGas;
    }

    public void setPkIdGas(Integer pkIdGas) {
        this.pkIdGas = pkIdGas;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public float getVal() {
        return val;
    }

    public void setVal(float val) {
        this.val = val;
    }

    public Empleados getEmpleadospkidemp() {
        return empleadospkidemp;
    }

    public void setEmpleadospkidemp(Empleados empleadospkidemp) {
        this.empleadospkidemp = empleadospkidemp;
    }

    public Categoria getCategoriapkidcat() {
        return categoriapkidcat;
    }

    public void setCategoriapkidcat(Categoria categoriapkidcat) {
        this.categoriapkidcat = categoriapkidcat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdGas != null ? pkIdGas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gastos)) {
            return false;
        }
        Gastos other = (Gastos) object;
        if ((this.pkIdGas == null && other.pkIdGas != null) || (this.pkIdGas != null && !this.pkIdGas.equals(other.pkIdGas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Gastos[ pkIdGas=" + pkIdGas + " ]";
    }
    
}
