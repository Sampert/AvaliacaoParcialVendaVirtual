/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Administrador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author Surya
 */
public class AdministradorDaoImpl extends BaseDaoAbstractImpl implements AdministradorDao{

    public AdministradorDaoImpl(EntityManager em) {
        super(em);
    }
 @Override
    public List<Administrador> pesquisarTotalAdministrador() {
        Query query = this.em.createQuery("SELECT a FROM Administrador a", Administrador.class);
        List<Administrador> administradores = query.getResultList();
        return administradores;
    }
    
    
}
