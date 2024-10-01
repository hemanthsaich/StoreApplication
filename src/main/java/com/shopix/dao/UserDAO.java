package com.shopix.dao;

import java.util.List;
import java.util.Optional;

import com.shopix.entity.Customer;
import com.shopix.entity.MyUser;
import com.shopix.entity.Retailer;
import com.shopix.entity.UserStatus;

public interface UserDAO {
	Optional<MyUser> getUser(String username, String password);

	void addCustomer(Customer customer);

	void addRetailer(Retailer retailer);

	List<MyUser> getAllUsers();

	void updateUserStatus(long userId, UserStatus status);
}
