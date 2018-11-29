
package dao;

import bean.Administrador;
import java.util.List;
import org.senac.dao.BaseDao;

/**
 *
 * @author Surya
 */
public interface AdministradorDao extends BaseDao{
    public List<Administrador> pesquisarTotalAdministrador();
}
