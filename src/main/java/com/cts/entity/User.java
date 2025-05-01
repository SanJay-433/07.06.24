package com.cts.entity;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String name;
	
	@Column(unique = true)
	private String email;
	
	private String password;
    private String shippingAddress;
    private String paymentDetails;
    
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ShoppingCart carts ;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<OrderManagement> orders ;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	

	public List<OrderManagement> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderManagement> orders) {
		this.orders = orders;
	}

	public ShoppingCart getCarts() {
		return carts;
	}

	public void setCarts(ShoppingCart carts) {
		this.carts = carts;
	}
	
     
}
