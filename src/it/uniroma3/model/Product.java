package it.uniroma3.model;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "tb_product")
@NamedQuery(name = "findAllProducts", query = "SELECT p FROM Product p")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int quantity;
	
	@Column(nullable = false)
	private Float price;
	
	@Column(nullable = false, unique = true)
	private String code;
	
	@Column(length = 2000)
	private String description;
	
	@ManyToMany(mappedBy = "products")
	private List<Provider> providers;
	
	public Product(){
		
	}
	
	public Product(String name, String code, String description, Float price, int quantity){
		this.name = name;
		this.code = code;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}
	
	public void addProvider(Provider provider){
		this.providers.add(provider);
	}
	
	public void removeProvider(Provider provider){
		this.providers.remove(provider);
	}
	
	public int hashCode(){
		return this.code.hashCode();
	}
	
	public boolean equals(Object o){
		Product p = (Product) o;
		return this.code.equals(p.getCode());
	}

}
