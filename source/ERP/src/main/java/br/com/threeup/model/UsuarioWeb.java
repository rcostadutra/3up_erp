/**
 * 
 */
package br.com.threeup.model;


import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;


/**
 * @author rcostadu
 * 
 */
@Component
@SessionScoped
public class UsuarioWeb {

    private Usuario logado;


    public void login( Usuario usuario ) {

        this.logado = usuario;
    }


    public String getNome() {

        return logado.getNome();
    }


    public boolean isLogado() {

        return logado != null;
    }


    public void logout() {

        // TODO Auto-generated method stub
        this.logado = null;
    }

}
