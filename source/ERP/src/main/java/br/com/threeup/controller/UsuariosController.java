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
import br.com.threeup.dao.UsuarioDao;
import br.com.threeup.model.Usuario;
import br.com.threeup.model.UsuarioWeb;

/**
 * @author rcostadu
 * 
 */
@Resource
public class UsuariosController {

	private final UsuarioDao dao;
	private final Result result;
	private final Validator validator;
	private final UsuarioWeb usuarioWeb;

	public UsuariosController(UsuarioDao dao, Result result,
			Validator validator, UsuarioWeb usuarioWeb) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
		this.usuarioWeb = usuarioWeb;
	}

	@Post("/usuarios")
	public void adiciona(Usuario usuario) {
		if (dao.existeUsuario(usuario)) {
			validator.add(new ValidationMessage("Login já existe",
					"usuario.login"));
		}
		validator.onErrorUsePageOf(UsuariosController.class).novo();

		dao.adiciona(usuario);

		result.redirectTo(ProdutosController.class).lista();
	}

	@Get("/login")
	public void loginForm() {

	}

	@Post("/login")
	public void login(Usuario usuario) {
		Usuario carregado = dao.carrega(usuario);
		if (carregado == null) {
			validator.add(new ValidationMessage("Login e/ou senha inválidos",
					"usuario.login"));
		}
		validator.onErrorUsePageOf(UsuariosController.class).loginForm();

		usuarioWeb.login(carregado);

		result.redirectTo(ProdutosController.class).lista();
	}

	@Path("/logout")
	public void logout() {
		usuarioWeb.logout();
		result.redirectTo(ProdutosController.class).lista();
	}

	public void novo() {

	}
}
