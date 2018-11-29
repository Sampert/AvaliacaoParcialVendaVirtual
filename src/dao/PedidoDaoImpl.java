/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author Surya
 */
public class PedidoDaoImpl extends BaseDaoAbstractImpl implements PedidoDao {
    
    public PedidoDaoImpl(EntityManager em) {
        super(em);
    }
     @Override
    public void excluirPorId(Integer id) {
        this.em.getTransaction().begin();
        Pedido pedido = this.em.find(Pedido.class, id);
        this.em.remove((Pedido) pedido);
        this.em.getTransaction().commit();
    }

    @Override
    public List<Pedido> pesquisarTotalPedido() {
     Query query = this.em.createQuery("SELECT p FROM Pedido p", Pedido.class);
        List<Pedido> pedidos = query.getResultList();
        return pedidos;
    }
}
