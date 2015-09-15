/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.LinkedList;
import controller.Produto;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class SistemaDeVendas extends javax.swing.JFrame {

    /**
     * Creates new form SistemaDeVendas
     */
    public SistemaDeVendas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listProdutos = new LinkedList<Produto>();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("sistemadevendas?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        produtosQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produtos p");
        produtosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtosQuery.getResultList();
        produtosQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produtos p");
        produtosList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtosQuery1.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        labProdutos = new javax.swing.JLayeredPane();
        lbCodigo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        lbUnidades = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtUnidades = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        jLCadastro = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        jLEstoque = new javax.swing.JLabel();
        labVendas = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();
        jLVendaDeProdutos = new javax.swing.JLabel();
        jLNomeProduto = new javax.swing.JLabel();
        jTNomeProduto = new javax.swing.JTextField();
        jLUnidadesEmEstoque = new javax.swing.JLabel();
        jTUnidadesEmEstoque = new javax.swing.JTextField();
        jLValorVendaUnidade = new javax.swing.JLabel();
        jTValorVendaUnidade = new javax.swing.JTextField();
        jLVender = new javax.swing.JLabel();
        jLNumeroUnidadesVendidas = new javax.swing.JLabel();
        jTNumeroUnidadesVendidas = new javax.swing.JTextField();
        jLValorTotal = new javax.swing.JLabel();
        jTValorTotal = new javax.swing.JTextField();
        jBFinalizar = new javax.swing.JButton();

        listProdutos = org.jdesktop.observablecollections.ObservableCollections.observableList(listProdutos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setName("Sistema de Vendas"); // NOI18N

        labProdutos.setBackground(javax.swing.UIManager.getDefaults().getColor("tab_unsel_fill_dark_lower"));

        lbCodigo.setText("Código:");

        lbNome.setText("Nome:");

        lbValor.setText("Valor:");

        lbUnidades.setText("Unidades:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codigo}"), txtCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), txtCodigo, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), txtNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), txtNome, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valor}"), txtValor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), txtValor, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.unidades}"), txtUnidades, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), txtUnidades, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        tbProdutos.setName("tbProdutos"); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProdutos, tbProdutos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${unidades}"));
        columnBinding.setColumnName("Unidades");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tbProdutos);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/btexcluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jLCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCadastro.setText("Cadastro");
        jLCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Add.png"))); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        jLEstoque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEstoque.setText("Estoque");
        jLEstoque.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout labProdutosLayout = new javax.swing.GroupLayout(labProdutos);
        labProdutos.setLayout(labProdutosLayout);
        labProdutosLayout.setHorizontalGroup(
            labProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labProdutosLayout.createSequentialGroup()
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome)
                        .addGap(18, 18, 18)
                        .addComponent(lbValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbUnidades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(labProdutosLayout.createSequentialGroup()
                        .addGroup(labProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        labProdutosLayout.setVerticalGroup(
            labProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labProdutosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(lbNome)
                    .addComponent(lbValor)
                    .addComponent(lbUnidades)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addGap(27, 27, 27))
        );
        labProdutos.setLayer(lbCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(lbNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(lbValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(lbUnidades, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(txtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(txtValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(txtUnidades, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(btExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(jLCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(btAdicionar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labProdutos.setLayer(jLEstoque, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Produtos", labProdutos);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProdutos, tbVendas);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${unidades}"));
        columnBinding.setColumnName("Unidades");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane4.setViewportView(tbVendas);

        jLVendaDeProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLVendaDeProdutos.setText("Venda de Produtos");

        jLNomeProduto.setText("Nome do produto:");

        jTNomeProduto.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbVendas, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), jTNomeProduto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLUnidadesEmEstoque.setText("Unidades em estoque:");

        jTUnidadesEmEstoque.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbVendas, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.unidades}"), jTUnidadesEmEstoque, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLValorVendaUnidade.setText("Valor de venda por unidade:");

        jTValorVendaUnidade.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbVendas, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valor}"), jTValorVendaUnidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLVender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLVender.setText("Vender");

        jLNumeroUnidadesVendidas.setText("Número de unidades vendidas:");

        jLValorTotal.setText("Valor total:");

        jTValorTotal.setEditable(false);

        jBFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/finalizar.png"))); // NOI18N
        jBFinalizar.setText("Finalizar");
        jBFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBFinalizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout labVendasLayout = new javax.swing.GroupLayout(labVendas);
        labVendas.setLayout(labVendasLayout);
        labVendasLayout.setHorizontalGroup(
            labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labVendasLayout.createSequentialGroup()
                        .addComponent(jLNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNomeProduto))
                    .addGroup(labVendasLayout.createSequentialGroup()
                        .addComponent(jLNumeroUnidadesVendidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNumeroUnidadesVendidas))
                    .addGroup(labVendasLayout.createSequentialGroup()
                        .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLVendaDeProdutos)
                            .addComponent(jLVender))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labVendasLayout.createSequentialGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                        .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labVendasLayout.createSequentialGroup()
                                .addComponent(jLValorTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBFinalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(labVendasLayout.createSequentialGroup()
                        .addComponent(jLValorVendaUnidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTValorVendaUnidade))
                    .addGroup(labVendasLayout.createSequentialGroup()
                        .addComponent(jLUnidadesEmEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTUnidadesEmEstoque)))
                .addGap(21, 21, 21))
        );
        labVendasLayout.setVerticalGroup(
            labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(labVendasLayout.createSequentialGroup()
                        .addComponent(jLVendaDeProdutos)
                        .addGap(18, 18, 18)
                        .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNomeProduto)
                            .addComponent(jTNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLUnidadesEmEstoque)
                            .addComponent(jTUnidadesEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValorVendaUnidade)
                            .addComponent(jTValorVendaUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLVender)
                        .addGap(18, 18, 18)
                        .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNumeroUnidadesVendidas)
                            .addComponent(jTNumeroUnidadesVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(labVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValorTotal)
                            .addComponent(jTValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        labVendas.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jLVendaDeProdutos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jLNomeProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jTNomeProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jLUnidadesEmEstoque, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jTUnidadesEmEstoque, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jLValorVendaUnidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jTValorVendaUnidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jLVender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jLNumeroUnidadesVendidas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jTNumeroUnidadesVendidas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jLValorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jTValorTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        labVendas.setLayer(jBFinalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Vendas", labVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        int selecionado = tbProdutos.getSelectedRow();
        listProdutos.remove(selecionado);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
        Produto p = new Produto();
        listProdutos.add(p);

        int nLinhas = tbProdutos.getRowCount() - 1;
        tbProdutos.setRowSelectionInterval(nLinhas, nLinhas);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btAdicionarActionPerformed
        
    private void jBFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBFinalizarMouseClicked
        int linhaatual = tbVendas.getSelectedRow();
      
        Produto produto = listProdutos.get(tbVendas.convertRowIndexToModel(linhaatual));
        
        if (produto.getUnidades() >= Integer.parseInt(jTNumeroUnidadesVendidas.getText())) {
            double valorTotal = produto.getValor() * Double.parseDouble(jTNumeroUnidadesVendidas.getText());
            jTValorTotal.setText(String.valueOf(valorTotal));
            int desconto = produto.getUnidades() - Integer.parseInt(jTNumeroUnidadesVendidas.getText());
            listProdutos.get(tbVendas.convertRowIndexToModel(linhaatual)).setUnidades(desconto);
            
            int novoEstoque = Integer.parseInt(jTUnidadesEmEstoque.getText()) - Integer.parseInt(jTNumeroUnidadesVendidas.getText());
            System.out.println("Novo Estoque" + novoEstoque);
            produto.getUnidades(novoEstoque);            
        } else {
            JFrame frame = new JFrame("Estoque insuficiente!");
            String estoqueMax = jTUnidadesEmEstoque.getText();
            JOptionPane.showMessageDialog(frame,
                    "O número de unidades do produto em estoque é insuficiente.", "Estoque insuficiente!",            
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBFinalizarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btExcluir;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jBFinalizar;
    private javax.swing.JLabel jLCadastro;
    private javax.swing.JLabel jLEstoque;
    private javax.swing.JLabel jLNomeProduto;
    private javax.swing.JLabel jLNumeroUnidadesVendidas;
    private javax.swing.JLabel jLUnidadesEmEstoque;
    private javax.swing.JLabel jLValorTotal;
    private javax.swing.JLabel jLValorVendaUnidade;
    private javax.swing.JLabel jLVendaDeProdutos;
    private javax.swing.JLabel jLVender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTNomeProduto;
    private javax.swing.JTextField jTNumeroUnidadesVendidas;
    private javax.swing.JTextField jTUnidadesEmEstoque;
    private javax.swing.JTextField jTValorTotal;
    private javax.swing.JTextField jTValorVendaUnidade;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLayeredPane labProdutos;
    private javax.swing.JLayeredPane labVendas;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbUnidades;
    private javax.swing.JLabel lbValor;
    private java.util.List<Produto> listProdutos;
    private java.util.List<model.Produtos> produtosList;
    private java.util.List<model.Produtos> produtosList1;
    private javax.persistence.Query produtosQuery;
    private javax.persistence.Query produtosQuery1;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTable tbVendas;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUnidades;
    private javax.swing.JTextField txtValor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
