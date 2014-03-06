/**
 * 
 */
package br.com.threeup.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.threeup.model.Fornecedor;


;

/**
 * @author rcostadu Cria a sessão e persiste na base
 */
@Component
@SuppressWarnings( "unchecked" )
public class FornecedorDao {

    private final Session session;


    public FornecedorDao( Session session ) {

        this.session = session;

    }


    public void salva( Fornecedor fornecedor ) {

        Transaction tx = session.beginTransaction();
        session.save( fornecedor );
        tx.commit();
    }


    public void update( Fornecedor fornecedor ) {

        Transaction tx = session.beginTransaction();
        session.update( fornecedor );
        tx.commit();
    }


    public List< Fornecedor > listaTudo() {

        return this.session.createCriteria( Fornecedor.class ).list();
    }


    public Fornecedor carrega( Long id ) {

        return (Fornecedor) this.session.load( Fornecedor.class, id );
    }


    public void atualiza( Fornecedor fornecedor ) {

        Transaction tx = session.beginTransaction();
        this.session.update( fornecedor );
        tx.commit();
    }


    public void remove( Fornecedor fornecedor ) {

        Transaction tx = session.beginTransaction();
        session.delete( fornecedor );
        tx.commit();
    }


    public List< Fornecedor > busca( String nome ) {

        return session.createCriteria( Fornecedor.class ).add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) )
            .list();
    }
}
