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
import br.com.ifrn.modelo.Os;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Essa classe é responsável na manipulação dos dados de serviços no banco
 *
 * @author Anderson
 * @version 0.1
 */
public class OsDao extends Conexao {

    /**
     * Método responsável para adiconar os de serviço dados no banco de dados
     *
     * @param os para criar um objeto do tipo serviço
     */
    public void adicionarOs(Os os) {
        Connection conn = Conexao.getConnection();
        try {
            String sql = "INSERT INTO servicos(tipo,situacao,equipamento,defeito,servico,tecnico,valor_os,idCli)"
                    + "values(?,?,?,?,?,?,?,?)";
            PreparedStatement pt = conn.prepareStatement(sql);
            pt.setString(1, os.getTipo());
            pt.setString(2, os.getSituacao());
            pt.setString(3, os.getEquipamento());
            pt.setString(4, os.getDefeito());
            pt.setString(5, os.getServico());
            pt.setString(6, os.getTecnico());
            pt.setString(7, os.getValorTotal());
            pt.setString(8, os.getEstrangeiraIdCliente());

            int add = pt.executeUpdate();
            if (add > 0) {
                JOptionPane.showMessageDialog(null, "Os Registrado com sucesso", "Sucesso:", JOptionPane.INFORMATION_MESSAGE);
            }
            pt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao adicionar os", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método responsável para lista os dados dos serviços pelo id
     *
     * @param codigo para receber o id de serviços
     * @return lista
     */
    public ArrayList<Os> listaDadosOs(String codigo) {
        Connection conn = Conexao.getConnection();
        ArrayList<Os> lista = new ArrayList<>();
        try {
            String sql = "select idOs,date_format(data_os,'%d/%m/%y - %H:%i'),tipo,situacao,equipamento,defeito,servico,tecnico,valor_os,idCli from servicos where idOs='" + codigo + "'";
            //  String sql="select * from servicos where idOs=?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            //  ptm.setString(1, codigo);
            ResultSet rst = ptm.executeQuery();

            if (rst.next()) {
                Os s = new Os();
                s.setCodigoOs(rst.getInt("idOs"));
                s.setData(rst.getString("date_format(data_os,'%d/%m/%y - %H:%i')"));
                s.setTipo(rst.getString("tipo"));
                s.setSituacao(rst.getString("situacao"));
                s.setEquipamento(rst.getString("equipamento"));
                s.setDefeito(rst.getString("defeito"));
                s.setServico(rst.getString("servico"));
                s.setTecnico(rst.getString("tecnico"));
                s.setValorTotal(rst.getString("valor_os"));
                s.setEstrangeiraIdCliente(rst.getString("idCli"));
                lista.add(s);
            } else {

                Os s = new Os();
                JOptionPane.showMessageDialog(null, "Não existe Os registrado", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
                s.setCodigoOs(0);
                s.setData(null);
                s.setTipo(null);
                s.setSituacao(null);
                s.setEquipamento(null);
                s.setDefeito(null);
                s.setServico(null);
                s.setTecnico(null);
                s.setValorTotal(null);
                s.setEstrangeiraIdCliente(null);
            }
            rst.close();
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados da Os não encontrado");
        }
        return lista;
    }

    /**
     * Método para alterar os dados de serviço
     *
     * @param os para receber o id
     */
    public void alterarOs(Os os) {
        Connection conn = Conexao.getConnection();
        try {
            String sql = "UPDATE servicos SET tipo=?,situacao=?,equipamento=?,defeito=?,servico=?,tecnico=?,valor_os=? WHERE idOs=?";
            PreparedStatement patm = conn.prepareStatement(sql);
            patm.setString(1, os.getTipo());
            patm.setString(2, os.getSituacao());
            patm.setString(3, os.getEquipamento());
            patm.setString(4, os.getDefeito());
            patm.setString(5, os.getServico());
            patm.setString(6, os.getTecnico());
            patm.setString(7, os.getValorTotal());
            patm.setInt(8, os.getCodigoOs());

            int udt = patm.executeUpdate();
            if (udt > 0) {
                JOptionPane.showMessageDialog(null, "OS atualizado com sucesso!");
            }
            patm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao alterar os dados da OS", "Aviso:", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método responsável para deletar um serviço
     *
     * @param os receber um id de serviço
     */
    public void deletaOs(Os os) {
        Connection conn = Conexao.getConnection();

        try {
            String sql = "DELETE FROM servicos WHERE idOs=?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setInt(1, os.getCodigoOs());

            int updat = ptm.executeUpdate();

            if (updat > 0) {
                JOptionPane.showMessageDialog(null, " OS deletado com sucesso!");
            }
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar OS", "Aviso:", JOptionPane.ERROR_MESSAGE);
        }
    }

}
