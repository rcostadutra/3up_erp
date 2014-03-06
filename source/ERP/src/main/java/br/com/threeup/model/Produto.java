/**
 * 
 */
package br.com.threeup.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @author rcostadu Entidade Produto
 */
@Entity
public class Produto {

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


    public Long getCod_barra() {

        return cod_barra;
    }


    public void setCod_barra( Long cod_barra ) {

        this.cod_barra = cod_barra;
    }


    public Double getCusto() {

        return custo;
    }


    public void setCusto( Double custo ) {

        this.custo = custo;
    }


    public Double getCusto_medio() {

        return custo_medio;
    }


    public void setCusto_medio( Double custo_medio ) {

        this.custo_medio = custo_medio;
    }


    public Double getPreco_venda() {

        return preco_venda;
    }


    public void setPreco_venda( Double preco_venda ) {

        this.preco_venda = preco_venda;
    }


    public Double getMargem_lucro() {

        return margem_lucro;
    }


    public void setMargem_lucro( Double margem_lucro ) {

        this.margem_lucro = margem_lucro;
    }


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


    public String getDescricao() {

        return descricao;
    }


    public void setDescricao( String descricao ) {

        this.descricao = descricao;
    }


    public Double getPreco() {

        return preco;
    }


    public void setPreco( Double preco ) {

        this.preco = preco;
    }

}
