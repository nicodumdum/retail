package com.enterprise.retail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity(name="sale_transaction")
public class SaleTransaction {
	
	@Id
	@Column(name="sale_transaction_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long saleTransactionId;
	
	@Column(name="sale_transaction_code")
	@NotNull
	private String transactionCode;
	
	@Column(name="sale_transaction_date")
	@NotNull
	private String transactionDate;
	
	@Column(name="sale_transaction_cost")
	private Double cost;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="store_id")
	private Store store;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_id")
	private Product product;
	
	public Long getSaleTransactionId() {
		return saleTransactionId;
	}

	public void setSaleTransactionId(Long saleTransactionId) {
		this.saleTransactionId = saleTransactionId;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	private String storeName;
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getStoreName() {
		
		return storeName;
	}
	
	private String productName;
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		
		return productName;
	}
}
