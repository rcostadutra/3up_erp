package br.com.threeup.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteProdutoTeste {

	public static void main(String[] args) {
	     Configuration configuration = new Configuration();
	     configuration.configure();
	     
	     SessionFactory factory = configuration.buildSessionFactory();
	     Session session = factory.openSession();
	     
	     // carrega o produto do banco de dados
	     Produto produto = (Produto) session.load(Produto.class, 1L);
	     
	     Transaction tx = session.beginTransaction();
	     session.delete(produto);
	     tx.commit();
	   }
	
	
}
