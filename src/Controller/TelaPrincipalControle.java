/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TelaAdministrador;
import View.TelaPrincipal;
//import View.TelaUsuario;
import bean.Administrador;
import bean.Endereco;
import bean.Usuario;
import dao.AdministradorDaoImpl;
import dao.EnderecoDaoImpl;
import dao.UsuarioDaoImpl;
import java.util.List;
import javax.persistence.EntityManager;
import org.senac.dao.ConnectionFactory;

/**
 *
 * @author Surya
 */
public class TelaPrincipalControle {

    private TelaPrincipal telaPrincipalView;
    private TelaAdministrador telaAdministrador;
    private UsuarioDaoImpl usuarioDaoImpl;
    private EnderecoDaoImpl enderecoDaoImpl;
    private AdministradorDaoImpl administradorDaoImpl;
    //private TelaUsuario telaUsuario;
    private String mensagemAlerta;

    public TelaPrincipalControle() {

        EntityManager em = new ConnectionFactory().openConnection("Venda_VirtualPU");

        this.usuarioDaoImpl = new UsuarioDaoImpl(em);
        this.enderecoDaoImpl = new EnderecoDaoImpl(em);
        this.administradorDaoImpl = new AdministradorDaoImpl(em);
    }

    public void verificarSenha(String login, String senha) {
        this.telaAdministrador = new TelaAdministrador();
        //this.telaUsuario = new TelaUsuario();

        List<Usuario> listaUs = usuarioDaoImpl.pesquisarTotalUsuario();
        List<Administrador> listaAdms = administradorDaoImpl.pesquisarTotalAdministrador();

        for (int i = 0; i < listaUs.size(); i++) {
            Usuario usuario = listaUs.get(i);
            if (usuario.getLogin().equalsIgnoreCase(login) && usuario.getSenha().equalsIgnoreCase(senha)) {
                //telaUsuario.setVisible(true);
            }
//else if(!usuario.getLogin().equalsIgnoreCase(login) && !usuario.getSenha().equalsIgnoreCase(senha)){
//                telaPrincipalView.setMensagemAlertaCadastroLoginEntrar();
//            }else if(!usuario.getLogin().equalsIgnoreCase(login) || !usuario.getSenha().equalsIgnoreCase(senha)){
//                telaPrincipalView.setMensagemAlertaCadastroLoginEntrar();
//            }
        }
        for (int i = 0; i < listaAdms.size(); i++) {
            Administrador adm = listaAdms.get(i);
            if (adm.getLogin().equalsIgnoreCase(login) && adm.getSenha().equalsIgnoreCase(senha)) {
                telaAdministrador.setVisible(true);
            }
            
        }

    }

    public void verificarLogin(String login) {

        List<Usuario> listaUs = usuarioDaoImpl.pesquisarTotalUsuario();
        List<Administrador> listaAdms = administradorDaoImpl.pesquisarTotalAdministrador();

        for (int i = 0; i < listaUs.size(); i++) {
            Usuario usuario = listaUs.get(i);
            for (int j = 0; j < listaAdms.size(); j++) {
                Administrador adm = listaAdms.get(j);
                if (usuario.getLogin().equalsIgnoreCase(login) || adm.getLogin().equalsIgnoreCase(login)) {
                    telaPrincipalView.setMensagemAlertaCadastroLogin();
                    break;
                } 
            }

        }
    }

    public void verificarCadastro(String nome, String cpf, String idade, String telefone,
            String email, String sexo, String login, String senha, String rua, String numero, String cep, String bairro,
            String cidade, String estado, String pais) {

        verificarCadastroNumeros(idade, numero);
        if (nome.equalsIgnoreCase("") || cpf.equalsIgnoreCase("") || idade.equalsIgnoreCase("") || telefone.equalsIgnoreCase("")
                || email.equalsIgnoreCase("") || sexo.equalsIgnoreCase("") || login.equalsIgnoreCase("") || senha.equalsIgnoreCase("")
                || rua.equalsIgnoreCase("") || (numero.equalsIgnoreCase("")) || cep.equalsIgnoreCase("") || bairro.equalsIgnoreCase("")
                || cidade.equalsIgnoreCase("") || estado.equalsIgnoreCase("") || pais.equalsIgnoreCase("")) {
            telaPrincipalView.setMensagemAlertaCadastro();
        } else {
            this.inserirCadastroUsuarioBanco(nome, cpf, idade, telefone,
                    email, sexo, login, senha, rua, numero, cep, bairro,
                    cidade, estado, pais);
        }

    }

    public void verificarCadastroNumeros(String idade, String numero) {

        if (idade.length() != 0) {
            try {
                Integer.parseInt(idade);
            } catch (NumberFormatException ex) {
                telaPrincipalView.setMensagemAlertaCadastroIdade();

            }
        }
        if (numero.length() != 0) {
            try {
                Integer.parseInt(numero);
            } catch (NumberFormatException ex) {
                telaPrincipalView.setMensagemAlertaCadastroNumero();

            }
        }

    }

    public void inserirCadastroUsuarioBanco(String nome, String cpf, String idade, String telefone,
            String email, String sexo, String login, String senha, String rua, String numero, String cep, String bairro,
            String cidade, String estado, String pais) {
        Endereco endereco = new Endereco(rua, Integer.parseInt(numero), cep, bairro, cidade, estado, pais);
        this.enderecoDaoImpl.save(endereco);

        Usuario usuario = new Usuario(nome, cpf, Integer.parseInt(idade), telefone, email, sexo, login, senha);
        usuario.setEndereco(endereco);
        this.usuarioDaoImpl.save(usuario);

    }
}
