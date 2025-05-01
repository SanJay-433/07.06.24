package com.cts.entity;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class ProductManagement {
	
	//Fields
	     @Id
	     @GeneratedValue(strategy=GenerationType.IDENTITY)
         private Long productId;
	     private String name;
	     private String description;
	     private Double price;
	     private Integer quantity;
	     private String status;
	     private String category;
	     private String imageUrl;
	     
    //Relationship     
       @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	   private List<CartItem> cartItem;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

	

    //GettersandSetters     
		
         
}
