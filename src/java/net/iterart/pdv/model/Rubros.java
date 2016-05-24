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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "Rubros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rubros.findAll", query = "SELECT r FROM Rubros r"),
    @NamedQuery(name = "Rubros.findByPkIdRubro", query = "SELECT r FROM Rubros r WHERE r.pkIdRubro = :pkIdRubro"),
    @NamedQuery(name = "Rubros.findByRubro", query = "SELECT r FROM Rubros r WHERE r.rubro = :rubro"),
    @NamedQuery(name = "Rubros.findByHab", query = "SELECT r FROM Rubros r WHERE r.hab = :hab")})
public class Rubros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_rubro")
    private Integer pkIdRubro;
    @Size(max = 25)
    @Column(name = "rubro")
    private String rubro;
    @Column(name = "hab")
    private Boolean hab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rubrosIdRubro")
    private List<Productos> productosList;

    public Rubros() {
    }

    public Rubros(Integer pkIdRubro) {
        this.pkIdRubro = pkIdRubro;
    }

    public Integer getPkIdRubro() {
        return pkIdRubro;
    }

    public void setPkIdRubro(Integer pkIdRubro) {
        this.pkIdRubro = pkIdRubro;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public Boolean getHab() {
        return hab;
    }

    public void setHab(Boolean hab) {
        this.hab = hab;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdRubro != null ? pkIdRubro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rubros)) {
            return false;
        }
        Rubros other = (Rubros) object;
        if ((this.pkIdRubro == null && other.pkIdRubro != null) || (this.pkIdRubro != null && !this.pkIdRubro.equals(other.pkIdRubro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Rubros[ pkIdRubro=" + pkIdRubro + " ]";
    }
    
}
