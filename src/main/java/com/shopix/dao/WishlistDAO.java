package com.shopix.dao;

import java.util.List;

import com.shopix.entity.Product;

public interface WishlistDAO {

	void addWishlistItem(long userId, long productId);

	void removeWishlistItem(long userId, long productId);

	List<Product> getItems(long userId);

	boolean isProductwishlisted(Long id1, long id);

}
