package GUI;

import DAO.ManipuladorDB;
import java.util.ArrayList;
import Backend.*;
import javax.swing.ButtonGroup;
import javax.swing.Popup;
import javax.swing.table.DefaultTableModel;

public class TelaMenuInicial extends javax.swing.JFrame {

    // atributos
    private boolean painel1Visivel = true, painel2Visivel = false;
    private ButtonGroup grupoPaineis = new ButtonGroup();
   
    
    private ManipuladorDB dbm;

    public TelaMenuInicial() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        dbm = new ManipuladorDB("banco_portaria_infernal");
        this.setPaineisInvisiveis();
        painelInicial.setVisible(true);
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInicial = new javax.swing.JPanel();
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
        lbl_bemVindo = new javax.swing.JLabel();
        painel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        ScrollPaneTabela = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        TabbedPaneOpcoes = new javax.swing.JTabbedPane();
        subPanelInserir = new javax.swing.JPanel();
        ComboBoxNovaInsercao = new javax.swing.JComboBox<>();
        lbl_novaInsercao = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        painel_InserirPrestador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_inserirNomePrestador = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_inserirCpfPrestador = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_inserirContatoPrestador = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btn_Inserir = new javax.swing.JButton();
        subPanelConsultar = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        checkBoxFiltros_id = new javax.swing.JCheckBox();
        checkBoxFiltros_nome = new javax.swing.JCheckBox();
        txt_filtros_nome = new javax.swing.JTextField();
        txt_filtros_id = new javax.swing.JTextField();
        ComboBoxTabelas = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btn_pesquise = new javax.swing.JButton();
        painel2 = new javax.swing.JPanel();
        lblCameras = new javax.swing.JLabel();
        lblTelaDeCameras = new javax.swing.JLabel();
        btnAlarme = new javax.swing.JButton();
        btnOutros = new javax.swing.JButton();
        btnPrintar = new javax.swing.JButton();
        painel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        ProgressBarVida = new javax.swing.JProgressBar();
        ProgressBarMana = new javax.swing.JProgressBar();
        lblVida = new javax.swing.JLabel();
        lblVida1 = new javax.swing.JLabel();
        lblNomePersonagem = new javax.swing.JLabel();
        lblEstatisticas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblFundin = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menuBarConfig = new javax.swing.JMenu();
        menuBarRadio0 = new javax.swing.JRadioButtonMenuItem();
        menuBarRadio1 = new javax.swing.JRadioButtonMenuItem();
        menuBarRadio2 = new javax.swing.JRadioButtonMenuItem();
        menuBarRadio3 = new javax.swing.JRadioButtonMenuItem();
        menuBarEditar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMaximumSize(new java.awt.Dimension(1399, 729));
        setMinimumSize(new java.awt.Dimension(760, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelInicial.setToolTipText("");
        painelInicial.setOpaque(false);
        painelInicial.setPreferredSize(new java.awt.Dimension(740, 560));

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
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
            .addGap(0, 272, Short.MAX_VALUE)
        );

        TabbedPaneInicio.addTab("A'NOTAS", jPanel1);

        lbl_bemVindo.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        lbl_bemVindo.setForeground(new java.awt.Color(255, 153, 51));
        lbl_bemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bemVindo.setText("BEM VINDO, PORTEIRO!");
        lbl_bemVindo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(lbl_bemVindo)
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabbedPaneInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbl_bemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(TabbedPaneInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        painelInicial.setVisible(true);

        getContentPane().add(painelInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painel1.setOpaque(false);
        painel1.setPreferredSize(new java.awt.Dimension(740, 500));
        painel1.setRequestFocusEnabled(false);
        painel1.setVisible(false);

        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("TABELA DE REGISTROS");

        tabela1.setOpaque(false);
        tabela1.setRowSelectionAllowed(false);
        ScrollPaneTabela.setViewportView(tabela1);

        ComboBoxNovaInsercao.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBoxNovaInsercao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOVA CORRESPONDÊNCIA", "NOVO PRESTADOR DE SERVIÇO", "NOVO RESIDENTE" }));

        lbl_novaInsercao.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lbl_novaInsercao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_novaInsercao.setText("SELECIONE O TIPO DE INSERÇÃO");

        painel_InserirPrestador.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserirNomePrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserirNomePrestadorActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CPF");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserirCpfPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserirCpfPrestadorActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CONTATO");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserirContatoPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserirContatoPrestadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_InserirPrestadorLayout = new javax.swing.GroupLayout(painel_InserirPrestador);
        painel_InserirPrestador.setLayout(painel_InserirPrestadorLayout);
        painel_InserirPrestadorLayout.setHorizontalGroup(
            painel_InserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_InserirPrestadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_InserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_inserirNomePrestador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_inserirContatoPrestador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_inserirCpfPrestador))
                .addContainerGap())
        );
        painel_InserirPrestadorLayout.setVerticalGroup(
            painel_InserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_InserirPrestadorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserirNomePrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserirCpfPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserirContatoPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Inserir.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_Inserir.setText("INSERIR");
        btn_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelInserirLayout = new javax.swing.GroupLayout(subPanelInserir);
        subPanelInserir.setLayout(subPanelInserirLayout);
        subPanelInserirLayout.setHorizontalGroup(
            subPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_novaInsercao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxNovaInsercao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6)
                    .addComponent(painel_InserirPrestador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7)
                    .addComponent(btn_Inserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanelInserirLayout.setVerticalGroup(
            subPanelInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelInserirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_novaInsercao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxNovaInsercao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_InserirPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Inserir)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        TabbedPaneOpcoes.addTab("INSERIR", subPanelInserir);

        jLabel21.setBackground(new java.awt.Color(255, 204, 51));
        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("FILTROS");

        checkBoxFiltros_id.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkBoxFiltros_id.setText("ID");
        checkBoxFiltros_id.setToolTipText("selecione para adicionar filtro à pesquisa");

        checkBoxFiltros_nome.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        checkBoxFiltros_nome.setText("NOME");
        checkBoxFiltros_nome.setToolTipText("selecione para adicionar filtro à pesquisa");
        checkBoxFiltros_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFiltros_nomeActionPerformed(evt);
            }
        });

        ComboBoxTabelas.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBoxTabelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CORRESPONDÊNCIA", "PRESTADOR", "RESIDENTE", "SERVIÇO", "AGENDA" }));
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

        javax.swing.GroupLayout subPanelConsultarLayout = new javax.swing.GroupLayout(subPanelConsultar);
        subPanelConsultar.setLayout(subPanelConsultarLayout);
        subPanelConsultarLayout.setHorizontalGroup(
            subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(subPanelConsultarLayout.createSequentialGroup()
                        .addGroup(subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(checkBoxFiltros_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(checkBoxFiltros_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_filtros_id)
                            .addComponent(txt_filtros_nome)))
                    .addComponent(ComboBoxTabelas, 0, 218, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_pesquise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanelConsultarLayout.setVerticalGroup(
            subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxFiltros_id)
                    .addComponent(txt_filtros_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxFiltros_nome)
                    .addComponent(txt_filtros_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pesquise, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        TabbedPaneOpcoes.addTab("CONSULTAR", subPanelConsultar);

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TabbedPaneOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TabbedPaneOpcoes)
                    .addComponent(ScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painel2.setOpaque(false);
        painel2.setPreferredSize(new java.awt.Dimension(740, 500));

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

        painel3.setBackground(new java.awt.Color(0, 0, 0));
        painel3.setOpaque(false);
        painel3.setPreferredSize(new java.awt.Dimension(740, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/porteiroIcon.png"))); // NOI18N

        ProgressBarVida.setForeground(new java.awt.Color(200, 0, 0));
        ProgressBarVida.setToolTipText("nivel de vida");
        ProgressBarVida.setValue(100);

        ProgressBarMana.setForeground(new java.awt.Color(50, 100, 200));
        ProgressBarMana.setValue(100);

        lblVida.setText("VIDA");

        lblVida1.setText("MANA");

        lblNomePersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomePersonagem.setText("PORTEIRO");

        lblEstatisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstatisticas.setText("ESTATÍSTICAS");

        jLabel4.setText("dias de trabalho:");

        jLabel5.setText("taxa de satisfação:");

        jLabel6.setText("advertências dadas:");

        jLabel7.setText("situações regularizadas:");

        jLabel8.setText("guardas sumonados:");

        jLabel9.setText("inimigos derrotados:");

        jLabel10.setText("câmeras destruídas:");

        jLabel11.setText("porteiros passados:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TOMOS");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/porteiroIcon.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/porteiroIcon.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/porteiroIcon.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/porteiroIcon.png"))); // NOI18N

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("tomo1");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("tomo2");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("tomo4");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("tomo3");

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jSeparator2)
                    .addComponent(lblNomePersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVida1)
                            .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ProgressBarVida, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(ProgressBarMana, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(painel3Layout.createSequentialGroup()
                                    .addComponent(lblVida)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(62, 62, 62)
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addComponent(lblEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel3Layout.createSequentialGroup()
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblNomePersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painel3Layout.createSequentialGroup()
                                .addComponent(lblVida, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProgressBarVida, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProgressBarMana, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3)))
                .addContainerGap())
            .addGroup(painel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblEstatisticas)
                .addGap(18, 18, 18)
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(93, 93, 93))
        );

        getContentPane().add(painel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        lblFundin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFundin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/fundoVermelho3.png"))); // NOI18N
        lblFundin.setMaximumSize(new java.awt.Dimension(1399, 729));
        lblFundin.setMinimumSize(new java.awt.Dimension(740, 538));
        lblFundin.setPreferredSize(new java.awt.Dimension(745, 538));
        getContentPane().add(lblFundin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuBarConfig.setText("configurações");

        menuBarRadio0.setSelected(true);
        menuBarRadio0.setText("Início");
        grupoPaineis.add(menuBarRadio0);
        menuBarRadio0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconePerfil32.png"))); // NOI18N
        menuBarRadio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio0ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio0);

        menuBarRadio1.setText("residentes");
        menuBarRadio1.setToolTipText("mostra o painel1");
        menuBarRadio1.setActionCommand("painel");
        grupoPaineis.add(menuBarRadio1);
        menuBarRadio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconePerfil32.png"))); // NOI18N
        menuBarRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio1ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio1);

        menuBarRadio2.setSelected(true);
        menuBarRadio2.setText("câmeras");
        menuBarRadio2.setToolTipText("mostra o painel 2");
        menuBarRadio2.setActionCommand("painel");
        menuBarRadio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconePerfil32.png"))); // NOI18N
        grupoPaineis.add(menuBarRadio2);
        menuBarRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio2ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio2);

        menuBarRadio3.setSelected(true);
        menuBarRadio3.setText("perfil");
        menuBarRadio3.setToolTipText("perfil de usuário");
        menuBarRadio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconePerfil32.png"))); // NOI18N
        grupoPaineis.add(menuBarRadio3);
        menuBarRadio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio3ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio3);

        MenuBar.add(menuBarConfig);

        menuBarEditar.setText("editar");
        MenuBar.add(menuBarEditar);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // métodos criados
    private void setPaineisInvisiveis(){
        this.painelInicial.setVisible(false);
        this.painel3.setVisible(false);
        this.painel2.setVisible(false);
        this.painel1.setVisible(false);
    }
  
    private void colocarNaTabela(String tabela,String[] colunas){
        
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        ArrayList<Object[]> lista; //Melhor jeito?
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
    
    // TODO: Sus
    private void colocarNaTabelaAdv(String tabela,String[] colunas,String param[],String valor[]){
        
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        ArrayList<Object[]> lista;
        Object[] data = new Object[colunas.length];
        
        // zerando
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        
        // add colunas
        for (int x=0; x< colunas.length;x++){
            dtm.addColumn(colunas[x]);
        }

        lista = dbm.consultarDadosAdv(tabela, param, valor);
        
        // add info no data
        for(int x=0; x< lista.size();x++){
            data[0] = lista.get(x)[0];
            data[1] = lista.get(x)[1];
            data[2] = lista.get(x)[2];
            data[3] = lista.get(x)[3];
            dtm.addRow(data);
        }
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

    private void menuBarRadio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio3ActionPerformed
        this.setPaineisInvisiveis();
        painel3.setVisible(true);
    }//GEN-LAST:event_menuBarRadio3ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void ComboBoxTabelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTabelasActionPerformed

    }//GEN-LAST:event_ComboBoxTabelasActionPerformed

    private void btnAlarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlarmeActionPerformed

    private void menuBarRadio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio0ActionPerformed
        this.setPaineisInvisiveis();
        painelInicial.setVisible(true);
    }//GEN-LAST:event_menuBarRadio0ActionPerformed

    private void checkBoxFiltros_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFiltros_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxFiltros_nomeActionPerformed

    private void btn_pesquiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquiseActionPerformed
        
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        //Enum?
        String[] colunasCorr= {"ID", "NOME", "CPF", "CONTATO"};        
        String[] colunasPres= {"ID", "NOME", "CPF", "CONTATO"};
        String[] colunasServ= {"ID", "NOME", "CPF", "CONTATO"};
        String[] colunasAgen= {"ID", "NOME", "CPF", "CONTATO"};
        String[] colunasResid= {"ID", "CASA", "NOME", "RAÇA"}; 
        String[] coluna = new String[4];
        String tabela = ""; //para="";
        
        switch((String)ComboBoxTabelas.getSelectedItem()){
            case "PRESTADOR":            
                tabela = "tb_prestador";
                //para = "prestador";
                coluna = colunasPres;
                break; 
            case "CORRESPONDÊNCIA":
                tabela = "tb_correspondencia";
                //para = "correspondencia";
                coluna = colunasCorr;
                break;   
            case "SERVIÇO":
                tabela = "tb_servico";
                //para = "servico";
                coluna = colunasServ;
                break;
            case "AGENDA":
                tabela = "tb_agenda";
                //para = "agenda";
                coluna = colunasAgen;
                break;  
            case "RESIDENTE":
                tabela = "tb_residente";
                //para = "residente";
                coluna = colunasResid;
                break;
            default:
                break;
        }
        
        if (this.checkBoxFiltros_id.isSelected() && !this.checkBoxFiltros_nome.isSelected()){
            String[] param = {"id"+tabela.replace("tb", "")};
            String[] valor = {this.txt_filtros_id.getText()};
            this.colocarNaTabelaAdv(tabela,coluna, param, valor);
        }
        else if (!this.checkBoxFiltros_id.isSelected() && this.checkBoxFiltros_nome.isSelected()){
            String[] param = {"nome"+tabela.replace("tb", "")};
            String[] valor = {this.txt_filtros_nome.getText()};
            this.colocarNaTabelaAdv(tabela,coluna, param, valor);
        }
        else if (this.checkBoxFiltros_id.isSelected() && this.checkBoxFiltros_nome.isSelected()){
            String[] param = {"id"+tabela.replace("tb", ""),"nome"+tabela.replace("tb", "")};
            String[] valor = {this.txt_filtros_id.getText(),this.txt_filtros_nome.getText()};
            this.colocarNaTabelaAdv(tabela,coluna, param, valor);
        } else {
            this.colocarNaTabela(tabela, coluna);
        }
        
        
        this.tabela1.setEnabled(false);
    }//GEN-LAST:event_btn_pesquiseActionPerformed

    private void txt_inserirNomePrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserirNomePrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserirNomePrestadorActionPerformed

    private void txt_inserirCpfPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserirCpfPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserirCpfPrestadorActionPerformed

    private void txt_inserirContatoPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserirContatoPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserirContatoPrestadorActionPerformed

    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        String tabela="";
        ArrayList<String> parametros = new ArrayList();
        ArrayList<String> valores = new ArrayList();
        switch (this.ComboBoxNovaInsercao.getSelectedIndex()){
            case 1:
                parametros.add("nome_prestador");
                parametros.add("cpf_prestador");
                parametros.add("contato_prestador");
                
                valores.add(this.txt_inserirNomePrestador.getText());
                valores.add(this.txt_inserirCpfPrestador.getText());
                valores.add(this.txt_inserirContatoPrestador.getText());
                
                tabela = "tb_prestador";
                break;
            case 2:
                parametros.add("tipo_correspondencia");
                parametros.add("recebido_correspondencia");
                parametros.add("entregador_correspondencia");
                parametros.add("cpf_entregador_correspondencia");
                tabela = "tb_correspondencia";
                
                
                
                break;
            case 3:
                parametros.add("casa_residente");
                parametros.add("nome_residente");
                parametros.add("raca_residente");
                tabela = "tb_residente";
                break;
            default:
                break;
        }
        
        String[] param = new String[parametros.size()];
        String[] valor = new String[valores.size()];
        for (int x=0; x<parametros.size(); x++){param[x] = parametros.get(x);}
        for (int x=0; x<valores.size(); x++){valor[x] = valores.get(x);}
        
        if (valores.size() == parametros.size() && valores.size() > 2){this.dbm.inserirDados(tabela, param, valor);}
        else{System.out.println("Insira todos os dados");}
        
    }//GEN-LAST:event_btn_InserirActionPerformed

  
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
            java.util.logging.Logger.getLogger(TelaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxNovaInsercao;
    private javax.swing.JComboBox<String> ComboBoxTabelas;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JProgressBar ProgressBarMana;
    private javax.swing.JProgressBar ProgressBarVida;
    private javax.swing.JScrollPane ScrollPaneTabela;
    private javax.swing.JTabbedPane TabbedPaneInicio;
    private javax.swing.JTabbedPane TabbedPaneOpcoes;
    private javax.swing.JButton btnAlarme;
    private javax.swing.JButton btnOutros;
    private javax.swing.JButton btnPrintar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btn_Inserir;
    private javax.swing.JButton btn_pesquise;
    private javax.swing.JCheckBox checkBoxFiltros_id;
    private javax.swing.JCheckBox checkBoxFiltros_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCameras;
    private javax.swing.JLabel lblEstatisticas;
    private javax.swing.JLabel lblFundin;
    private javax.swing.JLabel lblNomePersonagem;
    private javax.swing.JLabel lblTelaDeCameras;
    private javax.swing.JLabel lblVida;
    private javax.swing.JLabel lblVida1;
    private javax.swing.JLabel lbl_bemVindo;
    private javax.swing.JLabel lbl_novaInsercao;
    private javax.swing.JMenu menuBarConfig;
    private javax.swing.JMenu menuBarEditar;
    private javax.swing.JRadioButtonMenuItem menuBarRadio0;
    private javax.swing.JRadioButtonMenuItem menuBarRadio1;
    private javax.swing.JRadioButtonMenuItem menuBarRadio2;
    private javax.swing.JRadioButtonMenuItem menuBarRadio3;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painelAtivReccentes;
    private javax.swing.JPanel painelAtualizacao;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painelNovidades;
    private javax.swing.JPanel painel_InserirPrestador;
    private javax.swing.JPanel subPanelConsultar;
    private javax.swing.JPanel subPanelInserir;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextArea txt_area_ativRecentes;
    private javax.swing.JTextArea txt_area_atualizacao;
    private javax.swing.JTextArea txt_area_novidades;
    private javax.swing.JTextField txt_filtros_id;
    private javax.swing.JTextField txt_filtros_nome;
    private javax.swing.JTextField txt_inserirContatoPrestador;
    private javax.swing.JTextField txt_inserirCpfPrestador;
    private javax.swing.JTextField txt_inserirNomePrestador;
    // End of variables declaration//GEN-END:variables
}
