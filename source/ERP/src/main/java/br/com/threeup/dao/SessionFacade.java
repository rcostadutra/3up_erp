/**
 * 
 */
package br.com.threeup.dao;


import java.io.Serializable;
import java.util.List;

import org.dom4j.tree.AbstractEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * @author Thiago
 * 
 * @param <T>
 */
public abstract class SessionFacade< T extends Serializable > {

    private final Session session;


    /**
     * Método de criar a instância do {@link Session}
     * 
     * @param session
     *            Parametro {@link Session} que será inicializada.
     */
    public SessionFacade( Session session ) {

        this.session = session;
    }


    /**
     * Método responsável por receber o T e incluir no banco através da
     * {@link Session}
     * 
     * @param domain
     *            Parametro que será inserido no banco.
     */
    public void salva( T domain ) {

        Transaction tx = session.beginTransaction();
        session.save( domain );
        tx.commit();
    }


    /**
     * Método responsável por receber o T e alterar no banco através da
     * {@link Session}
     * 
     * @param domain
     *            Parametro que será alterado no banco
     */
    public void update( T domain ) {

        Transaction tx = session.beginTransaction();
        session.update( domain );
        tx.commit();
    }


    /**
     * Implementação do método obrigatório para cada entidade.
     * 
     * Método responsável por buscar todos os {@link AbstractEntity}s.
     * 
     * @return Uma {@link List}<{@link AbstractEntity}>
     */
    public abstract List< T > listaTudo();


    /**
     * Método responsável por buscar o {@link AbstractEntity} através do
     * parametro código.
     * 
     * @param id
     *            Código do {@link AbstractEntity}
     * @return {@link AbstractEntity}
     */
    public abstract T carrega( Long id );


    /**
     * Método responsável por remover o T do banco de dados.
     * 
     * @param domain
     *            Parametro que será excluído.
     */
    public void remove( T domain ) {

        Transaction tx = session.beginTransaction();
        session.delete( domain );
        tx.commit();
    }


    /**
     * Implementação do método obrigatório para cada entidade.
     * 
     * Método responsável por buscar uma lista de {@link AbstractEntity}s
     * atráves do nome
     * 
     * @param <T>
     * 
     * @param nome
     *            Parametro {@link String} que representa o atributo nome do
     *            {@link AbstractEntity}
     * @return {@link List}<{@link AbstractEntity}>
     */
    public abstract List< T > busca( String nome );


    /**
     * Método responsável por retornar o atributo {@link Session} para
     * utilização nas heranças.
     * 
     * @return the session {@link Session}
     */
    public Session getSession() {

        return session;
    }
}