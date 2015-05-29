package it.uniroma3.controller;

import it.uniroma3.model.Product;
import it.uniroma3.model.facade.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProductController {
	
	private Long id;
	private String name;
	private String code;
	private Float price;
	private String description;
	private int quantity;
	private Product product;
	
	@EJB(beanName = "pFacade")
	private ProductFacade productFacade;
	
	public String createProduct(){
		this.product = this.productFacade.createProduct(this.name, this.code, this.description, this.price, this.quantity);
		this.name = null;
		this.code = null;
		this.description = null;
		this.price = null;
		this.quantity = 0;
		return "/faces/productAdded.jsp";
		
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
