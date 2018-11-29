/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author Surya
 */
public class UsuarioDaoImpl extends BaseDaoAbstractImpl implements UsuarioDao {

    public UsuarioDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Usuario> pesquisarTotalUsuario() {
        Query query = this.em.createQuery("SELECT u FROM Usuario u", Usuario.class);
        List<Usuario> usuarios = query.getResultList();
        return usuarios;
    }

    @Override
    public void excluirPorId(Integer id) {
        this.em.getTransaction().begin();
        Usuario usuario = this.em.find(Usuario.class, id);
        this.em.remove((Usuario) usuario);
        this.em.getTransaction().commit();
    }


    @Override
    public List<Usuario> pesquisarPorCpf(String cpf) {
        Query query = this.em.createQuery("SELECT u FROM Usuario u where u.cpf = :cpf", Usuario.class);
        query.setParameter("cpf", cpf);
        List<Usuario> usuarios = query.getResultList();
        return usuarios;
    }

}
