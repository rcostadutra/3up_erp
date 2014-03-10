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
 * @author rcostadu
 * 
 */
@Resource
public class ParceirosController {

    private final ParceiroDao dao;

    private final Result result;


    public ParceirosController( ParceiroDao dao, Result result ) {

        this.dao = dao;
        this.result = result;

    }


    @Get( "/parceiros" )
    public List< Parceiro > lista() {

        return dao.listaTudo();
    }


    public List< Parceiro > busca( String nome ) {

        result.include( "nome", nome );
        return dao.busca( nome );
    }


    @Post( "/parceiros" )
    public void adiciona( Parceiro parceiro ) {

        dao.salva( parceiro );

        result.redirectTo( this ).lista();
    }


    @Get( "/parceiros/novo" )
    public void formulario() {

    }


    @Get( "/parceiros/{id}" )
    public Parceiro edita( Long id ) {

        return dao.carrega( id );

    }


    @Put( "/parceiros/{parceiro.id}" )
    public void altera( Parceiro parceiro ) {

        dao.update( parceiro );
        result.redirectTo( this ).lista();
    }


    @Delete( "/parceiros/{id}" )
    public void remove( Long id ) {

        Parceiro parceiro = dao.carrega( id );
        dao.remove( parceiro );
        result.redirectTo( this ).lista();
    }


    @Get( "/parceiros/busca.json" )
    public void buscaJson( String q ) {

        result.use( json() ).withoutRoot().from( dao.busca( q ) ).exclude( "id", "nome" ).serialize();
    }
}
