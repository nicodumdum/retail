package com.enterprise.retail.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.enterprise.retail.entity.Category;
import com.enterprise.retail.entity.Customer;
import com.enterprise.retail.entity.Product;
import com.enterprise.retail.entity.SaleTransaction;
import com.enterprise.retail.entity.Store;
import com.enterprise.retail.repository.CategoryRepository;
import com.enterprise.retail.repository.CustomerRepository;
import com.enterprise.retail.repository.ProductRepository;
import com.enterprise.retail.repository.SaleTransactionRepository;
import com.enterprise.retail.repository.StoreRepository;

@Profile("dataSeeder")
@Component
public class DataSeeder {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private SaleTransactionRepository saleTransactionRepository;
	
	@Autowired
	private StoreRepository storeRepository;
	
	@PostConstruct
	public void run() {
		
		Customer customer = new Customer();
		customer.setFirstName("Mike");
		customer.setLastName("Litoris");
		customer.setAddress("Smokey Mountains");
		customer.setBirthDate("9999-12-31");
		customer.setContactNumber("9111111");
		customer.setEmail("mikelitoris@domain.com");
		customer.setGender("Male");
		customer = customerRepository.save(customer);
		
		Store store = new Store();
		store.setStoreCode("S1");
		store.setStoreName("Appliance Center");
		store.setAddress("Smokey Mountains");
		store = storeRepository.save(store);
		
		Category category = new Category();
		category.setCategoryCode("C1");
		category.setCategoryName("Appliances");
		category.setDescription("Appliances for everyone.");
		category = categoryRepository.save(category);
				
		Product product = new Product();
		product.setProductCode("P1");
		product.setProductName("Flat Screen HD TV");
		product.setDescription("Coolest TV in town!");
		product.setCost(50000.00);
		product.setCategory(category);
		product.setCategoryName(category.getCategoryName());
		product = productRepository.save(product);
		
		SaleTransaction saleTransaction = new SaleTransaction();
		saleTransaction.setTransactionCode("T1");
		saleTransaction.setTransactionDate("9999-12-31");
		saleTransaction.setStore(store);
		saleTransaction.setProduct(product);
		saleTransaction.setCost(50000.00);
		saleTransaction.setStoreName(store.getStoreName());
		saleTransaction.setProductName(product.getProductName());
		saleTransaction = saleTransactionRepository.save(saleTransaction);
	}
}
