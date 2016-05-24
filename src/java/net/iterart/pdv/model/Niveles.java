/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iterart.pdv.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "Niveles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Niveles.findAll", query = "SELECT n FROM Niveles n"),
    @NamedQuery(name = "Niveles.findByPkIdNiv", query = "SELECT n FROM Niveles n WHERE n.pkIdNiv = :pkIdNiv"),
    @NamedQuery(name = "Niveles.findByNivel", query = "SELECT n FROM Niveles n WHERE n.nivel = :nivel")})
public class Niveles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_niv")
    private Integer pkIdNiv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nivel")
    private String nivel;
    @OneToMany(mappedBy = "fkIdNivel")
    private List<Usuarios> usuariosList;

    public Niveles() {
    }

    public Niveles(Integer pkIdNiv) {
        this.pkIdNiv = pkIdNiv;
    }

    public Niveles(Integer pkIdNiv, String nivel) {
        this.pkIdNiv = pkIdNiv;
        this.nivel = nivel;
    }

    public Integer getPkIdNiv() {
        return pkIdNiv;
    }

    public void setPkIdNiv(Integer pkIdNiv) {
        this.pkIdNiv = pkIdNiv;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdNiv != null ? pkIdNiv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Niveles)) {
            return false;
        }
        Niveles other = (Niveles) object;
        if ((this.pkIdNiv == null && other.pkIdNiv != null) || (this.pkIdNiv != null && !this.pkIdNiv.equals(other.pkIdNiv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Niveles[ pkIdNiv=" + pkIdNiv + " ]";
    }
    
}
