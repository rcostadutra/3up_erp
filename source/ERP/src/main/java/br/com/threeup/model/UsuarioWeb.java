/**
 * 
 */
package br.com.threeup.model;


import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;


/**
 * Classe que representa o dominio Usuário Web logado no banco de dados.
 * 
 * @author rcostadu
 * 
 */
@Component
@SessionScoped
public class UsuarioWeb {

    private Usuario logado;


    /**
     * @param usuario
     */
    public void login( Usuario usuario ) {

        this.logado = usuario;
    }


    /**
     * @return
     */
    public String getNome() {

        return logado.getNome();
    }


    /**
     * @return
     */
    public boolean isLogado() {

        return logado != null;
    }


    /**
     * 
     */
    public void logout() {

        // TODO Auto-generated method stub
        this.logado = null;
    }

}
