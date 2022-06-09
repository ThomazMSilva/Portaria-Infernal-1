package GUI;

import DAO.ManipuladorDB;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        

public class TelaMenuInicialAdmin extends javax.swing.JFrame {

    // atributos
    private ButtonGroup grupoPaineis = new ButtonGroup(); 
    private ManipuladorDB dbm;
    private String[][] colunas = {
        // correspondência 0
        {
            "id_correspondencia",              // 0
            "id_destinatario_correspondencia", // 1
            "tipo_correspondencia",            // 2
            "nome_entregador_correspondencia", // 3
            "cpf_entregador_correspondencia",  // 4
            "recebido_correspondencia"         // 5

        },
        // prestador 1
        {
            "id_prestador",      // 0
            "cpf_prestador",     // 1
            "nome_prestador",    // 2
            "contato_prestador"  // 3
        },
        // serviço 2
        {
            "id_servico",        // 0
            "id_prestador",      // 1
            "id_contratante",    // 2
            "tipo",              // 3
            "data_agendada",     // 4
            "data_recebida"      // 5
        },
        // agenda 3
        {
            "id_agenda",         // 0
            "compromisso_agenda" // 1
        },
        // residente 4
        {
            "id_residente",      // 0
            "id_casa",           // 1
            "cpf_residente",     // 2
            "nome_residente",    // 3
            "contato_residente"  // 4
        },
        // admin 5
        {
            "id_admin",          // 0
            "cpf_admin",         // 1
            "nome_admin",        // 2
            "senha_admin"        // 3
        },
        // porteiro 6
        {
            "id_porteiro",       // 0   
            "nome_porteiro",     // 1
            "senha_porteiro",    // 2
            "dia_servico_porteiro"//3
        }    
    };
    String[] checkbox;
    public TelaMenuInicialAdmin() {
        
        initComponents();
        dbm = new ManipuladorDB("banco_portaria");
        this.setPaineisInvisiveis();
        this.setSubPaineisInsercaoInvisiveis();
        this.painelInicial.setVisible(true);
        this.painel_inserirCorrespondencia.setVisible(true);
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        ComboBox_admin_tipo_alteracao2 = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        buttonGroup_admin_deletar = new javax.swing.ButtonGroup();
        painelInicial = new javax.swing.JPanel();
        lbl_bemVindo = new javax.swing.JLabel();
        TabbedPaneInicio = new javax.swing.JTabbedPane();
        painelAtivReccentes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_area_ativRecentes = new javax.swing.JTextArea();
        painelNovidades = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_area_novidades = new javax.swing.JTextArea();
        painelAtualizacao = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_area_atualizacao = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        painel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        ScrollPaneTabela = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        TabbedPaneOpcoes = new javax.swing.JTabbedPane();
        subPanelInserir = new javax.swing.JPanel();
        ComboBoxNovaInsercao = new javax.swing.JComboBox<>();
        lbl_novaInsercao = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        painel_inserirCorrespondencia = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_inserir_id_morador_correspondencia = new javax.swing.JTextField();
        CheckBox_inserir_nome_entregador = new javax.swing.JCheckBox();
        txt_inserir_nome_entregador_correspondencia = new javax.swing.JTextField();
        CheckBox_inserir_cpf_entregador = new javax.swing.JCheckBox();
        txt_inserir_cpf_entregador_correspondencia = new javax.swing.JTextField();
        txt_inserir_desc_correspondencia = new javax.swing.JTextField();
        painel_inserirPrestador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_inserir_nome_prestador = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_inserir_cpf_prestador = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_inserir_contato_prestador = new javax.swing.JTextField();
        painel_inserirResidente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_inserir_id_casa_residente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_inserir_nome_residente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_inserir_cpf_residente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_inserir_contato_residente = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btn_Inserir = new javax.swing.JButton();
        subPanelConsultar = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txt_filtros_consulta = new javax.swing.JTextField();
        ComboBoxTabelas = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btn_pesquise = new javax.swing.JButton();
        Combobox_colunasConsulta = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        ComboBox_tipo_pesquisa = new javax.swing.JComboBox<>();
        subPanel_admin = new javax.swing.JPanel();
        TabbedPane_admin = new javax.swing.JTabbedPane();
        subSubPanel_admin_alterar = new javax.swing.JPanel();
        jButton_admin_alterar = new javax.swing.JButton();
        CheckBox_admin_alterar_data = new javax.swing.JCheckBox();
        txt_admin_alterar_data_agendada = new javax.swing.JTextField();
        txt_admin_alterar_data_realizada = new javax.swing.JTextField();
        pwf_admin_alterar_senha = new javax.swing.JPasswordField();
        jLabel_admin_alterar_nome = new javax.swing.JLabel();
        CheckBox_admin_alterar_contato = new javax.swing.JCheckBox();
        jLabel_admin_alterar_contato = new javax.swing.JLabel();
        CheckBox_admin_alterar_nome = new javax.swing.JCheckBox();
        jLabel_admin_alterar_senha = new javax.swing.JLabel();
        jLabel_admin_alterar_data_realizada = new javax.swing.JLabel();
        CheckBox_admin_alterar_senha = new javax.swing.JCheckBox();
        jLabel_admin_alterar_data_agendada = new javax.swing.JLabel();
        txt_admin_alterar_nome = new javax.swing.JTextField();
        txt_admin_alterar_contato = new javax.swing.JTextField();
        ComboBox_admin_alterar_dado = new javax.swing.JComboBox<>();
        jSeparator_admin_alterar2 = new javax.swing.JSeparator();
        jLabel_admin_alterar_tipo = new javax.swing.JLabel();
        txt_admin_alterar_tipo = new javax.swing.JTextField();
        CheckBox_admin_alterar_tipo = new javax.swing.JCheckBox();
        jSeparator_admin_alterar1 = new javax.swing.JSeparator();
        jLabel_admin_alterar_identificação = new javax.swing.JLabel();
        txt_admin_alterar_id = new javax.swing.JTextField();
        CheckBox_admin_alterar_id = new javax.swing.JCheckBox();
        CheckBox_admin_alterar_cpf = new javax.swing.JCheckBox();
        txt_admin_alterar_cpf = new javax.swing.JTextField();
        subSubPanel_admin_deletar = new javax.swing.JPanel();
        ComboBox_admin_deletar_tipo = new javax.swing.JComboBox<>();
        jSeparator_admin_deletar = new javax.swing.JSeparator();
        jLabel_admin_deletar_identificação = new javax.swing.JLabel();
        jLabel_admin_deletar_id = new javax.swing.JLabel();
        jTextField_admin_deletar_id = new javax.swing.JTextField();
        jLabel_admin_deletar_cpf = new javax.swing.JLabel();
        jTextField_admin_deletar_cpf = new javax.swing.JTextField();
        jLabel_admin_deletar_nome = new javax.swing.JLabel();
        jTextField_admin_deletar_nome = new javax.swing.JTextField();
        jLabel_admin_deletar_contato = new javax.swing.JLabel();
        jTextField_admin_deletar_contato = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_admin_deletar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton_admin_deletar_id = new javax.swing.JRadioButton();
        jRadioButton_admin_deletar_cpf = new javax.swing.JRadioButton();
        jRadioButton_admin_deletar_nome = new javax.swing.JRadioButton();
        jRadioButton_admin_deletar_contato = new javax.swing.JRadioButton();
        painel2 = new javax.swing.JPanel();
        lblCameras = new javax.swing.JLabel();
        lblTelaDeCameras = new javax.swing.JLabel();
        btnAlarme = new javax.swing.JButton();
        btnOutros = new javax.swing.JButton();
        btnPrintar = new javax.swing.JButton();
        lblFundin = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menuBarConfig = new javax.swing.JMenu();
        menuBarRadio0 = new javax.swing.JRadioButtonMenuItem();
        menuBarRadio1 = new javax.swing.JRadioButtonMenuItem();
        menuBarRadio2 = new javax.swing.JRadioButtonMenuItem();

        jCheckBox1.setText("jCheckBox1");

        ComboBox_admin_tipo_alteracao2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBox_admin_tipo_alteracao2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "PORTEIRO", "RESIDENTE", "CORRESPONDENCIA", "SERVICO", "PRESTADOR" }));

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(760, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelInicial.setToolTipText("");
        painelInicial.setMinimumSize(new java.awt.Dimension(740, 550));
        painelInicial.setOpaque(false);
        painelInicial.setPreferredSize(new java.awt.Dimension(740, 550));

        lbl_bemVindo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbl_bemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bemVindo.setText("BEM VINDO DE VOLTA, PORTEIRO(A)!");
        lbl_bemVindo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_area_ativRecentes.setEditable(false);
        txt_area_ativRecentes.setColumns(20);
        txt_area_ativRecentes.setRows(5);
        txt_area_ativRecentes.setTabSize(4);
        txt_area_ativRecentes.setText("\n*(31/05/22) - registro de porteiro[CLEITINHO] novo no sistema.\n\n*(30/05/22) - registro de morador[ZEZÃO DAMASSA] novo no sistema.");
        jScrollPane2.setViewportView(txt_area_ativRecentes);

        javax.swing.GroupLayout painelAtivReccentesLayout = new javax.swing.GroupLayout(painelAtivReccentes);
        painelAtivReccentes.setLayout(painelAtivReccentesLayout);
        painelAtivReccentesLayout.setHorizontalGroup(
            painelAtivReccentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtivReccentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAtivReccentesLayout.setVerticalGroup(
            painelAtivReccentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtivReccentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPaneInicio.addTab("ATIVIDADES RECENTES", painelAtivReccentes);

        txt_area_novidades.setColumns(20);
        txt_area_novidades.setRows(5);
        jScrollPane3.setViewportView(txt_area_novidades);

        javax.swing.GroupLayout painelNovidadesLayout = new javax.swing.GroupLayout(painelNovidades);
        painelNovidades.setLayout(painelNovidadesLayout);
        painelNovidadesLayout.setHorizontalGroup(
            painelNovidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelNovidadesLayout.setVerticalGroup(
            painelNovidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNovidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPaneInicio.addTab("AGENDA", painelNovidades);

        txt_area_atualizacao.setColumns(20);
        txt_area_atualizacao.setRows(5);
        jScrollPane4.setViewportView(txt_area_atualizacao);

        javax.swing.GroupLayout painelAtualizacaoLayout = new javax.swing.GroupLayout(painelAtualizacao);
        painelAtualizacao.setLayout(painelAtualizacaoLayout);
        painelAtualizacaoLayout.setHorizontalGroup(
            painelAtualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAtualizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelAtualizacaoLayout.setVerticalGroup(
            painelAtualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPaneInicio.addTab("NOVIDADES", painelAtualizacao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        TabbedPaneInicio.addTab("A'NOTAS", jPanel1);

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(TabbedPaneInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(lbl_bemVindo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_bemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabbedPaneInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        painelInicial.setVisible(true);

        getContentPane().add(painelInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painel1.setMaximumSize(new java.awt.Dimension(1399, 729));
        painel1.setMinimumSize(new java.awt.Dimension(740, 550));
        painel1.setOpaque(false);
        painel1.setPreferredSize(new java.awt.Dimension(740, 550));
        painel1.setRequestFocusEnabled(false);
        painel1.setVisible(false);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("TABELA DE REGISTROS");

        tabela1.setOpaque(false);
        tabela1.setRowSelectionAllowed(false);
        ScrollPaneTabela.setViewportView(tabela1);

        TabbedPaneOpcoes.setMaximumSize(new java.awt.Dimension(420, 420));
        TabbedPaneOpcoes.setPreferredSize(new java.awt.Dimension(255, 420));

        subPanelInserir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBoxNovaInsercao.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBoxNovaInsercao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOVA CORRESPONDÊNCIA", "NOVO PRESTADOR DE SERVIÇO", "NOVO RESIDENTE" }));
        ComboBoxNovaInsercao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNovaInsercaoActionPerformed(evt);
            }
        });
        subPanelInserir.add(ComboBoxNovaInsercao, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));

        lbl_novaInsercao.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lbl_novaInsercao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_novaInsercao.setText("SELECIONE O TIPO DE INSERÇÃO");
        subPanelInserir.add(lbl_novaInsercao, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 218, 28));
        subPanelInserir.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 218, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID MORADOR");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESC. DA CORRESPONDENCIA");

        CheckBox_inserir_nome_entregador.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        CheckBox_inserir_nome_entregador.setText("NOME DO ENTREGADOR");
        CheckBox_inserir_nome_entregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_inserir_nome_entregadorActionPerformed(evt);
            }
        });

        CheckBox_inserir_cpf_entregador.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        CheckBox_inserir_cpf_entregador.setText("CPF ENTREGADOR");

        javax.swing.GroupLayout painel_inserirCorrespondenciaLayout = new javax.swing.GroupLayout(painel_inserirCorrespondencia);
        painel_inserirCorrespondencia.setLayout(painel_inserirCorrespondenciaLayout);
        painel_inserirCorrespondenciaLayout.setHorizontalGroup(
            painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirCorrespondenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_inserir_nome_entregador_correspondencia)
                    .addComponent(CheckBox_inserir_nome_entregador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_inserir_desc_correspondencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(painel_inserirCorrespondenciaLayout.createSequentialGroup()
                        .addGroup(painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_inserir_cpf_entregador_correspondencia)
                            .addComponent(CheckBox_inserir_cpf_entregador, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_inserirCorrespondenciaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_inserir_id_morador_correspondencia)))
                .addContainerGap())
        );
        painel_inserirCorrespondenciaLayout.setVerticalGroup(
            painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirCorrespondenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_inserir_id_morador_correspondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_inserir_desc_correspondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox_inserir_nome_entregador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_inserir_nome_entregador_correspondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox_inserir_cpf_entregador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(txt_inserir_cpf_entregador_correspondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        subPanelInserir.add(painel_inserirCorrespondencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 210));

        painel_inserirPrestador.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserir_nome_prestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserir_nome_prestadorActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CPF");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserir_cpf_prestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserir_cpf_prestadorActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CONTATO");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserir_contato_prestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserir_contato_prestadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_inserirPrestadorLayout = new javax.swing.GroupLayout(painel_inserirPrestador);
        painel_inserirPrestador.setLayout(painel_inserirPrestadorLayout);
        painel_inserirPrestadorLayout.setHorizontalGroup(
            painel_inserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirPrestadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_inserir_nome_prestador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_inserir_contato_prestador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_inserir_cpf_prestador))
                .addContainerGap())
        );
        painel_inserirPrestadorLayout.setVerticalGroup(
            painel_inserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirPrestadorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserir_nome_prestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserir_cpf_prestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserir_contato_prestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        subPanelInserir.add(painel_inserirPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, 218, 210));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CASA");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CPF");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTATO");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NOME");

        javax.swing.GroupLayout painel_inserirResidenteLayout = new javax.swing.GroupLayout(painel_inserirResidente);
        painel_inserirResidente.setLayout(painel_inserirResidenteLayout);
        painel_inserirResidenteLayout.setHorizontalGroup(
            painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                        .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_inserir_id_casa_residente, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_inserir_cpf_residente, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                    .addComponent(txt_inserir_nome_residente)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_inserir_contato_residente))
                .addContainerGap())
            .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        painel_inserirResidenteLayout.setVerticalGroup(
            painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_inserir_id_casa_residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_inserir_cpf_residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(txt_inserir_nome_residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_inserir_contato_residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );

        subPanelInserir.add(painel_inserirResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 210));
        subPanelInserir.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 10));

        btn_Inserir.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_Inserir.setText("INSERIR");
        btn_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirActionPerformed(evt);
            }
        });
        subPanelInserir.add(btn_Inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, -1));

        TabbedPaneOpcoes.addTab("INSERIR", subPanelInserir);

        jLabel21.setBackground(new java.awt.Color(255, 204, 51));
        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("FILTROS");

        txt_filtros_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtros_consultaActionPerformed(evt);
            }
        });

        ComboBoxTabelas.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBoxTabelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CORRESPONDÊNCIA", "PRESTADOR", "SERVIÇO", "AGENDA", "RESIDENTE" }));
        ComboBoxTabelas.setToolTipText("");
        ComboBoxTabelas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComboBoxTabelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTabelasActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 204, 51));
        jLabel22.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("TABELA");

        btn_pesquise.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_pesquise.setText("PESQUISE");
        btn_pesquise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquiseActionPerformed(evt);
            }
        });

        Combobox_colunasConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combobox_colunasConsultaActionPerformed(evt);
            }
        });

        ComboBox_tipo_pesquisa.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBox_tipo_pesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCA EXATA", "BUSCA APROXIMADA", "BUSCA GERAL" }));
        ComboBox_tipo_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_tipo_pesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelConsultarLayout = new javax.swing.GroupLayout(subPanelConsultar);
        subPanelConsultar.setLayout(subPanelConsultarLayout);
        subPanelConsultarLayout.setHorizontalGroup(
            subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBox_tipo_pesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(subPanelConsultarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator2))
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxTabelas, 0, 243, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_filtros_consulta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_pesquise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Combobox_colunasConsulta, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanelConsultarLayout.setVerticalGroup(
            subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ComboBox_tipo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Combobox_colunasConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_filtros_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pesquise, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        TabbedPaneOpcoes.addTab("CONSULTAR", subPanelConsultar);

        jButton_admin_alterar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton_admin_alterar.setText("ATUALIZAR DADOS");
        jButton_admin_alterar.setMaximumSize(new java.awt.Dimension(80, 24));
        jButton_admin_alterar.setMinimumSize(new java.awt.Dimension(80, 24));
        jButton_admin_alterar.setPreferredSize(new java.awt.Dimension(80, 24));
        jButton_admin_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_admin_alterarActionPerformed(evt);
            }
        });

        CheckBox_admin_alterar_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_admin_alterar_dataActionPerformed(evt);
            }
        });

        txt_admin_alterar_data_agendada.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        txt_admin_alterar_data_realizada.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        jLabel_admin_alterar_nome.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel_admin_alterar_nome.setText("NOME");

        CheckBox_admin_alterar_contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_admin_alterar_contatoActionPerformed(evt);
            }
        });

        jLabel_admin_alterar_contato.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel_admin_alterar_contato.setText("CONTATO");

        CheckBox_admin_alterar_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_admin_alterar_nomeActionPerformed(evt);
            }
        });

        jLabel_admin_alterar_senha.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel_admin_alterar_senha.setText("SENHA");

        jLabel_admin_alterar_data_realizada.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel_admin_alterar_data_realizada.setText("DATA REALIZADA");

        jLabel_admin_alterar_data_agendada.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel_admin_alterar_data_agendada.setText("DATA AGENDADA");

        txt_admin_alterar_nome.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_admin_alterar_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_admin_alterar_nomeActionPerformed(evt);
            }
        });

        txt_admin_alterar_contato.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_admin_alterar_contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_admin_alterar_contatoActionPerformed(evt);
            }
        });

        ComboBox_admin_alterar_dado.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBox_admin_alterar_dado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "PORTEIRO", "RESIDENTE", "CORRESPONDENCIA", "SERVICO", "PRESTADOR" }));

        jLabel_admin_alterar_tipo.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel_admin_alterar_tipo.setText("TIPO");

        txt_admin_alterar_tipo.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_admin_alterar_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_admin_alterar_tipoActionPerformed(evt);
            }
        });

        CheckBox_admin_alterar_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_admin_alterar_tipoActionPerformed(evt);
            }
        });

        jLabel_admin_alterar_identificação.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel_admin_alterar_identificação.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_admin_alterar_identificação.setText("IDENTIFICAÇÃO");

        txt_admin_alterar_id.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_admin_alterar_id.setText("ID");

        txt_admin_alterar_cpf.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txt_admin_alterar_cpf.setText("CPF");

        javax.swing.GroupLayout subSubPanel_admin_alterarLayout = new javax.swing.GroupLayout(subSubPanel_admin_alterar);
        subSubPanel_admin_alterar.setLayout(subSubPanel_admin_alterarLayout);
        subSubPanel_admin_alterarLayout.setHorizontalGroup(
            subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator_admin_alterar1)
                    .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                        .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_admin_alterar_identificação, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_admin_alterar_dado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator_admin_alterar2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subSubPanel_admin_alterarLayout.createSequentialGroup()
                                .addComponent(jLabel_admin_alterar_data_agendada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_admin_alterar_data_realizada))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subSubPanel_admin_alterarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txt_admin_alterar_data_agendada, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CheckBox_admin_alterar_data)
                                .addGap(21, 21, 21)
                                .addComponent(txt_admin_alterar_data_realizada, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                                .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_admin_alterar_nome)
                                    .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                                        .addComponent(txt_admin_alterar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CheckBox_admin_alterar_nome))
                                    .addComponent(jLabel_admin_alterar_senha)
                                    .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                                        .addComponent(pwf_admin_alterar_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CheckBox_admin_alterar_senha))
                                    .addComponent(jLabel_admin_alterar_contato)
                                    .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                                        .addComponent(txt_admin_alterar_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CheckBox_admin_alterar_contato))
                                    .addComponent(jLabel_admin_alterar_tipo)
                                    .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                                        .addComponent(txt_admin_alterar_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CheckBox_admin_alterar_tipo)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                                .addComponent(txt_admin_alterar_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBox_admin_alterar_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_admin_alterar_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckBox_admin_alterar_cpf))
                            .addComponent(jButton_admin_alterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        subSubPanel_admin_alterarLayout.setVerticalGroup(
            subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboBox_admin_alterar_dado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator_admin_alterar2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_admin_alterar_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_admin_alterar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBox_admin_alterar_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_admin_alterar_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwf_admin_alterar_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBox_admin_alterar_senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_admin_alterar_contato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_admin_alterar_contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBox_admin_alterar_contato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subSubPanel_admin_alterarLayout.createSequentialGroup()
                        .addComponent(jLabel_admin_alterar_tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_admin_alterar_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_admin_alterar_tipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_admin_alterar_data_agendada)
                            .addComponent(jLabel_admin_alterar_data_realizada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_admin_alterar_data_agendada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_admin_alterar_data_realizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_admin_alterar_data))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator_admin_alterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_admin_alterar_identificação)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_admin_alterar_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox_admin_alterar_id)))
                    .addGroup(subSubPanel_admin_alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_admin_alterar_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckBox_admin_alterar_cpf)))
                .addGap(18, 18, 18)
                .addComponent(jButton_admin_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPane_admin.addTab("ALTERAR", subSubPanel_admin_alterar);

        subSubPanel_admin_deletar.setMaximumSize(new java.awt.Dimension(320, 320));
        subSubPanel_admin_deletar.setPreferredSize(new java.awt.Dimension(255, 250));

        ComboBox_admin_deletar_tipo.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBox_admin_deletar_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "PORTEIRO", "RESIDENTE", "CORRESPONDENCIA", "SERVICO", "PRESTADOR" }));
        ComboBox_admin_deletar_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_admin_deletar_tipoActionPerformed(evt);
            }
        });

        jLabel_admin_deletar_identificação.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel_admin_deletar_identificação.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_admin_deletar_identificação.setText("IDENTIFICAÇÃO");

        jLabel_admin_deletar_id.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel_admin_deletar_id.setText("ID");

        jLabel_admin_deletar_cpf.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel_admin_deletar_cpf.setText("CPF");

        jTextField_admin_deletar_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_admin_deletar_cpfActionPerformed(evt);
            }
        });

        jLabel_admin_deletar_nome.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel_admin_deletar_nome.setText("NOME");

        jTextField_admin_deletar_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_admin_deletar_nomeActionPerformed(evt);
            }
        });

        jLabel_admin_deletar_contato.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel_admin_deletar_contato.setText("CONTATO");

        jTextField_admin_deletar_contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_admin_deletar_contatoActionPerformed(evt);
            }
        });

        jButton_admin_deletar.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton_admin_deletar.setText("DELETAR DADO");
        jButton_admin_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_admin_deletarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TIPOS DE DADO");

        buttonGroup_admin_deletar.add(jRadioButton_admin_deletar_id);
        jRadioButton_admin_deletar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_admin_deletar_idActionPerformed(evt);
            }
        });

        buttonGroup_admin_deletar.add(jRadioButton_admin_deletar_cpf);
        jRadioButton_admin_deletar_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_admin_deletar_cpfActionPerformed(evt);
            }
        });

        buttonGroup_admin_deletar.add(jRadioButton_admin_deletar_nome);

        buttonGroup_admin_deletar.add(jRadioButton_admin_deletar_contato);

        javax.swing.GroupLayout subSubPanel_admin_deletarLayout = new javax.swing.GroupLayout(subSubPanel_admin_deletar);
        subSubPanel_admin_deletar.setLayout(subSubPanel_admin_deletarLayout);
        subSubPanel_admin_deletarLayout.setHorizontalGroup(
            subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subSubPanel_admin_deletarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                                    .addComponent(jLabel_admin_deletar_cpf)
                                    .addGap(202, 202, 202))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subSubPanel_admin_deletarLayout.createSequentialGroup()
                                    .addComponent(jTextField_admin_deletar_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton_admin_deletar_cpf)
                                    .addGap(12, 12, 12)))
                            .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                                .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                                        .addComponent(jTextField_admin_deletar_id, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton_admin_deletar_id))
                                    .addComponent(jLabel_admin_deletar_nome)
                                    .addComponent(jLabel_admin_deletar_contato))
                                .addGap(24, 24, 24))
                            .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                                .addComponent(jLabel_admin_deletar_id)
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subSubPanel_admin_deletarLayout.createSequentialGroup()
                        .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_admin_deletar_tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator_admin_deletar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_admin_deletar_identificação, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                        .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                                .addComponent(jTextField_admin_deletar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton_admin_deletar_nome))
                            .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                                .addComponent(jTextField_admin_deletar_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton_admin_deletar_contato)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton_admin_deletar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        subSubPanel_admin_deletarLayout.setVerticalGroup(
            subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subSubPanel_admin_deletarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subSubPanel_admin_deletarLayout.createSequentialGroup()
                        .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subSubPanel_admin_deletarLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBox_admin_deletar_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator_admin_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_admin_deletar_identificação)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel_admin_deletar_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_admin_deletar_id))
                            .addComponent(jTextField_admin_deletar_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addComponent(jLabel_admin_deletar_cpf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_admin_deletar_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_admin_deletar_cpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_admin_deletar_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_admin_deletar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_admin_deletar_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_admin_deletar_contato)
                .addGap(10, 10, 10)
                .addGroup(subSubPanel_admin_deletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_admin_deletar_contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_admin_deletar_contato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_admin_deletar)
                .addGap(166, 166, 166))
        );

        TabbedPane_admin.addTab("DELETAR", subSubPanel_admin_deletar);

        javax.swing.GroupLayout subPanel_adminLayout = new javax.swing.GroupLayout(subPanel_admin);
        subPanel_admin.setLayout(subPanel_adminLayout);
        subPanel_adminLayout.setHorizontalGroup(
            subPanel_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel_adminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TabbedPane_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        subPanel_adminLayout.setVerticalGroup(
            subPanel_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_adminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPane_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPaneOpcoes.addTab("ADMIN", subPanel_admin);

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TabbedPaneOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(138, 138, 138))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabbedPaneOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painel2.setMinimumSize(new java.awt.Dimension(740, 550));
        painel2.setOpaque(false);
        painel2.setPreferredSize(new java.awt.Dimension(740, 550));

        lblCameras.setBackground(new java.awt.Color(255, 255, 255));
        lblCameras.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblCameras.setForeground(new java.awt.Color(255, 255, 255));
        lblCameras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCameras.setText("CÂMERAS");

        lblTelaDeCameras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/conjuntoCameras.png"))); // NOI18N

        btnAlarme.setBackground(new java.awt.Color(200, 0, 0));
        btnAlarme.setText("ALARME");
        btnAlarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmeActionPerformed(evt);
            }
        });

        btnOutros.setText("OUTROS BOTÕES, TALVEZ");

        btnPrintar.setText("PRINTAR");
        btnPrintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(lblCameras))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painel2Layout.createSequentialGroup()
                                .addComponent(btnAlarme)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrintar)
                                .addGap(18, 18, 18)
                                .addComponent(btnOutros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblTelaDeCameras))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblCameras)
                .addGap(18, 18, 18)
                .addComponent(lblTelaDeCameras)
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrintar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlarme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblFundin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFundin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/foto_fundo_vemelho_ondinha1080.png"))); // NOI18N
        lblFundin.setMaximumSize(new java.awt.Dimension(1399, 729));
        lblFundin.setMinimumSize(new java.awt.Dimension(740, 538));
        lblFundin.setPreferredSize(new java.awt.Dimension(745, 538));
        getContentPane().add(lblFundin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -42, 830, 580));

        menuBarConfig.setText("TELAS");

        menuBarRadio0.setSelected(true);
        menuBarRadio0.setText("INÍCIO");
        grupoPaineis.add(menuBarRadio0);
        menuBarRadio0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconePerfil32.png"))); // NOI18N
        menuBarRadio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio0ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio0);

        menuBarRadio1.setText("CADASTROS");
        menuBarRadio1.setToolTipText("ABRE A ABA DE CADASTRADOS");
        menuBarRadio1.setActionCommand("painel");
        grupoPaineis.add(menuBarRadio1);
        menuBarRadio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconeCadastro32.png"))); // NOI18N
        menuBarRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio1ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio1);

        menuBarRadio2.setSelected(true);
        menuBarRadio2.setText("CÂMERAS");
        menuBarRadio2.setToolTipText("ABRE A ABA DE CÂMERAS");
        menuBarRadio2.setActionCommand("painel");
        menuBarRadio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconeCamera32.png"))); // NOI18N
        grupoPaineis.add(menuBarRadio2);
        menuBarRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio2ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio2);

        MenuBar.add(menuBarConfig);

        setJMenuBar(MenuBar);

        setSize(new java.awt.Dimension(756, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // métodos criados
    private void setPaineisInvisiveis(){
        this.painelInicial.setVisible(false);
        this.painel2.setVisible(false);
        this.painel1.setVisible(false);
    }
  
    private void setSubPaineisInsercaoInvisiveis(){
        this.painel_inserirCorrespondencia.setVisible(false);
        this.painel_inserirPrestador.setVisible(false);
        this.painel_inserirResidente.setVisible(false);
    }
    
    private void colocarNaTabela(String tabela,String[] colunas){
        
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        ArrayList<Object[]> lista;
        Object[] data = new Object[colunas.length];
        
        // zerando colunas e linhas
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        
        // adicionando as colunas na tabela
        for (int x=0; x< colunas.length;x++){
            dtm.addColumn(colunas[x]);
        }

        lista = dbm.consultarDados(tabela);
        
        // colocando as informações no array data
        for(int x=0; x< lista.size();x++){
            data[0] = lista.get(x)[0];
            data[1] = lista.get(x)[1];
            data[2] = lista.get(x)[2];
            data[3] = lista.get(x)[3];
            dtm.addRow(data);
        }
    }
    
    private void colocarNaTabelaAdv(String tabela,String[] colunas,String param[],String valor[]){
        
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        ArrayList<Object[]> lista;
        Object[] data = new Object[colunas.length];
        
        // zerando colunas e linhas
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        
        // add colunas
        for (int x=0; x< colunas.length;x++){
            dtm.addColumn(colunas[x]);
        }

        lista = dbm.consultarDadosAdv(tabela, param, valor);
        
        // add info no data
        for(int x=0; x< lista.size();x++){
            for (int z=0; z<data.length;z++){data[z] = lista.get(x)[z];}
            dtm.addRow(data);
        }
    }

    private void colocarNaTabelaAdv(String tabela,String[] colunas,String param[],String valor[], boolean like){
        
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        ArrayList<Object[]> lista;
        Object[] data = new Object[colunas.length];
        
        // zerando colunas e linhas
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        
        // add colunas
        for (int x=0; x< colunas.length;x++){
            dtm.addColumn(colunas[x]);
        }

        lista = dbm.consultarDadosAdv(tabela, param, valor, true);
        
        // add info no data
        for(int x=0; x< lista.size();x++){
            for (int z=0; z<data.length;z++){data[z] = lista.get(x)[z];}
            dtm.addRow(data);
        }
    }

    private void limparInfoInsercoes(){
        this.txt_inserir_contato_prestador.setText("");
        this.txt_inserir_contato_residente.setText("");
        this.txt_inserir_cpf_entregador_correspondencia.setText("");
        this.txt_inserir_cpf_prestador.setText("");
        this.txt_inserir_cpf_residente.setText("");
        this.txt_inserir_desc_correspondencia.setText("");
        this.txt_inserir_id_casa_residente.setText("");
        this.txt_inserir_id_morador_correspondencia.setText("");
        this.txt_inserir_nome_entregador_correspondencia.setText("");
        this.txt_inserir_nome_prestador.setText("");
        this.txt_inserir_nome_residente.setText("");
        
    }
 
    // métodos automáticos
    
    private void menuBarRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio1ActionPerformed
        this.setPaineisInvisiveis();    
        painel1.setVisible(true);      
    }//GEN-LAST:event_menuBarRadio1ActionPerformed

    private void menuBarRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio2ActionPerformed
        this.setPaineisInvisiveis();
        painel2.setVisible(true);
    }//GEN-LAST:event_menuBarRadio2ActionPerformed

    // opções de consulta
    private void ComboBoxTabelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTabelasActionPerformed
        /*
        0 = CORRESPONDÊNCIA
        1 = PRESTADOR
        2 = SERVIÇO
        3 = AGENDA
        4 = RESIDENTE
        */
        
        // limpando lista anterior
        this.Combobox_colunasConsulta.removeAllItems();
        
        // adicionando nova lista de parametros
        switch(this.ComboBoxTabelas.getSelectedIndex()){
            case 0:
                for (int x=0; x< this.colunas[0].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[0][x].replace("_correspondencia", "").replace("_", " "));}
                break;
            case 1:
                for (int x=0; x< this.colunas[1].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[1][x].replace("_prestador", "").replace("_", " "));}
                break;
            case 2:
                for (int x=0; x< this.colunas[2].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[2][x].replace("_servico", "").replace("_", " "));}
                break;
            case 3:
                for (int x=0; x< this.colunas[3].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[3][x].replace("_agenda", "").replace("_", " "));}
                break;
            case 4:
                for (int x=0; x< this.colunas[4].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[4][x].replace("_residente", "").replace("_", " "));}
                break;
            default:
                this.Combobox_colunasConsulta.addItem(" ");
                break;
        }
    }//GEN-LAST:event_ComboBoxTabelasActionPerformed
    
    // alarme
    private void btnAlarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmeActionPerformed
        JOptionPane.showMessageDialog(null, "UM AVISO DE EMERGÊNCIA FOI ENVIADO\nPARA A POLÍCIA LOCAL!");
    }//GEN-LAST:event_btnAlarmeActionPerformed

    private void menuBarRadio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio0ActionPerformed
        this.setPaineisInvisiveis();
        painelInicial.setVisible(true);
    }//GEN-LAST:event_menuBarRadio0ActionPerformed

    // consulta
    private void btn_pesquiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquiseActionPerformed
        
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        
        String[][] colunasTb = {
            //colunas correspondencia
            {"ID", "ID DESTINATÁRIO", "TIPO DE CORRESPONDENCIA", "DATA DE RECEBIMENTO"},
            // colunas prestador de serviços
            {"ID", "CPF", "NOME", "CONTATO"},
            // colunas serviços
            {"ID SERVIÇO", "ID PRESTADOR", "ID CONTRATANTE",
            "TIPO DE SERVICO", "DATA AGENDADA", "DATA DE REALIZAÇÃO"},
            // colunas agenda
            {"ID", "COMPROMISSO"},
            // colunas residentes
            {"ID", "CASA", "CPF", "PROPRIETÁRIO", "CONTATO"}
               
        };
        String tabela = "";
        int tam=0, indexColunasTab=0;
        
        switch((String)ComboBoxTabelas.getSelectedItem()){
            case "CORRESPONDÊNCIA":
                tabela = "tb_correspondencia";
                indexColunasTab=0;
                tam = colunasTb[0].length;
                break; 
            case "PRESTADOR":
                tabela = "tb_prestador";
                indexColunasTab=1;
                tam = colunasTb[1].length;
                break;   
            case "SERVIÇO":
                tabela = "tb_servico";
                indexColunasTab=2;
                tam = colunasTb[2].length;
                break;
            case "AGENDA":
                tabela = "tb_agenda";
                indexColunasTab=3;
                tam = colunasTb[3].length;
                break;  
            case "RESIDENTE":
                tabela = "tb_residente";
                indexColunasTab=4;
                tam = colunasTb[4].length;
                break;
            default:
                break;
        }
        // criando o array de colunas que aparecerão na tabela e add valores nele
        String[] coluna = new String[tam];
        coluna = colunasTb[indexColunasTab];
        
        switch (this.ComboBox_tipo_pesquisa.getSelectedIndex()){
            case 0: // busca exata
                String[] param = {this.colunas[indexColunasTab][this.Combobox_colunasConsulta.getSelectedIndex()]};
                String[] valor = {this.txt_filtros_consulta.getText().toLowerCase().trim()};
                this.colocarNaTabelaAdv(tabela,coluna, param, valor);
                break;
            case 1: // busca aproximada
                String[] param1 = {this.colunas[indexColunasTab][this.Combobox_colunasConsulta.getSelectedIndex()]};
                String[] valor1 = {this.txt_filtros_consulta.getText().toLowerCase().trim()};
                this.colocarNaTabelaAdv(tabela,coluna, param1, valor1, true);
                break;
            case 2: // busca geral
                this.colocarNaTabela(tabela, coluna);
                break;
            default:
                break;
                    
        }
        
        
        this.tabela1.setEnabled(false);
    }//GEN-LAST:event_btn_pesquiseActionPerformed

    private void txt_inserir_nome_prestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserir_nome_prestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserir_nome_prestadorActionPerformed

    private void txt_inserir_cpf_prestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserir_cpf_prestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserir_cpf_prestadorActionPerformed

    private void txt_inserir_contato_prestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserir_contato_prestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserir_contato_prestadorActionPerformed

    // inserção
    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        String tabela="";
        ArrayList<String> parametros = new ArrayList();
        ArrayList<String> valores = new ArrayList();
        
        switch (this.ComboBoxNovaInsercao.getSelectedIndex()){
            case 1: // prestador
                
                parametros.add(this.colunas[1][2]); // nome prestador
                parametros.add(this.colunas[1][1]); // cpf prestador
                parametros.add(this.colunas[1][3]); // contato prestador
                
                valores.add(this.txt_inserir_nome_prestador.getText().toLowerCase().trim());
                valores.add(this.txt_inserir_cpf_prestador.getText().trim());
                valores.add(this.txt_inserir_contato_prestador.getText().trim());
                
                tabela = "tb_prestador";
                break;
                
            case 0: // correspondencia
                
                parametros.add(this.colunas[0][1]); // id morador
                parametros.add(this.colunas[0][2]); // descrição da correspondência
                
                valores.add(this.txt_inserir_id_morador_correspondencia.getText().trim());
                valores.add(this.txt_inserir_desc_correspondencia.getText().trim());
                
                if(this.CheckBox_inserir_nome_entregador.isSelected()){
                    parametros.add(this.colunas[0][3]); // nome entregador
                    valores.add(this.txt_inserir_nome_entregador_correspondencia.getText().toLowerCase().trim());
                }
                if(this.CheckBox_inserir_cpf_entregador.isSelected()){
                    parametros.add(this.colunas[0][4]); // cpf entregador
                    valores.add(this.txt_inserir_cpf_entregador_correspondencia.getText().trim());
                }

                tabela = "tb_correspondencia";
                break;
                
            case 2: // residente
                parametros.add(this.colunas[4][1]); // casa residente
                parametros.add(this.colunas[4][2]); // cpf residente
                parametros.add(this.colunas[4][3]); // nome residente
                parametros.add(this.colunas[4][4]); // contato residente
                
                
                valores.add(this.txt_inserir_id_casa_residente.getText());
                valores.add(this.txt_inserir_cpf_residente.getText());
                valores.add(this.txt_inserir_nome_residente.getText().toLowerCase());
                valores.add(this.txt_inserir_contato_residente.getText());
                
                tabela = "tb_residente";
                break;
                
            default:
                break;
        }
        
        String[] param = new String[parametros.size()];
        String[] valor = new String[valores.size()];
        for (int x=0; x<parametros.size(); x++){param[x] = parametros.get(x);}
        for (int x=0; x<valores.size(); x++){valor[x] = valores.get(x);}
        
        if (valores.size() == parametros.size() && valores.size() > 2){
            this.dbm.inserirDados(tabela, param, valor);
            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!");
            this.limparInfoInsercoes();
        }
        else{
            JOptionPane.showMessageDialog(null,
                "INFORMAÇÕES INVÁLIDAS/INCOMPLETAS!"
                + "\nTENHA CERTEZA DE PREENCHER TODOS OS REQUISITOS.");       
        }
        
    }//GEN-LAST:event_btn_InserirActionPerformed

    private void txt_filtros_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtros_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtros_consultaActionPerformed

    // print
    private void btnPrintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintarActionPerformed
        JOptionPane.showMessageDialog(null, "PRINT DE TELA DA CÂMERA DE SEGURANÇA\nTIRADA COM SUCESSO!");
    }//GEN-LAST:event_btnPrintarActionPerformed

    private void CheckBox_inserir_nome_entregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_inserir_nome_entregadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_inserir_nome_entregadorActionPerformed

    // visibilidade dos subPaineis
    private void ComboBoxNovaInsercaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNovaInsercaoActionPerformed
        this.setSubPaineisInsercaoInvisiveis();
        switch (this.ComboBoxNovaInsercao.getSelectedIndex()){
            case 0: // correspondencia
                this.painel_inserirCorrespondencia.setVisible(true);
                break;
            case 1: // prestador de serviço
                this.painel_inserirPrestador.setVisible(true);
                break;
            case 2: // residente
                this.painel_inserirResidente.setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_ComboBoxNovaInsercaoActionPerformed

    private void ComboBox_tipo_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_tipo_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_tipo_pesquisaActionPerformed

    private void Combobox_colunasConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combobox_colunasConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combobox_colunasConsultaActionPerformed
    
    private void CheckBox_admin_alterar_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_admin_alterar_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_admin_alterar_tipoActionPerformed

    private void txt_admin_alterar_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_admin_alterar_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_admin_alterar_tipoActionPerformed

    private void txt_admin_alterar_contatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_admin_alterar_contatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_admin_alterar_contatoActionPerformed

    private void txt_admin_alterar_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_admin_alterar_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_admin_alterar_nomeActionPerformed

    private void CheckBox_admin_alterar_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_admin_alterar_nomeActionPerformed

    }//GEN-LAST:event_CheckBox_admin_alterar_nomeActionPerformed

    private void CheckBox_admin_alterar_contatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_admin_alterar_contatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_admin_alterar_contatoActionPerformed

    private void CheckBox_admin_alterar_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_admin_alterar_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_admin_alterar_dataActionPerformed

    private void jButton_admin_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_admin_alterarActionPerformed
        String tabela = "";
        ArrayList<String> parametros=new ArrayList();
        ArrayList<String> valores=new ArrayList();
        ArrayList<String> paramPes=new ArrayList();
        ArrayList<String> valorPes=new ArrayList();

        switch (this.ComboBox_admin_alterar_dado.getSelectedIndex()){
            
            case 1: // porteiro
            if(this.CheckBox_admin_alterar_nome.isSelected()){
                parametros.add(this.colunas[6][2]); // nome porteiro
                valores.add(this.txt_admin_alterar_nome.getText().toLowerCase().trim());
            }
            if(this.CheckBox_admin_alterar_senha.isSelected()){
                parametros.add(this.colunas[6][3]); // senha porteiro
                valores.add(this.pwf_admin_alterar_senha.getText().trim());
            }
            if(this.CheckBox_admin_alterar_id.isSelected()){
                paramPes.add("id_porteiro");
                valorPes.add(this.txt_admin_alterar_id.getText().trim());
            }
            
            tabela = "tb_porteiro";
            break;

            case 0: // admin

            if(this.CheckBox_admin_alterar_nome.isSelected()){
                parametros.add(this.colunas[5][2]); // nome admin
                valores.add(this.txt_admin_alterar_nome.getText().toLowerCase().trim());
            }
            if(this.CheckBox_admin_alterar_senha.isSelected()){
                parametros.add(this.colunas[5][3]); // senha admin
                valores.add(this.pwf_admin_alterar_senha.getText().trim());
            }
            if(this.CheckBox_admin_alterar_id.isSelected()){
                paramPes.add("id_admin");
                valorPes.add(this.txt_admin_alterar_id.getText().trim());
            }
            if(this.CheckBox_admin_alterar_cpf.isSelected()){
                paramPes.add("cpf_admin");
                valorPes.add(this.txt_admin_alterar_cpf.getText().trim());
            }

            tabela = "tb_admin";
            break;

            case 2: // residente
                
            if(this.CheckBox_admin_alterar_nome.isSelected()){
            parametros.add(this.colunas[4][3]); // nome residente]
            valores.add(this.txt_admin_alterar_nome.getText().toLowerCase());
            }    
            if(this.CheckBox_admin_alterar_contato.isSelected()){
            parametros.add(this.colunas[4][4]); // contato residente
            valores.add(this.txt_admin_alterar_contato.getText()); 
            }
            if(this.CheckBox_admin_alterar_id.isSelected()){
                paramPes.add("id_residente");
                valorPes.add(this.txt_admin_alterar_id.getText().trim());
            }
            if(this.CheckBox_admin_alterar_cpf.isSelected()){
                paramPes.add("cpf_cliente");
                valorPes.add(this.txt_admin_alterar_cpf.getText().trim());
            }

            tabela = "tb_residente";
            break;

            case 3: //correspondencia
            
            if(this.CheckBox_admin_alterar_tipo.isSelected()){    
            parametros.add(this.colunas[0][2]); // descrição da correspondência
            valores.add(this.txt_admin_alterar_tipo.getText().trim());
            }
            if(this.CheckBox_admin_alterar_nome.isSelected()){
                parametros.add(this.colunas[0][3]); // nome entregador
                valores.add(this.txt_admin_alterar_nome.getText().toLowerCase().trim());
            }
            if(this.CheckBox_admin_alterar_data.isSelected()){
                parametros.add(this.colunas[0][5]); // data de entrega
                valores.add(this.txt_admin_alterar_data_realizada.getText().trim());
            }
            if(this.CheckBox_admin_alterar_id.isSelected()){
                paramPes.add("id_correspondencia");
                valorPes.add(this.txt_admin_alterar_id.getText().trim());
            }
            if(this.CheckBox_admin_alterar_cpf.isSelected()){
                paramPes.add("cpf_entregador_correspondencia");
                valorPes.add(this.txt_admin_alterar_cpf.getText().trim());
            }


            tabela = "tb_correspondencia";
            break;
            
            case 4: //servico
                
            if(this.CheckBox_admin_alterar_tipo.isSelected()){    
            parametros.add(this.colunas[2][3]); // tipo do servico
            valores.add(this.txt_admin_alterar_tipo.getText().trim());
            }
            if(this.CheckBox_admin_alterar_data.isSelected())
            parametros.add(this.colunas[2][4]); // data de agendamento
            parametros.add(this.colunas[2][5]); // data de realização
            valores.add(this.txt_admin_alterar_data_agendada.getText().trim());
            valores.add(this.txt_admin_alterar_data_realizada.getText().trim());
            if(this.CheckBox_admin_alterar_id.isSelected()){
                paramPes.add("id_servico");
                valorPes.add(this.txt_admin_alterar_id.getText().trim());
            }
            
            tabela="tb_servico";
            break;
            
            case 5: //prestador
                
            if(this.CheckBox_admin_alterar_nome.isSelected()){
                parametros.add(this.colunas[1][2]); // nome prestador
                valores.add(this.txt_admin_alterar_nome.getText().toLowerCase().trim());
            }
            if(this.CheckBox_admin_alterar_contato.isSelected()){
            parametros.add(this.colunas[1][3]); // contato prestador
            valores.add(this.txt_admin_alterar_contato.getText().trim()); 
            }
            if(this.CheckBox_admin_alterar_id.isSelected()){
                paramPes.add("id_residente");
                valorPes.add(this.txt_admin_alterar_id.getText().trim());
            }
            if(this.CheckBox_admin_alterar_cpf.isSelected()){
                paramPes.add("cpf_cliente");
                valorPes.add(this.txt_admin_alterar_cpf.getText().trim());
            }


            tabela = "tb_prestador";
            break;

            default:
            break;
        }

        String[] valor = new String[valores.size()];
        String[] param = new String[parametros.size()];
        String[] paramPesquisa = new String[paramPes.size()];
        String[] valorPesquisa = new String[valorPes.size()];
        
        for(int x=0;x<parametros.size();x++){
            param[x]=parametros.get(x);
        }
        for(int x=0;x<valores.size();x++){
            valor[x]=valores.get(x);
        }
        for(int x=0;x<paramPes.size();x++){
            paramPesquisa[x]=paramPes.get(x);
        }
        for(int x=0;x<valorPes.size();x++){
            valorPesquisa[x]=valorPes.get(x);
        }
        
        if(param.length == valor.length){
            dbm.alterarDados(tabela,param, valor, paramPesquisa, valorPesquisa);
            JOptionPane.showMessageDialog(null, "Tabela alterada com sucesso.");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR TABELA.");
        }
    }//GEN-LAST:event_jButton_admin_alterarActionPerformed

    private void jRadioButton_admin_deletar_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_admin_deletar_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_admin_deletar_cpfActionPerformed

    private void jRadioButton_admin_deletar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_admin_deletar_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_admin_deletar_idActionPerformed

    private void jButton_admin_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_admin_deletarActionPerformed
        String tabela = "";
        String paramAnc="";

        switch(this.ComboBox_admin_deletar_tipo.getSelectedIndex()){
            case 0: //admin
            tabela="tb_admin";
            paramAnc="_admin";
            break;
            case 1: //porteiro
            tabela="tb_porteiro";
            paramAnc="_porteiro";
            break;
            case 2: //residente
            tabela="tb_residente";
            paramAnc="_residente";
            case 3: //correspondencia
            tabela="tb_correspondencia";
            paramAnc="_correspondencia";
            break;
            case 4: //servico
            tabela="tb_servico";
            paramAnc="_servico";
            break;
            case 5: //prestador
            tabela="tb_prestador";
            paramAnc="_prestador";
            break;
        }

        String param="", valor="";

        if(this.jRadioButton_admin_deletar_id.isSelected()){
            param="id"+paramAnc;
            valor=this.jTextField_admin_deletar_id.getText().toLowerCase().trim();
        }
        if(this.jRadioButton_admin_deletar_cpf.isSelected()){
            param="cpf"+paramAnc;
            valor=this.jTextField_admin_deletar_cpf.getText().toLowerCase().trim();
        }
        if(this.jRadioButton_admin_deletar_nome.isSelected()){
            param="nome"+paramAnc;
            valor=this.jTextField_admin_deletar_nome.getText().toLowerCase().trim();
        }
        if(this.jRadioButton_admin_deletar_contato.isSelected()){
            param="contato"+paramAnc;
            valor=this.jTextField_admin_deletar_contato.getText().toLowerCase().trim();
        }

        if(true){
            dbm.deletarRegistro(tabela,param, valor);
            JOptionPane.showMessageDialog(null, "Dado deletado com sucesso.");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRO AO DELETAR DADO.");
        }
    }//GEN-LAST:event_jButton_admin_deletarActionPerformed

    private void jTextField_admin_deletar_contatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_admin_deletar_contatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_admin_deletar_contatoActionPerformed

    private void jTextField_admin_deletar_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_admin_deletar_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_admin_deletar_nomeActionPerformed

    private void jTextField_admin_deletar_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_admin_deletar_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_admin_deletar_cpfActionPerformed

    private void ComboBox_admin_deletar_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_admin_deletar_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_admin_deletar_tipoActionPerformed
       
                
     
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
            java.util.logging.Logger.getLogger(TelaMenuInicialAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicialAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicialAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicialAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuInicialAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_admin_alterar_contato;
    private javax.swing.JCheckBox CheckBox_admin_alterar_cpf;
    private javax.swing.JCheckBox CheckBox_admin_alterar_data;
    private javax.swing.JCheckBox CheckBox_admin_alterar_id;
    private javax.swing.JCheckBox CheckBox_admin_alterar_nome;
    private javax.swing.JCheckBox CheckBox_admin_alterar_senha;
    private javax.swing.JCheckBox CheckBox_admin_alterar_tipo;
    private javax.swing.JCheckBox CheckBox_inserir_cpf_entregador;
    private javax.swing.JCheckBox CheckBox_inserir_nome_entregador;
    private javax.swing.JComboBox<String> ComboBoxNovaInsercao;
    private javax.swing.JComboBox<String> ComboBoxTabelas;
    private javax.swing.JComboBox<String> ComboBox_admin_alterar_dado;
    private javax.swing.JComboBox<String> ComboBox_admin_deletar_tipo;
    private javax.swing.JComboBox<String> ComboBox_admin_tipo_alteracao2;
    private javax.swing.JComboBox<String> ComboBox_tipo_pesquisa;
    private javax.swing.JComboBox<String> Combobox_colunasConsulta;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JScrollPane ScrollPaneTabela;
    private javax.swing.JTabbedPane TabbedPaneInicio;
    private javax.swing.JTabbedPane TabbedPaneOpcoes;
    private javax.swing.JTabbedPane TabbedPane_admin;
    private javax.swing.JButton btnAlarme;
    private javax.swing.JButton btnOutros;
    private javax.swing.JButton btnPrintar;
    private javax.swing.JButton btn_Inserir;
    private javax.swing.JButton btn_pesquise;
    private javax.swing.ButtonGroup buttonGroup_admin_deletar;
    private javax.swing.JButton jButton_admin_alterar;
    private javax.swing.JButton jButton_admin_deletar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_admin_alterar_contato;
    private javax.swing.JLabel jLabel_admin_alterar_data_agendada;
    private javax.swing.JLabel jLabel_admin_alterar_data_realizada;
    private javax.swing.JLabel jLabel_admin_alterar_identificação;
    private javax.swing.JLabel jLabel_admin_alterar_nome;
    private javax.swing.JLabel jLabel_admin_alterar_senha;
    private javax.swing.JLabel jLabel_admin_alterar_tipo;
    private javax.swing.JLabel jLabel_admin_deletar_contato;
    private javax.swing.JLabel jLabel_admin_deletar_cpf;
    private javax.swing.JLabel jLabel_admin_deletar_id;
    private javax.swing.JLabel jLabel_admin_deletar_identificação;
    private javax.swing.JLabel jLabel_admin_deletar_nome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_admin_deletar_contato;
    private javax.swing.JRadioButton jRadioButton_admin_deletar_cpf;
    private javax.swing.JRadioButton jRadioButton_admin_deletar_id;
    private javax.swing.JRadioButton jRadioButton_admin_deletar_nome;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator_admin_alterar1;
    private javax.swing.JSeparator jSeparator_admin_alterar2;
    private javax.swing.JSeparator jSeparator_admin_deletar;
    private javax.swing.JTextField jTextField_admin_deletar_contato;
    private javax.swing.JTextField jTextField_admin_deletar_cpf;
    private javax.swing.JTextField jTextField_admin_deletar_id;
    private javax.swing.JTextField jTextField_admin_deletar_nome;
    private javax.swing.JLabel lblCameras;
    private javax.swing.JLabel lblFundin;
    private javax.swing.JLabel lblTelaDeCameras;
    private javax.swing.JLabel lbl_bemVindo;
    private javax.swing.JLabel lbl_novaInsercao;
    private javax.swing.JMenu menuBarConfig;
    private javax.swing.JRadioButtonMenuItem menuBarRadio0;
    private javax.swing.JRadioButtonMenuItem menuBarRadio1;
    private javax.swing.JRadioButtonMenuItem menuBarRadio2;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painelAtivReccentes;
    private javax.swing.JPanel painelAtualizacao;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painelNovidades;
    private javax.swing.JPanel painel_inserirCorrespondencia;
    private javax.swing.JPanel painel_inserirPrestador;
    private javax.swing.JPanel painel_inserirResidente;
    private javax.swing.JPasswordField pwf_admin_alterar_senha;
    private javax.swing.JPanel subPanelConsultar;
    private javax.swing.JPanel subPanelInserir;
    private javax.swing.JPanel subPanel_admin;
    private javax.swing.JPanel subSubPanel_admin_alterar;
    private javax.swing.JPanel subSubPanel_admin_deletar;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextField txt_admin_alterar_contato;
    private javax.swing.JTextField txt_admin_alterar_cpf;
    private javax.swing.JTextField txt_admin_alterar_data_agendada;
    private javax.swing.JTextField txt_admin_alterar_data_realizada;
    private javax.swing.JTextField txt_admin_alterar_id;
    private javax.swing.JTextField txt_admin_alterar_nome;
    private javax.swing.JTextField txt_admin_alterar_tipo;
    private javax.swing.JTextArea txt_area_ativRecentes;
    private javax.swing.JTextArea txt_area_atualizacao;
    private javax.swing.JTextArea txt_area_novidades;
    private javax.swing.JTextField txt_filtros_consulta;
    private javax.swing.JTextField txt_inserir_contato_prestador;
    private javax.swing.JTextField txt_inserir_contato_residente;
    private javax.swing.JTextField txt_inserir_cpf_entregador_correspondencia;
    private javax.swing.JTextField txt_inserir_cpf_prestador;
    private javax.swing.JTextField txt_inserir_cpf_residente;
    private javax.swing.JTextField txt_inserir_desc_correspondencia;
    private javax.swing.JTextField txt_inserir_id_casa_residente;
    private javax.swing.JTextField txt_inserir_id_morador_correspondencia;
    private javax.swing.JTextField txt_inserir_nome_entregador_correspondencia;
    private javax.swing.JTextField txt_inserir_nome_prestador;
    private javax.swing.JTextField txt_inserir_nome_residente;
    // End of variables declaration//GEN-END:variables
}
