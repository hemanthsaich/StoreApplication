package com.shopix.dao;

import java.util.List;

import com.shopix.entity.CartItem;
import com.shopix.entity.Order;
import com.shopix.entity.OrderDetail;
import com.shopix.entity.PaymentDetail;

public interface OrderDAO {

	double getCartValue(long customerId);

	List<CartItem> getCartItems(long userId);

	void save(PaymentDetail paymentDetail);

	void save(Order order);

	void save(OrderDetail detail);

	List<Order> getCustomerOrders(long customerId);

	void cancelCustomerOrder(long customerId, long orderDetailId);
}
