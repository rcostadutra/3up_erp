/**
 * 
 */
package br.com.threeup.controller;


import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.threeup.dao.impl.UsuarioDao;
import br.com.threeup.model.Usuario;
import br.com.threeup.model.UsuarioWeb;


/**
 * Classe responsável pelas regras de manipulação dos dados do
 * {@link UsuarioController}
 * 
 * @author rcostadu
 * 
 */
@Resource
public class UsuariosController {

    private final UsuarioDao dao;

    private final Result result;

    private final Validator validator;

    private final UsuarioWeb usuarioWeb;


    /**
     * Método responsável por criar uma instância das variaveis globais da
     * classe.
     * 
     * @param dao
     *            Instância {@link UsuarioDao}
     * @param result
     *            Instância {@link Result}
     * @param validator
     *            Instância {@link Validator}
     * @param usuarioWeb
     *            Instância {@link UsuarioWeb}
     */
    public UsuariosController( UsuarioDao dao, Result result, Validator validator, UsuarioWeb usuarioWeb ) {

        this.dao = dao;
        this.result = result;
        this.validator = validator;
        this.usuarioWeb = usuarioWeb;
    }


    /**
     * Método responsável por inserir o {@link Usuario} no banco.
     * 
     * @param usuario
     *            Paramentro {@link Usuario} que será salvo no banco.
     */
    @Post( "/usuarios" )
    public void adiciona( Usuario usuario ) {

        if ( dao.existeUsuario( usuario ) ) {
            validator.add( new ValidationMessage( "Login já existe", "usuario.login" ) );
        }
        validator.onErrorUsePageOf( UsuariosController.class ).novo();

        dao.salva( usuario );

        result.redirectTo( ProdutosController.class ).lista();
    }


    /**
     * Método {@link Void} para controle do login na camada view.
     */
    @Get( "/login" )
    public void loginForm() {

    }


    /**
     * Método responsável por realizar o login do {@link Usuario} no sistema.
     * 
     * @param usuario
     *            Parametro {@link Usuario} que será alterado no banco de dados.
     */
    @Post( "/login" )
    public void login( Usuario usuario ) {

        Usuario carregado = dao.carrega( usuario );
        if ( carregado == null ) {
            validator.add( new ValidationMessage( "Login e/ou senha inválidos", "usuario.login" ) );
        }
        validator.onErrorUsePageOf( UsuariosController.class ).loginForm();

        usuarioWeb.login( carregado );

        result.redirectTo( ProdutosController.class ).lista();
    }


    /**
     * Método responsável por realizar o logout do {@link Usuario} do sistema
     */
    @Path( "/logout" )
    public void logout() {

        usuarioWeb.logout();
        result.redirectTo( ProdutosController.class ).lista();
    }


    /**
     * TODO: Método em desenvolvimento.
     */
    public void novo() {

    }
}
