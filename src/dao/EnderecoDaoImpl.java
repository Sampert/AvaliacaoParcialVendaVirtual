/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Endereco;
import javax.persistence.EntityManager;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author Surya
 */
public class EnderecoDaoImpl extends BaseDaoAbstractImpl implements EnderecoDao {

    public EnderecoDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public void excluirPorId(Integer id) {
        this.em.getTransaction().begin();
        Endereco endereco = this.em.find(Endereco.class, id);
        this.em.remove((Endereco) endereco);
        this.em.getTransaction().commit();
    }

}
