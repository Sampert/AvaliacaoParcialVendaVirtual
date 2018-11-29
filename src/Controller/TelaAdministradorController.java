/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TelaAdministrador;
import View.TelaPrincipal;
import bean.Jogo;
import bean.Pedido;
import bean.Usuario;
import dao.AdministradorDaoImpl;
import dao.EnderecoDaoImpl;
import dao.JogoDaoImpl;
import dao.PedidoDaoImpl;
import dao.UsuarioDaoImpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;
import org.senac.dao.ConnectionFactory;

/**
 *
 * @author Surya
 */
public class TelaAdministradorController {

    private TelaAdministrador telaAdministrador;
    private TelaPrincipal telaPrincipal;
    private UsuarioDaoImpl usuarioDaoImpl;
    private EnderecoDaoImpl enderecoDaoImpl;
    private AdministradorDaoImpl administradorDaoImpl;
    private JogoDaoImpl jogoDaoImpl;
    private PedidoDaoImpl pedidoDaoImpl;

    public TelaAdministradorController(TelaAdministrador telaAdm) {
        this.telaAdministrador = telaAdm;
        //telaAdministrador = new TelaAdministrador();
        //telaAdministrador.setVisible(true);

        EntityManager em = new ConnectionFactory().openConnection("Venda_VirtualPU");
        this.usuarioDaoImpl = new UsuarioDaoImpl(em);
        this.enderecoDaoImpl = new EnderecoDaoImpl(em);
        this.administradorDaoImpl = new AdministradorDaoImpl(em);
        this.jogoDaoImpl = new JogoDaoImpl(em);
        this.pedidoDaoImpl = new PedidoDaoImpl(em);

        preencherTabelaUsuario();
        preencherTabelaJogo();
        //preencherTabelaPedido();

    }

    public void removerUsuario(DefaultTableModel defaultTableModelUsuario) {

        int[] linhaSelecionadas = telaAdministrador.getListaSelecionaUsuario();

        for (int i = 0; i < linhaSelecionadas.length; i++) {
            int id = (int) defaultTableModelUsuario.getValueAt(linhaSelecionadas[i], 0);

            usuarioDaoImpl.excluirPorId(id);
            enderecoDaoImpl.excluirPorId(id);

            defaultTableModelUsuario.removeRow(linhaSelecionadas[i]);
            for (int j = i + 1; j < linhaSelecionadas.length; j++) {
                linhaSelecionadas[j] = linhaSelecionadas[j] - 1;

            }
        }
    }

    public void removerJogo(DefaultTableModel defaultTableModelJogo) {

        int[] linhaSelecionadas = telaAdministrador.getListaSelecionaJogo();

        for (int i = 0; i < linhaSelecionadas.length; i++) {
            int id = (int) defaultTableModelJogo.getValueAt(linhaSelecionadas[i], 0);
            jogoDaoImpl.excluirPorId(id);

            defaultTableModelJogo.removeRow(linhaSelecionadas[i]);
            for (int j = i + 1; j < linhaSelecionadas.length; j++) {
                linhaSelecionadas[j] = linhaSelecionadas[j] - 1;

            }
        }
    }

    public void preencherTabelaUsuario() {

        List<Usuario> lista = this.usuarioDaoImpl.pesquisarTotalUsuario();

        this.telaAdministrador.preencherTabelaUsuario(lista);

    }

    public void preencherTabelaJogo() {

        List<Jogo> lista = jogoDaoImpl.pesquisarTotalJogo();
        this.telaAdministrador.preencherTabelaJogo(lista);

    }

    public void preencherTabelaPedido() {

        List<Pedido> lista = this.pedidoDaoImpl.pesquisarTotalPedido();

        this.telaAdministrador.preencherTabelaPedido(lista);

    }

    public Jogo pesquisarJogoBanco(int id) {

        Jogo jogo = (Jogo) jogoDaoImpl.searchById(Jogo.class, id);

        return jogo;
    }

    public void preencherTabelaPesquisarUsuario() {
        String cpf = telaAdministrador.pegarTextoPesquisarUsuario();
        Usuario usuario = null;
        List<Usuario> listaUsuarios = usuarioDaoImpl.pesquisarTotalUsuario();

        if (!cpf.equals("")) {

            for (int i = 0; i < listaUsuarios.size(); i++) {
                usuario = listaUsuarios.get(i);
                if (!usuario.getCpf().equalsIgnoreCase(cpf)) {
                    telaAdministrador.setMensagemAlertaPesquisaUsuario();
                    break;
                }
            }
            listaUsuarios = usuarioDaoImpl.pesquisarPorCpf(cpf);
            telaAdministrador.preencherTabelaPesquisarUsuario(listaUsuarios);

        } else {
            telaAdministrador.setMensagemAlertaPesquisaUsuario();
        }
    }

    public void preencherTabelaPesquisarJogo() {
        String nome = telaAdministrador.pegarTextoPesquisarJogo();
        Jogo jogo = null;
        List<Jogo> listaJogos = jogoDaoImpl.pesquisarTotalJogo();
        if (!nome.equals("")) {

            for (int i = 0; i < listaJogos.size(); i++) {
                jogo = listaJogos.get(i);
                if (!jogo.getNome().equalsIgnoreCase(nome)) {
                    telaAdministrador.setMensagemAlertaPesquisaJogo();
                    break;
                }
            }

            listaJogos = jogoDaoImpl.pesquisarPorNome(nome);

            telaAdministrador.preencherTabelaPesquisarJogo(listaJogos);

        } else if (nome.equals("")) {
            //telaAdministrador.setMensagemAlertaPesquisaUsuario();
        }
        //telaAdministrador.setMensagemAlertaPesquisaJogoLimparMensagem();

    }

    public void inserirCadastroJogoBanco(DefaultTableModel defaultTableModelJogo, String nome, String tipo, String descricao,
            String valor) {
        Jogo jogo = new Jogo(nome, tipo, descricao, Double.parseDouble(valor));
        this.jogoDaoImpl.save(jogo);

        defaultTableModelJogo.addRow(new Object[]{jogo.getId(), jogo.getNome(), jogo.getTipo(), jogo.getDescricao(), jogo.getValor()});

    }

    public void encerrar() {
        EntityManager em = new ConnectionFactory().openConnection("Venda_VirtualPU");
        em.close();
    }
}
