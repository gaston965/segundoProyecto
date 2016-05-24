/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iterart.pdv.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.iterart.pdv.model.Tarjetas;

/**
 *
 * @author gastonb
 */
@Stateless
public class TarjetasFacade extends AbstractFacade<Tarjetas> {

    @PersistenceContext(unitName = "segundoProyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TarjetasFacade() {
        super(Tarjetas.class);
    }
    
}
