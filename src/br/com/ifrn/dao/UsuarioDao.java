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
import br.com.ifrn.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Essa classe responsável para manipular os dados dos usuários no banco
 *
 * @author Anderson
 * @version 0.1
 */
public class UsuarioDao {

    /**
     * Método para adicionar os dados de usuário no banco de dados
     *
     * @param usuario para criar um objeto do tipo usuário
     */
    public void adicionaUsuario(Usuario usuario) {

        //Criando uma Connection com Classe Conexao_BD; 
        Connection conn = Conexao.getConnection();

        try {
            //Inserindo os dados do usuario no banco de dados;
            String sql = "insert into tecusuario(idUsu,usuario,login,senha,perfil) values(?,?,?,?,?)";

            PreparedStatement patm = conn.prepareStatement(sql);
            //Passando como paramentros os atributos do USUARIO da classe Usuario do modelo;

            patm.setInt(1, usuario.getIdUsuario());
            patm.setString(2, usuario.getNomeUsuario());
            patm.setString(3, usuario.getLogin());
            patm.setString(4, usuario.getSenha());
            patm.setString(5, usuario.getPerfil());

            //Executar;
            int upd = patm.executeUpdate();

            if (upd > 0) {
                //Caso de tudo certo exibir essa mensagem;
                JOptionPane.showMessageDialog(null, "Usuário Adicionado Com Sucesso");
                Usuario usu = new Usuario();
                // usu.setIdUsuario(rst.getInt("idUsu"));
                usu.setNomeUsuario(null);
                usu.setLogin(null);
                usu.setSenha(null);
                usu.setPerfil(null);
            } else {
                //Caso de error  exibir essa mensagem;
                JOptionPane.showMessageDialog(null, "Usuário Não Adicionado !", "Error ", JOptionPane.ERROR_MESSAGE);
            }

            //Fechando conexão PreparedStatement;
            patm.close();

            //Fechando conexão Connection;
            conn.close();

        } catch (SQLException ex) {
            //Caso aconteça algum error mostrar essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao Adicionar Usuário !");
        }

    }

    /**
     * Método para limpar os campos de textos na view
     *
     * @return list
     */
    public ArrayList<Usuario> limparCampos() {

        ArrayList<Usuario> list = new ArrayList<>();
        Usuario usu = new Usuario();
        //  usu.setIdUsuario(0);
        usu.setNomeUsuario(null);
        usu.setLogin(null);
        usu.setSenha(null);
        usu.setPerfil(null);
        list.add(usu);
        return list;
    }

    /**
     * Método para lista os dados do usuário pelo id
     *
     * @param codigo para receber o id
     * @return lista
     */
    public ArrayList<Usuario> listaDados(String codigo) {
        Connection conn = Conexao.getConnection();
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tecusuario WHERE idUsu=?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, codigo);
            ResultSet rst = ptm.executeQuery();

            if (rst.next()) {
                Usuario usu = new Usuario();
                usu.setIdUsuario(rst.getInt("idUsu"));
                usu.setNomeUsuario(rst.getString("usuario"));
                usu.setLogin(rst.getString("login"));
                usu.setSenha(rst.getString("senha"));
                usu.setPerfil(rst.getString(5));
                lista.add(usu);
            } else {
                JOptionPane.showMessageDialog(null, "Não existe esse usuário registrado ", "Aviso:", JOptionPane.INFORMATION_MESSAGE);
                Usuario usu = new Usuario();
                // usu.setIdUsuario(rst.getInt("idUsu"));
                usu.setNomeUsuario(null);
                usu.setLogin(null);
                usu.setSenha(null);
                usu.setPerfil(null);
                lista.add(usu);
            }
            rst.close();
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados do usuário não encontrados");
        }
        return lista;
    }

    /**
     * Método para lista todos perfils
     *
     * @return lista
     */
    public ArrayList<Usuario> listaPerfil() {
        Connection conn = Conexao.getConnection();
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            String sql = "SELECT perfil FROM tecusuario";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ResultSet rst = ptm.executeQuery();

            if (rst.next()) {
                Usuario usu = new Usuario();
                /*    usu.setIdUsuario(rst.getInt("idUsu"));
                usu.setNomeUsuario(rst.getString("usuario"));
                usu.setLogin(rst.getString("login"));
                usu.setSenha(rst.getString("senha"));
                 */ usu.setPerfil(rst.getString("perfil"));
                lista.add(usu);
            } else {
                JOptionPane.showMessageDialog(null, "Não existe esse perfil registrado ", "Comunicado:", JOptionPane.INFORMATION_MESSAGE);
            }
            rst.close();
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados de perfil não encontrados");
        }
        return lista;
    }

    /**
     * Método para alterar os dados do usuário no banco
     *
     * @param usu para receber o id
     */
    public void alteraDados(Usuario usu) {
        Connection conn = Conexao.getConnection();

        try {
            String sql = "UPDATE tecusuario SET usuario=?,login=?,senha=?,perfil=? WHERE idUsu=?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setString(1, usu.getNomeUsuario());
            ptm.setString(2, usu.getLogin());
            ptm.setString(3, usu.getSenha());
            ptm.setString(4, usu.getPerfil());
            ptm.setInt(5, usu.getIdUsuario());

            int updat = ptm.executeUpdate();

            if (updat > 0) {
                JOptionPane.showMessageDialog(null, "Dados do Usuário atualizado com sucesso!");
            }
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao atualizar os dados do usuário", "Aviso:", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método para deletar um usuário
     *
     * @param usu para receber o id do banco
     */
    public void deletaUsuario(Usuario usu) {
        Connection conn = Conexao.getConnection();

        try {
            String sql = "DELETE FROM tecusuario WHERE idUsu=?";
            PreparedStatement ptm = conn.prepareStatement(sql);
            ptm.setInt(1, usu.getIdUsuario());

            int updat = ptm.executeUpdate();

            if (updat > 0) {
                JOptionPane.showMessageDialog(null, " Usuário deletado com sucesso!");
            }
            ptm.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ao deletar usuário", "Aviso:", JOptionPane.ERROR_MESSAGE);
        }
    }
}
