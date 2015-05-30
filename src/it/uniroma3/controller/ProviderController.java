package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Address;
import it.uniroma3.model.Provider;
import it.uniroma3.model.facade.ProviderFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProviderController {
	
	@EJB(beanName = "providerFacade")
	private ProviderFacade providerFacade;
	
	private Long id;
	private String name;
	private String phoneNumber;
	private String email;
	private String vatin;
	private Address address;
	private Provider provider;
	private List<Provider> providers;
	
	private String street;
	private String city;
	private String country;
	private String state;
	private String zipcode;
	
	public String createProvider(){
		this.address = new Address(this.street, this.city, this.country, this.state, this.zipcode);
		this.provider = this.providerFacade.createProvider(this.name, this.phoneNumber, this.email, this.vatin, this.address);
		return "/faces/adminIndex.jsp";
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

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}
	
	
	
	

}
