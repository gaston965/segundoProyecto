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
@Table(name = "Categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
    @NamedQuery(name = "Categoria.findByPkIdCat", query = "SELECT c FROM Categoria c WHERE c.pkIdCat = :pkIdCat"),
    @NamedQuery(name = "Categoria.findByCat", query = "SELECT c FROM Categoria c WHERE c.cat = :cat")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_cat")
    private Integer pkIdCat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cat")
    private String cat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriapkidcat")
    private List<Gastos> gastosList;

    public Categoria() {
    }

    public Categoria(Integer pkIdCat) {
        this.pkIdCat = pkIdCat;
    }

    public Categoria(Integer pkIdCat, String cat) {
        this.pkIdCat = pkIdCat;
        this.cat = cat;
    }

    public Integer getPkIdCat() {
        return pkIdCat;
    }

    public void setPkIdCat(Integer pkIdCat) {
        this.pkIdCat = pkIdCat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @XmlTransient
    public List<Gastos> getGastosList() {
        return gastosList;
    }

    public void setGastosList(List<Gastos> gastosList) {
        this.gastosList = gastosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdCat != null ? pkIdCat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.pkIdCat == null && other.pkIdCat != null) || (this.pkIdCat != null && !this.pkIdCat.equals(other.pkIdCat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Categoria[ pkIdCat=" + pkIdCat + " ]";
    }
    
}
