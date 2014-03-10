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
import br.com.threeup.dao.impl.TransportadoraDao;
import br.com.threeup.model.Transportadora;


/**
 * Classe responsável pelas regras de manipulação da view para inclusão dos
 * dados do {@link Transportadora} no back-end
 * 
 * @author Thiago
 * 
 */
@Resource
public class TransportadorasController {

    private final TransportadoraDao dao;

    private final Result result;


    /**
     * Método responsável por criar uma instância das variaveis globais da
     * classe.
     * 
     * @param dao
     *            Instância {@link TransportadoraDao}
     * @param result
     *            Instância {@link Result}
     */
    public TransportadorasController( TransportadoraDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    /**
     * Método responsável por retorno todos os {@link Transportadora}s sem
     * filtros.
     * 
     * @return Uma {@link List}<{@link Transportadora}>
     */
    @Get( "/transportadoras" )
    public List< Transportadora > lista() {

        return dao.listaTudo();
    }


    /**
     * Método responsável por buscar os {@link Transportadora}s através do nome
     * como referência.
     * 
     * @param nome
     *            Paramentro {@link String} referente ao nome do
     *            {@link Transportadora}
     * @return Uma {@link List}<{@link Clinte}>
     */
    public List< Transportadora > busca( String nome ) {

        result.include( "nome", nome );
        return dao.busca( nome );
    }


    /**
     * Método responsável por inserir o {@link Transportadora} no banco.
     * 
     * @param transportadora
     *            Paramentro {@link Transportadora} que será salvo no banco.
     */
    @Post( "/transportadoras" )
    public void adiciona( Transportadora transportadora ) {

        dao.salva( transportadora );
        result.redirectTo( this ).lista();
    }


    /**
     * Método {@link Void} para controle do formulário na camada view.
     */
    @Get( "/transportadoras/novo" )
    public void formulario() {

    }


    /**
     * Método responsável por buscar o {@link Transportadora} para alteração dos
     * dados.
     * 
     * @param id
     *            Parametro {@link Transportadora} que será alterado no banco de
     *            dados.
     * @return Uma instância de {@link Transportadora}
     */
    @Get( "/transportadoras/{id}" )
    public Transportadora edita( Long id ) {

        return dao.carrega( id );

    }


    /**
     * Método responsável por alterar os dados {@link Transportadora}
     * 
     * @param transportadora
     *            Parametro {@link Transportadora} que será alterado no banco de
     *            dados.
     */
    @Put( "/transportadoras/{transportadora.id}" )
    public void altera( Transportadora transportadora ) {

        dao.update( transportadora );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por remover o {@link Transportadora} através do
     * código.
     * 
     * @param id
     *            Parametro {@link Transportadora} que será alterado no banco de
     *            dados.
     */
    @Delete( "/transportadoras/{id}" )
    public void remove( Long id ) {

        Transportadora transportadora = dao.carrega( id );
        dao.remove( transportadora );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por buscar informações do contaBancaria para
     * {@link Result} de retorno da classe.
     * 
     * @param nome
     *            Parametro de entrada da busca em {@link String}
     */
    @Get( "/transportadoras/busca.json" )
    public void buscaJson( String nome ) {

        result.use( json() ).withoutRoot().from( dao.busca( nome ) ).exclude( "id", "nome" ).serialize();
    }
}