/**
 * 
 */
package br.com.threeup.infra;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;  

/**
 * @author rcostadu
 * 
 */
@Component
@ApplicationScoped
public class CriadorDeSessionFactory implements
		ComponentFactory<SessionFactory> {
	
	private SessionFactory factory; 
	
	@PostConstruct
	public void abre() {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		factory =configuration.buildSessionFactory();
		
	}
	
	public SessionFactory getInstance(){
		return factory;
	}
	
	@PreDestroy
	public void fecha(){
		factory.close();
	}
}
