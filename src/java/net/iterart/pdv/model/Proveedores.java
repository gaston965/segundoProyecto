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
@Table(name = "Proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p"),
    @NamedQuery(name = "Proveedores.findByPkIdPro", query = "SELECT p FROM Proveedores p WHERE p.pkIdPro = :pkIdPro"),
    @NamedQuery(name = "Proveedores.findByApePro", query = "SELECT p FROM Proveedores p WHERE p.apePro = :apePro"),
    @NamedQuery(name = "Proveedores.findByDni", query = "SELECT p FROM Proveedores p WHERE p.dni = :dni"),
    @NamedQuery(name = "Proveedores.findByDomi", query = "SELECT p FROM Proveedores p WHERE p.domi = :domi"),
    @NamedQuery(name = "Proveedores.findByTele", query = "SELECT p FROM Proveedores p WHERE p.tele = :tele"),
    @NamedQuery(name = "Proveedores.findByEmail", query = "SELECT p FROM Proveedores p WHERE p.email = :email"),
    @NamedQuery(name = "Proveedores.findByPathImg", query = "SELECT p FROM Proveedores p WHERE p.pathImg = :pathImg"),
    @NamedQuery(name = "Proveedores.findByAct", query = "SELECT p FROM Proveedores p WHERE p.act = :act")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_pro")
    private Integer pkIdPro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "ape_pro")
    private String apePro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "dni")
    private String dni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "domi")
    private String domi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tele")
    private String tele;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "pathImg")
    private String pathImg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "act")
    private boolean act;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdProv")
    private List<Compras> comprasList;

    public Proveedores() {
    }

    public Proveedores(Integer pkIdPro) {
        this.pkIdPro = pkIdPro;
    }

    public Proveedores(Integer pkIdPro, String apePro, String dni, String domi, String tele, String email, String pathImg, boolean act) {
        this.pkIdPro = pkIdPro;
        this.apePro = apePro;
        this.dni = dni;
        this.domi = domi;
        this.tele = tele;
        this.email = email;
        this.pathImg = pathImg;
        this.act = act;
    }

    public Integer getPkIdPro() {
        return pkIdPro;
    }

    public void setPkIdPro(Integer pkIdPro) {
        this.pkIdPro = pkIdPro;
    }

    public String getApePro() {
        return apePro;
    }

    public void setApePro(String apePro) {
        this.apePro = apePro;
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

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public boolean getAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    @XmlTransient
    public List<Compras> getComprasList() {
        return comprasList;
    }

    public void setComprasList(List<Compras> comprasList) {
        this.comprasList = comprasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdPro != null ? pkIdPro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.pkIdPro == null && other.pkIdPro != null) || (this.pkIdPro != null && !this.pkIdPro.equals(other.pkIdPro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Proveedores[ pkIdPro=" + pkIdPro + " ]";
    }
    
}
