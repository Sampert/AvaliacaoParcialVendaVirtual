/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Jogo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.senac.dao.BaseDaoAbstractImpl;

/**
 *
 * @author Surya
 */
public class JogoDaoImpl extends BaseDaoAbstractImpl implements JogoDao {

    public JogoDaoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public List<Jogo> pesquisarTotalJogo() {
        Query query = this.em.createQuery("SELECT j FROM Jogo j", Jogo.class);
        List<Jogo> jogos = query.getResultList();
        return jogos;

    }

    @Override
    public void excluirPorId(Integer id) {
        this.em.getTransaction().begin();
        Jogo jogo = this.em.find(Jogo.class, id);
        this.em.remove((Jogo) jogo);
        this.em.getTransaction().commit();
    }

    @Override
    public List<Jogo> pesquisarPorNome(String nome) {
       Query query = this.em.createQuery("SELECT j FROM Jogo j where j.nome = :nome", Jogo.class);
        query.setParameter("nome", nome);
        List<Jogo> jogos = query.getResultList();
        return jogos;
    }

}
