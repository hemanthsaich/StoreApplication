package com.shopix.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.dao.UserDAO;
import com.shopix.dto.RegistrationForm;
import com.shopix.entity.Customer;
import com.shopix.entity.MyUser;
import com.shopix.entity.Retailer;
import com.shopix.entity.UserStatus;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	public Optional<MyUser> getUser(String username, String password) {
		if (username.equals("admin") && password.equals("1234567890")) {
			MyUser user = new MyUser();
			user.setRole("ADMIN");
			user.setUsername(username);
			user.setStatus(UserStatus.ACTIVE);
			user.setEmail("admin@email.com");
			return Optional.of(user);
		}
		return dao.getUser(username, password);
	}

	@Override
	public void registerCustomer(RegistrationForm registrationForm) {
		Customer customer = new Customer();
		customer.setUsername(registrationForm.getUsername());
		customer.setEmail(registrationForm.getEmail());
		customer.setPassword(registrationForm.getPassword());
		customer.setStatus(UserStatus.ACTIVE);
		dao.addCustomer(customer);
	}

	@Override
	public void registerRetailer(RegistrationForm registrationForm) {
		Retailer retailer = new Retailer();
		retailer.setEmail(registrationForm.getEmail());
		retailer.setUsername(registrationForm.getUsername());
		retailer.setPassword(registrationForm.getPassword());
		retailer.setStatus(UserStatus.PENDING_VERIFICATION);
		dao.addRetailer(retailer);
	}

	@Override
	public List<MyUser> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public void updateUserStatus(long userId, UserStatus status) {
		dao.updateUserStatus(userId, status);
	}

}
