package it.uniroma3.model;

import javax.persistence.*;


@Entity
@Table(name = "tb_admin")
@NamedQuery(name = "getAdminByUsername", query = "SELECT a FROM Admin a WHERE a.username = :username")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	public Admin(){
		
	}
	
	public Admin(String username, String password){
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int hashCode(){
		return this.username.hashCode();
	}
	
	public boolean equals(Object o){
		Admin a = (Admin) o;
		return this.username.equals(a.getUsername());
	}

}
