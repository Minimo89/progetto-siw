package it.uniroma3.model;

import javax.persistence.*;


@Entity
@Table(name = "tb_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private String street;
	
	@Column(nullable = false)
	private String country;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String zipcode;
	
	public Address(){
		
	}
	
	public Address(String street, String city, String country, String state, String zipcode){
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zipcode  =zipcode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public int hashCode(){
		return this.street.hashCode() + this.city.hashCode() + this.country.hashCode() + this.state.hashCode() + this.zipcode.hashCode();
	}
	
	public boolean equals(Object o){
		Address a = (Address) o;
		return this.street.equals(a.getStreet()) && this.city.equals(a.getCity()) && this.country.equals(a.getCountry())
				&& this.state.equals(a.getState()) && this.zipcode.equals(a.getZipcode());
	}

}
