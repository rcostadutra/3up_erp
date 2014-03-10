package br.com.threeup.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.threeup.dao.SessionFacade;
import br.com.threeup.model.ContaBancaria;


/**
 * Cria a {@link Session} para persistência no banco de dados que representa o
 * domninio {@link ContaBancariaDao}.
 * 
 * @author Thiago
 * 
 */
@Component
public class ContaBancariaDao extends SessionFacade< ContaBancaria > {

    /**
     * @param session
     */
    public ContaBancariaDao( Session session ) {

        super( session );
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#listaTudo()
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< ContaBancaria > listaTudo() {

        List< ContaBancaria > returns = this.getSession().createCriteria( ContaBancaria.class ).list();

        return returns;
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#busca(java.lang.String)
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< ContaBancaria > busca( String nome ) {

        return this.getSession().createCriteria( ContaBancaria.class )
            .add( Restrictions.ilike( "mnemonico", nome, MatchMode.ANYWHERE ) ).list();
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#carrega(java.lang.Long)
     */
    @Override
    public ContaBancaria carrega( Long id ) {

        return (ContaBancaria) this.getSession().load( ContaBancaria.class, id );
    }

}