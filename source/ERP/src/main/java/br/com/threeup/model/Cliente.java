/**
 * 
 */
package br.com.threeup.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Classe que representa o dominio Cliente no banco de dados.
 * 
 * @author rcostadu
 * 
 */

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 8787379436270398398L;

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String razao_social;

    private String cpf;

    private String cnpj;

    private Long telefone;

    private Long celular;

    private String rg;

    private String ie;

    private String email;

    private String web_site;

    private Long cep;

    private Long cep_entrega;

    private String logradouro;

    private String logradouro_entrega;

    private Long nro;

    private Long nro_entrega;

    private String complemento;

    private String complemento_entrega;

    private String bairro;

    private String bairro_entrega;

    private String uf;

    private String uf_entrega;

    private String cidade;

    private String cidade_entrega;


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
     * @return the cpf
     */
    public String getCpf() {

        return cpf;
    }


    /**
     * @param cpf
     *            the cpf to set
     */
    public void setCpf( String cpf ) {

        this.cpf = cpf;
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
     * @return the rg
     */
    public String getRg() {

        return rg;
    }


    /**
     * @param rg
     *            the rg to set
     */
    public void setRg( String rg ) {

        this.rg = rg;
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
     * @return the cep_entrega
     */
    public Long getCep_entrega() {

        return cep_entrega;
    }


    /**
     * @param cep_entrega
     *            the cep_entrega to set
     */
    public void setCep_entrega( Long cep_entrega ) {

        this.cep_entrega = cep_entrega;
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
     * @return the logradouro_entrega
     */
    public String getLogradouro_entrega() {

        return logradouro_entrega;
    }


    /**
     * @param logradouro_entrega
     *            the logradouro_entrega to set
     */
    public void setLogradouro_entrega( String logradouro_entrega ) {

        this.logradouro_entrega = logradouro_entrega;
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
     * @return the nro_entrega
     */
    public Long getNro_entrega() {

        return nro_entrega;
    }


    /**
     * @param nro_entrega
     *            the nro_entrega to set
     */
    public void setNro_entrega( Long nro_entrega ) {

        this.nro_entrega = nro_entrega;
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
     * @return the complemento_entrega
     */
    public String getComplemento_entrega() {

        return complemento_entrega;
    }


    /**
     * @param complemento_entrega
     *            the complemento_entrega to set
     */
    public void setComplemento_entrega( String complemento_entrega ) {

        this.complemento_entrega = complemento_entrega;
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
     * @return the bairro_entrega
     */
    public String getBairro_entrega() {

        return bairro_entrega;
    }


    /**
     * @param bairro_entrega
     *            the bairro_entrega to set
     */
    public void setBairro_entrega( String bairro_entrega ) {

        this.bairro_entrega = bairro_entrega;
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
     * @return the uf_entrega
     */
    public String getUf_entrega() {

        return uf_entrega;
    }


    /**
     * @param uf_entrega
     *            the uf_entrega to set
     */
    public void setUf_entrega( String uf_entrega ) {

        this.uf_entrega = uf_entrega;
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


    /**
     * @return the cidade_entrega
     */
    public String getCidade_entrega() {

        return cidade_entrega;
    }


    /**
     * @param cidade_entrega
     *            the cidade_entrega to set
     */
    public void setCidade_entrega( String cidade_entrega ) {

        this.cidade_entrega = cidade_entrega;
    }

}
