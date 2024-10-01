package com.shopix.service;

import java.util.List;

import com.shopix.dto.ProductForm;
import com.shopix.entity.Product;

public interface InventoryService {
	List<Product> getAllProducts(long id);

	void addProduct(ProductForm form, Long id);

	Product getProductInfo(Long userId, long id);

	int updateProduct(long userId, long id, ProductForm form);

	void deleteProduct(long userId, long id);

}
