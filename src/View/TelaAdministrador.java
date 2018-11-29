/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TelaAdministradorController;
import bean.Endereco;
import bean.Jogo;
import bean.Pedido;
import bean.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Surya
 */
public class TelaAdministrador extends javax.swing.JFrame {

    private TelaAdministradorController telaAdmControler;
    private DefaultTableModel modeloTabelaUsuario;
    private DefaultTableModel modeloTabelaJogo;
    private DefaultTableModel modeloTabelaPesquisarUsuario;
    private DefaultTableModel modeloTabelaPesquisarJogo;
    private DefaultTableModel modeloTabelaPedido;
    private TelaPrincipal telaPrincipal;

    public TelaAdministrador() {
        initComponents();
        modeloTabelaUsuario = (DefaultTableModel) this.jTabelaUsuario.getModel();
        modeloTabelaJogo = (DefaultTableModel) this.jtabelaJogo.getModel();
        modeloTabelaPesquisarUsuario = (DefaultTableModel) this.jTabelaPesquisaUsuario.getModel();
        modeloTabelaPesquisarJogo = (DefaultTableModel) this.jTabelaPesquisarJogo.getModel();
        //modeloTabelaPedido = (DefaultTableModel) this.jTabelaPedido.getModel();

        telaAdmControler = new TelaAdministradorController(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTelaPrincipalAdm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jAbaAdm = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabelaJogo = new javax.swing.JTable();
        jCadastrar = new javax.swing.JButton();
        jExcluirJogo = new javax.swing.JButton();
        jFechar = new javax.swing.JButton();
        jTextPesquisarJogo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonPesquisarJogoNome = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTabelaPesquisarJogo = new javax.swing.JTable();
        jLabelAlertaTabelaJogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNomeJogo = new javax.swing.JTextField();
        jDescricaoJogo = new javax.swing.JTextField();
        jTipoJogo = new javax.swing.JTextField();
        jValorJogo = new javax.swing.JTextField();
        jCadastrarJogo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelUsuario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabelaUsuario = new javax.swing.JTable();
        jButtonExcluirUsuario = new javax.swing.JButton();
        jAtualizarListaUsuario = new javax.swing.JButton();
        jTextPesquisarUsuarioCpf = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabelaPesquisaUsuario = new javax.swing.JTable();
        jButtonPesquisarUsuario = new javax.swing.JButton();
        jLabelAlertaPesquisarUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIniciar = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTelaPrincipalAdm.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        jLabel1.setText("Configuração");

        jAbaAdm.setBackground(new java.awt.Color(204, 204, 204));
        jAbaAdm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jAbaAdm.setForeground(new java.awt.Color(0, 0, 102));
        jAbaAdm.setToolTipText("Inserir nome");
        jAbaAdm.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jtabelaJogo.setBackground(new java.awt.Color(240, 240, 240));
        jtabelaJogo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jtabelaJogo.setForeground(new java.awt.Color(0, 0, 102));
        jtabelaJogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Tipo", "Descrição", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabelaJogo.setGridColor(new java.awt.Color(102, 102, 102));
        jtabelaJogo.setSelectionBackground(new java.awt.Color(0, 0, 153));
        jScrollPane1.setViewportView(jtabelaJogo);

        jCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        jCadastrar.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jCadastrar.setText("Cadastrar Jogo");
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });

