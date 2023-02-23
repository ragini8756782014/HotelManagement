package com.example.demo.service.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Component
public class CreateCustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Long createCustomer(List<Customer> list) {
		validate();
		List<Customer> customer = createEntity(list);
		Long customerId = 0L;
		for (Customer c : customer) {
			customerId = c.getCustomerid();
		}
		return customerId;
	}

	private void validate() {

	}

	private List<Customer> createEntity(List<Customer> customer) {
		List<Customer> c = new ArrayList<>();

		c.forEach(item -> {
			Customer cs = new Customer();
			cs.setAge(item.getAge());
			cs.setContactnumber(item.getContactnumber());
			cs.setCustomeraddress(item.getCustomeraddress());
			cs.setCustomerfullname(item.getCustomerfullname());
			c.add(cs);
		});
		return c;

	}
}
