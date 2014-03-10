package br.com.threeup.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.threeup.dao.SessionFacade;
import br.com.threeup.model.Parceiro;


/**
 * Cria a {@link Session} para persistência no banco de dados que representa o
 * domninio {@link Parceiro}.
 * 
 * @author rcostadu
 */
@Component
public class ParceiroDao extends SessionFacade< Parceiro > {

    /**
     * Método de criar a instância do {@link Session}
     * 
     * @param session
     *            Parametro {@link Session} que será inicializada.
     */
    public ParceiroDao( Session session ) {

        super( session );

    }


    /**
     * @see br.com.threeup.dao.SessionFacade#listaTudo()
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Parceiro > listaTudo() {

        List< Parceiro > returns = this.getSession().createCriteria( Parceiro.class ).list();

        return returns;
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#carrega(java.lang.Long)
     */
    @Override
    public Parceiro carrega( Long id ) {

        return (Parceiro) this.getSession().load( Parceiro.class, id );
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#busca(java.lang.String)
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Parceiro > busca( String nome ) {

        return this.getSession().createCriteria( Parceiro.class )
            .add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) ).list();
    }

}