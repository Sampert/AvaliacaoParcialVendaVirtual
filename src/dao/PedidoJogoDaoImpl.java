/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.PedidoJogo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author Surya
 */
public class PedidoJogoDaoImpl extends BaseDaoAbstractImpl implements PedidoJogoDao{
    
    public PedidoJogoDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<PedidoJogo> pesquisarTotalPedidoJogo() {
         Query query = this.em.createQuery("SELECT p FROM PedidoJogo p", PedidoJogo.class);
        List<PedidoJogo> pedidosJogos = query.getResultList();
        return pedidosJogos;
    }
    
}
