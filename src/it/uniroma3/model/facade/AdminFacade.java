package it.uniroma3.model.facade;

import it.uniroma3.model.Admin;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "aFacade")
public class AdminFacade {
	
	@PersistenceContext(unitName = "progetto-siw")
	private EntityManager em;
	
	public Admin createAdmin(String username, String password){
		Admin admin = new Admin(username, password);
		this.em.persist(admin);
		return admin;
	}
	
	public Admin credentialCheck(String username, String password){
		Admin admin;
		try{
			admin = (Admin) this.em.createNamedQuery("getAdminByUsername").setParameter("username", username).getSingleResult();
		}catch (Exception e){
			return null;
		}
		if(admin.getPassword().equals(password))
			return admin;
		else
			return null;
		
	}

}