        jExcluirJogo.setBackground(new java.awt.Color(153, 153, 153));
        jExcluirJogo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jExcluirJogo.setText("Excluir");
        jExcluirJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirJogoActionPerformed(evt);
            }
        });

        jFechar.setBackground(new java.awt.Color(153, 153, 153));
        jFechar.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jFechar.setText("Fechar");
        jFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharActionPerformed(evt);
            }
        });

        jTextPesquisarJogo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jTextPesquisarJogo.setForeground(new java.awt.Color(153, 153, 153));

        jButtonPesquisarJogoNome.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jButtonPesquisarJogoNome.setText("Pesquisar");
        jButtonPesquisarJogoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarJogoNomeActionPerformed(evt);
            }
        });

        jTabelaPesquisarJogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Tipo", "Descrição", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTabelaPesquisarJogo);

        jLabelAlertaTabelaJogo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelAlertaTabelaJogo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCadastrar)
                                .addGap(35, 35, 35)
                                .addComponent(jExcluirJogo)
                                .addGap(31, 31, 31)
                                .addComponent(jFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextPesquisarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisarJogoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAlertaTabelaJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPesquisarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarJogoNome)
                    .addComponent(jLabelAlertaTabelaJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCadastrar)
                    .addComponent(jExcluirJogo)
                    .addComponent(jFechar))
                .addGap(17, 17, 17))
        );

        jAbaAdm.addTab("Jogos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel3.setText("Tipo");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel4.setText("Valor");

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel5.setText("Descrição");

        jCadastrarJogo.setBackground(new java.awt.Color(153, 153, 153));
        jCadastrarJogo.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jCadastrarJogo.setText("Cadastrar");
        jCadastrarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarJogoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCadastrarJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jNomeJogo)
                    .addComponent(jDescricaoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTipoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jValorJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jNomeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jDescricaoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jValorJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCadastrarJogo)
                    .addComponent(jButton1))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jAbaAdm.addTab("Cadastrar Jogo", jPanel3);

        jPanelUsuario.setBackground(new java.awt.Color(102, 102, 102));

        jTabelaUsuario.setForeground(new java.awt.Color(0, 0, 102));
        jTabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Cpf", "Idade", "Telefone", "Email", "Sexo", "Id End.", "Rua", "Numero", "Cep", "Bairro", "Cidade", "Estado", "Pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTabelaUsuario);

        jButtonExcluirUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jButtonExcluirUsuario.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jButtonExcluirUsuario.setText("Excluir");
        jButtonExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirUsuarioActionPerformed(evt);
            }
        });

        jAtualizarListaUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jAtualizarListaUsuario.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jAtualizarListaUsuario.setText("Atualizar Lista");
        jAtualizarListaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarListaUsuarioActionPerformed(evt);
            }
        });

        jTextPesquisarUsuarioCpf.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jTextPesquisarUsuarioCpf.setToolTipText("Insira o Cpf");

        jTabelaPesquisaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Cpf", "Idade", "telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTabelaPesquisaUsuario);

        jButtonPesquisarUsuario.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jButtonPesquisarUsuario.setText("Pesquisar");
        jButtonPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarUsuarioActionPerformed(evt);
            }
        });

        jLabelAlertaPesquisarUsuario.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelAlertaPesquisarUsuario.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAlertaPesquisarUsuario.setToolTipText("Insira o Cpf");

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jAtualizarListaUsuario)
                        .addGap(116, 116, 116)
                        .addComponent(jButtonExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addComponent(jTextPesquisarUsuarioCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAlertaPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlertaPesquisarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextPesquisarUsuarioCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPesquisarUsuario)))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirUsuario)
                    .addComponent(jAtualizarListaUsuario))
                .addGap(24, 24, 24))
        );

        jAbaAdm.addTab("Usuários", jPanelUsuario);

        javax.swing.GroupLayout jTelaPrincipalAdmLayout = new javax.swing.GroupLayout(jTelaPrincipalAdm);
        jTelaPrincipalAdm.setLayout(jTelaPrincipalAdmLayout);
        jTelaPrincipalAdmLayout.setHorizontalGroup(
            jTelaPrincipalAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaPrincipalAdmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTelaPrincipalAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAbaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jTelaPrincipalAdmLayout.setVerticalGroup(
            jTelaPrincipalAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaPrincipalAdmLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jAbaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jMenuIniciar.setText("Iniciar");
        jMenuIniciar.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuIniciar.add(jMenuItemSair);

        jMenuItemInicio.setText("Voltar ");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenuIniciar.add(jMenuItemInicio);

        jMenuBar1.add(jMenuIniciar);

        jMenuSobre.setText("Sobre");
        jMenuSobre.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        jMenuItemAjuda.setText("Ajuda");
        jMenuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemAjuda);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTelaPrincipalAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTelaPrincipalAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirUsuarioActionPerformed
        telaAdmControler.removerUsuario(modeloTabelaUsuario);
    }//GEN-LAST:event_jButtonExcluirUsuarioActionPerformed

    private void jFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jFecharActionPerformed

    private void jCadastrarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarJogoActionPerformed
        telaAdmControler.inserirCadastroJogoBanco(modeloTabelaJogo, this.jNomeJogo.getText(), this.jTipoJogo.getText(),
                this.jDescricaoJogo.getText(), this.jValorJogo.getText());

        this.jAbaAdm.setSelectedIndex(0);
    }//GEN-LAST:event_jCadastrarJogoActionPerformed

    private void jExcluirJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirJogoActionPerformed
        telaAdmControler.removerJogo(modeloTabelaJogo);
    }//GEN-LAST:event_jExcluirJogoActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
        this.jAbaAdm.setSelectedIndex(1);
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
        telaAdmControler.encerrar();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaActionPerformed
        JOptionPane.showMessageDialog(null, "Desenvolvido por Surya Sampert");
    }//GEN-LAST:event_jMenuItemAjudaActionPerformed

    private void jButtonPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarUsuarioActionPerformed
        telaAdmControler.preencherTabelaPesquisarUsuario();

    }//GEN-LAST:event_jButtonPesquisarUsuarioActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jAbaAdm.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPesquisarJogoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarJogoNomeActionPerformed
        telaAdmControler.preencherTabelaPesquisarJogo();
    }//GEN-LAST:event_jButtonPesquisarJogoNomeActionPerformed

    private void jAtualizarListaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarListaUsuarioActionPerformed
        //telaAdmControler.preencherTabelaUsuario();
    }//GEN-LAST:event_jAtualizarListaUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministrador().setVisible(true);
            }
        });
    }

    public int[] getListaSelecionaJogo() {

        return this.jtabelaJogo.getSelectedRows();
    }

    public int[] getListaSelecionaUsuario() {
        return this.jTabelaUsuario.getSelectedRows();
    }

    public void preencherTabelaUsuario(List<Usuario> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Usuario us = lista.get(i);
            Endereco endereco = us.getEndereco();
            this.modeloTabelaUsuario.addRow(new Object[]{us.getId(), us.getNome(), us.getCpf(), us.getIdade(), us.getTelefone(),
                us.getEmail(), us.getSexo(), endereco.getId(), endereco.getRua(), endereco.getNumero(), endereco.getCep(),
                endereco.getBairro(), endereco.getCidade(), endereco.getEstado(), endereco.getPais()});
        }
    }

    public void preencherTabelaJogo(List<Jogo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Jogo jg = lista.get(i);

            this.modeloTabelaJogo.addRow(new Object[]{jg.getId(), jg.getNome(), jg.getTipo(), jg.getDescricao(), jg.getValor()});
        }
    }

    public void preencherTabelaPedido(List<Pedido> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Pedido pedido = lista.get(i);
            Jogo jogo = telaAdmControler.pesquisarJogoBanco(pedido.getId());
            this.modeloTabelaPedido.addRow(new Object[]{pedido.getUsuario().getNome(), pedido.getUsuario().getCpf(),
                jogo.getNome(), jogo.getValor(), pedido.getId(), pedido.getValor()});
        }
    }

    public void setMensagemAlertaPesquisaUsuario() {
        this.jLabelAlertaPesquisarUsuario.setText("Não foi possivel localizar o usuário.");
    }

    public void setMensagemAlertaPesquisaJogo() {
        this.jLabelAlertaTabelaJogo.setText("Não foi possivel localizar o jogo.");
    }

    public void setMensagemAlertaPesquisaJogoLimparMensagem() {
        this.jLabelAlertaTabelaJogo.setText("");
    }

    public void setMensagemAlertaPesquisaUsuarioLimparMensagem() {
        this.jLabelAlertaPesquisarUsuario.setText("");
    }

    public String pegarTextoPesquisarUsuario() {
        return jTextPesquisarUsuarioCpf.getText();
    }

    public String pegarTextoPesquisarJogo() {
        return jTextPesquisarJogo.getText();
    }

    public void preencherTabelaPesquisarUsuario(List<Usuario> usuarios) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            this.modeloTabelaPesquisarUsuario.addRow(new Object[]{usuario.getId(), usuario.getNome(), usuario.getCpf(),
                usuario.getIdade(), usuario.getTelefone(), usuario.getEmail()});
        }
    }

    public void preencherTabelaPesquisarJogo(List<Jogo> jogos) {
        for (int i = 0; i < jogos.size(); i++) {
            Jogo jogo = jogos.get(i);
            this.modeloTabelaPesquisarJogo.addRow(new Object[]{jogo.getId(), jogo.getNome(), jogo.getTipo(),
                jogo.getDescricao(), jogo.getValor()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jAbaAdm;
    private javax.swing.JButton jAtualizarListaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonExcluirUsuario;
    private javax.swing.JButton jButtonPesquisarJogoNome;
    private javax.swing.JButton jButtonPesquisarUsuario;
    private javax.swing.JButton jCadastrar;
    private javax.swing.JButton jCadastrarJogo;
    private javax.swing.JTextField jDescricaoJogo;
    private javax.swing.JButton jExcluirJogo;
    private javax.swing.JButton jFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAlertaPesquisarUsuario;
    private javax.swing.JLabel jLabelAlertaTabelaJogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuIniciar;
    private javax.swing.JMenuItem jMenuItemAjuda;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JTextField jNomeJogo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTabelaPesquisaUsuario;
    private javax.swing.JTable jTabelaPesquisarJogo;
    private javax.swing.JTable jTabelaUsuario;
    private javax.swing.JPanel jTelaPrincipalAdm;
    private javax.swing.JTextField jTextPesquisarJogo;
    private javax.swing.JTextField jTextPesquisarUsuarioCpf;
    private javax.swing.JTextField jTipoJogo;
    private javax.swing.JTextField jValorJogo;
    private javax.swing.JTable jtabelaJogo;
    // End of variables declaration//GEN-END:variables

}
