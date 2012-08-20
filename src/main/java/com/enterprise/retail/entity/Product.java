package com.enterprise.retail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity(name="product")
public class Product {
	
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long productId;
	
	@Column(name="product_code")
	@NotNull
	private String productCode;
	
	@Column(name="product_name")
	@NotNull
	private String productName;
	
	@Column(name="product_description")
	@NotNull
	private String description;
	
	@Column(name="product_cost")
	private Double cost;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="category_id")
	private Category category;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	private String categoryName;
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryName() {
		
		return categoryName;
	}
}
