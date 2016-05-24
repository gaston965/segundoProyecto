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
@Table(name = "Clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByPkIdCli", query = "SELECT c FROM Clientes c WHERE c.pkIdCli = :pkIdCli"),
    @NamedQuery(name = "Clientes.findByApeCli", query = "SELECT c FROM Clientes c WHERE c.apeCli = :apeCli"),
    @NamedQuery(name = "Clientes.findByDni", query = "SELECT c FROM Clientes c WHERE c.dni = :dni"),
    @NamedQuery(name = "Clientes.findByDomi", query = "SELECT c FROM Clientes c WHERE c.domi = :domi"),
    @NamedQuery(name = "Clientes.findByTele", query = "SELECT c FROM Clientes c WHERE c.tele = :tele"),
    @NamedQuery(name = "Clientes.findByEmail", query = "SELECT c FROM Clientes c WHERE c.email = :email"),
    @NamedQuery(name = "Clientes.findBySaldo", query = "SELECT c FROM Clientes c WHERE c.saldo = :saldo"),
    @NamedQuery(name = "Clientes.findByMontoLimite", query = "SELECT c FROM Clientes c WHERE c.montoLimite = :montoLimite"),
    @NamedQuery(name = "Clientes.findByAct", query = "SELECT c FROM Clientes c WHERE c.act = :act")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_cli")
    private Integer pkIdCli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "ape_cli")
    private String apeCli;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo")
    private Float saldo;
    @Column(name = "monto_limite")
    private Float montoLimite;
    @Column(name = "act")
    private Boolean act;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdCli")
    private List<Devolucion> devolucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdCli")
    private List<Operaciones> operacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdCli")
    private List<Ventas> ventasList;
    @JoinColumn(name = "fk_id_usu", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuarios fkIdUsu;

    public Clientes() {
    }

    public Clientes(Integer pkIdCli) {
        this.pkIdCli = pkIdCli;
    }

    public Clientes(Integer pkIdCli, String apeCli, String dni, String domi) {
        this.pkIdCli = pkIdCli;
        this.apeCli = apeCli;
        this.dni = dni;
        this.domi = domi;
    }

    public Integer getPkIdCli() {
        return pkIdCli;
    }

    public void setPkIdCli(Integer pkIdCli) {
        this.pkIdCli = pkIdCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
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

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getMontoLimite() {
        return montoLimite;
    }

    public void setMontoLimite(Float montoLimite) {
        this.montoLimite = montoLimite;
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
    public List<Operaciones> getOperacionesList() {
        return operacionesList;
    }

    public void setOperacionesList(List<Operaciones> operacionesList) {
        this.operacionesList = operacionesList;
    }

    @XmlTransient
    public List<Ventas> getVentasList() {
        return ventasList;
    }

    public void setVentasList(List<Ventas> ventasList) {
        this.ventasList = ventasList;
    }

    public Usuarios getFkIdUsu() {
        return fkIdUsu;
    }

    public void setFkIdUsu(Usuarios fkIdUsu) {
        this.fkIdUsu = fkIdUsu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdCli != null ? pkIdCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.pkIdCli == null && other.pkIdCli != null) || (this.pkIdCli != null && !this.pkIdCli.equals(other.pkIdCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Clientes[ pkIdCli=" + pkIdCli + " ]";
    }
    
}
