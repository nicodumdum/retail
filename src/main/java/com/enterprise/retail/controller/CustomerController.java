package com.enterprise.retail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enterprise.retail.entity.Customer;
import com.enterprise.retail.repository.CustomerRepository;

@Controller
@RequestMapping("/admin/customers")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(Model uiModel) {
		List<Customer> customers = customerRepository.findAll();
		uiModel.addAttribute("customers", customers);
		return "admin/customers/index";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Long id, Model uiModel) {
		Customer customer = customerRepository.findOne(id);
		uiModel.addAttribute("customer", customer);
		return "admin/customers/show";
	}
}
