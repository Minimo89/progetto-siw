package it.uniroma3.model.facade;

import it.uniroma3.model.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "pFacade")
public class ProductFacade {
	
	@PersistenceContext(unitName = "progetto-siw")
	private EntityManager em;
	
	public Product createProduct(String name, String code, String description, Float price, int quantity){
		Product product = new Product(name, code, description, price, quantity);
		this.em.persist(product);
		return product;
	}

}
