package com.shopix.service;

import java.util.List;

import com.shopix.entity.OrderDetail;
import com.shopix.entity.OrderStatus;

public interface RetailerService {

	List<OrderDetail> getOrders(long userId, OrderStatus status);

	void changeOrderStatus(long userId, long orderDetailId, OrderStatus status);

}
