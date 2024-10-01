package com.shopix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.dao.OrderDetailDAO;
import com.shopix.entity.OrderDetail;
import com.shopix.entity.OrderStatus;

@Service
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	private OrderDetailDAO orderDetailDAO;

	@Override
	public List<OrderDetail> getOrders(long userId, OrderStatus status) {
		return orderDetailDAO.getRetailerOrderDetails(userId, status);
	}

	@Override
	public void changeOrderStatus(long userId, long orderDetailId, OrderStatus status) {
		orderDetailDAO.changeOrderStatus(userId, orderDetailId, status);
	}

}
