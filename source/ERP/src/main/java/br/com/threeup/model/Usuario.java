/**
 * 
 */
package br.com.threeup.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Classe que representa o dominio Usuário no banco de dados.
 * 
 * @author rcostadu
 * 
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = -994851576249661498L;

    @Id
    private String login;

    private String senha;

    private String nome;


    /**
     * @return the login
     */
    public String getLogin() {

        return login;
    }


    /**
     * @param login
     *            the login to set
     */
    public void setLogin( String login ) {

        this.login = login;
    }


    /**
     * @return the senha
     */
    public String getSenha() {

        return senha;
    }


    /**
     * @param senha
     *            the senha to set
     */
    public void setSenha( String senha ) {

        this.senha = senha;
    }


    /**
     * @return the nome
     */
    public String getNome() {

        return nome;
    }


    /**
     * @param nome
     *            the nome to set
     */
    public void setNome( String nome ) {

        this.nome = nome;
    }

}