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
import br.com.threeup.model.Cliente;


/**
 * @author rcostadu Cria a sessão e persiste na base
 */
@Component
@SuppressWarnings( "unchecked" )
public class ClienteDao {

    private final Session session;


    public ClienteDao( Session session ) {

        this.session = session;

    }


    public void salva( Cliente cliente ) {

        Transaction tx = session.beginTransaction();
        session.save( cliente );
        tx.commit();
    }


    public void update( Cliente cliente ) {

        Transaction tx = session.beginTransaction();
        session.update( cliente );
        tx.commit();
    }


    public List< Cliente > listaTudo() {

        return this.session.createCriteria( Cliente.class ).list();
    }


    public Cliente carrega( Long id ) {

        return (Cliente) this.session.load( Cliente.class, id );
    }


    public void atualiza( Cliente cliente ) {

        Transaction tx = session.beginTransaction();
        this.session.update( cliente );
        tx.commit();
    }


    public void remove( Cliente cliente ) {

        Transaction tx = session.beginTransaction();
        session.delete( cliente );
        tx.commit();
    }


    public List< Cliente > busca( String nome ) {

        return session.createCriteria( Cliente.class ).add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) )
            .list();
    }
}
