package dao;

import bean.Jogo;
import java.util.List;
import org.senac.dao.BaseDao;

/**
 *
 * @author Surya
 */
public interface JogoDao extends BaseDao {

    public List<Jogo> pesquisarTotalJogo();

    public void excluirPorId(Integer id);
    
    public List<Jogo> pesquisarPorNome(String nome);
    
}
