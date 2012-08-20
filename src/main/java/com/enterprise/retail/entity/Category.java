package com.enterprise.retail.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity(name="category")
public class Category {
	
	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categoryId;
	
	@Column(name="category_code")
	@NotNull
	private String categoryCode;
	
	@Column(name="category_name")
	@NotNull
	private String categoryName;
	
	@Column(name="category_description")
	private String description;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
