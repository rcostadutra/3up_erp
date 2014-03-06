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
import br.com.threeup.dao.FornecedorDao;
import br.com.threeup.model.Fornecedor;


/**
 * @author rcostadu
 * 
 */
@Resource
public class FornecedoresController {

    private final FornecedorDao dao;

    private final Result result;


    public FornecedoresController( FornecedorDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    @Get( "/fornecedores" )
    public List< Fornecedor > lista() {

        return dao.listaTudo();
    }


    public List< Fornecedor > busca( String nome ) {

        result.include( "nome", nome );
        return dao.busca( nome );
    }


    @Post( "/fornecedores" )
    public void adiciona( Fornecedor fornecedor ) {

        dao.salva( fornecedor );

        result.redirectTo( this ).lista();
    }


    @Get( "/fornecedores/novo" )
    public void formulario() {

    }


    @Get( "/fornecedores/{id}" )
    public Fornecedor edita( Long id ) {

        return dao.carrega( id );

    }


    @Put( "/fornecedores/{fornecedor.id}" )
    public void altera( Fornecedor fornecedor ) {

        dao.atualiza( fornecedor );
        result.redirectTo( this ).lista();
    }


    @Delete( "/fornecedores/{id}" )
    public void remove( Long id ) {

        Fornecedor fornecedor = dao.carrega( id );
        dao.remove( fornecedor );
        result.redirectTo( this ).lista();
    }


    @Get( "/fornecedores/busca.json" )
    public void buscaJson( String q ) {

        result.use( json() ).withoutRoot().from( dao.busca( q ) ).exclude( "id", "nome" ).serialize();
    }
}
