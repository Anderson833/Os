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
package br.com.ifrn.modelo;

/**
 * Essa classe é responsável em modela o objeto cliente
 *
 * @author Anderson
 * @version 0.1
 */
public class Clientes {

    /**
     * Os atributos
     */
    private int codigoCli;
    private String nomecle;
    private String endereco;
    private String telefone;
    private String email;

    /**
     * Os Métodos getters e setters
     */
    /**
     * @return the codigoCli
     */
    public int getCodigoCli() {
        return codigoCli;
    }

    /**
     * @param codigoCli the codigoCli to set
     */
    public void setCodigoCli(int codigoCli) {
        this.codigoCli = codigoCli;
    }

    /**
     * @return the nomecle
     */
    public String getNomecle() {
        return nomecle;
    }

    /**
     * @param nomecle the nomecle to set
     */
    public void setNomecle(String nomecle) {
        this.nomecle = nomecle;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
