package com.shopix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.dao.ProductReviewDAO;
import com.shopix.entity.ProductReview;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductReviewServiceImpl implements ProductReviewService {

	@Autowired
	private ProductReviewDAO productReviewDAO;

	@Override
	public List<ProductReview> getReviewsByProductId(long productId) {
		return productReviewDAO.findByProductId(productId);
	}

	@Override
	public List<ProductReview> getReviewsByCustomerId(long userId) {
		return productReviewDAO.getCustomerReviews(userId);
	}

	@Override
	public void saveProductReview(long userId, long productId, String reviewContent, int rating) {
		productReviewDAO.addCustomerReview(userId, productId, reviewContent, rating);
	}

	@Override
	public void deleteReview(long id) {
		productReviewDAO.deleteReview(id);
	}

}
