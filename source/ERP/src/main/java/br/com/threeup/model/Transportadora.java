/**
 * 
 */
package br.com.threeup.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Classe que representa o dominio Transportadora no banco de dados.
 * 
 * @author Thiago
 * 
 */
@Entity
public class Transportadora implements Serializable {

    private static final long serialVersionUID = 2573247734176238327L;

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String razao_social;

    private String cnpj;

    private Long telefone;

    private Long celular;

    private String ie;

    private String email;

    private String web_site;

    private Long cep;

    private String logradouro;

    private Long nro;

    private String complemento;

    private String bairro;

    private String uf;

    private String cidade;


    /**
     * @return the id
     */
    public Long getId() {

        return id;
    }


    /**
     * @param id
     *            the id to set
     */
    public void setId( Long id ) {

        this.id = id;
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


    /**
     * @return the razao_social
     */
    public String getRazao_social() {

        return razao_social;
    }


    /**
     * @param razao_social
     *            the razao_social to set
     */
    public void setRazao_social( String razao_social ) {

        this.razao_social = razao_social;
    }


    /**
     * @return the cnpj
     */
    public String getCnpj() {

        return cnpj;
    }


    /**
     * @param cnpj
     *            the cnpj to set
     */
    public void setCnpj( String cnpj ) {

        this.cnpj = cnpj;
    }


    /**
     * @return the telefone
     */
    public Long getTelefone() {

        return telefone;
    }


    /**
     * @param telefone
     *            the telefone to set
     */
    public void setTelefone( Long telefone ) {

        this.telefone = telefone;
    }


    /**
     * @return the celular
     */
    public Long getCelular() {

        return celular;
    }


    /**
     * @param celular
     *            the celular to set
     */
    public void setCelular( Long celular ) {

        this.celular = celular;
    }


    /**
     * @return the ie
     */
    public String getIe() {

        return ie;
    }


    /**
     * @param ie
     *            the ie to set
     */
    public void setIe( String ie ) {

        this.ie = ie;
    }


    /**
     * @return the email
     */
    public String getEmail() {

        return email;
    }


    /**
     * @param email
     *            the email to set
     */
    public void setEmail( String email ) {

        this.email = email;
    }


    /**
     * @return the web_site
     */
    public String getWeb_site() {

        return web_site;
    }


    /**
     * @param web_site
     *            the web_site to set
     */
    public void setWeb_site( String web_site ) {

        this.web_site = web_site;
    }


    /**
     * @return the cep
     */
    public Long getCep() {

        return cep;
    }


    /**
     * @param cep
     *            the cep to set
     */
    public void setCep( Long cep ) {

        this.cep = cep;
    }


    /**
     * @return the logradouro
     */
    public String getLogradouro() {

        return logradouro;
    }


    /**
     * @param logradouro
     *            the logradouro to set
     */
    public void setLogradouro( String logradouro ) {

        this.logradouro = logradouro;
    }


    /**
     * @return the nro
     */
    public Long getNro() {

        return nro;
    }


    /**
     * @param nro
     *            the nro to set
     */
    public void setNro( Long nro ) {

        this.nro = nro;
    }


    /**
     * @return the complemento
     */
    public String getComplemento() {

        return complemento;
    }


    /**
     * @param complemento
     *            the complemento to set
     */
    public void setComplemento( String complemento ) {

        this.complemento = complemento;
    }


    /**
     * @return the bairro
     */
    public String getBairro() {

        return bairro;
    }


    /**
     * @param bairro
     *            the bairro to set
     */
    public void setBairro( String bairro ) {

        this.bairro = bairro;
    }


    /**
     * @return the uf
     */
    public String getUf() {

        return uf;
    }


    /**
     * @param uf
     *            the uf to set
     */
    public void setUf( String uf ) {

        this.uf = uf;
    }


    /**
     * @return the cidade
     */
    public String getCidade() {

        return cidade;
    }


    /**
     * @param cidade
     *            the cidade to set
     */
    public void setCidade( String cidade ) {

        this.cidade = cidade;
    }

}