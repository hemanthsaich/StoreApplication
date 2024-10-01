package com.shopix.service;

import java.util.List;

import com.shopix.dto.CheckoutForm;
import com.shopix.entity.CartItem;
import com.shopix.entity.Order;
import com.shopix.entity.Product;

public interface CustomerService {
	List<Product> getItems(long userId);

	void addWishlistItem(long userId, long productId);

	void removeWishlistItem(long userId, long productId);

	List<CartItem> getCartItemsByCustomer(long userId);

	void addProductToCart(long userId, long productId);

	void updateCartQuantity(long userId, long productId, int quantity);

	void deleteCartitem(long userId, long productId);

	List<Product> getProducts(String category, String search);

	Product getProduct(long id);

	boolean isProductWishlisted(Long id1, long id);

	boolean isProductInCart(Long id1, long id);


	List<String> getCategories();

	void placeOrder(long customerId, CheckoutForm form);

	List<Order> getOrders(long customerId);

	void cancelOrder(long customerId, long orderDetailId);
}
