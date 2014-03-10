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
import br.com.threeup.dao.impl.ParceiroDao;
import br.com.threeup.model.Parceiro;


/**
 * Classe responsável pelas regras de manipulação dos dados do
 * {@link ParceiroController}
 * 
 * @author rcostadu
 * 
 */
@Resource
public class ParceirosController {

    private final ParceiroDao dao;

    private final Result result;


    /**
     * Método responsável por criar uma instância das variaveis globais da
     * classe.
     * 
     * @param dao
     *            Instância {@link ParceiroDao}
     * @param result
     *            Instância {@link Result}
     */
    public ParceirosController( ParceiroDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    /**
     * Método responsável por retorno todos os {@link Parceiro}s sem filtros.
     * 
     * @return Uma {@link List}<{@link Parceiro}>
     */
    @Get( "/parceiros" )
    public List< Parceiro > lista() {

        return dao.listaTudo();
    }


    /**
     * Método responsável por buscar os {@link Parceiro}s através do nome como
     * referência.
     * 
     * @param nome
     *            Paramentro {@link String} referente ao nome do
     *            {@link Parceiro}
     * @return Uma {@link List}<{@link Parceiro}>
     */
    public List< Parceiro > busca( String nome ) {

        result.include( "nome", nome );
        return dao.busca( nome );
    }


    /**
     * Método responsável por inserir o {@link Parceiro} no banco.
     * 
     * @param parceiro
     *            Paramentro {@link Parceiro} que será salvo no banco.
     */
    @Post( "/parceiros" )
    public void adiciona( Parceiro parceiro ) {

        dao.salva( parceiro );

        result.redirectTo( this ).lista();
    }


    /**
     * Método {@link Void} para controle do formulário na camada view.
     */
    @Get( "/parceiros/novo" )
    public void formulario() {

    }


    /**
     * Método responsável por buscar o {@link Parceiro} para alteração dos
     * dados.
     * 
     * @param id
     *            Código do {@link Parceiro} para busca.
     * @return Uma instância de {@link Parceiro}
     */
    @Get( "/parceiros/{id}" )
    public Parceiro edita( Long id ) {

        return dao.carrega( id );

    }


    /**
     * Método responsável por alterar os dados {@link Parceiro}
     * 
     * @param parceiro
     *            Parametro {@link Parceiro} que será alterado no banco de
     *            dados.
     */
    @Put( "/parceiros/{parceiro.id}" )
    public void altera( Parceiro parceiro ) {

        dao.update( parceiro );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por remover o {@link Parceiro} atráves do código.
     * 
     * @param id
     *            Código do {@link Parceiro} para exclusão
     */
    @Delete( "/parceiros/{id}" )
    public void remove( Long id ) {

        Parceiro parceiro = dao.carrega( id );
        dao.remove( parceiro );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por buscar informações do contaBancaria para
     * {@link Result} de retorno da classe.
     * 
     * @param parameter
     *            Parametro de entrada da busca em {@link String}
     */
    @Get( "/parceiros/busca.json" )
    public void buscaJson( String parameter ) {

        result.use( json() ).withoutRoot().from( dao.busca( parameter ) ).exclude( "id", "nome" ).serialize();
    }
}
