package it.uniroma3.model.facade;

import java.util.LinkedList;
import java.util.List;

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
	
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts(){
		List<Product> products = new LinkedList<Product>();
		products = this.em.createNamedQuery("findAllProducts").getResultList();
		return products;
	}
	
	public Product findProduct(Long id){
		Product product = this.em.find(Product.class, id);
		return product;
	}

}
