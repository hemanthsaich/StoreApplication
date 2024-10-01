package com.shopix.service;

import java.util.List;
import java.util.Optional;

import com.shopix.dto.RegistrationForm;
import com.shopix.entity.MyUser;
import com.shopix.entity.UserStatus;

public interface UserService {
	Optional<MyUser> getUser(String username, String password);

	void registerCustomer(RegistrationForm registrationForm);

	void registerRetailer(RegistrationForm registrationForm);

	List<MyUser> getAllUsers();

	void updateUserStatus(long userId, UserStatus status);
}
