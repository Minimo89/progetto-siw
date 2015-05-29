package it.uniroma3.model;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "tb_orders")
@NamedQueries({
	@NamedQuery(name = "getAllCustomersOrders", query = "SELEC OBJECT (o) FROM Orders o WHERE o.customer = :customer"),
	@NamedQuery(name = "findOrdersToBeFilled", query = "DELECT OBJECT (o) FROM Orders o WHERE o.closeDate is not null and o.evasionDate is null"),
	@NamedQuery(name = "getCustomersCart", query = "SELECT OBJECT (o) FROM Orders o WHERE o.closeDate is null and o.customer = :customer")
})
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date closeDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date evasionDate;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "order")
	private List<OrderLine> orderLines;
	
	public Orders(){
		this.orderLines = new LinkedList<OrderLine>();
		this.creationDate = new Date();
	}
	
	public Orders(Customer customer){
		this();
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Date getEvasionDate() {
		return evasionDate;
	}

	public void setEvasionDate(Date evasionDate) {
		this.evasionDate = evasionDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
	public void addOrderLine(Product product, int quantity){
		boolean find = false;
		OrderLine temp = null;
		Iterator<OrderLine> i = this.orderLines.iterator();
		
		while(i.hasNext() && !find){
			temp = i.next();
			if(temp.getProduct().equals(product))
				find = true;
		}
		
		if(find)
			temp.setQuantity(temp.getQuantity() + quantity);
		else{
			OrderLine ol = new OrderLine(product, quantity, this);
			this.orderLines.add(ol);
		}
	}
	
	public void removeOrderLine(OrderLine ol){
		this.orderLines.remove(ol);
	}
	
	public void closeOrder(){
		this.closeDate = new Date();
	}
	
	public void evasionOrder(){
		this.evasionDate = new Date();
	}
	
	public int hashCode(){
		return this.customer.hashCode() + this.creationDate.hashCode();
	}
	
	public boolean equals(Object obj){
		Orders o = (Orders) obj;
		return this.customer.equals(o.getCustomer()) && this.creationDate.equals(o.getCreationDate());
	}

}
