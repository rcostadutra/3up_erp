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
import br.com.threeup.dao.impl.ClienteDao;
import br.com.threeup.model.Cliente;


/**
 * Classe responsável pelas regras de manipulação da view para inclusão dos
 * dados do {@link Cliente} no back-end
 * 
 * @author rcostadu
 * 
 */
@Resource
public class ClientesController {

    private final ClienteDao dao;

    private final Result result;


    /**
     * Método responsável por criar uma instância das variaveis globais da
     * classe.
     * 
     * @param dao
     *            Instância {@link ClienteDao}
     * @param result
     *            Instância {@link Result}
     */
    public ClientesController( ClienteDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    /**
     * Método responsável por retorno todos os {@link Cliente}s sem filtros.
     * 
     * @return Uma {@link List}<{@link Cliente}>
     */
    @Get( "/clientes" )
    public List< Cliente > lista() {

        return dao.listaTudo();
    }


    /**
     * Método responsável por buscar os {@link Cliente}s através do nome como
     * referência.
     * 
     * @param nome
     *            Paramentro {@link String} referente ao nome do {@link Cliente}
     * @return Uma {@link List}<{@link Clinte}>
     */
    public List< Cliente > busca( String nome ) {

        result.include( "nome", nome );
        return dao.busca( nome );
    }


    /**
     * Método responsável por inserir o {@link Cliente} no banco.
     * 
     * @param cliente
     *            Paramentro {@link Cliente} que será salvo no banco.
     */
    @Post( "/clientes" )
    public void adiciona( Cliente cliente ) {

        dao.salva( cliente );
        result.redirectTo( this ).lista();
    }


    /**
     * Método {@link Void} para controle do formulário na camada view.
     */
    @Get( "/clientes/novo" )
    public void formulario() {

    }


    /**
     * Método responsável por buscar o {@link Cliente} para alteração dos dados.
     * 
     * @param id
     *            Parametro {@link Cliente} que será alterado no banco de dados.
     * @return Uma instância de {@link Cliente}
     */
    @Get( "/clientes/{id}" )
    public Cliente edita( Long id ) {

        return dao.carrega( id );

    }


    /**
     * Método responsável por alterar os dados {@link Cliente}
     * 
     * @param cliente
     *            Parametro {@link Cliente} que será alterado no banco de dados.
     */
    @Put( "/clientes/{cliente.id}" )
    public void altera( Cliente cliente ) {

        dao.update( cliente );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por remover o {@link Cliente} através do código.
     * 
     * @param id
     *            Parametro {@link Cliente} que será alterado no banco de dados.
     */
    @Delete( "/clientes/{id}" )
    public void remove( Long id ) {

        Cliente cliente = dao.carrega( id );
        dao.remove( cliente );
        result.redirectTo( this ).lista();
    }


    /**
     * Método responsável por buscar informações do contaBancaria para
     * {@link Result} de retorno da classe.
     * 
     * @param nome
     *            Parametro de entrada da busca em {@link String}
     */
    @Get( "/clientes/busca.json" )
    public void buscaJson( String nome ) {

        result.use( json() ).withoutRoot().from( dao.busca( nome ) ).exclude( "id", "nome" ).serialize();
    }
}