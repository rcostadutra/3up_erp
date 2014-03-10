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
import br.com.threeup.dao.impl.FornecedorDao;
import br.com.threeup.model.Fornecedor;


/**
 * Classe responsável pelas regras de manipulação dos dados do
 * {@link FornecedorController}
 * 
 * @author rcostadu
 * 
 */
@Resource
public class FornecedoresController {

    private final FornecedorDao dao;

    private final Result result;


    /**
     * Método responsável por criar uma instância das variaveis globais da
     * classe.
     * 
     * @param dao
     *            Instância {@link FornecedorDao}
     * @param result
     *            Instância {@link Result}
     */
    public FornecedoresController( FornecedorDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    /**
     * Método responsável por retorno todos os {@link Fornecedor}s sem filtros.
     * 
     * @return Uma {@link List}<{@link Fornecedor}>
     */
    @Get( "/fornecedores" )
    public List< Fornecedor > lista() {

        return dao.listaTudo();
    }


    /**
     * Método responsável por buscar os {@link Fornecedor}s através do nome como
     * referência.
     * 
     * @param nome
     *            Paramentro {@link String} referente ao nome do
     *            {@link Fornecedor}
     * @return Uma {@link List}<{@link Fornecedor}>
     */
    public List< Fornecedor > busca( String nome ) {

        result.include( "nome", nome );
        return dao.busca( nome );
    }


    /**
     * Método responsável por inserir o {@link Fornecedor} no banco.
     * 
     * @param fornecedor
     *            Paramentro {@link Fornecedor} que será salvo no banco.
     */
    @Post( "/fornecedores" )
    public void adiciona( Fornecedor fornecedor ) {

        dao.salva( fornecedor );

        result.redirectTo( this ).lista();
    }


    /**
     * Método {@link Void} para controle do formulário na camada view.
     */
    @Get( "/fornecedores/novo" )
    public void formulario() {

    }


    /**
     * Método responsável por buscar o {@link Fornecedor} para alteração dos
     * dados.
     * 
     * @param id
     *            Código do {@link Fornecedor} para busca.
     * @return Uma instância de {@link Fornecedor}
     */
    @Get( "/fornecedores/{id}" )
    public Fornecedor edita( Long id ) {

        return dao.carrega( id );

    }


    /**
     * Método responsável por alterar os dados {@link Fornecedor}
     * 
     * @param fornecedor
     *            Parametro {@link Fornecedor} que será alterado no banco de
     *            dados.
     */
    @Put( "/fornecedores/{fornecedor.id}" )
    public void altera( Fornecedor fornecedor ) {

        dao.update( fornecedor );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por remover o {@link Fornecedor} atráves do código.
     * 
     * @param id
     *            Código do {@link Fornecedor} para exclusão
     */
    @Delete( "/fornecedores/{id}" )
    public void remove( Long id ) {

        Fornecedor fornecedor = dao.carrega( id );
        dao.remove( fornecedor );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por buscar informações do contaBancaria para
     * {@link Result} de retorno da classe.
     * 
     * @param parameter
     *            Parametro de entrada da busca em {@link String}
     */
    @Get( "/fornecedores/busca.json" )
    public void buscaJson( String parameter ) {

        result.use( json() ).withoutRoot().from( dao.busca( parameter ) ).exclude( "id", "nome" ).serialize();
    }
}
