/*
 * The MIT License
 *
 * Copyright 2023 Desenvolvedor Anderson Fernandes.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.ifrn.telas;

import Conexao.Conexao;
import br.com.ifrn.dao.OsDao;
import br.com.ifrn.modelo.Clientes;
import br.com.ifrn.modelo.Os;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Esse jframe é responsável em exibir os dados de serviços
 *
 * @author Anderson
 * @version 0.1
 */
public class TelaOs extends javax.swing.JInternalFrame {

    /**
     * Criado um formulário TelaOs
     */
    Connection conn = null;

    public TelaOs() {
        initComponents();
        conn = Conexao.getConnection();
    }
    /**
     * variável para armazenar o tipo de radio button
     */
    private String tipo;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOs = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        rbtOr = new javax.swing.JRadioButton();
        rbtOs = new javax.swing.JRadioButton();
        jbkStac = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEquipamet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDefet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTecnico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtServic = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btLista = new javax.swing.JButton();
        btAltera = new javax.swing.JButton();
        btDeleta = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Os");
        setPreferredSize(new java.awt.Dimension(610, 399));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nº Os:");

        jLabel2.setText("Data:");

        buttonGroup1.add(rbtOr);
        rbtOr.setText("Orçamento");
        rbtOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOrActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtOs);
        rbtOs.setText("Os");
        rbtOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtOs, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(rbtOs))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rbtOr)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtOr)
                    .addComponent(rbtOs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbkStac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Entregar Ok", "Não aprovado", "Abandonado", "Na bancada", "Aprovado" }));

        jLabel3.setText("*Situação");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/pesquisa.png"))); // NOI18N

        tabCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCli", "Nome", "Fone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabCliente);

        jLabel5.setText("*Id");

        txtIdCli.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdCli))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisa)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtIdCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jLabel6.setText("*Equipament...");

        jLabel7.setText("*Defeito");

        jLabel8.setText("Técnico");

        jLabel9.setText("Serviço");

        jLabel10.setText("Valor Total");

        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/create.png"))); // NOI18N
        btAdicionar.setToolTipText("Adicionar");
        btAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdicionar.setPreferredSize(new java.awt.Dimension(80, 80));
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/read.png"))); // NOI18N
        btLista.setToolTipText("Lista");
        btLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLista.setPreferredSize(new java.awt.Dimension(80, 80));
        btLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaActionPerformed(evt);
            }
        });

        btAltera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/update.png"))); // NOI18N
        btAltera.setToolTipText("Alterar");
        btAltera.setEnabled(false);
        btAltera.setPreferredSize(new java.awt.Dimension(80, 80));
        btAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlteraActionPerformed(evt);
            }
        });

        btDeleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/deleta.png"))); // NOI18N
        btDeleta.setToolTipText("Deletar");
        btDeleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeleta.setEnabled(false);
        btDeleta.setPreferredSize(new java.awt.Dimension(80, 80));
        btDeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletaActionPerformed(evt);
            }
        });

        btImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/PrintImpressao.png"))); // NOI18N
        btImprimir.setToolTipText("Imprimir");
        btImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btImprimir.setEnabled(false);
        btImprimir.setPreferredSize(new java.awt.Dimension(80, 80));
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEquipamet)
                                .addComponent(txtDefet, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                                .addComponent(txtServic, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbkStac, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btAltera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btDeleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbkStac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEquipamet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDefet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtServic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btAltera, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btDeleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btLista, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        setBounds(0, 0, 610, 399);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (txtPesquisa.getText().isEmpty()) {
            limpar();
        } else if(soNumeros(txtPesquisa.getText())) {
            JOptionPane.showMessageDialog(null,"Digite apenas letras","Atenção",JOptionPane.INFORMATION_MESSAGE);
            txtPesquisa.setText(" ");
            txtPesquisa.requestFocus();
        }else{
            // Na linha de baixo Pesquisa os cliente
            listaDadosClientes();
        }

    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tabClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClienteMouseClicked
        // Seta os dados ao clicar na linha da tabela
        setaIdCliente();
    }//GEN-LAST:event_tabClienteMouseClicked

    private void rbtOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOrActionPerformed
        // ação quando o butão for selecionado
        tipo = "Orçamento";
    }//GEN-LAST:event_rbtOrActionPerformed

    private void rbtOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOsActionPerformed
        // ação para quando o butão for selecionado
        tipo = "Os";
    }//GEN-LAST:event_rbtOsActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // Ação para o radio button de orçamento ficar marcado
        rbtOr.setSelected(true);
        tipo = "Orçamento";
    }//GEN-LAST:event_formInternalFrameOpened

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed

        if (txtIdCli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de ID");
            txtIdCli.requestFocus();
        } else if (txtEquipamet.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de Equipamento");
            txtEquipamet.requestFocus();
        } else if (txtDefet.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de defeito");
            txtDefet.requestFocus();
        } else if (jbkStac.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Escolha a situação");
            jbkStac.requestFocus();
        } else {
            // Adicionar os dados da Os no banco de dados
            addOs();
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaActionPerformed
        // na linha a baixo tem o método para lista as Os pelo id
        listaOs();
    }//GEN-LAST:event_btListaActionPerformed

    private void btAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlteraActionPerformed
        // Na linha de baixo chamar o método para alterar os dados da OS
        atualizaOs();
        limpar();
    }//GEN-LAST:event_btAlteraActionPerformed

    private void btDeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletaActionPerformed
        // linha em baixo para remover uma OS
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir essa os", "Aviso", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            removerOS();
            limpar();
        }

    }//GEN-LAST:event_btDeletaActionPerformed

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        // método para imprimir uma os
        imprimirOS();
    }//GEN-LAST:event_btImprimirActionPerformed
    /**
     * Método para recuperar o id do último serviço
     */
    public void recuperaOs() {
        try {
            String sql = "select max(idOs) from servicos";
            PreparedStatement pt = conn.prepareStatement(sql);
            ResultSet st = pt.executeQuery();
            while (st.next()) {
                txtOs.setText(st.getString(1));
            }
            pt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    /**
     * Método para imprimir Os
     */
    public void imprimirOS() {
        //confirmando a impressão de uma os
        int confir = JOptionPane.showConfirmDialog(null, "Confirmar  emissão desse relatório ", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confir == JOptionPane.YES_OPTION) {
            // IMPRIMIR UMA OS COM FRAMEWORK JasperReports
            try {
                // classe HasMap para filtar os id
                HashMap filtro = new HashMap();
                filtro.put("os", Integer.parseInt(txtOs.getText()));
                // Usando a classe JasperPrint para prepara impressão de uma os
                  JasperPrint print = JasperFillManager.fillReport(getClass().getResourceAsStream("/reports/Os.jasper"), filtro, conn);
                // A linha a baixo mostrar a impressão de uma os atraves da classe JasperViewer
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error ao imprimir os");
            }
        }
    }

    /**
     * Método para limpar os campos
     */
    public void limpar() {
        txtData.setText("");
        txtOs.setText("");
        txtTecnico.setText("");
        txtPesquisa.setText("");
        txtServic.setText("");
        txtDefet.setText("");
        txtValorTotal.setText("");
        txtIdCli.setText("");
        txtEquipamet.setText("");
        jbkStac.setSelectedItem(" ");
        DefaultTableModel md = (DefaultTableModel) tabCliente.getModel();
        md.setNumRows(0);
        //habilitando os objetos
        btAdicionar.setEnabled(true);
        txtPesquisa.setEnabled(true);
        btLista.setEnabled(true);
        tabCliente.setVisible(true);
        //desabilitar os objetos
        btAltera.setEnabled(false);
        btDeleta.setEnabled(false);
        btImprimir.setEnabled(false);
    }

    /**
     * Método para atualizar serviço
     */
    public void atualizaOs() {
        OsDao os = new OsDao();
        Os s = new Os();
        s.setTipo(tipo);
        s.setSituacao(jbkStac.getSelectedItem().toString());
        s.setEquipamento(txtEquipamet.getText());
        s.setDefeito(txtDefet.getText());
        s.setServico(txtServic.getText());
        s.setTecnico(txtTecnico.getText());
        s.setValorTotal(txtValorTotal.getText().replace(",", "."));
        s.setCodigoOs(Integer.parseInt(txtOs.getText()));
        os.alterarOs(s);
        //habilitando os objetos
        btAdicionar.setEnabled(true);
        txtPesquisa.setEnabled(true);
        tabCliente.setVisible(true);
    }

    /**
     * Método para remover serviço
     */
    public void removerOS() {
        OsDao s = new OsDao();
        Os o = new Os();
        o.setCodigoOs(Integer.parseInt(txtOs.getText()));
        s.deletaOs(o);
    }

    /**
     * Método para adicionar serviço
     */
    public void addOs() {
        OsDao os = new OsDao();
        Os s = new Os();
        s.setTipo(tipo);
        s.setSituacao(jbkStac.getSelectedItem().toString());
        s.setEquipamento(txtEquipamet.getText());
        s.setDefeito(txtDefet.getText());
        s.setServico(txtServic.getText());
        s.setTecnico(txtTecnico.getText());
        s.setValorTotal(txtValorTotal.getText().replace(",", "."));
        s.setEstrangeiraIdCliente(txtIdCli.getText());
        os.adicionarOs(s);
        recuperaOs();
        btAdicionar.setEnabled(false);
        btLista.setEnabled(false);
        btImprimir.setEnabled(true);
    }

    /**
     * Método para lista serviço pelo id
     */
    public void listaOs() {
        String num_os = JOptionPane.showInputDialog("Número da Os");

        if (soNumeros(num_os)) {
            OsDao d = new OsDao();
            for (Os s : d.listaDadosOs(num_os)) {
                txtOs.setText("" + s.getCodigoOs());
                txtData.setText(s.getData());
                String rbt = s.getTipo();
                //setando os radios buttons
                if (rbt.equals("Os")) {
                    rbtOs.setSelected(true);
                    tipo = "Os";
                } else {
                    rbtOr.setSelected(true);
                    tipo = "Orçamento";
                }
                jbkStac.setSelectedItem(s.getSituacao());
                txtEquipamet.setText(s.getEquipamento());
                txtDefet.setText(s.getDefeito());
                txtServic.setText(s.getServico());
                txtTecnico.setText(s.getTecnico());
                txtValorTotal.setText(s.getValorTotal());
                txtIdCli.setText(s.getEstrangeiraIdCliente());
                // evitando problemas
                btAdicionar.setEnabled(false);
                btLista.setEnabled(false);
                txtPesquisa.setEnabled(false);
                tabCliente.setVisible(false);
                // ativa os butões
                btAltera.setEnabled(true);
                btDeleta.setEnabled(true);
                btImprimir.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os Invalida!");
        }

    }

    /**
     * Método para aceitar apenas números
     *
     * @param str para receber um dado do campo de texto
     * @return str
     */
    public boolean soNumeros(String str) {

        return str.matches("^[0/.-9]+");
    }

    /**
     * Método para lista clientes pelo nome
     */
    public void listaDadosClientes() {
        Connection conn = Conexao.getConnection();
        ArrayList<Clientes> lista = new ArrayList<>();
        try {
            String sql = "SELECT idCli,nomeCli,foneCli FROM cliente WHERE nomeCli like ?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, txtPesquisa.getText() + "%");
            ResultSet rst = ptm.executeQuery();
            // a linha abaixo fazer lista os dados do clientes pelo nome
            tabCliente.setModel(DbUtils.resultSetToTableModel(rst));

            rst.close();
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados do cliente não encontrados");
        }

    }

    /**
     * Método para seta o id do cliente no campo de texto do mesmo
     */
    public void setaIdCliente() {
        int seta = tabCliente.getSelectedRow();
        txtIdCli.setText(tabCliente.getModel().getValueAt(seta, 0).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAltera;
    private javax.swing.JButton btDeleta;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btLista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jbkStac;
    private javax.swing.JRadioButton rbtOr;
    private javax.swing.JRadioButton rbtOs;
    private javax.swing.JTable tabCliente;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDefet;
    private javax.swing.JTextField txtEquipamet;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtOs;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtServic;
    private javax.swing.JTextField txtTecnico;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
