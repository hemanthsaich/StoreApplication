package com.shopix.dao;

import java.util.List;

import com.shopix.entity.OrderDetail;
import com.shopix.entity.OrderStatus;

public interface OrderDetailDAO {

	List<OrderDetail> getRetailerOrderDetails(long userId, OrderStatus status);

	void changeOrderStatus(long retailerId, long orderDetailId, OrderStatus status);

}
