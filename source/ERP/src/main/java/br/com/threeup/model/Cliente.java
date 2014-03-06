/**
 * 
 */
package br.com.threeup.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @author rcostadu
 * 
 */

@Entity
public class Cliente {

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


    public Long getId() {

        return id;
    }


    public void setId( Long id ) {

        this.id = id;
    }


    public String getNome() {

        return nome;
    }


    public void setNome( String nome ) {

        this.nome = nome;
    }


    public String getRazao_social() {

        return razao_social;
    }


    public void setRazao_social( String razao_social ) {

        this.razao_social = razao_social;
    }


    public String getCpf() {

        return cpf;
    }


    public void setCpf( String cpf ) {

        this.cpf = cpf;
    }


    public String getCnpj() {

        return cnpj;
    }


    public void setCnpj( String cnpj ) {

        this.cnpj = cnpj;
    }


    public Long getTelefone() {

        return telefone;
    }


    public void setTelefone( Long telefone ) {

        this.telefone = telefone;
    }


    public Long getCelular() {

        return celular;
    }


    public void setCelular( Long celular ) {

        this.celular = celular;
    }


    public String getRg() {

        return rg;
    }


    public void setRg( String rg ) {

        this.rg = rg;
    }


    public String getIe() {

        return ie;
    }


    public void setIe( String ie ) {

        this.ie = ie;
    }


    public String getEmail() {

        return email;
    }


    public void setEmail( String email ) {

        this.email = email;
    }


    public String getWeb_site() {

        return web_site;
    }


    public void setWeb_site( String web_site ) {

        this.web_site = web_site;
    }


    public Long getCep() {

        return cep;
    }


    public void setCep( Long cep ) {

        this.cep = cep;
    }


    public Long getCep_entrega() {

        return cep_entrega;
    }


    public void setCep_entrega( Long cep_entrega ) {

        this.cep_entrega = cep_entrega;
    }


    public String getLogradouro() {

        return logradouro;
    }


    public void setLogradouro( String logradouro ) {

        this.logradouro = logradouro;
    }


    public String getLogradouro_entrega() {

        return logradouro_entrega;
    }


    public void setLogradouro_entrega( String logradouro_entrega ) {

        this.logradouro_entrega = logradouro_entrega;
    }


    public Long getNro() {

        return nro;
    }


    public void setNro( Long nro ) {

        this.nro = nro;
    }


    public Long getNro_entrega() {

        return nro_entrega;
    }


    public void setNro_entrega( Long nro_entrega ) {

        this.nro_entrega = nro_entrega;
    }


    public String getComplemento() {

        return complemento;
    }


    public void setComplemento( String complemento ) {

        this.complemento = complemento;
    }


    public String getComplemento_entrega() {

        return complemento_entrega;
    }


    public void setComplemento_entrega( String complemento_entrega ) {

        this.complemento_entrega = complemento_entrega;
    }


    public String getBairro() {

        return bairro;
    }


    public void setBairro( String bairro ) {

        this.bairro = bairro;
    }


    public String getBairro_entrega() {

        return bairro_entrega;
    }


    public void setBairro_entrega( String bairro_entrega ) {

        this.bairro_entrega = bairro_entrega;
    }


    public String getUf() {

        return uf;
    }


    public void setUf( String uf ) {

        this.uf = uf;
    }


    public String getUf_entrega() {

        return uf_entrega;
    }


    public void setUf_entrega( String uf_entrega ) {

        this.uf_entrega = uf_entrega;
    }


    public String getCidade() {

        return cidade;
    }


    public void setCidade( String cidade ) {

        this.cidade = cidade;
    }


    public String getCidade_entrega() {

        return cidade_entrega;
    }


    public void setCidade_entrega( String cidade_entrega ) {

        this.cidade_entrega = cidade_entrega;
    }

}
