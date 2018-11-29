
package dao;

import bean.Usuario;
import java.util.List;
import org.senac.dao.BaseDao;

/**
 *
 * @author Surya
 */
public interface UsuarioDao extends BaseDao{
    
    public List<Usuario> pesquisarTotalUsuario();
    public void excluirPorId(Integer id);
    //public Usuario pesquisarPorCpf(String cpf);
    public List<Usuario> pesquisarPorCpf(String cpf);
}
