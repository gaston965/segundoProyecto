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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "Ingresos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingresos.findAll", query = "SELECT i FROM Ingresos i"),
    @NamedQuery(name = "Ingresos.findByPkIdIng", query = "SELECT i FROM Ingresos i WHERE i.pkIdIng = :pkIdIng"),
    @NamedQuery(name = "Ingresos.findByFec", query = "SELECT i FROM Ingresos i WHERE i.fec = :fec"),
    @NamedQuery(name = "Ingresos.findByIng", query = "SELECT i FROM Ingresos i WHERE i.ing = :ing"),
    @NamedQuery(name = "Ingresos.findByVal", query = "SELECT i FROM Ingresos i WHERE i.val = :val")})
public class Ingresos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_ing")
    private Integer pkIdIng;
    @Column(name = "fec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fec;
    @Size(max = 26)
    @Column(name = "ing")
    private String ing;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "val")
    private Float val;
    @JoinColumn(name = "Empleados_pk_id_emp", referencedColumnName = "pk_id_emp")
    @ManyToOne(optional = false)
    private Empleados empleadospkidemp;

    public Ingresos() {
    }

    public Ingresos(Integer pkIdIng) {
        this.pkIdIng = pkIdIng;
    }

    public Integer getPkIdIng() {
        return pkIdIng;
    }

    public void setPkIdIng(Integer pkIdIng) {
        this.pkIdIng = pkIdIng;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public Float getVal() {
        return val;
    }

    public void setVal(Float val) {
        this.val = val;
    }

    public Empleados getEmpleadospkidemp() {
        return empleadospkidemp;
    }

    public void setEmpleadospkidemp(Empleados empleadospkidemp) {
        this.empleadospkidemp = empleadospkidemp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdIng != null ? pkIdIng.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingresos)) {
            return false;
        }
        Ingresos other = (Ingresos) object;
        if ((this.pkIdIng == null && other.pkIdIng != null) || (this.pkIdIng != null && !this.pkIdIng.equals(other.pkIdIng))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Ingresos[ pkIdIng=" + pkIdIng + " ]";
    }
    
}
