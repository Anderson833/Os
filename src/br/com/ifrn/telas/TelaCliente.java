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
import br.com.ifrn.dao.ClienteDao;
import br.com.ifrn.modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
// na linha de baixo tem a importação da biblioteca rs2xml.jar
import net.proteanit.sql.DbUtils;

/**
 * Esse Jframe é responsável em exibir os dados de cliente
 *
 * @author Anderson
 * @version 0.1
 */
public class TelaCliente extends javax.swing.JInternalFrame {

    /**
     * Criado um formulário TelaCliente
     */
    public TelaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btadd = new javax.swing.JButton();
        btAlt = new javax.swing.JButton();
        btdeleta = new javax.swing.JButton();
        txtlista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setPreferredSize(new java.awt.Dimension(610, 399));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("* Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 61, 23));

        jLabel2.setText("Endereço:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 75, 23));

        jLabel3.setText("*Telefone:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 60, 25));

        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 60, 30));

        jLabel5.setText("* Campos Obrigatórios");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 130, 23));
        getContentPane().add(txtNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 273, 27));

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 273, 27));
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 154, 31));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 255, 30));

        btadd.setText("Adicionar");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });
        getContentPane().add(btadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 102, 37));

        btAlt.setText("Alterar");
        btAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltActionPerformed(evt);
            }
        });
        getContentPane().add(btAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 112, 38));

        btdeleta.setText("Deletar");
        btdeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeletaActionPerformed(evt);
            }
        });
        getContentPane().add(btdeleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 104, 39));

        txtlista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlistaKeyReleased(evt);
            }
        });
        getContentPane().add(txtlista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 312, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/pesquisa.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 11, 30, 30));

        tabelaCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereco", "Fone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.setFocusable(false);
        tabelaCliente.getTableHeader().setReorderingAllowed(false);
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 477, 80));

        jLabel7.setText("Id:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 20, 30));

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 50, 30));

        setBounds(0, 0, 609, 424);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed

    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed

        if (txtNomeCli.getText().isEmpty() && txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome e Telefone, são obrigatório", "Por favor", JOptionPane.WARNING_MESSAGE);
        } else {
            if (txtNomeCli.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Por favor", JOptionPane.WARNING_MESSAGE);
                txtNomeCli.requestFocus();
            } else if (txtTelefone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o campo telefone", "Por favor", JOptionPane.WARNING_MESSAGE);
                txtTelefone.requestFocus();
            } else {
                // método para adicionar clientes
                addClientes();
            }
        }
    }//GEN-LAST:event_btaddActionPerformed

    private void txtlistaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlistaKeyReleased

        if (txtlista.getText().isEmpty()) {
            DefaultTableModel md = (DefaultTableModel) tabelaCliente.getModel();
            md.setNumRows(0);
            limparCampos();
        } else {
            // a linha abaixo ao continuar digitanto vai listando os dados do cliente
            listaDadosClientes();
        }
    }//GEN-LAST:event_txtlistaKeyReleased

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        // método para preenche os dados nos campos
        setaDados();
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void btAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltActionPerformed
        // método para altearaar os dados
        alterarDados();
    }//GEN-LAST:event_btAltActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btdeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeletaActionPerformed
        // método para deleta cliente
        deletaClientes();
    }//GEN-LAST:event_btdeletaActionPerformed
    /**
     * Método para adicionar cliente no banco
     */
    public void addClientes() {
        ClienteDao dao = new ClienteDao();
        Clientes cli = new Clientes();
        cli.setNomecle(txtNomeCli.getText());
        cli.setEndereco(txtEndereco.getText());
        cli.setTelefone(txtTelefone.getText());
        cli.setEmail(txtEmail.getText());
        dao.salvarClientes(cli);
        // a linha abaixo limpar os campos
        limparCampos();
    }

    /**
     * Método para alterar os dados dos clientes no banco de dados
     */
    public void alterarDados() {
        ClienteDao dao = new ClienteDao();
        Clientes cli = new Clientes();
        cli.setNomecle(txtNomeCli.getText());
        cli.setEndereco(txtEndereco.getText());
        cli.setTelefone(txtTelefone.getText());
        cli.setEmail(txtEmail.getText());
        cli.setCodigoCli(Integer.parseInt(txtId.getText()));
        dao.alterar(cli);
        // a linha abaixo limpar os campos
        limparCampos();
        //Na linha de baixo habilitar o butão de adicionar
        btadd.setEnabled(true);
    }

    /**
     * Método para deletar cliente no banco
     */
    public void deletaClientes() {
        ClienteDao dao = new ClienteDao();
        Clientes cli = new Clientes();
        cli.setCodigoCli(Integer.parseInt(txtId.getText()));
        dao.deletaCliente(cli);
        // na linha de baixo sera habilitado o butão de adicionar
        btadd.setEnabled(true);
    }

    /**
     * Método para lista os dados dos clientes
     */
    public void listaDadosClientes() {
        Connection conn = Conexao.getConnection();
        ArrayList<Clientes> lista = new ArrayList<>();
        try {
            String sql = "select idCli as Id, nomeCli as Nome, endCli as Endereço, foneCli as Fone, emalCli as Email from cliente where nomeCli like ?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, txtlista.getText() + "%");
            ResultSet rst = ptm.executeQuery();
            // a linha abaixo fazer lista os dados do clientes pelo nome
            tabelaCliente.setModel(DbUtils.resultSetToTableModel(rst));

            rst.close();
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados do cliente não encontrados");
        }

    }

    /**
     * Método para seta os dados nos campos
     */
    public void setaDados() {
        int dados = tabelaCliente.getSelectedRow();
        txtId.setText(tabelaCliente.getModel().getValueAt(dados, 0).toString());
        txtNomeCli.setText(tabelaCliente.getModel().getValueAt(dados, 1).toString());
        txtEndereco.setText(tabelaCliente.getModel().getValueAt(dados, 2).toString());
        txtTelefone.setText(tabelaCliente.getModel().getValueAt(dados, 3).toString());
        txtEmail.setText(tabelaCliente.getModel().getValueAt(dados, 4).toString());
        // Na linha debaixo desabilitar o butão de adicionar
        btadd.setEnabled(false);
    }

    /**
     * Método para limpar os campos de textos
     */
    public void limparCampos() {
        txtEmail.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtNomeCli.setText("");
        txtId.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlt;
    private javax.swing.JButton btadd;
    private javax.swing.JButton btdeleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtlista;
    // End of variables declaration//GEN-END:variables
}
