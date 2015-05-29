package it.uniroma3.model.facade;

import java.util.Date;

import it.uniroma3.model.Address;
import it.uniroma3.model.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless(name = "cFacade")
public class CustomerFacade {
	
	@PersistenceContext(unitName = "progetto-siw")
	protected EntityManager em;
	
	public Customer createCustomer(String firstName, String lastName, String email, String password, Address address, String phoneNumber, Date dateOfBirth){
		Customer customer = new Customer(firstName, lastName, email, password, phoneNumber, dateOfBirth, address);
		this.em.persist(customer);
		return customer;
	}

}
