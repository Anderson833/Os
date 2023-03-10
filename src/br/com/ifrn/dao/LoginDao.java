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
 * Essa classe é responsável em fazer login com os dados do banco de dados
 *
 * @author Anderson
 * @version 0.1
 */
public class LoginDao {

    /**
     * Método responsável em fazer o login com os dados do banco
     *
     * @param usuario
     * @param senha
     * @return logar
     */
    public boolean logar(String usuario, String senha) {

        //Instânciando conexão com classe Conexso_BD;
        Connection conn = Conexao.getConnection();

        boolean logar = false;

        try {
            //Comando para selecionar usuário e senha no banco de dados;
            String sql = "select * from tecusuario where login=? and senha=? ";

            PreparedStatement patm = conn.prepareStatement(sql);
            patm.setString(1, usuario);
            patm.setString(2, senha);

            ResultSet rst = patm.executeQuery();

            if (rst.next()) {
                logar = true;
            }

            //Fechando conexão PreparedStatement;
            patm.close();

            //Fechando conexão Connection;
            conn.close();

        } catch (Exception ex) {
            //Caso ocorrer aldo errado mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao Logar");
        }

        return logar;
    }

}
