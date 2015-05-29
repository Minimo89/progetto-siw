package it.uniroma3.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_orders_line")
@NamedQueries({
	@NamedQuery(name = "getOrderLines", query = "SELECT OBJECT (ol) FROM OrderLine ol WHERE ol.order = :order"),
	@NamedQuery(name = "getOrderByOrderLineId", query = "SELECT OBJECT (o) FROM OrderLine ol WHERE ol.id = :id")
})
public class OrderLine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private Float price;
	
	@Column(nullable = false)
	private int quantity;
	
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private Orders order;
	
	public OrderLine(){
		
	}
	
	public OrderLine(Product product, int quantity, Orders order){
		this.product = product;
		this.quantity = quantity;
		this.order = order;
		this.price = product.getPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
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

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	public int hashCode(){
		return this.product.hashCode() + this.order.hashCode();
	}
	
	public boolean equals(Object o){
		OrderLine ol = (OrderLine) o;
		return this.product.equals(ol.getProduct()) && this.order.equals(ol.getOrder());
	}

}
