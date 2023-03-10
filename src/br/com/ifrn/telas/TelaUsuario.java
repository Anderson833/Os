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

import br.com.ifrn.dao.UsuarioDao;
import br.com.ifrn.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 * Esse frame interno é responsável em exibir os dados de usuário
 *
 * @author Anderson
 * @version 0.1
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    /**
     * Criado um formulário TelaUsuario
     */
    public TelaUsuario() {
        initComponents();
        // listaCombox();
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
        txtUsuario = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jComboBox1Perfil = new javax.swing.JComboBox<>();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btAlteraarDados = new javax.swing.JButton();
        btDeletaUsuario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(610, 0));

        jLabel1.setText("* Id:");

        jLabel2.setText("* Usuário:");

        jLabel3.setText("*Perfil:");

        jLabel4.setText("*Login:");

        jLabel5.setText("* Senha:");

        jComboBox1Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jComboBox1Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1PerfilActionPerformed(evt);
            }
        });

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/create.png"))); // NOI18N
        btAdicionar.setToolTipText("Adicionar");
        btAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/read.png"))); // NOI18N
        jButton2.setToolTipText("Pesquisar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btAlteraarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/update.png"))); // NOI18N
        btAlteraarDados.setToolTipText("Atualizar");
        btAlteraarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlteraarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlteraarDadosActionPerformed(evt);
            }
        });

        btDeletaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifrn/icones/deleta.png"))); // NOI18N
        btDeletaUsuario.setToolTipText("Deletar");
        btDeletaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletaUsuarioActionPerformed(evt);
            }
        });

        jLabel6.setText("*  Campos obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLogin)))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btAlteraarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btDeletaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlteraarDados)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btDeletaUsuario)))
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAdicionar, btAlteraarDados, btDeletaUsuario, jButton2});

        setBounds(0, 0, 611, 388);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1PerfilActionPerformed

    }//GEN-LAST:event_jComboBox1PerfilActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed

    }//GEN-LAST:event_txtLoginActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // a linha abaixo verifica se contem algum campo vazio
        if (txtid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo do Id", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
            txtid.requestFocus();
        } else if (txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo do Usuário", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
            txtUsuario.requestFocus();
        } else if (txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo senha", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
            txtSenha.requestFocus();
        } else if (txtLogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo de login", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
            txtLogin.requestFocus();
        } else if (jComboBox1Perfil.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo de perfil", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
            jComboBox1Perfil.requestFocus();
        } else {
            addUsuario();
        }


    }//GEN-LAST:event_btAdicionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // a linha abaixo verifica se contem o campo  de Id vazio
        if (txtid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo do Id", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
            txtid.requestFocus();
        } else {
            listaUsuario();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btAlteraarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlteraarDadosActionPerformed
        // a linha abaixo verifica se contem o campo  de Id vazio
        if (txtid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo do Id", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
            txtid.requestFocus();
        } else {
            //método para alterar os dados do usuário
            atualizaDados();
        }
    }//GEN-LAST:event_btAlteraarDadosActionPerformed

    private void btDeletaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletaUsuarioActionPerformed
        // a linha abaixo verifica se contem o campo  de Id vazio
        if (txtid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchar o campo do Id", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
            txtid.requestFocus();
        } else {
            int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que quer remover o usuário?", "Atenção:", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION) {
                // método para deletar usuário
                deletaUsuario();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não removido");
            }
        }
    }//GEN-LAST:event_btDeletaUsuarioActionPerformed
    /**
     * Método para adicionar usuário no banco de dados
     */
    public void addUsuario() {
        UsuarioDao dao = new UsuarioDao();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(Integer.parseInt(txtid.getText()));
        usuario.setNomeUsuario(txtUsuario.getText());
        usuario.setLogin(txtLogin.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setPerfil(jComboBox1Perfil.getSelectedItem().toString());
        dao.adicionaUsuario(usuario);
        // Na linha de baixo tem um método para limpa os campos
        limpaCampos();

    }

    /**
     * Método para deletar usuário
     */
    public void deletaUsuario() {
        UsuarioDao dao = new UsuarioDao();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(Integer.parseInt(txtid.getText()));
        dao.deletaUsuario(usuario);
    }

    /**
     * Método para atualizar os dados do usuário
     */
    public void atualizaDados() {
        UsuarioDao dao = new UsuarioDao();
        Usuario us = new Usuario();
        us.setNomeUsuario(txtUsuario.getText());
        us.setLogin(txtLogin.getText());
        us.setPerfil(jComboBox1Perfil.getSelectedItem().toString());
        us.setSenha(txtSenha.getText());
        us.setIdUsuario(Integer.parseInt(txtid.getText()));
        dao.alteraDados(us);
    }

    /**
     * Método para limpar os campos
     */
    public void limpaCampos() {
        UsuarioDao dao = new UsuarioDao();
        for (Usuario object : dao.limparCampos()) {
            txtid.setText("");
            txtUsuario.setText(object.getNomeUsuario());
            txtLogin.setText(object.getLogin());
            txtSenha.setText(object.getSenha());
            jComboBox1Perfil.setSelectedItem(object.getPerfil());

        }
    }

    /**
     * Método para lista os dados de pelo id do usuário
     */
    public void listaUsuario() {
        UsuarioDao dao = new UsuarioDao();
        for (Usuario object : dao.listaDados(txtid.getText())) {
            txtUsuario.setText(object.getNomeUsuario());
            txtLogin.setText(object.getLogin());
            txtSenha.setText(object.getSenha());
            jComboBox1Perfil.setSelectedItem(object.getPerfil());

        }
    }
    /*
    public void listaCombox(){
         UsuarioDao dao = new UsuarioDao();
        for ( Usuario u:dao.listaPerfil()) {
            jComboBox1Perfil.addItem(u.getPerfil());
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAlteraarDados;
    private javax.swing.JButton btDeletaUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Object> jComboBox1Perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
