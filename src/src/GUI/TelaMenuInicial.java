package GUI;

import DAO.ManipuladorDB;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaMenuInicial extends javax.swing.JFrame {

    // atributos
    private ButtonGroup grupoPaineis = new ButtonGroup(); 
    private ManipuladorDB dbm;
    private String[][] colunas = {
        // correspondência
        {
            "id_correspondencia",
            "id_destinatario_correspondencia",
            "tipo_correspondencia",
            "recebido_correspondencia",
            "nome_entregador_correspondencia",
            "cpf_entregador_correspondencia"
        },
        // prestador
        {
            "id_prestador",
            "cpf_prestador",
            "nome_prestador",
            "contato_prestador"  
        },
        // serviço
        {
            "id_servico",
            "id_prestador",
            "id_contratante",
            "tipo",
            "data_agendada",
            "data_recebida"
        },
        // agenda
        {
            "id_agenda",
            "compromisso_agenda"
        },
        // residente
        {
            "id_residente",
            "id_casa_residente",
            "cpf_residente",
            "nome_residente",
            "contato_residente"
        }
    };

    public TelaMenuInicial() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        dbm = new ManipuladorDB("banco_portaria");
        this.setPaineisInvisiveis();
        painelInicial.setVisible(true);
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMaximumSize(new java.awt.Dimension(1399, 729));
        setMinimumSize(new java.awt.Dimension(760, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelInicial.setToolTipText("");
        painelInicial.setOpaque(false);
        painelInicial.setPreferredSize(new java.awt.Dimension(740, 560));

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
                .addContainerGap(117, Short.MAX_VALUE))
        );

        painelInicial.setVisible(true);

        getContentPane().add(painelInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painel1.setOpaque(false);
        painel1.setPreferredSize(new java.awt.Dimension(740, 500));
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
                .addContainerGap(18, Short.MAX_VALUE))
        );

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

        ComboBox_tipo_pesquisa.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBox_tipo_pesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCA EXATA", "BUSCA APROXIMADA", "BUSCA GERAL" }));

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
                    .addComponent(ComboBoxTabelas, 0, 218, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(35, Short.MAX_VALUE))
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
                .addContainerGap(29, Short.MAX_VALUE))
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

        lblFundin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFundin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/foto_fundo_vemelho_ondinha.png"))); // NOI18N
        lblFundin.setMaximumSize(new java.awt.Dimension(1399, 729));
        lblFundin.setMinimumSize(new java.awt.Dimension(740, 538));
        lblFundin.setPreferredSize(new java.awt.Dimension(745, 538));
        getContentPane().add(lblFundin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // métodos criados
    private void setPaineisInvisiveis(){
        this.painelInicial.setVisible(false);
        this.painel2.setVisible(false);
        this.painel1.setVisible(false);
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

 
    // métodos automáticos
    
    private void menuBarRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio1ActionPerformed
        this.setPaineisInvisiveis();    
        painel1.setVisible(true);      
    }//GEN-LAST:event_menuBarRadio1ActionPerformed

    private void menuBarRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio2ActionPerformed
        this.setPaineisInvisiveis();
        painel2.setVisible(true);
    }//GEN-LAST:event_menuBarRadio2ActionPerformed

    private void ComboBoxTabelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTabelasActionPerformed
        /*
        0 = CORRESPONDÊNCIA
        1 = PRESTADOR
        2 = RESIDENTE
        3 = SERVIÇO
        4 = AGENDA
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
                    this.Combobox_colunasConsulta.addItem(this.colunas[2][x].replace("_residente", "").replace("_", " "));}
                break;
            case 3:
                for (int x=0; x< this.colunas[3].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[3][x].replace("_servico", "").replace("_", " "));}
                break;
            case 4:
                for (int x=0; x< this.colunas[4].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[4][x].replace("_agenda", "").replace("_", " "));}
                break;
            default:
                this.Combobox_colunasConsulta.addItem(" ");
                break;
        }
    }//GEN-LAST:event_ComboBoxTabelasActionPerformed

    private void btnAlarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmeActionPerformed
        // TODO add your handling code here:
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

    private void txt_inserirNomePrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserirNomePrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserirNomePrestadorActionPerformed

    private void txt_inserirCpfPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserirCpfPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserirCpfPrestadorActionPerformed

    private void txt_inserirContatoPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserirContatoPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserirContatoPrestadorActionPerformed

    // inserção
    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        String tabela="";
        ArrayList<String> parametros = new ArrayList();
        ArrayList<String> valores = new ArrayList();
        switch (this.ComboBoxNovaInsercao.getSelectedIndex()){
            case 1:
                parametros.add(this.colunas[1][2]); // nome prestador
                parametros.add(this.colunas[1][1]); // cpf prestador
                parametros.add(this.colunas[1][3]); // contato prestador
                
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

    private void txt_filtros_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtros_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtros_consultaActionPerformed

  
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
    private javax.swing.JComboBox<String> ComboBox_tipo_pesquisa;
    private javax.swing.JComboBox<String> Combobox_colunasConsulta;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JScrollPane ScrollPaneTabela;
    private javax.swing.JTabbedPane TabbedPaneInicio;
    private javax.swing.JTabbedPane TabbedPaneOpcoes;
    private javax.swing.JButton btnAlarme;
    private javax.swing.JButton btnOutros;
    private javax.swing.JButton btnPrintar;
    private javax.swing.JButton btn_Inserir;
    private javax.swing.JButton btn_pesquise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
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
    private javax.swing.JPanel painel_InserirPrestador;
    private javax.swing.JPanel subPanelConsultar;
    private javax.swing.JPanel subPanelInserir;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextArea txt_area_ativRecentes;
    private javax.swing.JTextArea txt_area_atualizacao;
    private javax.swing.JTextArea txt_area_novidades;
    private javax.swing.JTextField txt_filtros_consulta;
    private javax.swing.JTextField txt_inserirContatoPrestador;
    private javax.swing.JTextField txt_inserirCpfPrestador;
    private javax.swing.JTextField txt_inserirNomePrestador;
    // End of variables declaration//GEN-END:variables
}
