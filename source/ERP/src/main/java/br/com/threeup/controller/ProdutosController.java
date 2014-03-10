/**
 * 
 */
package br.com.threeup.controller;


import static br.com.caelum.vraptor.view.Results.json;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.threeup.dao.impl.ProdutoDao;
import br.com.threeup.model.Produto;


/**
 * Classe responsável pelas regras de manipulação dos dados do
 * {@link ProdutoController}
 * 
 * @author rcostadu
 * 
 */
@Resource
public class ProdutosController {

    private final ProdutoDao dao;

    private final Result result;


    /**
     * Método responsável por criar uma instância das variaveis globais da
     * classe.
     * 
     * @param dao
     *            Instância {@link ProdutoDao}
     * @param result
     *            Instância {@link Result}
     */
    public ProdutosController( ProdutoDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    /**
     * Método responsável por retorno todos os {@link Produto}s sem filtros.
     * 
     * @return Uma {@link List}<{@link Produto}>
     */
    @Get( "/produtos" )
    public List< Produto > lista() {

        return dao.listaTudo();
    }


    /**
     * Método responsável por buscar os {@link Produto}s através do nome como
     * referência.
     * 
     * @param nome
     *            Paramentro {@link String} referente ao nome do {@link Produto}
     * @return Uma {@link List}<{@link Produto}>
     */
    public List< Produto > busca( String nome ) {

        result.include( "nome", nome );
        return dao.busca( nome );
    }


    /**
     * Método responsável por inserir o {@link Produto} no banco.
     * 
     * @param produto
     *            Paramentro {@link Produto} que será salvo no banco.
     */
    @Post( "/produtos" )
    public void adiciona( Produto produto ) {

        dao.salva( produto );
        result.redirectTo( this ).lista();
    }


    /**
     * Método {@link Void} para controle do formulário na camada view.
     */
    @Get( "/produtos/novo" )
    public void formulario() {

    }


    /**
     * Método responsável por buscar o {@link Produto} para alteração dos dados.
     * 
     * @param id
     *            Código do {@link Produto} para busca.
     * @return Uma instância de {@link Produto}
     */
    @Get( "/produtos/{id}" )
    public Produto edita( Long id ) {

        return dao.carrega( id );

    }


    /**
     * Método responsável por alterar os dados {@link Produto}
     * 
     * @param produto
     *            Parametro {@link Produto} que será alterado no banco de dados.
     */
    @Put( "/produtos/{produto.id}" )
    public void altera( Produto produto ) {

        dao.update( produto );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por remover o {@link Produto} atráves do código.
     * 
     * @param id
     *            Código do {@link Produto} para exclusão
     */
    @Delete( "/produtos/{id}" )
    public void remove( Long id ) {

        Produto produto = dao.carrega( id );
        dao.remove( produto );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por buscar informações do contaBancaria para
     * {@link Result} de retorno da classe.
     * 
     * @param parameter
     *            Parametro de entrada da busca em {@link String}
     */
    @Get( "/produtos/busca.json" )
    public void buscaJson( String parameter ) {

        result.use( json() ).withoutRoot().from( dao.busca( parameter ) ).exclude( "id", "descricao" ).serialize();
    }
}
