/**
 * 
 */
package br.com.threeup.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Classe que representa o dominio Produto no banco de dados.
 * 
 * @author rcostadu
 */
@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = -6996954639387307264L;

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String descricao;

    private Double preco;

    private Long cod_barra;

    private Double custo;

    private Double custo_medio;

    private Double preco_venda;

    private Double margem_lucro;


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
     * @return the descricao
     */
    public String getDescricao() {

        return descricao;
    }


    /**
     * @param descricao
     *            the descricao to set
     */
    public void setDescricao( String descricao ) {

        this.descricao = descricao;
    }


    /**
     * @return the preco
     */
    public Double getPreco() {

        return preco;
    }


    /**
     * @param preco
     *            the preco to set
     */
    public void setPreco( Double preco ) {

        this.preco = preco;
    }


    /**
     * @return the cod_barra
     */
    public Long getCod_barra() {

        return cod_barra;
    }


    /**
     * @param cod_barra
     *            the cod_barra to set
     */
    public void setCod_barra( Long cod_barra ) {

        this.cod_barra = cod_barra;
    }


    /**
     * @return the custo
     */
    public Double getCusto() {

        return custo;
    }


    /**
     * @param custo
     *            the custo to set
     */
    public void setCusto( Double custo ) {

        this.custo = custo;
    }


    /**
     * @return the custo_medio
     */
    public Double getCusto_medio() {

        return custo_medio;
    }


    /**
     * @param custo_medio
     *            the custo_medio to set
     */
    public void setCusto_medio( Double custo_medio ) {

        this.custo_medio = custo_medio;
    }


    /**
     * @return the preco_venda
     */
    public Double getPreco_venda() {

        return preco_venda;
    }


    /**
     * @param preco_venda
     *            the preco_venda to set
     */
    public void setPreco_venda( Double preco_venda ) {

        this.preco_venda = preco_venda;
    }


    /**
     * @return the margem_lucro
     */
    public Double getMargem_lucro() {

        return margem_lucro;
    }


    /**
     * @param margem_lucro
     *            the margem_lucro to set
     */
    public void setMargem_lucro( Double margem_lucro ) {

        this.margem_lucro = margem_lucro;
    }

}