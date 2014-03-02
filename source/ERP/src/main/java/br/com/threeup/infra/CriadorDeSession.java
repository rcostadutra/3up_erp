/**
 * 
 */
package br.com.threeup.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @author rcostadu
 * 
 */
@Component
public class CriadorDeSession implements ComponentFactory<Session> {

	private final SessionFactory factory;
	private Session session;

	public CriadorDeSession(SessionFactory factory) {
		this.factory = factory;
	}

	public Session getInstance() {
		return session;
	}

	@PostConstruct
	public void abre() {
		session = factory.openSession();
	}

	@PreDestroy
	public void fecha() {
		session.close();
	}

}
