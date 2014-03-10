package br.com.threeup.controller;


import static br.com.caelum.vraptor.view.Results.json;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.threeup.dao.impl.ContaBancariaDao;
import br.com.threeup.model.ContaBancaria;


/**
 * Classe responsável pelas regras de manipulação dos dados do
 * {@link ContaBancariaController}
 * 
 * @author Thiago
 * 
 */
@Resource
public class ContaBancariasController {

    private final ContaBancariaDao dao;

    private final Result result;


    /**
     * Método responsável por criar uma instância das variaveis globais da
     * classe.
     * 
     * @param dao
     *            Instância {@link ContaBancariaDao}
     * @param result
     *            Instância {@link Result}
     */
    public ContaBancariasController( ContaBancariaDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    /**
     * Método responsável por retorno todos os {@link ContaBancaria}s sem
     * filtros.
     * 
     * @return Uma {@link List}<{@link ContaBancaria}>
     */
    @Get( "/contaBancarias" )
    public List< ContaBancaria > lista() {

        return dao.listaTudo();
    }


    /**
     * Método responsável por buscar os {@link ContaBancaria}s através do nome
     * como referência.
     * 
     * @param mnemonico
     *            Paramentro {@link String} referente ao nome do
     *            {@link ContaBancaria}
     * @return Uma {@link List}<{@link ContaBancaria}>
     */
    public List< ContaBancaria > busca( String mnemonico ) {

        result.include( "mnemonico", mnemonico );
        return dao.busca( mnemonico );
    }


    /**
     * Método responsável por inserir o {@link ContaBancaria} no banco.
     * 
     * @param contaBancaria
     *            Paramentro {@link ContaBancaria} que será salvo no banco.
     */
    @Post( "/contaBancarias" )
    public void adiciona( ContaBancaria contaBancaria ) {

        dao.salva( contaBancaria );
        result.redirectTo( this ).lista();
    }


    /**
     * Método {@link Void} para controle do formulário na camada view.
     */
    @Get( "/contaBancarias/novo" )
    public void formulario() {

    }


    /**
     * Método responsável por buscar o {@link ContaBancaria} para alteração dos
     * dados.
     * 
     * @param id
     *            Código do {@link ContaBancaria} para busca.
     * @return Uma instância de {@link ContaBancaria}
     */
    @Get( "/contaBancarias/{id}" )
    public ContaBancaria edita( Long id ) {

        return dao.carrega( id );

    }


    /**
     * Método responsável por alterar os dados {@link ContaBancaria}
     * 
     * @param contaBancaria
     *            Parametro {@link ContaBancaria} que será alterado no banco de
     *            dados.
     */
    @Put( "/contaBancarias/{contaBancaria.id}" )
    public void altera( ContaBancaria contaBancaria ) {

        dao.update( contaBancaria );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por remover o {@link ContaBancaria} atráves do código.
     * 
     * @param id
     *            Código do {@link ContaBancaria} para exclusão
     */
    @Delete( "/contaBancarias/{id}" )
    public void remove( Long id ) {

        ContaBancaria contaBancaria = dao.carrega( id );
        dao.remove( contaBancaria );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por buscar informações do contaBancaria para
     * {@link Result} de retorno da classe.
     * 
     * @param parameter
     *            Parametro de entrada da busca em {@link String}
     */
    @Get( "/contaBancarias/busca.json" )
    public void buscaJson( String parameter ) {

        result.use( json() ).withoutRoot().from( dao.busca( parameter ) ).exclude( "id", "mnemonico" ).serialize();
    }
}