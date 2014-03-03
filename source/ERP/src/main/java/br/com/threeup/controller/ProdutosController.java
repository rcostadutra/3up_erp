/**
 * 
 */
package br.com.threeup.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Delete;

import static br.com.caelum.vraptor.view.Results.*;

import br.com.threeup.dao.ProdutoDao;
import br.com.threeup.model.Produto;

/**
 * @author rcostadu
 * 
 */
@Resource
public class ProdutosController {

	private final ProdutoDao dao;
	private final Result result;

	public ProdutosController(ProdutoDao dao, Result result) {
		this.dao = dao;
		this.result = result;

	}

	@Get("/produtos")
	public List<Produto> lista() {

		return dao.listaTudo();
	}

	public List<Produto> busca(String nome) {
		result.include("nome", nome);
		return dao.busca(nome);
	}

	@Post("/produtos")
	public void adiciona(Produto produto) {

		dao.salva(produto);

		// redirect forma 1
		// result.redirectTo(ProdutosController.class).lista();

		// redirect forma 2
		result.redirectTo(this).lista();
	}

	@Get("/produtos/novo")
	public void formulario() {

	}

	@Get("/produtos/{id}")
	public Produto edita(Long id) {
		return dao.carrega(id);

	}

	@Put("/produtos/{produto.id}")
	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}

	@Delete("/produtos/{id}")
	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}
	
	@Get ("/produtos/busca.json")
	public void buscaJson(String q){
		result.use(json())
		.withoutRoot()
		.from(dao.busca(q))
		.exclude("id", "descricao")
		.serialize();
	}
}
