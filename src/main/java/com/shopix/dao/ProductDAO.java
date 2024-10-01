package com.shopix.dao;

import java.util.List;

import com.shopix.dto.ProductForm;
import com.shopix.entity.Product;

public interface ProductDAO {
	List<Product> findProducts(String category, String search);

	Product getProductById(long id);

	List<Product> getRetailerProducts(long id);

	void addProduct(ProductForm form, Long id);

	Product addRetailerProduct(Long userId, long id);

	int updateProduct(Long userId, long id, ProductForm form);

	void deleteProduct(long userId, long id);

	List<String> getAllCategories();
}
