package com.cts.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class ShoppingCart {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long cartId;
	    private Integer quantity;
	    private Double totalPrice;
	    @OneToOne
	    @JoinColumn(name = "userId", nullable = false)
	    private User user;

	    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL)
	    private List<CartItem> cartItems;
	    
	    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	    private List<OrderManagement> order;

		public Long getCartId() {
			return cartId;
		}

		public void setCartId(Long cartId) {
			this.cartId = cartId;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(Double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public List<CartItem> getCartItems() {
			return cartItems;
		}

		public void setCartItems(List<CartItem> cartItems) {
			this.cartItems = cartItems;
		}

	    
}


