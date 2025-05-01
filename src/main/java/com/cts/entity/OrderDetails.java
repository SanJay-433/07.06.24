package com.cts.entity;

import jakarta.persistence.*;

@Entity
public class OrderDetails {

	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailsId;
    private String name;
    private Double price;
    private Integer quantity;

    
    
    
    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private OrderManagement order;

    
    
    
	public Long getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(Long orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public OrderManagement getOrder() {
		return order;
	}

	public void setOrder(OrderManagement order) {
		this.order = order;
	}

}