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
package br.com.ifrn.dao;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * Acessar o perfil e usuário com os dados do banco
 *@version  0.1
 * @author Anderson
 */
public class AcessoDao extends Conexao {

    Connection conn = Conexao.getConnection();

    /**
     * Método para buscar perfil
     *
     * @param usu
     * @param senha
     * @return pf de perfil
     */
    public String acesso(String usu, String senha) {
        String pf = "";
        try {
            String sql = "SELECT perfil FROM tecusuario where login=? and senha=? ";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, usu);
            ptm.setString(2, senha);

            ResultSet rst = ptm.executeQuery();

            if (rst.next()) {
                pf = rst.getString("perfil");
            }
            rst.close();
            ptm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao buscar Perfil");
        }
        return pf;
    }

    /**
     * Método para buscar um usuário
     *
     * @param usuario
     * @param senha
     * @return usuário
     */
    public String acessoUsuario(String usuario, String senha) {
        String usu = "";
        try {
            String sql = "SELECT usuario FROM tecusuario where login=? and senha=? ";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, usuario);
            ptm.setString(2, senha);

            ResultSet rst = ptm.executeQuery();

            if (rst.next()) {
                usu = rst.getString("usuario");
            }
            rst.close();
            ptm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao buscar usuario");
        }
        return usu;

    }

}
