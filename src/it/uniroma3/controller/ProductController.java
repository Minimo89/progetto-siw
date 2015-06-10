package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Product;
import it.uniroma3.model.facade.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ProductController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private String code;
	private Float price;
	private String description;
	private int quantity;
	private Product product;
	private List<Product> products;
	
	@EJB(beanName = "pFacade")
	private ProductFacade productFacade;
	
	public String createProduct(){
		this.product = this.productFacade.createProduct(this.name, this.code, this.description, this.price, this.quantity);
		return "/faces/productAdded.jsp";
		
	}
	
	public String getAllProducts(){
		this.products = this.productFacade.getAllProducts();
		return "/faces/products.jsp";
	}
	
	public String findProduct(){
		this.product = this.productFacade.findProduct(id);
		return "/faces/product.jsp";
	}
	
	public String findProduct(Long id){
		this.product = this.productFacade.findProduct(id);
		return "/faces/product.jsp";
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

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
