package br.com.threeup.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.threeup.dao.SessionFacade;
import br.com.threeup.model.Transportadora;


/**
 * Cria a {@link Session} para persistência no banco de dados que representa o
 * domninio {@link Transportadora}.
 * 
 * @author Thiago
 * 
 */
@Component
public class TransportadoraDao extends SessionFacade< Transportadora > {

    /**
     * Método de criar a instância do {@link Session}
     * 
     * @param session
     *            Parametro {@link Session} que será inicializada.
     */
    public TransportadoraDao( Session session ) {

        super( session );

    }


    /**
     * @see br.com.threeup.dao.SessionFacade#listaTudo()
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Transportadora > listaTudo() {

        List< Transportadora > returns = this.getSession().createCriteria( Transportadora.class ).list();

        return returns;
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#carrega(java.lang.Long)
     */
    @Override
    public Transportadora carrega( Long id ) {

        return (Transportadora) this.getSession().load( Transportadora.class, id );
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#busca(java.lang.String)
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Transportadora > busca( String nome ) {

        return this.getSession().createCriteria( Transportadora.class )
            .add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) ).list();
    }

}
