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
@Table(name = "Empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByPkIdEmp", query = "SELECT e FROM Empleados e WHERE e.pkIdEmp = :pkIdEmp"),
    @NamedQuery(name = "Empleados.findByApeEmp", query = "SELECT e FROM Empleados e WHERE e.apeEmp = :apeEmp"),
    @NamedQuery(name = "Empleados.findByDni", query = "SELECT e FROM Empleados e WHERE e.dni = :dni"),
    @NamedQuery(name = "Empleados.findByDomi", query = "SELECT e FROM Empleados e WHERE e.domi = :domi"),
    @NamedQuery(name = "Empleados.findByTele", query = "SELECT e FROM Empleados e WHERE e.tele = :tele"),
    @NamedQuery(name = "Empleados.findByEmail", query = "SELECT e FROM Empleados e WHERE e.email = :email"),
    @NamedQuery(name = "Empleados.findByAct", query = "SELECT e FROM Empleados e WHERE e.act = :act")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_emp")
    private Integer pkIdEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ape_emp")
    private String apeEmp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "dni")
    private String dni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "domi")
    private String domi;
    @Size(max = 50)
    @Column(name = "tele")
    private String tele;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Column(name = "act")
    private Boolean act;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdEmp")
    private List<Devolucion> devolucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdEmp")
    private List<Ventas> ventasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadospkidemp")
    private List<Gastos> gastosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdEmp")
    private List<Compras> comprasList;
    @JoinColumn(name = "fk_id_usu", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuarios fkIdUsu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleadospkidemp")
    private List<Ingresos> ingresosList;

    public Empleados() {
    }

    public Empleados(Integer pkIdEmp) {
        this.pkIdEmp = pkIdEmp;
    }

    public Empleados(Integer pkIdEmp, String apeEmp, String dni, String domi) {
        this.pkIdEmp = pkIdEmp;
        this.apeEmp = apeEmp;
        this.dni = dni;
        this.domi = domi;
    }

    public Integer getPkIdEmp() {
        return pkIdEmp;
    }

    public void setPkIdEmp(Integer pkIdEmp) {
        this.pkIdEmp = pkIdEmp;
    }

    public String getApeEmp() {
        return apeEmp;
    }

    public void setApeEmp(String apeEmp) {
        this.apeEmp = apeEmp;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomi() {
        return domi;
    }

    public void setDomi(String domi) {
        this.domi = domi;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAct() {
        return act;
    }

    public void setAct(Boolean act) {
        this.act = act;
    }

    @XmlTransient
    public List<Devolucion> getDevolucionList() {
        return devolucionList;
    }

    public void setDevolucionList(List<Devolucion> devolucionList) {
        this.devolucionList = devolucionList;
    }

    @XmlTransient
    public List<Ventas> getVentasList() {
        return ventasList;
    }

    public void setVentasList(List<Ventas> ventasList) {
        this.ventasList = ventasList;
    }

    @XmlTransient
    public List<Gastos> getGastosList() {
        return gastosList;
    }

    public void setGastosList(List<Gastos> gastosList) {
        this.gastosList = gastosList;
    }

    @XmlTransient
    public List<Compras> getComprasList() {
        return comprasList;
    }

    public void setComprasList(List<Compras> comprasList) {
        this.comprasList = comprasList;
    }

    public Usuarios getFkIdUsu() {
        return fkIdUsu;
    }

    public void setFkIdUsu(Usuarios fkIdUsu) {
        this.fkIdUsu = fkIdUsu;
    }

    @XmlTransient
    public List<Ingresos> getIngresosList() {
        return ingresosList;
    }

    public void setIngresosList(List<Ingresos> ingresosList) {
        this.ingresosList = ingresosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdEmp != null ? pkIdEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.pkIdEmp == null && other.pkIdEmp != null) || (this.pkIdEmp != null && !this.pkIdEmp.equals(other.pkIdEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Empleados[ pkIdEmp=" + pkIdEmp + " ]";
    }
    
}
