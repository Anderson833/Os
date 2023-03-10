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
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Conexão com banco de dados
 *
 * @author Anderson Fernandes
 * @version 0.1
 */
public class Conexao {

    /**
     * Método responsável para conectar com banco de dados
     *
     * @return conectar
     */
    public static Connection getConnection() {

        //Criando uma Connection;
        Connection conectar = null;

        try {

            //Carregando os Driver ;
            Class.forName("com.mysql.jdbc.Driver");

            //Criando uma Conexão com Banco De Dados;
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdinfortec?characterEncoding=utf-8", "Osdba", "1234");

        } catch (Exception e) {
            // Caso ocorrer algum error exibir essa mensagem;
            JOptionPane.showMessageDialog(null, "Error ao Conectar Com Banco  De Dados !");
        }

        //Retornando a Conexão com Banco de Dados;
        return conectar;

    }

}
