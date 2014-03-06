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
public class Parceiro {

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

    private String logradouro;

    private Long nro;

    private String complemento;

    private String bairro;

    private String uf;

    private String cidade;


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


    public String getLogradouro() {

        return logradouro;
    }


    public void setLogradouro( String logradouro ) {

        this.logradouro = logradouro;
    }


    public Long getNro() {

        return nro;
    }


    public void setNro( Long nro ) {

        this.nro = nro;
    }


    public String getComplemento() {

        return complemento;
    }


    public void setComplemento( String complemento ) {

        this.complemento = complemento;
    }


    public String getBairro() {

        return bairro;
    }


    public void setBairro( String bairro ) {

        this.bairro = bairro;
    }


    public String getUf() {

        return uf;
    }


    public void setUf( String uf ) {

        this.uf = uf;
    }


    public String getCidade() {

        return cidade;
    }


    public void setCidade( String cidade ) {

        this.cidade = cidade;
    }

}
