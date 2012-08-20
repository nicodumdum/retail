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

@Entity(name="store")
public class Store {
	
	@Id
	@Column(name="store_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long storeId;
	
	@Column(name="store_code")
	@NotNull
	private String storeCode;
	
	@Column(name="store_name")
	@NotNull
	private String storeName;
	
	@Column(name="store_address")
	@NotNull
	private String address;

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
