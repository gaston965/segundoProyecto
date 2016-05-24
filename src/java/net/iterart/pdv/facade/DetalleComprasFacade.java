/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iterart.pdv.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.iterart.pdv.model.DetalleCompras;

/**
 *
 * @author gastonb
 */
@Stateless
public class DetalleComprasFacade extends AbstractFacade<DetalleCompras> {

    @PersistenceContext(unitName = "segundoProyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleComprasFacade() {
        super(DetalleCompras.class);
    }
    
}
