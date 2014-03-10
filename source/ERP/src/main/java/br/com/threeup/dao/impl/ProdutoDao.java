package br.com.threeup.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.threeup.dao.SessionFacade;
import br.com.threeup.model.Produto;


/**
 * Cria a {@link Session} para persistência no banco de dados que representa o
 * domninio {@link Produto}.
 * 
 * @author rcostadu
 */
@Component
public class ProdutoDao extends SessionFacade< Produto > {

    /**
     * Método de criar a instância do {@link Session}
     * 
     * @param session
     *            Parametro {@link Session} que será inicializada.
     */
    public ProdutoDao( Session session ) {

        super( session );

    }


    /**
     * @see br.com.threeup.dao.SessionFacade#listaTudo()
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Produto > listaTudo() {

        List< Produto > returns = this.getSession().createCriteria( Produto.class ).list();

        return returns;
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#carrega(java.lang.Long)
     */
    @Override
    public Produto carrega( Long id ) {

        return (Produto) this.getSession().load( Produto.class, id );
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#busca(java.lang.String)
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Produto > busca( String nome ) {

        return this.getSession().createCriteria( Produto.class )
            .add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) ).list();
    }
}