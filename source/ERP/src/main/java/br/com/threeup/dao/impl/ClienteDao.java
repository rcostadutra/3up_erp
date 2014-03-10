/**
 * 
 */
package br.com.threeup.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.threeup.dao.SessionFacade;
import br.com.threeup.model.Cliente;


/**
 * Cria a {@link Session} para persistência no banco de dados que representa o
 * domninio {@link Cliente}.
 * 
 * @author rcostadu
 */
@Component
public class ClienteDao extends SessionFacade< Cliente > {

    /**
     * Método de criar a instância do {@link Session}
     * 
     * @param session
     *            Parametro {@link Session} que será inicializada.
     */
    public ClienteDao( Session session ) {

        super( session );

    }


    /**
     * @see br.com.threeup.dao.SessionFacade#listaTudo()
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Cliente > listaTudo() {

        List< Cliente > returns = this.getSession().createCriteria( Cliente.class ).list();

        return returns;
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#carrega(java.lang.Long)
     */
    @Override
    public Cliente carrega( Long id ) {

        return (Cliente) this.getSession().load( Cliente.class, id );
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#busca(java.lang.String)
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Cliente > busca( String nome ) {

        return this.getSession().createCriteria( Cliente.class )
            .add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) ).list();
    }

}