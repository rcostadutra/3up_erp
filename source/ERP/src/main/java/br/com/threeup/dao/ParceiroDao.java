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
import br.com.threeup.model.Parceiro;


/**
 * @author rcostadu Cria a sessão e persiste na base
 */
@Component
@SuppressWarnings( "unchecked" )
public class ParceiroDao {

    private final Session session;


    public ParceiroDao( Session session ) {

        this.session = session;

    }


    public void salva( Parceiro parceiro ) {

        Transaction tx = session.beginTransaction();
        session.save( parceiro );
        tx.commit();
    }


    public void update( Parceiro parceiro ) {

        Transaction tx = session.beginTransaction();
        session.update( parceiro );
        tx.commit();
    }


    public List< Parceiro > listaTudo() {

        return this.session.createCriteria( Parceiro.class ).list();
    }


    public Parceiro carrega( Long id ) {

        return (Parceiro) this.session.load( Parceiro.class, id );
    }


    public void atualiza( Parceiro parceiro ) {

        Transaction tx = session.beginTransaction();
        this.session.update( parceiro );
        tx.commit();
    }


    public void remove( Parceiro parceiro ) {

        Transaction tx = session.beginTransaction();
        session.delete( parceiro );
        tx.commit();
    }


    public List< Parceiro > busca( String nome ) {

        return session.createCriteria( Parceiro.class ).add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) )
            .list();
    }
}
