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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gastonb
 */
@Entity
@Table(name = "Sesiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sesiones.findAll", query = "SELECT s FROM Sesiones s"),
    @NamedQuery(name = "Sesiones.findByPkIdSesiones", query = "SELECT s FROM Sesiones s WHERE s.pkIdSesiones = :pkIdSesiones"),
    @NamedQuery(name = "Sesiones.findByInicio", query = "SELECT s FROM Sesiones s WHERE s.inicio = :inicio"),
    @NamedQuery(name = "Sesiones.findByFin", query = "SELECT s FROM Sesiones s WHERE s.fin = :fin"),
    @NamedQuery(name = "Sesiones.findByCajaIni", query = "SELECT s FROM Sesiones s WHERE s.cajaIni = :cajaIni"),
    @NamedQuery(name = "Sesiones.findByCajaFin", query = "SELECT s FROM Sesiones s WHERE s.cajaFin = :cajaFin"),
    @NamedQuery(name = "Sesiones.findByAbierta", query = "SELECT s FROM Sesiones s WHERE s.abierta = :abierta")})
public class Sesiones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_sesiones")
    private Integer pkIdSesiones;
    @Column(name = "inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicio;
    @Column(name = "fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cajaIni")
    private Float cajaIni;
    @Column(name = "cajaFin")
    private Float cajaFin;
    @Column(name = "abierta")
    private Boolean abierta;
    @JoinColumn(name = "Usuarios_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuarios usuariosidusuario;

    public Sesiones() {
    }

    public Sesiones(Integer pkIdSesiones) {
        this.pkIdSesiones = pkIdSesiones;
    }

    public Integer getPkIdSesiones() {
        return pkIdSesiones;
    }

    public void setPkIdSesiones(Integer pkIdSesiones) {
        this.pkIdSesiones = pkIdSesiones;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Float getCajaIni() {
        return cajaIni;
    }

    public void setCajaIni(Float cajaIni) {
        this.cajaIni = cajaIni;
    }

    public Float getCajaFin() {
        return cajaFin;
    }

    public void setCajaFin(Float cajaFin) {
        this.cajaFin = cajaFin;
    }

    public Boolean getAbierta() {
        return abierta;
    }

    public void setAbierta(Boolean abierta) {
        this.abierta = abierta;
    }

    public Usuarios getUsuariosidusuario() {
        return usuariosidusuario;
    }

    public void setUsuariosidusuario(Usuarios usuariosidusuario) {
        this.usuariosidusuario = usuariosidusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdSesiones != null ? pkIdSesiones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sesiones)) {
            return false;
        }
        Sesiones other = (Sesiones) object;
        if ((this.pkIdSesiones == null && other.pkIdSesiones != null) || (this.pkIdSesiones != null && !this.pkIdSesiones.equals(other.pkIdSesiones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.iterart.pdv.model.Sesiones[ pkIdSesiones=" + pkIdSesiones + " ]";
    }
    
}
