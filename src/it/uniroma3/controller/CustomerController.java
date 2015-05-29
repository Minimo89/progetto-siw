package it.uniroma3.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import it.uniroma3.model.Address;
import it.uniroma3.model.Customer;
import it.uniroma3.model.Orders;
import it.uniroma3.model.facade.CustomerFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CustomerController {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Address address;
	private String phoneNumber;
	private String dateOfBirth;
	private List<Orders> orders;
	private Customer customer;
	private List<Customer> customers;
	
	private String street;
	private String city;
	private String country;
	private String state;
	private String zipcode;
	
	private Orders order;
	
	@EJB(beanName = "cFacade")
	private CustomerFacade customerFacade;
	
	public String createCustomer() throws ParseException{
		Date date = dateConverter(dateOfBirth);
		if(date == null){
			this.id = null;
			this.firstName = null;
			this.lastName = null;
			this.email = null;
			this.password = null;
			this.address = null;
			this.phoneNumber = null;
			this.dateOfBirth = null;
			this.street = null;
			this.city = null;
			this.country = null;
			this.state = null;
			this.zipcode = null;
			this.customer = null;
			return "/faces/newCustomer.jsp";
		}
		this.address = new Address(street, city, country, state, zipcode);
		this.customer = this.customerFacade.createCustomer(firstName, lastName, email, password, address, phoneNumber, date);
		this.id = null;
		this.firstName = null;
		this.lastName = null;
		this.email = null;
		this.password = null;
		this.address = null;
		this.phoneNumber = null;
		this.dateOfBirth = null;
		this.street = null;
		this.city = null;
		this.country = null;
		this.state = null;
		this.zipcode = null;
		this.customer = null;
		return "/faces/registrationComplete.jsp";
	}
	
	public Date dateConverter(String date) throws ParseException{
		Date dateOfBirth = null;
		try{
			SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
			dateOfBirth = formatter.parse(date);
			return dateOfBirth;
		} catch (ParseException e){
			e.printStackTrace();
		}
		return dateOfBirth;
	}
	
	public String logIn(){
		Customer customer = this.customerFacade.credentialCheck(this.email, this.password);
		if(customer != null){
			this.id = customer.getId();
			this.customer = customer;
			return "/faces/customerIndex.jsp";
		}
		else
			return "/faces/index.jsp";
	}
	

	public Long getId() {
		return id;
	}
	
	public String logOut(){
		this.id = null;
		this.firstName = null;
		this.lastName = null;
		this.email = null;
		this.password = null;
		this.address = null;
		this.phoneNumber = null;
		this.dateOfBirth = null;
		this.street = null;
		this.city = null;
		this.country = null;
		this.state = null;
		this.zipcode = null;
		this.customer = null;
		return "/faces/index.jsp";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
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

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

		

}
