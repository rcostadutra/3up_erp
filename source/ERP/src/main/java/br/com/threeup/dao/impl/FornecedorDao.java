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
import br.com.threeup.model.Fornecedor;


/**
 * Cria a {@link Session} para persistência no banco de dados que representa o
 * domninio {@link Fornecedor}.
 * 
 * @author rcostadu
 */
@Component
public class FornecedorDao extends SessionFacade< Fornecedor > {

    /**
     * Método de criar a instância do {@link Session}
     * 
     * @param session
     *            Parametro {@link Session} que será inicializada.
     */
    public FornecedorDao( Session session ) {

        super( session );

    }


    /**
     * @see br.com.threeup.dao.SessionFacade#listaTudo()
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Fornecedor > listaTudo() {

        List< Fornecedor > returns = this.getSession().createCriteria( Fornecedor.class ).list();

        return returns;
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#carrega(java.lang.Long)
     */
    @Override
    public Fornecedor carrega( Long id ) {

        return (Fornecedor) this.getSession().load( Fornecedor.class, id );
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#busca(java.lang.String)
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Fornecedor > busca( String nome ) {

        return this.getSession().createCriteria( Fornecedor.class )
            .add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) ).list();
    }

}