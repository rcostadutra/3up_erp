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
import br.com.threeup.model.Produto;

/**
 * @author rcostadu Cria a sessão e persiste na base
 */
@Component
public class ProdutoDao {

	private final Session session;

	public ProdutoDao(Session session) {
		this.session = session;

	}

	public void salva(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}

	public void update(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.update(produto);
		tx.commit();
	}

	public List<Produto> listaTudo() {
		return this.session.createCriteria(Produto.class).list();
	}

	public Produto carrega(Long id) {
		return (Produto) this.session.load(Produto.class, id);
	}

	public void atualiza(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.update(produto);
		tx.commit();
	}

	public void remove(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.delete(produto);
		tx.commit();
	}

	public List<Produto> busca(String nome) {
	    return session.createCriteria(Produto.class)
	      .add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE))
	      .list();
	  }    
}
