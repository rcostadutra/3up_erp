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
 * @author rcostadu
 * 
 */
@Resource
public class ClientesController {

    private final ClienteDao dao;

    private final Result result;


    public ClientesController( ClienteDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    @Get( "/clientes" )
    public List< Cliente > lista() {

        return dao.listaTudo();
    }


    public List< Cliente > busca( String nome ) {

        result.include( "nome", nome );
        return dao.busca( nome );
    }


    @Post( "/clientes" )
    public void adiciona( Cliente cliente ) {

        dao.salva( cliente );

        // redirect forma 1
        // result.redirectTo(ProdutosController.class).lista();

        // redirect forma 2
        result.redirectTo( this ).lista();
    }


    @Get( "/clientes/novo" )
    public void formulario() {

    }


    @Get( "/clientes/{id}" )
    public Cliente edita( Long id ) {

        return dao.carrega( id );

    }


    @Put( "/clientes/{cliente.id}" )
    public void altera( Cliente cliente ) {

        dao.update( cliente );
        result.redirectTo( this ).lista();
    }


    @Delete( "/clientes/{id}" )
    public void remove( Long id ) {

        Cliente cliente = dao.carrega( id );
        dao.remove( cliente );
        result.redirectTo( this ).lista();
    }


    @Get( "/clientes/busca.json" )
    public void buscaJson( String q ) {

        result.use( json() ).withoutRoot().from( dao.busca( q ) ).exclude( "id", "nome" ).serialize();
    }
}
