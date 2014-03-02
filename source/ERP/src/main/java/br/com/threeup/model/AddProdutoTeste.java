package br.com.threeup.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.threeup.dao.ProdutoDao;
import br.com.threeup.infra.CriadorDeSession;
import br.com.threeup.infra.CriadorDeSessionFactory;

public class AddProdutoTeste {

	public static void main(String[] args) {

		Produto produto = criaProduto();

		SessionFactory factory = new CriadorDeSessionFactory().getInstance();

		Session session = new CriadorDeSession(factory).getInstance();

		ProdutoDao dao = new ProdutoDao(session);

		dao.salva(produto);
	}

	/**
	 * @return Criação do objeto produto para persistencia
	 */
	public static Produto criaProduto() {
		Produto produto = new Produto();
		produto.setNome("Prateleira");
		produto.setDescricao("Uma prateleira para colocar livros");
		produto.setPreco(35.10);
		return produto;
	}

}
