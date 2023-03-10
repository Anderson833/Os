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
import br.com.ifrn.modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * Classe responsável para manipular os dados do cliente no banco de dados
 *@version 0.1
 * @author Anderson
 */
public class ClienteDao extends Conexao {

    /**
     * Método para salvar os dados do cliente no banco de dados
     *
     * @param cliente para passar os objetos
     */
    public void salvarClientes(Clientes cliente) {

        Connection conn = Conexao.getConnection();

        try {
            String sql = "INSERT INTO cliente(nomeCli,endCli,foneCli,emalCli)values(?,?,?,?)";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, cliente.getNomecle());
            ptm.setString(2, cliente.getEndereco());
            ptm.setString(3, cliente.getTelefone());
            ptm.setString(4, cliente.getEmail());

            int add = ptm.executeUpdate();
            if (add > 0) {
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
                Clientes cli = new Clientes();
                cli.setNomecle(null);
                cli.setEndereco(null);
                cli.setTelefone(null);
                cli.setEmail(null);

            }
            ptm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao salva cliente", "Opa!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método para realizar alteração os dados dos clientes no banco de dados
     *
     * @param cli para receber o id do cliente
     */
    public void alterar(Clientes cli) {
        Connection conn = Conexao.getConnection();
        try {
            String sql = "UPDATE cliente SET nomeCli=?,endCli=?,foneCli=?,emalCli=? WHERE idCli=?";
            PreparedStatement patm = conn.prepareStatement(sql);
            patm.setString(1, cli.getNomecle());
            patm.setString(2, cli.getEndereco());
            patm.setString(3, cli.getTelefone());
            patm.setString(4, cli.getEmail());
            patm.setInt(5, cli.getCodigoCli());

            int udt = patm.executeUpdate();
            if (udt > 0) {
                JOptionPane.showMessageDialog(null, "Dados atualizado com sucesso!");
            }
            patm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao alterar os dados do cliente", "Aviso:", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método para deletar um cliente no banco
     *
     * @param cli para receber o id do cliente
     */
    public void deletaCliente(Clientes cli) {
        Connection conn = Conexao.getConnection();

        try {
            String sql = "DELETE FROM cliente WHERE idCli=?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setInt(1, cli.getCodigoCli());

            int updat = ptm.executeUpdate();

            if (updat > 0) {
                JOptionPane.showMessageDialog(null, " Cliente deletado com sucesso!");
            }
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar Cliente", "Aviso:", JOptionPane.ERROR_MESSAGE);
        }
    }

}
