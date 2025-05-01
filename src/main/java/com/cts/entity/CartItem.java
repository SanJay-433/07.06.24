package com.cts.entity;
import jakarta.persistence.*;

@Entity
public class CartItem {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long cartItemId;
	    private Integer quantity; 
	    private Double productPrice;
	    
	    
	    @ManyToOne
	    @JoinColumn(name = "cartId", nullable = false)
	    private ShoppingCart shoppingCart;

	    @ManyToOne
	    @JoinColumn(name = "productId", nullable = false)
	    private ProductManagement product;

	    
	    
	    
		public Long getCartItemId() {
			return cartItemId;
		}

		public void setCartItemId(Long cartItemId) {
			this.cartItemId = cartItemId;
		}

		public ShoppingCart getShoppingCart() {
			return shoppingCart;
		}

		public void setShoppingCart(ShoppingCart shoppingCart) {
			this.shoppingCart = shoppingCart;
		}

		public ProductManagement getProduct() {
			return product;
		}

		public void setProduct(ProductManagement product) {
			this.product = product;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(Double productPrice) {
			this.productPrice = productPrice;
		}
        
	    
	}

