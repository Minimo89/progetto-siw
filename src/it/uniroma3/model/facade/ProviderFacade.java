package it.uniroma3.model.facade;

import it.uniroma3.model.Address;
import it.uniroma3.model.Provider;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "providerFacade")
public class ProviderFacade {
	
	@PersistenceContext(unitName = "progetto-siw")
	private EntityManager em;
	
	public Provider createProvider(String name, String phoneNumber, String email, String vatin, Address address){
		Provider provider = new Provider(name, phoneNumber, email, vatin, address);
		this.em.persist(provider);
		return provider;
	}

}
