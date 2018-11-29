/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.PedidoJogo;
import java.util.List;
import org.senac.dao.BaseDao;

/**
 *
 * @author Surya
 */
public interface PedidoJogoDao extends BaseDao{
    public List<PedidoJogo> pesquisarTotalPedidoJogo();
}
