package it.uniroma3.model;

import java.util.Map;

import javax.persistence.*;

@Entity
@Table(name = "tb_provider")
public class Provider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String phoneNumber;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String vatin;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Address address;
	
	@ManyToMany
	private Map<String, Product> products;
	
	public Provider(){
		
	}
	
	public Provider(String name, String phoneNumber, String email, String vatin, Address address){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.vatin = vatin;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVatin() {
		return vatin;
	}

	public void setVatin(String vatin) {
		this.vatin = vatin;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Map<String, Product> getProducts() {
		return products;
	}

	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product product){
		this.products.put(product.getCode(), product);
	}
	
	public void removeProduct(Product product){
		this.products.remove(product);
	}
	
	public int hashCode(){
		return this.vatin.hashCode();
	}
	
	public boolean equals(Object o){
		Provider p = (Provider) o;
		return this.vatin.equals(p.getVatin());
	}

}
