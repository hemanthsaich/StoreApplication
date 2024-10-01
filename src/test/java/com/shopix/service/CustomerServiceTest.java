package com.shopix.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shopix.dto.CheckoutForm;

@SpringBootTest
class CustomerServiceTest {

	@Autowired
	private CustomerService customerService;

	@Test
	void test() {
		CheckoutForm form = new CheckoutForm();
		form.setAddress("Chennai");
		form.setFullName("Hemanth");
		form.setMobileNumber("9876543210");
		form.setPaymentMode("COD");
		form.setPincode(600096);
		customerService.placeOrder(3, form);
	}

}
