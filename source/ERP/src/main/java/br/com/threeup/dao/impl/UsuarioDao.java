package br.com.threeup.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.threeup.dao.SessionFacade;
import br.com.threeup.model.Usuario;


/**
 * Cria a {@link Session} para persistência no banco de dados que representa o
 * domninio {@link Usuario}.
 * 
 * @author rcostadu
 * 
 */
@Component
public class UsuarioDao extends SessionFacade< Usuario > {

    /**
     * Método de criar a instância do {@link Session}
     * 
     * @param session
     *            Parametro {@link Session} que será inicializada.
     */
    public UsuarioDao( Session session ) {

        super( session );
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#listaTudo()
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Usuario > listaTudo() {

        List< Usuario > returns = this.getSession().createCriteria( Usuario.class ).list();

        return returns;
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#carrega(java.lang.Long)
     */
    @Override
    public Usuario carrega( Long id ) {

        return (Usuario) this.getSession().load( Usuario.class, id );
    }


    /**
     * @see br.com.threeup.dao.SessionFacade#busca(java.lang.String)
     */
    @Override
    @SuppressWarnings( "unchecked" )
    public List< Usuario > busca( String nome ) {

        return this.getSession().createCriteria( Usuario.class )
            .add( Restrictions.ilike( "nome", nome, MatchMode.ANYWHERE ) ).list();
    }


    /**
     * Método responsável por verificar se o {@link Usuario} já existe
     * 
     * @param usuario
     *            Parametro {@link Usuario} que será validado.
     * @return {@link Boolean}
     */
    public boolean existeUsuario( Usuario usuario ) {

        Usuario encontrado = (Usuario) getSession().createCriteria( Usuario.class )
            .add( Restrictions.eq( "login", usuario.getLogin() ) ).uniqueResult();
        return encontrado != null;
    }


    /**
     * Método responsável por carregar os dados do {@link Usuario}.
     * 
     * @param usuario
     *            Parametro {@link Usuario} que será carregado.
     * @return {@link Usuario}
     */
    public Usuario carrega( Usuario usuario ) {

        return (Usuario) getSession().createCriteria( Usuario.class )
            .add( Restrictions.eq( "login", usuario.getLogin() ) ).add( Restrictions.eq( "senha", usuario.getSenha() ) )
            .uniqueResult();
    }
}