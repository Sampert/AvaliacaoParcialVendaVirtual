package dao;

import bean.Pedido;
import java.util.List;
import org.senac.dao.BaseDao;

/**
 *
 * @author Surya
 */
public interface PedidoDao extends BaseDao{
    public void excluirPorId(Integer id);
    public List<Pedido> pesquisarTotalPedido();
}
